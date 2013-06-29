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
import org.dussan.vaadin.dcharts.base.elements.PointLabels;
import org.dussan.vaadin.dcharts.base.elements.XYaxis;
import org.dussan.vaadin.dcharts.base.elements.XYseries;
import org.dussan.vaadin.dcharts.canvasoverlays.DashedHorizontalLine;
import org.dussan.vaadin.dcharts.canvasoverlays.HorizontalLine;
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
import org.dussan.vaadin.dcharts.metadata.LegendPlacements;
import org.dussan.vaadin.dcharts.metadata.SeriesToggles;
import org.dussan.vaadin.dcharts.metadata.XYaxes;
import org.dussan.vaadin.dcharts.metadata.Yaxes;
import org.dussan.vaadin.dcharts.metadata.directions.BarDirections;
import org.dussan.vaadin.dcharts.metadata.lines.LineCaps;
import org.dussan.vaadin.dcharts.metadata.locations.LegendLocations;
import org.dussan.vaadin.dcharts.metadata.renderers.AxisRenderers;
import org.dussan.vaadin.dcharts.metadata.renderers.LabelRenderers;
import org.dussan.vaadin.dcharts.metadata.renderers.LegendRenderers;
import org.dussan.vaadin.dcharts.metadata.renderers.SeriesRenderers;
import org.dussan.vaadin.dcharts.metadata.renderers.TickRenderers;
import org.dussan.vaadin.dcharts.metadata.ticks.TickFormatters;
import org.dussan.vaadin.dcharts.options.Axes;
import org.dussan.vaadin.dcharts.options.CanvasOverlay;
import org.dussan.vaadin.dcharts.options.Grid;
import org.dussan.vaadin.dcharts.options.Highlighter;
import org.dussan.vaadin.dcharts.options.Legend;
import org.dussan.vaadin.dcharts.options.Options;
import org.dussan.vaadin.dcharts.options.Series;
import org.dussan.vaadin.dcharts.options.SeriesDefaults;
import org.dussan.vaadin.dcharts.options.Title;
import org.dussan.vaadin.dcharts.renderers.legend.EnhancedLegendRenderer;
import org.dussan.vaadin.dcharts.renderers.series.BarRenderer;
import org.dussan.vaadin.dcharts.renderers.series.BlockRenderer;
import org.dussan.vaadin.dcharts.renderers.series.BubbleRenderer;
import org.dussan.vaadin.dcharts.renderers.series.PieRenderer;
import org.dussan.vaadin.dcharts.renderers.tick.AxisTickRenderer;
import org.dussan.vaadin.dcharts.renderers.tick.CanvasAxisTickRenderer;

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
		DCharts charts3_1 = chartsDemo3_1();
		DCharts charts3_2 = chartsDemo3_2();
		DCharts charts4 = chartsDemo4();
		DCharts charts5 = chartsDemo5();
		DCharts charts6 = chartsDemo6();
		DCharts charts7 = chartsDemo7();
		DCharts charts8 = chartsDemo8();

		HorizontalLayout layout3 = new HorizontalLayout();
		layout3.addComponent(charts3_1);
		layout3.addComponent(charts3_2);

		TabSheet demoTabSheet = new TabSheet();
		layout.addComponent(demoTabSheet);
		demoTabSheet.addTab(charts1, "Demo 1");
		demoTabSheet.addTab(charts2, "Demo 2");
		demoTabSheet.addTab(layout3, "Demo 3");
		demoTabSheet.addTab(charts4, "Demo 4");
		demoTabSheet.addTab(charts5, "Demo 5");
		demoTabSheet.addTab(charts6, "Demo 6");
		demoTabSheet.addTab(charts7, "Demo 7");
		demoTabSheet.addTab(charts8, "Demo 8");
	}

	private DCharts chartsDemo1() {
		DCharts chart = new DCharts();
		chart.autoSelectDecimalAndThousandsSeparator(new Locale("sl", "SI"));
		chart.setHeight("400px");
		chart.setCaption("test");
		chart.setEnableDownload(true);
		chart.setChartImageFormat(ChartImageFormat.GIF);

		DataSeries dataSeries = new DataSeries();
		dataSeries.add(200, 600, 700, 1000);
		dataSeries.add(460, -210, 690, 820);
		dataSeries.add(-260, -440, 320, 200);

		SeriesDefaults seriesDefaults = new SeriesDefaults()
				.setFillToZero(true).setRenderer(SeriesRenderers.BAR);

		Series series = new Series()
				.addSeries(new XYseries().setLabel("Hotel"))
				.addSeries(new XYseries().setLabel("Event Regristration"))
				.addSeries(new XYseries().setLabel("Airfare"));

		Legend legend = new Legend()
				.setShow(true)
				.setRendererOptions(
						new EnhancedLegendRenderer().setSeriesToggle(
								SeriesToggles.SLOW).setSeriesToggleReplot(true))
				.setPlacement(LegendPlacements.OUTSIDE_GRID);

		Axes axes = new Axes().addAxis(
				new XYaxis().setRenderer(AxisRenderers.CATEGORY).setTicks(
						new Ticks().add("May", "June", "July", "August")))
				.addAxis(
						new XYaxis(XYaxes.Y).setPad(1.05f).setTickOptions(
								new AxisTickRenderer().setFormatString("$%d")));

		Options options = new Options().setSeriesDefaults(seriesDefaults)
				.setSeries(series).setLegend(legend).setAxes(axes);

		chart.setDataSeries(dataSeries).setOptions(options)
				.setEnableDownload(true)
				.setChartImageFormat(ChartImageFormat.GIF).show();

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

	private DCharts chartsDemo3_1() {
		DataSeries dataSeries = new DataSeries().newSeries().add("none", 23)
				.add("error", 0).add("click", 5).add("impression", 25);

		SeriesDefaults seriesDefaults = new SeriesDefaults().setRenderer(
				SeriesRenderers.PIE).setRendererOptions(
				new PieRenderer().setShowDataLabels(true));

		Legend legend = new Legend().setShow(true).setLocation(
				LegendLocations.SOUTH);

		Options options = new Options().setCaptureRightClick(true)
				.setSeriesDefaults(seriesDefaults).setLegend(legend);

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

	private DCharts chartsDemo3_2() {
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

	private DCharts chartsDemo4() {
		DataSeries dataSeries = new DataSeries() //
				.add(0.9176, 0.9296, 0.927, 0.9251, 0.9241, 0.9225, 0.9197,
						0.9164, 0.9131, 0.9098, 0.9064, 0.9028, 0.8991, 0.8957,
						0.8925, 0.8896, 0.8869, 0.8844, 0.882, 0.8797, 0.8776,
						0.8755, 0.8735, 0.8715, 0.8696, 0.8677, 0.8658, 0.8637,
						0.8616, 0.8594, 0.8572, 0.8548, 0.8524, 0.8499, 0.8473,
						0.8446, 0.8418, 0.8389, 0.8359, 0.8328, 0.8295, 0.8262,
						0.8227, 0.8191, 0.8155, 0.8119, 0.8083, 0.8048, 0.8013,
						0.7979, 0.7945, 0.7912, 0.7879, 0.7846, 0.7813, 0.778,
						0.7747, 0.7714, 0.768, 0.7647, 0.7612, 0.7577, 0.7538,
						0.7496, 0.7449, 0.7398, 0.7342, 0.7279, 0.721, 0.7137,
						0.7059, 0.6977, 0.6889, 0.6797, 0.6698, 0.6593, 0.6482,
						0.6367, 0.6247, 0.6121, 0.5989, 0.5852, 0.571, 0.5561,
						0.5402, 0.5232, 0.505, 0.4855, 0.4643, 0.4414, 0.4166,
						0.3893, 0.3577, 0.3204, 0.2764, 0.2272, 0.1774, 0.1231,
						0.0855, 0.0849) //
				.add(0.0824, 0.0704, 0.073, 0.0749, 0.0759, 0.0775, 0.0803,
						0.0836, 0.0869, 0.0902, 0.0936, 0.0972, 0.1009, 0.1043,
						0.1075, 0.1104, 0.1131, 0.1156, 0.118, 0.1203, 0.1224,
						0.1245, 0.1265, 0.1285, 0.1304, 0.1323, 0.1342, 0.1363,
						0.1384, 0.1406, 0.1428, 0.1452, 0.1476, 0.1501, 0.1527,
						0.1554, 0.1582, 0.1611, 0.1641, 0.1672, 0.1705, 0.1738,
						0.1773, 0.1809, 0.1845, 0.1881, 0.1917, 0.1952, 0.1987,
						0.2021, 0.2055, 0.2088, 0.2121, 0.2154, 0.2187, 0.222,
						0.2253, 0.2286, 0.232, 0.2353, 0.2388, 0.2423, 0.2462,
						0.2504, 0.2551, 0.2602, 0.2658, 0.2721, 0.279, 0.2863,
						0.2941, 0.3023, 0.3111, 0.3203, 0.3302, 0.3407, 0.3518,
						0.3633, 0.3753, 0.3879, 0.4011, 0.4148, 0.429, 0.4439,
						0.4598, 0.4768, 0.495, 0.5145, 0.5357, 0.5586, 0.5834,
						0.6107, 0.6423, 0.6796, 0.7236, 0.7728, 0.8226, 0.8769,
						0.9145, 0.9151);

		Title title = new Title(
				"Contribution of Urban and Rural Population to National Percentiles (edited data)");

		SeriesDefaults seriesDefaults = new SeriesDefaults()
				.setShowMarker(false).setFill(true).setFillAndStroke(true);

		Legend legend = new Legend()
				.setShow(true)
				.setRenderer(LegendRenderers.ENHANCED)
				.setRendererOptions(
						new EnhancedLegendRenderer().setNumberRows(1))
				.setPlacement(LegendPlacements.OUTSIDE_GRID)
				.setLabels("Rural", "Urban").setLocation(LegendLocations.SOUTH);

		Axes axes = new Axes().addAxis(
				new XYaxis(XYaxes.X)
						.setPad(0)
						.setMin(1)
						.setMax(100)
						.setLabel("Population Percentile")
						.setLabelRenderer(LabelRenderers.CANVAS)
						.setTickInterval(3)
						.setTickOptions(
								new CanvasAxisTickRenderer()
										.setShowGridline(false))).addAxis(
				new XYaxis(XYaxes.Y)
						.setMin(0)
						.setMax(1)
						.setLabel("Percentage of Population")
						.setLabelRenderer(LabelRenderers.CANVAS)
						.setTickOptions(
								new CanvasAxisTickRenderer()
										.setFormatter(TickFormatters.PERCENT)
										.setShowGridline(false)
										.setFormatString("%d%%")));

		Grid grid = new Grid().setDrawBorder(false).setShadow(false)
				.setBackground("white");

		Options options = new Options().setTitle(title).setStackSeries(true)
				.setSeriesColors("#77933C", "#B9CDE5")
				.setSeriesDefaults(seriesDefaults).setLegend(legend)
				.setAxes(axes).setGrid(grid);

		DCharts chart = new DCharts();
		chart.setWidth(750, Unit.PIXELS);
		chart.setHeight(300, Unit.PIXELS);
		chart.setMarginRight(10);
		chart.setEnableDownload(true);
		chart.setChartImageFormat(ChartImageFormat.GIF);
		chart.setDataSeries(dataSeries).setOptions(options).show();

		return chart;
	}

	private DCharts chartsDemo5() {
		DataSeries dataSeries = new DataSeries()
				.newSeries()
				.add(0.9, 120, "Vernors")
				.add(1.8, 140, "Fanta")
				.add(3.2, 90, "Barqs", "{background:'#ddbb33'}")
				.add(4.1, 140, "Arizon Iced Tea")
				.add(4.5, 91, "Red Bull")
				.add(6.8, 17, "Go Girl")
				//
				.newSeries().add(1.3, 44, "Pepsi").add(2.1, 170, "Sierra Mist")
				.add(2.6, 66, "Moutain Dew")
				.add(4, 52, "Sobe")
				.add(5.4, 16, "Amp")
				.add(6, 48, "Aquafina")
				//
				.newSeries()
				.add(1, 59, "Coca-Cola", "{background:'rgb(250, 160, 160)'}")
				.add(2, 50, "Ambasa").add(3, 90, "Mello Yello")
				.add(4, 90, "Sprite").add(5, 71, "Squirt").add(5, 155, "Youki");

		SeriesDefaults seriesDefaults = new SeriesDefaults()
				.setRenderer(SeriesRenderers.BLOCK);

		Legend legend = new Legend()
				.setShow(true)
				.setRenderer(LegendRenderers.ENHANCED)
				.setRendererOptions(
						new EnhancedLegendRenderer()
								.setSeriesToggleReplot(true));

		Axes axes = new Axes()
				.addAxis(new XYaxis(XYaxes.X).setMin(0).setMax(8)).addAxis(
						new XYaxis(XYaxes.Y).setMin(0).setMax(200));

		Series series = new Series()
				.addSeries(new XYseries())
				.addSeries(
						new XYseries()
								.setRenderer(SeriesRenderers.BLOCK)
								.setRendererOptions(
										new BlockRenderer()
												.setCss("background:'#A1EED6'")))
				.addSeries(
						new XYseries()
								.setRenderer(SeriesRenderers.BLOCK)
								.setRendererOptions(
										new BlockRenderer()
												.setCss("background:'#D3E4A0'")));

		Options options = new Options().setSeriesDefaults(seriesDefaults)
				.setLegend(legend).setAxes(axes).setSeries(series);

		DCharts chart = new DCharts();
		chart.setWidth("500px");
		chart.setHeight("300px");
		chart.setDataSeries(dataSeries).setOptions(options).show();
		return chart;
	}

	private DCharts chartsDemo6() {
		DataSeries dataSeries = new DataSeries().add(2, 6, 7, 12);

		SeriesDefaults seriesDefaults = new SeriesDefaults()
				.setRenderer(SeriesRenderers.BAR);

		Axes axes = new Axes().addAxis(new XYaxis().setRenderer(
				AxisRenderers.CATEGORY).setTicks(
				new Ticks().add("a", "b", "c", "d")));

		Highlighter highlighter = new Highlighter().setShow(false);

		CanvasOverlay canvasOverlay = new CanvasOverlay()
				.setShow(true)
				.setObject(
						new HorizontalLine().setY(4).setLineWidth(6)
								.setColor("rgb(100, 55, 124)").setShadow(false))
				.setObject(
						new HorizontalLine().setY(6).setLineWidth(12)
								.setXminOffset("8px").setXmaxOffset("29px")
								.setColor("rgb(50, 55, 30)").setShadow(false))
				.setObject(
						new DashedHorizontalLine().setY(8).setLineWidth(6)
								.setXoffset(1).setColor("rgb(133, 120, 24)")
								.setShadow(false))
				.setObject(
						new HorizontalLine().setY(10).setLineWidth(3)
								.setXoffset(0).setColor("rgb(89, 198, 154)")
								.setShadow(false))
				.setObject(
						new DashedHorizontalLine().setY(13).setLineWidth(3)
								.setDashPattern(16, 12).setXoffset(0)
								.setLineCap(LineCaps.ROUND)
								.setColor("rgb(66, 98, 144)").setShadow(false));

		Options options = new Options().setSeriesDefaults(seriesDefaults)
				.setAxes(axes).setHighlighter(highlighter)
				.setCanvasOverlay(canvasOverlay);

		DCharts chart = new DCharts();
		chart.setWidth(450, Unit.PIXELS);
		chart.setHeight(300, Unit.PIXELS);
		chart.setDataSeries(dataSeries).setOptions(options).show();
		return chart;
	}

	private DCharts chartsDemo7() {
		DataSeries dataSeries = new DataSeries();
		dataSeries.newSeries().add(2, 1).add(4, 2).add(6, 3).add(3, 4);
		dataSeries.newSeries().add(5, 1).add(1, 2).add(3, 3).add(4, 4);
		dataSeries.newSeries().add(4, 1).add(12, 2).add(1, 3).add(2, 4);

		SeriesDefaults seriesDefaults = new SeriesDefaults()
				.setRenderer(SeriesRenderers.BAR)
				.setShadowAngle(135)
				.setRendererOptions(
						new BarRenderer()
								.setBarDirection(BarDirections.HOTIZONTAL));

		Axes axes = new Axes().addAxis(new XYaxis(XYaxes.Y)
				.setRenderer(AxisRenderers.CATEGORY));

		Legend legend = new Legend()
				.setShow(true)
				.setPlacement(LegendPlacements.OUTSIDE_GRID)
				.setRenderer(LegendRenderers.ENHANCED)
				.setRendererOptions(
						new EnhancedLegendRenderer().setSeriesToggle(
								SeriesToggles.SLOW).setSeriesToggleReplot(true));

		Options options = new Options().setSeriesDefaults(seriesDefaults)
				.setAxes(axes).setLegend(legend);

		DCharts chart = new DCharts();
		chart.setWidth(450, Unit.PIXELS);
		chart.setHeight(300, Unit.PIXELS);
		chart.setDataSeries(dataSeries).setOptions(options).show();
		return chart;
	}

	private DCharts chartsDemo8() {
		DataSeries dataSeries = new DataSeries()
				.add(14, 3, 4, -3, 5, 2, -3, -7);

		SeriesDefaults seriesDefaults = new SeriesDefaults()
				.setRenderer(SeriesRenderers.BAR)
				.setRendererOptions(
						new BarRenderer().setWaterfall(true).setVaryBarColor(
								true))
				.setPointLabels(new PointLabels().setHideZeros(true))
				.setYaxis(Yaxes.Y2);

		Ticks ticks = new Ticks().add("2008", "Apricots", "Tomatoes",
				"Potatoes", "Rhubarb", "Squash", "Grapes", "Peanuts");
		ticks.add("2009");

		Axes axes = new Axes().addAxis(
				new XYaxis()
						.setRenderer(AxisRenderers.CATEGORY)
						.setTicks(ticks)
						.setTickRenderer(TickRenderers.CANVAS)
						.setTickOptions(
								new CanvasAxisTickRenderer().setAngle(-90)
										.setFontSize("10pt").setShowMark(false)
										.setShowGridline(false))).addAxis(
				new XYaxis(XYaxes.Y2).setMin(0).setTickInterval(5));

		Title title = new Title("Crop Yield Charnge, 2008 to 2009");

		Options options = new Options().setSeriesDefaults(seriesDefaults)
				.setAxes(axes).setTitle(title);

		DCharts chart = new DCharts();
		chart.setWidth(450, Unit.PIXELS);
		chart.setHeight(300, Unit.PIXELS);
		chart.setDataSeries(dataSeries).setOptions(options).show();
		return chart;
	}

}
