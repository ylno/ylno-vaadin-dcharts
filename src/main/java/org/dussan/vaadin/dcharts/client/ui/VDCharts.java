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
package org.dussan.vaadin.dcharts.client.ui;

import java.util.HashMap;
import java.util.Map;

import org.dussan.vaadin.dcharts.client.events.EventObject;
import org.dussan.vaadin.dcharts.client.events.EventProcessor;
import org.dussan.vaadin.dcharts.client.handlers.BarDataHandler;
import org.dussan.vaadin.dcharts.client.handlers.BubbleDataHandler;
import org.dussan.vaadin.dcharts.client.handlers.DonutDataHandler;
import org.dussan.vaadin.dcharts.client.handlers.LineDataHandler;
import org.dussan.vaadin.dcharts.client.handlers.OhlcDataHandler;
import org.dussan.vaadin.dcharts.client.handlers.PieDataHandler;
import org.dussan.vaadin.dcharts.client.handlers.PyramidDataHandler;
import org.dussan.vaadin.dcharts.client.js.JqPlot;
import org.dussan.vaadin.dcharts.client.js.injector.JavaScriptInjector;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.logical.shared.HasValueChangeHandlers;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.vaadin.client.BrowserInfo;
import com.vaadin.client.ui.VHorizontalLayout;

