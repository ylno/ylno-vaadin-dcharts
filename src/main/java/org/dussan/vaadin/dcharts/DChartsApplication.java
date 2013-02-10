/**
 * Copyright (C) 2012-2013  Dušan Vejnovič  <vaadin@dussan.org>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dussan.vaadin.dcharts;

import java.util.Arrays;
import java.util.Locale;

import org.dussan.vaadin.dcharts.base.elements.XYaxis;
import org.dussan.vaadin.dcharts.data.DataSeries;
import org.dussan.vaadin.dcharts.data.Ticks;
import org.dussan.vaadin.dcharts.events.ChartData;
import org.dussan.vaadin.dcharts.events.click.ChartDataClickEvent;
import org.dussan.vaadin.dcharts.events.click.ChartDataClickHandler;
import org.dussan.vaadin.dcharts.events.mouseenter.ChartDataMouseEnterEvent;
import org.dussan.vaadin.dcharts.events.mouseenter.ChartDataMouseEnterHandler;
import org.dussan.vaadin.dcharts.events.mouseleave.ChartDataMouseLeaveEvent;
import org.dussan.vaadin.dcharts.events.mouseleave.ChartDataMouseLeaveHandler;
import org.dussan.vaadin.dcharts.events.rightclick.ChartDataRightClickEvent;
import org.dussan.vaadin.dcharts.events.rightclick.ChartDataRightClickHandler;
import org.dussan.vaadin.dcharts.metadata.TooltipAxes;
import org.dussan.vaadin.dcharts.metadata.TooltipMoveSpeeds;
import org.dussan.vaadin.dcharts.metadata.XYaxes;
import org.dussan.vaadin.dcharts.metadata.locations.TooltipLocations;
import org.dussan.vaadin.dcharts.metadata.renderers.AxisRenderers;
import org.dussan.vaadin.dcharts.metadata.renderers.LabelRenderers;
import org.dussan.vaadin.dcharts.metadata.renderers.SeriesRenderers;
import org.dussan.vaadin.dcharts.options.Axes;
import org.dussan.vaadin.dcharts.options.Highlighter;
import org.dussan.vaadin.dcharts.options.Options;
import org.dussan.vaadin.dcharts.options.SeriesDefaults;
import org.dussan.vaadin.dcharts.renderers.label.CanvasAxisLabelRenderer;
import org.dussan.vaadin.dcharts.renderers.tick.AxisTickRenderer;

import com.vaadin.Application;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;
import com.vaadin.ui.Window.Notification;

public class DChartsApplication extends Application {

	private static final long serialVersionUID = 6965636231736806289L;

	private void showNotification(String event, ChartData chartData) {
		String caption = "<span style='color:#ff6600'>Event: " + event
				+ "</span>";
		StringBuilder description = new StringBuilder();
		description.append("<b>Chart id:</b> " + chartData.getChartId());

		if (chartData.getSeriesIndex() != null) {
			description.append("<br /><b>Series index:</b> "
					+ chartData.getSeriesIndex());
		}

		if (chartData.getPointIndex() != null) {
			description.append("<br /><b>Point index:</b> "
					+ chartData.getPointIndex());
		}

		if (chartData.getData() != null) {
			description.append("<br /><b>Chart data:</b> "
					+ Arrays.toString(chartData.getData()));
		}

		if (chartData.getOriginData() != null) {
			if (chartData.getOriginData() instanceof Object[]) {
				description
						.append("<br /><b>Origin data:</b> "
								+ Arrays.toString((Object[]) chartData
										.getOriginData()));
			} else {
				description.append("<br /><b>Origin data:</b> "
						+ chartData.getOriginData().toString());
			}
		}

		Notification notification = new Notification(caption,
				description.toString(), Notification.TYPE_TRAY_NOTIFICATION);
		notification.setDelayMsec(3000);
		notification.setHtmlContentAllowed(true);
		getMainWindow().showNotification(notification);
	}

	@Override
	public void init() {
		Window mainWindow = new Window("dCharts Application");
		setMainWindow(mainWindow);

		DCharts chart = new DCharts();
		chart.autoSelectDecimalAndThousandsSeparator(new Locale("sl", "SI"));
		chart.setWidth("100%");
		chart.setHeight("250px");
		mainWindow.addComponent(chart);

		Label version = new Label("dCharts version: " + DCharts.getVersion()
				+ "  ,  dChart git version: " + DCharts.getGitVersion()
				+ "  ,  dChart jqPlot version: " + DCharts.getJqPlotVersion());
		mainWindow.addComponent(version);

		DataSeries dataSeries = new DataSeries().add(2000.20, 1116, 7, 10);

		SeriesDefaults seriesDefaults = new SeriesDefaults()
				.setRenderer(SeriesRenderers.BAR);

		Axes axes = new Axes().addAxis(
				new XYaxis().setRenderer(AxisRenderers.CATEGORY).setTicks(
						new Ticks().add("a", "b", "c", "d")))
				.addAxis(
						new XYaxis(XYaxes.Y)
								.setTickOptions(
										new AxisTickRenderer()
												.setFormatString("%'.2f"))
								.setLabel("Test Value")
								.setLabelRenderer(LabelRenderers.CANVAS)
								.setLabelOptions(
										new CanvasAxisLabelRenderer()
												.setAngle(-90)));

		Highlighter highlighter = new Highlighter().setShow(true)
				.setTooltipMoveSpeed(TooltipMoveSpeeds.FAST)
				.setTooltipAlwaysVisible(true)
				.setTooltipLocation(TooltipLocations.EAST)
				.setTooltipAxes(TooltipAxes.XY_BAR);

		Options options = new Options().setCaptureRightClick(true)
				.setSeriesDefaults(seriesDefaults).setAxes(axes)
				.setHighlighter(highlighter);

		chart.setDataSeries(dataSeries).setOptions(options).show();

		chart.setEnableChartDataMouseEnterEvent(true);
		chart.setEnableChartDataMouseLeaveEvent(true);
		chart.setEnableChartDataClickEvent(true);
		chart.setEnableChartDataRightClickEvent(true);

		chart.addHandler(new ChartDataMouseEnterHandler() {
			@Override
			public void onChartDataMouseEnter(ChartDataMouseEnterEvent event) {
				showNotification("CHART DATA MOUSE ENTER", event.getChartData());
			}
		});

		chart.addHandler(new ChartDataMouseLeaveHandler() {
			@Override
			public void onChartDataMouseLeave(ChartDataMouseLeaveEvent event) {
				showNotification("CHART DATA MOUSE LEAVE", event.getChartData());
			}
		});

		chart.addHandler(new ChartDataClickHandler() {
			@Override
			public void onChartDataClick(ChartDataClickEvent event) {
				showNotification("CHART DATA CLICK", event.getChartData());
			}
		});

		chart.addHandler(new ChartDataRightClickHandler() {
			@Override
			public void onChartDataRightClick(ChartDataRightClickEvent event) {
				showNotification("CHART DATA RIGHT CLICK", event.getChartData());
			}
		});
	}

}
