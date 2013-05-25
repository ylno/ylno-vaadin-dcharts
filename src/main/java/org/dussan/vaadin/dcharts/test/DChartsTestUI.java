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
package org.dussan.vaadin.dcharts.test;

import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.Locale;

import org.dussan.vaadin.dcharts.ChartImageFormat;
import org.dussan.vaadin.dcharts.DCharts;
import org.dussan.vaadin.dcharts.base.elements.XYaxis;
import org.dussan.vaadin.dcharts.data.DataSeries;
import org.dussan.vaadin.dcharts.data.Ticks;
import org.dussan.vaadin.dcharts.events.ChartData;
import org.dussan.vaadin.dcharts.events.chartImageChange.ChartImageChangeEvent;
import org.dussan.vaadin.dcharts.events.chartImageChange.ChartImageChangeHandler;
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
import org.dussan.vaadin.dcharts.renderers.series.BubbleRenderer;
import org.dussan.vaadin.dcharts.renderers.series.PieRenderer;
import org.dussan.vaadin.dcharts.renderers.tick.AxisTickRenderer;

import com.vaadin.server.Page;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class DChartsTestUI extends UI {

	private static final long serialVersionUID = -7077515649056486386L;

	private void showEventNotification(String event, Object chartObject) {
		String caption = "<span style='color:#ff6600'>Event: " + event
				+ "</span>";
		StringBuilder description = new StringBuilder();

		if (chartObject instanceof ChartData) {
			ChartData chartData = (ChartData) chartObject;
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
					description.append("<br /><b>Origin data:</b> "
							+ Arrays.toString((Object[]) chartData
									.getOriginData()));
				} else {
					description.append("<br /><b>Origin data:</b> "
							+ chartData.getOriginData().toString());
				}
			}
		} else if (chartObject instanceof BufferedImage) {
			BufferedImage chartImage = (BufferedImage) chartObject;
			description.append("<b>Chart image width:</b> "
					+ chartImage.getWidth() + "px");
			description.append("<br /><b>Chart image height:</b> "
					+ chartImage.getHeight() + "px");
		}

		Notification notification = new Notification(caption,
				description.toString(), Type.TRAY_NOTIFICATION);
		notification.setDelayMsec(3000);
		notification.setHtmlContentAllowed(true);
		notification.show(Page.getCurrent());
	}

	@Override
	protected void init(VaadinRequest request) {
		VerticalLayout layout = new VerticalLayout();
		layout.setSizeFull();
		setContent(layout);
		Page.getCurrent().setTitle("dCharts Application");

		DCharts charts1 = chartsDemo1();
		DCharts charts2 = chartsDemo2();
		DCharts charts3 = chartsDemo3();
		DCharts charts4 = chartsDemo4();

		HorizontalLayout layout3 = new HorizontalLayout();
		layout3.addComponent(charts3);
		layout3.addComponent(charts4);

		TabSheet demoTabSheet = new TabSheet();
		layout.addComponent(demoTabSheet);
		demoTabSheet.addTab(charts1, "Demo 1");
		demoTabSheet.addTab(charts2, "Demo 2");
		demoTabSheet.addTab(layout3, "Demo 3");
	}

	private DCharts chartsDemo1() {
		DCharts chart = new DCharts();
		chart.autoSelectDecimalAndThousandsSeparator(new Locale("sl", "SI"));
		chart.setHeight("400px");
		chart.setCaption("test");
		chart.setEnableDownload(true);
		chart.setChartImageFormat(ChartImageFormat.GIF);

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
				showEventNotification("CHART DATA MOUSE ENTER",
						event.getChartData());
			}
		});

		chart.addHandler(new ChartDataMouseLeaveHandler() {
			@Override
			public void onChartDataMouseLeave(ChartDataMouseLeaveEvent event) {
				showEventNotification("CHART DATA MOUSE LEAVE",
						event.getChartData());
			}
		});

		chart.addHandler(new ChartDataClickHandler() {
			@Override
			public void onChartDataClick(ChartDataClickEvent event) {
				showEventNotification("CHART DATA CLICK", event.getChartData());
			}
		});

		chart.addHandler(new ChartDataRightClickHandler() {
			@Override
			public void onChartDataRightClick(ChartDataRightClickEvent event) {
				showEventNotification("CHART DATA RIGHT CLICK",
						event.getChartData());
			}
		});

		chart.addHandler(new ChartImageChangeHandler() {
			@Override
			public void onChartImageChange(ChartImageChangeEvent event) {
				showEventNotification("CHART IMAGE CHANGE",
						event.getChartImage());
			}
		});

		return chart;
	}

	private DCharts chartsDemo2() {
		DCharts chart = new DCharts();
		chart.autoSelectDecimalAndThousandsSeparator(new Locale("sl", "SI"));
		chart.setCaption("test");

		DataSeries dataSeries = new DataSeries().newSeries()
				.add(11, 123, 1236, "Acura").add(45, 92, 1067, "Alfa Romeo")
				.add(24, 104, 1176, "AM General")
				.add(50, 23, 610, "Aston Martin Lagonda")
				.add(18, 17, 539, "Audi").add(7, 89, 864, "BMW")
				.add(2, 13, 1026, "Bugatti");

		SeriesDefaults seriesDefaults = new SeriesDefaults()
				.setRenderer(SeriesRenderers.BUBBLE)
				.setRendererOptions(
						new BubbleRenderer().setBubbleAlpha(0.6f)
								.setHighlightAlpha(0.8f)).setShadow(true)
				.setShadowAlpha(0.05f);

		Options options = new Options().setCaptureRightClick(true)
				.setSeriesDefaults(seriesDefaults);
		chart.setDataSeries(dataSeries).setOptions(options).show();

		chart.setEnableChartDataMouseEnterEvent(true);
		chart.setEnableChartDataMouseLeaveEvent(true);
		chart.setEnableChartDataClickEvent(true);
		chart.setEnableChartDataRightClickEvent(true);

		chart.addHandler(new ChartDataMouseEnterHandler() {
			@Override
			public void onChartDataMouseEnter(ChartDataMouseEnterEvent event) {
				showEventNotification("CHART DATA MOUSE ENTER",
						event.getChartData());
			}
		});

		chart.addHandler(new ChartDataMouseLeaveHandler() {
			@Override
			public void onChartDataMouseLeave(ChartDataMouseLeaveEvent event) {
				showEventNotification("CHART DATA MOUSE LEAVE",
						event.getChartData());
			}
		});

		chart.addHandler(new ChartDataClickHandler() {
			@Override
			public void onChartDataClick(ChartDataClickEvent event) {
				showEventNotification("CHART DATA CLICK", event.getChartData());
			}
		});

		chart.addHandler(new ChartDataRightClickHandler() {
			@Override
			public void onChartDataRightClick(ChartDataRightClickEvent event) {
				showEventNotification("CHART DATA RIGHT CLICK",
						event.getChartData());
			}
		});

		return chart;
	}

	private DCharts chartsDemo3() {
		DataSeries dataSeries = new DataSeries().newSeries().add("none", 23)
				.add("error", 0).add("click", 5).add("impression", 25);

		SeriesDefaults seriesDefaults = new SeriesDefaults().setRenderer(
				SeriesRenderers.PIE).setRendererOptions(
				new PieRenderer().setShowDataLabels(true));

		Options options = new Options().setCaptureRightClick(true)
				.setSeriesDefaults(seriesDefaults);

		final DCharts chart = new DCharts();
		chart.setWidth("400px");
		chart.setHeight("400px");
		chart.setEnableChartDataMouseEnterEvent(true);
		chart.setEnableChartDataMouseLeaveEvent(true);
		chart.setEnableChartDataClickEvent(true);
		chart.setEnableChartDataRightClickEvent(true);

		chart.addHandler(new ChartDataMouseEnterHandler() {
			@Override
			public void onChartDataMouseEnter(ChartDataMouseEnterEvent event) {
				showEventNotification("CHART DATA MOUSE ENTER",
						event.getChartData());
			}
		});

		chart.addHandler(new ChartDataMouseLeaveHandler() {
			@Override
			public void onChartDataMouseLeave(ChartDataMouseLeaveEvent event) {
				showEventNotification("CHART DATA MOUSE LEAVE",
						event.getChartData());
			}
		});

		chart.addHandler(new ChartDataClickHandler() {
			@Override
			public void onChartDataClick(ChartDataClickEvent event) {
				showEventNotification("CHART DATA CLICK", event.getChartData());
			}
		});

		chart.addHandler(new ChartDataRightClickHandler() {
			@Override
			public void onChartDataRightClick(ChartDataRightClickEvent event) {
				showEventNotification("CHART DATA RIGHT CLICK",
						event.getChartData());
			}
		});

		chart.setDataSeries(dataSeries).setOptions(options).show();

		return chart;
	}

	private DCharts chartsDemo4() {
		DataSeries dataSeries = new DataSeries().newSeries().add("none", 23)
				.add("error", 0).add("click", 5).add("impression", 25);

		SeriesDefaults seriesDefaults = new SeriesDefaults().setRenderer(
				SeriesRenderers.PIE).setRendererOptions(
				new PieRenderer().setShowDataLabels(true));

		Options options = new Options().setCaptureRightClick(true)
				.setSeriesDefaults(seriesDefaults);

		DCharts chart = new DCharts();
		chart.setWidth("400px");
		chart.setHeight("400px");
		chart.setEnableChartDataMouseEnterEvent(true);
		chart.setEnableChartDataMouseLeaveEvent(true);
		chart.setEnableChartDataClickEvent(true);
		chart.setEnableChartDataRightClickEvent(true);

		chart.addHandler(new ChartDataMouseEnterHandler() {
			@Override
			public void onChartDataMouseEnter(ChartDataMouseEnterEvent event) {
				showEventNotification("CHART DATA MOUSE ENTER",
						event.getChartData());
			}
		});

		chart.addHandler(new ChartDataMouseLeaveHandler() {
			@Override
			public void onChartDataMouseLeave(ChartDataMouseLeaveEvent event) {
				showEventNotification("CHART DATA MOUSE LEAVE",
						event.getChartData());
			}
		});

		chart.addHandler(new ChartDataClickHandler() {
			@Override
			public void onChartDataClick(ChartDataClickEvent event) {
				showEventNotification("CHART DATA CLICK", event.getChartData());
			}
		});

		chart.addHandler(new ChartDataRightClickHandler() {
			@Override
			public void onChartDataRightClick(ChartDataRightClickEvent event) {
				showEventNotification("CHART DATA RIGHT CLICK",
						event.getChartData());
			}
		});

		chart.setDataSeries(dataSeries).setOptions(options).show();

		return chart;
	}

}