public class VDCharts extends VHorizontalLayout implements
		HasValueChangeHandlers<Object[]> {

	private static final int DECIMAL_SEPARATOR = 0;
	private static final int THOUSANDS_SEPARATOR = 1;
	private static final int DATA_SERIES = 2;
	private static final int OPTIONS = 3;
	private static final int SHOW_CHART = 4;
	private static final int REPLOT_CHART = 5;
	private static final int REFRESH_CHART = 6;
	private static final int MARGIN_TOP = 7;
	private static final int MARGIN_RIGHT = 8;
	private static final int MARGIN_BOTTOM = 9;
	private static final int MARGIN_LEFT = 10;
	private static final int MOUSE_ENTER_EVENT = 11;
	private static final int MOUSE_LEAVE_EVENT = 12;
	private static final int CLICK_EVENT = 13;
	private static final int RIGHT_CLICK_EVENT = 14;

	private Map<Integer, String> chartData = null;
	private Element chart = null;
	private EventObject eventObject = null;

	private Boolean showChart = null;
	private String decimalSeparator = null;
	private String thousandsSeparator = null;
	private String dataSeries = null;
	private String options = null;

	private Boolean enableChartDataMouseEnterEvent = null;
	private Boolean enableChartDataMouseLeaveEvent = null;
	private Boolean enableChartDataClickEvent = null;
	private Boolean enableChartDataRightClickEvent = null;

	public VDCharts() {
		decimalSeparator = ".";
		thousandsSeparator = ",";
		setStyleName("v-dcharts");

		// enable/disable mouse events
		enableChartDataMouseEnterEvent = false;
		enableChartDataMouseLeaveEvent = false;
		enableChartDataClickEvent = false;
		enableChartDataRightClickEvent = false;
	}

	private void loadJQueryLibrary() {
		JavaScriptInjector.inject(JqPlot.CODE.jQuery().getText());
	}

	private void loadJqPlotLibrary() {
		// inject JqPlot css
		JqPlot.CODE.css().ensureInjected();

		// inject canvas emulator for Microsoft Internet Explorer
		if (BrowserInfo.get().isIE() && !BrowserInfo.get().isIE9()
				&& !BrowserInfo.get().isIE10()) {
			JavaScriptInjector.inject(JqPlot.CODE.exCanvas().getText());
		}

		// initialize main JqPlot libraries
		JavaScriptInjector.inject(JqPlot.CODE.jqPlot().getText());
		JavaScriptInjector.inject(JqPlot.CODE.canvasTextRenderer().getText());
	}

	private static native void showChart(String id, String dataSeries,
			String options, String decimalSeparator, String thousandsSeparator)
	/*-{
	 	eval("var _options="+options+";");
	 	eval("var _dataSeries="+dataSeries+";");
		$wnd.jQuery(document).ready(function($){
			$wnd.jQuery('#'.concat(id)).empty();
			$.jqplot.sprintf.decimalMark=decimalSeparator;
			$.jqplot.sprintf.thousandsSeparator=thousandsSeparator;
			$wnd.chart=$.jqplot(id, _dataSeries, _options);
		});
	}-*/;

	private static native void replotChart(String id, Boolean reset)
	/*-{
		if($wnd.chart){
			$wnd.jQuery(document).ready(function($){
				$wnd.chart.replot({resetAxes: reset});
			});
		}
	}-*/;

	private void activateJqPlotPlugins(String options) {
		if (enableChartDataClickEvent) {
			LineDataHandler.activateClick(this, chart.getId());
		}
		if (enableChartDataRightClickEvent) {
			LineDataHandler.activateRightClick(this, chart.getId());
		}

		if (options.contains("$wnd.jQuery.jqplot.BarRenderer")) {
			JavaScriptInjector.inject(JqPlot.CODE.barRenderer().getText());
			if (enableChartDataMouseEnterEvent) {
				BarDataHandler.activateMouseEnter(this, chart.getId());
			}
			if (enableChartDataMouseLeaveEvent) {
				BarDataHandler.activateMouseLeave(this, chart.getId());
			}
			if (enableChartDataClickEvent) {
				BarDataHandler.activateClick(this, chart.getId());
			}
			if (enableChartDataRightClickEvent) {
				BarDataHandler.activateRightClick(this, chart.getId());
			}
		}

		if (options.contains("$wnd.jQuery.jqplot.BubbleRenderer")) {
			JavaScriptInjector.inject(JqPlot.CODE.bubbleRenderer().getText());
			if (enableChartDataMouseEnterEvent) {
				BubbleDataHandler.activateMouseEnter(this, chart.getId());
			}
			if (enableChartDataMouseLeaveEvent) {
				BubbleDataHandler.activateMouseLeave(this, chart.getId());
			}
			if (enableChartDataClickEvent) {
				BubbleDataHandler.activateClick(this, chart.getId());
			}
			if (enableChartDataRightClickEvent) {
				BubbleDataHandler.activateRightClick(this, chart.getId());
			}
		}

		if (options.contains("$wnd.jQuery.jqplot.CategoryAxisRenderer")) {
			JavaScriptInjector.inject(JqPlot.CODE.categoryAxisRenderer()
					.getText());
		}
		if (options.contains("$wnd.jQuery.jqplot.CanvasAxisLabelRenderer")) {
			JavaScriptInjector.inject(JqPlot.CODE.canvasAxisLabelRenderer()
					.getText());
		}

		if (options.contains("$wnd.jQuery.jqplot.CanvasAxisTickRenderer")) {
			JavaScriptInjector.inject(JqPlot.CODE.canvasAxisTickRenderer()
					.getText());
		}

		if (options.contains("$wnd.jQuery.jqplot.DateAxisRenderer")) {
			JavaScriptInjector.inject(JqPlot.CODE.dateAxisRenderer().getText());
		}

		if (options.contains("$wnd.jQuery.jqplot.DonutRenderer")) {
			JavaScriptInjector.inject(JqPlot.CODE.donutRenderer().getText());
			if (enableChartDataMouseEnterEvent) {
				DonutDataHandler.activateMouseEnter(this, chart.getId());
			}
			if (enableChartDataMouseLeaveEvent) {
				DonutDataHandler.activateMouseLeave(this, chart.getId());
			}
			if (enableChartDataClickEvent) {
				DonutDataHandler.activateClick(this, chart.getId());
			}
			if (enableChartDataRightClickEvent) {
				DonutDataHandler.activateRightClick(this, chart.getId());
			}
		}

		if (options.contains("$wnd.jQuery.jqplot.EnhancedLegendRenderer")) {
			JavaScriptInjector.inject(JqPlot.CODE.enhancedLegendRenderer()
					.getText());
		}

		if (options.contains("$wnd.jQuery.jqplot.LogAxisRenderer")) {
			JavaScriptInjector.inject(JqPlot.CODE.logAxisRenderer().getText());
		}

		if (options.contains("$wnd.jQuery.jqplot.MeterGaugeRenderer")) {
			JavaScriptInjector.inject(JqPlot.CODE.meterGaugeRenderer()
					.getText());
		}

		if (options.contains("$wnd.jQuery.jqplot.PieRenderer")) {
			JavaScriptInjector.inject(JqPlot.CODE.pieRenderer().getText());
			if (enableChartDataMouseEnterEvent) {
				PieDataHandler.activateMouseEnter(this, chart.getId());
			}
			if (enableChartDataMouseLeaveEvent) {
				PieDataHandler.activateMouseLeave(this, chart.getId());
			}
			if (enableChartDataClickEvent) {
				PieDataHandler.activateClick(this, chart.getId());
			}
			if (enableChartDataRightClickEvent) {
				PieDataHandler.activateRightClick(this, chart.getId());
			}
		}

		if (options.contains("$wnd.jQuery.jqplot.PyramidAxisRenderer")) {
			JavaScriptInjector.inject(JqPlot.CODE.pyramidAxisRenderer()
					.getText());
		}

		if (options.contains("$wnd.jQuery.jqplot.PyramidGridRenderer")) {
			JavaScriptInjector.inject(JqPlot.CODE.pyramidGridRenderer()
					.getText());
		}

		if (options.contains("$wnd.jQuery.jqplot.PyramidRenderer")) {
			JavaScriptInjector.inject(JqPlot.CODE.pyramidRenderer().getText());
			if (enableChartDataMouseEnterEvent) {
				PyramidDataHandler.activateMouseEnter(this, chart.getId());
			}
			if (enableChartDataMouseLeaveEvent) {
				PyramidDataHandler.activateMouseLeave(this, chart.getId());
			}
		}

		if (options.contains("$wnd.jQuery.jqplot.OHLCRenderer")) {
			JavaScriptInjector.inject(JqPlot.CODE.ohlcRenderer().getText());
			if (enableChartDataMouseEnterEvent) {
				OhlcDataHandler.activateMouseEnter(this, chart.getId());
			}
			if (enableChartDataMouseLeaveEvent) {
				OhlcDataHandler.activateMouseLeave(this, chart.getId());
			}
			if (enableChartDataClickEvent) {
				OhlcDataHandler.activateClick(this, chart.getId());
			}
		}

		if (options.contains("cursor:")) {
			JavaScriptInjector.inject(JqPlot.CODE.cursor().getText());
		}

		if (options.contains("highlighter:")) {
			JavaScriptInjector.inject(JqPlot.CODE.highlighter().getText());
		}

		if (options.contains("pointLabels:")) {
			JavaScriptInjector.inject(JqPlot.CODE.pointLabels().getText());
		}

		if (options.contains("trendline:")) {
			JavaScriptInjector.inject(JqPlot.CODE.trendline().getText());
		}
	}

	private String checkEnabledAnimationEffects(String options) {
		if (BrowserInfo.get().isIE() && !BrowserInfo.get().isIE9()
				&& !BrowserInfo.get().isIE10()) {
			options = options.replaceAll("animate: true", "animate: false");
		}
		return options;
	}

	private String setChartDimensions(String options) {
		StringBuilder value = new StringBuilder();
		if (options != null && options.length() > 0) {
			value.append("{width: '");
			value.append(getOffsetWidth());
			value.append("px', height: '");
			if (getOffsetHeight() > 0) {
				value.append(getOffsetHeight() + "px', ");
			} else {
				value.append(getParent().getOffsetHeight() + "px', ");
			}
			value.append(options.substring(1));
		}
		return value.toString();
	}

	private void fireEvent(String id, String event, String data) {
		if (eventObject == null
				|| !eventObject.equals(new EventObject(id, event, data))) {
			Map<String, String> eventData = new HashMap<String, String>();
			eventData.put("id", id == null ? new String() : id);
			eventData.put("event", event == null ? new String() : event);
			eventData.put("data", data == null ? "" : data);
			eventObject = new EventObject(id, event, data);
			// send event data to server
			EventProcessor.fireEvent(this, eventData);
		}
	}

	@Override
	public HandlerRegistration addValueChangeHandler(
			ValueChangeHandler<Object[]> handler) {
		HandlerRegistration registration = this.addHandler(handler,
				ValueChangeEvent.getType());
		return registration;
	}

	public boolean isChartPrepared() {
		return (chart != null && chart.hasParentElement());
	}

	public void prepareChart() {
		// load JS libraries
		loadJQueryLibrary();
		loadJqPlotLibrary();

		chart = getElement().getFirstChildElement();
		processChartData(chartData);
		chartData.clear();
	}

	public void refreshChart() {
		if (isChartPrepared() && showChart) {
			showChart(chart.getId(), dataSeries, options, decimalSeparator,
					thousandsSeparator);
		}
	}

	public void processChartData(Map<Integer, String> chartData) {
		if (chartData != null && chartData.size() > 0) {
			if (!isChartPrepared()) {
				this.chartData = chartData;
			} else {
				if (chartData.containsKey(MARGIN_TOP)
						|| chartData.containsKey(MARGIN_BOTTOM)) {
					int top = chartData.containsKey(MARGIN_TOP) ? Integer
							.parseInt(chartData.get(MARGIN_TOP)) : 0;
					int bottom = chartData.containsKey(MARGIN_BOTTOM) ? Integer
							.parseInt(chartData.get(MARGIN_BOTTOM)) : 0;
					getElement().getStyle().setHeight(
							getElement().getOffsetHeight() - top - bottom,
							Unit.PX);
					getElement().getStyle().setMarginTop(top, Unit.PX);
					getElement().getStyle().setMarginBottom(bottom, Unit.PX);
				}

				if (chartData.containsKey(MARGIN_LEFT)
						|| chartData.containsKey(MARGIN_RIGHT)) {
					int left = chartData.containsKey(MARGIN_LEFT) ? Integer
							.parseInt(chartData.get(MARGIN_LEFT)) : 0;
					int right = chartData.containsKey(MARGIN_RIGHT) ? Integer
							.parseInt(chartData.get(MARGIN_RIGHT)) : 0;
					getElement().getStyle().setWidth(
							getElement().getOffsetWidth() - left, Unit.PX);
					getElement().getStyle().setMarginLeft(left, Unit.PX);
					chart.getStyle().setMarginRight(right, Unit.PX);
				}

				if (chartData.containsKey(MOUSE_ENTER_EVENT)) {
					enableChartDataMouseEnterEvent = Boolean
							.parseBoolean(chartData.get(MOUSE_ENTER_EVENT));
				}

				if (chartData.containsKey(MOUSE_LEAVE_EVENT)) {
					enableChartDataMouseLeaveEvent = Boolean
							.parseBoolean(chartData.get(MOUSE_LEAVE_EVENT));
				}

				if (chartData.containsKey(CLICK_EVENT)) {
					enableChartDataClickEvent = Boolean.parseBoolean(chartData
							.get(CLICK_EVENT));
				}

				if (chartData.containsKey(RIGHT_CLICK_EVENT)) {
					enableChartDataRightClickEvent = Boolean
							.parseBoolean(chartData.get(RIGHT_CLICK_EVENT));
				}

				if (chartData.containsKey(DECIMAL_SEPARATOR)) {
					decimalSeparator = chartData.get(DECIMAL_SEPARATOR);
				}

				if (chartData.containsKey(THOUSANDS_SEPARATOR)) {
					thousandsSeparator = chartData.get(THOUSANDS_SEPARATOR);
				}

				dataSeries = new String("[]");
				if (chartData.containsKey(DATA_SERIES) && dataSeries != null
						&& !dataSeries.isEmpty()) {
					dataSeries = chartData.get(DATA_SERIES);
				}

				options = new String("{}");
				if (chartData.containsKey(OPTIONS)) {
					options = chartData.get(OPTIONS);
					options = checkEnabledAnimationEffects(options);
					activateJqPlotPlugins(options);
				}
				options = setChartDimensions(options);

				if (chartData.containsKey(SHOW_CHART)) {
					showChart = Boolean.parseBoolean(chartData.get(SHOW_CHART));
					if (showChart) {
						getElement().getStyle().clearDisplay();
						showChart(chart.getId(), dataSeries, options,
								decimalSeparator, thousandsSeparator);
					} else {
						getElement().getStyle().setDisplay(Display.NONE);
					}
				}

				if (chartData.containsKey(REPLOT_CHART) && showChart) {
					replotChart(chart.getId(),
							Boolean.parseBoolean(chartData.get(REPLOT_CHART)));
				}

				if (chartData.containsKey(REFRESH_CHART) && showChart) {
					if (Boolean.parseBoolean(chartData.get(REFRESH_CHART))) {
						refreshChart();
					}
				}
			}
		}
	}

	public void a() {
		replotChart(chart.getId(), true);
	}

}
