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

import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.RepeatingCommand;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.dom.client.Style.Float;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.logical.shared.HasValueChangeHandlers;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.DOM;
import com.vaadin.client.BrowserInfo;
import com.vaadin.client.ui.VHorizontalLayout;

public class VDCharts extends VHorizontalLayout implements
		HasValueChangeHandlers<Object[]> {

	private static final int ID = 0;
	private static final int DECIMAL_SEPARATOR = 1;
	private static final int THOUSANDS_SEPARATOR = 2;
	private static final int DATA_SERIES = 3;
	private static final int OPTIONS = 4;
	private static final int SHOW_CHART = 5;
	private static final int REPLOT_CHART_CLEAR = 6;
	private static final int REPLOT_CHART_RESET_AXES = 7;
	private static final int MARGIN_TOP = 8;
	private static final int MARGIN_RIGHT = 9;
	private static final int MARGIN_BOTTOM = 10;
	private static final int MARGIN_LEFT = 11;
	private static final int MOUSE_ENTER_EVENT = 12;
	private static final int MOUSE_LEAVE_EVENT = 13;
	private static final int CLICK_EVENT = 14;
	private static final int RIGHT_CLICK_EVENT = 15;
	private static final int CHART_IMAGE_CHANGE_DELAY = 16;
	private static final int CHART_IMAGE_CHANGE_EVENT = 17;
	private static final int DOWNLOAD_BUTTON_ENABLE = 18;
	private static final int DOWNLOAD_BUTTON_LOCATION = 19;

	private static final int DOWNLOAD_BUTTON_LOCATION_TOP_LEFT = 0;
	private static final int DOWNLOAD_BUTTON_LOCATION_TOP_RIGHT = 1;
	private static final int DOWNLOAD_BUTTON_LOCATION_BOTTOM_LEFT = 2;
	private static final int DOWNLOAD_BUTTON_LOCATION_BOTTOM_RIGHT = 3;

	private Map<Integer, String> chartData = null;
	private Element chart = null;
	private EventObject eventObject = null;
	private EventObject chartImageEventObject = null;

	private Boolean showChart = null;
	private Boolean downloadButtonEnabled = null;
	private Integer downloadButtonLocation = null;
	private Integer chartImageChangeDelay = null;
	private String chartId = null;
	private String decimalSeparator = null;
	private String thousandsSeparator = null;
	private String dataSeries = null;
	private String options = null;

	private Boolean enableChartDataMouseEnterEvent = null;
	private Boolean enableChartDataMouseLeaveEvent = null;
	private Boolean enableChartDataClickEvent = null;
	private Boolean enableChartDataRightClickEvent = null;
	private Boolean enableChartImageChangeEvent = null;

	public VDCharts() {
		chartImageChangeDelay = 600;
		downloadButtonEnabled = false;
		downloadButtonLocation = DOWNLOAD_BUTTON_LOCATION_TOP_RIGHT;
		decimalSeparator = ".";
		thousandsSeparator = ",";
		setStyleName("v-dcharts");

		// enable/disable mouse events
		enableChartDataMouseEnterEvent = false;
		enableChartDataMouseLeaveEvent = false;
		enableChartDataClickEvent = false;
		enableChartDataRightClickEvent = false;
		enableChartImageChangeEvent = false;
	}

	private VDCharts getThis() {
		return this;
	}

	private void loadJQueryLibrary() {
		if (!JavaScriptInjector.isJQueryLibraryLoaded()) {
			JavaScriptInjector.inject(JqPlot.CODE.jQuery().getText());
			JavaScriptInjector.inject(JqPlot.CODE.attrChange().getText());
		}
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
		if (!JavaScriptInjector.isJqPlotLibraryLoaded()) {
			JavaScriptInjector.inject(JqPlot.CODE.jqPlot().getText());
			JavaScriptInjector.inject(JqPlot.CODE.canvasTextRenderer()
					.getText());
		}
	}

	private native void showChart(VDCharts c, String id, String dataSeries,
			String options, String decimalSeparator, String thousandsSeparator)
	/*-{
		$wnd.jQuery(document).ready(function($){
		 	var _options = eval("("+options+")");
		 	var _dataSeries = eval("("+dataSeries+")");
			$wnd.jQuery('#'.concat(id)).empty();
			$.jqplot.sprintf.decimalMark=decimalSeparator;
			$.jqplot.sprintf.thousandsSeparator=thousandsSeparator;
			$.jqplot(id, _dataSeries, _options);
			// send first chart image
			c.@org.dussan.vaadin.dcharts.client.ui.VDCharts::sendChartImageToServer()();
			// and then watch for changes
			$wnd.jQuery('#'.concat(id)).find('.jqplot-series-canvas').attrchange(function(attrName) {
				if($wnd.jQuery('#'.concat(id).concat('-button')).size() == 1 && 
					$wnd.jQuery('#'.concat(id).concat('-button-clone')).size() == 0) {
					var button = $wnd.jQuery('#'.concat(id).concat('-button'));
					button.clone().attr('id',button.attr('id').concat('-clone'))
						.css('top',button.position().top).css('left',button.position().left)
						.css('position','absolute').appendTo(button.parent());
					$wnd.jQuery('#'.concat(id).concat('-button-clone')).find('.v-button-caption').css('color','red');
				}
				c.@org.dussan.vaadin.dcharts.client.ui.VDCharts::sendChartImageToServer()();
			});
		});
	}-*/;

	private native void replotChart(VDCharts c, String id, Boolean clearChart,
			Boolean resetChartAxes)
	/*-{
		$wnd.jQuery(document).ready(function($){
			$wnd.jQuery('#'.concat(id)).replot({clear:clearChart,resetAxes:resetChartAxes});
			c.@org.dussan.vaadin.dcharts.client.ui.VDCharts::sendChartImageToServer()();
		});
	}-*/;

	private native void fireEventForSendingChartImageToServer(VDCharts c,
			String id)
	/*-{
		$wnd.jQuery(document).ready(function($) {
			var event = 'rawImageData';
			var data = $wnd.jQuery('#'.concat(id)).jqplotToImageStr();
			c.@org.dussan.vaadin.dcharts.client.ui.VDCharts::fireEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)(id, event, data);
			$wnd.jQuery('#'.concat(id).concat('-button-clone')).remove();
		});
	}-*/;

	private void activateJqPlotPlugins(String options) {
		if (enableChartDataClickEvent) {
			LineDataHandler.activateClick(this, chart.getId());
		}

		if (enableChartDataRightClickEvent) {
			LineDataHandler.activateRightClick(this, chart.getId());
		}

		if (options.contains("$wnd.jQuery.jqplot.BarRenderer")) {
			if (!JavaScriptInjector.isBarRendererLoaded()) {
				JavaScriptInjector.inject(JqPlot.CODE.barRenderer().getText());
			}
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

		if (options.contains("$wnd.jQuery.jqplot.BlockRenderer")
				&& !JavaScriptInjector.isBlockRendererLoaded()) {
			JavaScriptInjector.inject(JqPlot.CODE.blockRenderer().getText());
		}

		if (options.contains("$wnd.jQuery.jqplot.BubbleRenderer")) {
			if (!JavaScriptInjector.isBubbleRendererLoaded()) {
				JavaScriptInjector.inject(JqPlot.CODE.bubbleRenderer()
						.getText());
			}
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

		if (options.contains("$wnd.jQuery.jqplot.CategoryAxisRenderer")
				&& !JavaScriptInjector.isCategoryAxisRendererLoaded()) {
			JavaScriptInjector.inject(JqPlot.CODE.categoryAxisRenderer()
					.getText());
		}

		if (options.contains("$wnd.jQuery.jqplot.CanvasAxisLabelRenderer")
				&& !JavaScriptInjector.isCategoryAxisRendererLoaded()) {
			JavaScriptInjector.inject(JqPlot.CODE.canvasAxisLabelRenderer()
					.getText());
		}

		if (options.contains("$wnd.jQuery.jqplot.CanvasAxisTickRenderer")
				&& !JavaScriptInjector.isCanvasAxisTickRendererLoaded()) {
			JavaScriptInjector.inject(JqPlot.CODE.canvasAxisTickRenderer()
					.getText());
		}

		if (options.contains("$wnd.jQuery.jqplot.DateAxisRenderer")
				&& !JavaScriptInjector.isDateAxisRendererLoaded()) {
			JavaScriptInjector.inject(JqPlot.CODE.dateAxisRenderer().getText());
		}

		if (options.contains("$wnd.jQuery.jqplot.DonutRenderer")) {
			if (!JavaScriptInjector.isDonutRendererLoaded()) {
				JavaScriptInjector
						.inject(JqPlot.CODE.donutRenderer().getText());
			}
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

		if (options.contains("$wnd.jQuery.jqplot.EnhancedLegendRenderer")
				&& !JavaScriptInjector.isEnhancedLegendRendererLoaded()) {
			JavaScriptInjector.inject(JqPlot.CODE.enhancedLegendRenderer()
					.getText());
		}

		if (options.contains("$wnd.jQuery.jqplot.LogAxisRenderer")
				&& !JavaScriptInjector.isLogAxisRendererLoaded()) {
			JavaScriptInjector.inject(JqPlot.CODE.logAxisRenderer().getText());
		}

		if (options.contains("$wnd.jQuery.jqplot.MeterGaugeRenderer")
				&& !JavaScriptInjector.isMeterGaugeRendererLoaded()) {
			JavaScriptInjector.inject(JqPlot.CODE.meterGaugeRenderer()
					.getText());
		}

		if (options.contains("$wnd.jQuery.jqplot.PieRenderer")) {
			if (!JavaScriptInjector.isPieRendererLoaded()) {
				JavaScriptInjector.inject(JqPlot.CODE.pieRenderer().getText());
			}
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

		if (options.contains("$wnd.jQuery.jqplot.PyramidAxisRenderer")
				&& !JavaScriptInjector.isPyramidAxisRendererLoaded()) {
			JavaScriptInjector.inject(JqPlot.CODE.pyramidAxisRenderer()
					.getText());
		}

		if (options.contains("$wnd.jQuery.jqplot.PyramidGridRenderer")
				&& !JavaScriptInjector.isPyramidGridRendererLoaded()) {
			JavaScriptInjector.inject(JqPlot.CODE.pyramidGridRenderer()
					.getText());
		}

		if (options.contains("$wnd.jQuery.jqplot.PyramidRenderer")) {
			if (!JavaScriptInjector.isPyramidRendererLoaded()) {
				JavaScriptInjector.inject(JqPlot.CODE.pyramidRenderer()
						.getText());
			}
			if (enableChartDataMouseEnterEvent) {
				PyramidDataHandler.activateMouseEnter(this, chart.getId());
			}
			if (enableChartDataMouseLeaveEvent) {
				PyramidDataHandler.activateMouseLeave(this, chart.getId());
			}
		}

		if (options.contains("$wnd.jQuery.jqplot.OHLCRenderer")) {
			if (!JavaScriptInjector.isOHLCRendererLoaded()) {
				JavaScriptInjector.inject(JqPlot.CODE.ohlcRenderer().getText());
			}
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

		if (options.contains("canvasOverlay:")
				&& !JavaScriptInjector.isCanvasOverlayLibraryLoaded()) {
			JavaScriptInjector.inject(JqPlot.CODE.canvasOverlay().getText());
		}

		if (options.contains("cursor:")
				&& !JavaScriptInjector.isCursorLibraryLoaded()) {
			JavaScriptInjector.inject(JqPlot.CODE.cursor().getText());
		}

		if (options.contains("highlighter:")
				&& !JavaScriptInjector.isHighlighterLibraryLoaded()) {
			JavaScriptInjector.inject(JqPlot.CODE.highlighter().getText());
			if (!JavaScriptInjector.isBubbleRendererLoaded()) {
				JavaScriptInjector.inject(JqPlot.CODE.bubbleRenderer()
						.getText());
			}
		}

		if (options.contains("pointLabels:")
				&& !JavaScriptInjector.isPointLabelsLibraryLoaded()) {
			JavaScriptInjector.inject(JqPlot.CODE.pointLabels().getText());
		}

		if (options.contains("trendline:")
				&& !JavaScriptInjector.isTrendlineLibraryLoaded()) {
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

	private String setChartDimensions(String options, int marigTop,
			int marigRight, int marigBottom, int marigLeft) {
		Element button = DOM.getElementById(chart.getId() + "-button");
		int buttonHeight = button != null ? button.getOffsetHeight() : 0;
		StringBuilder value = new StringBuilder();
		if (options != null && options.length() > 0) {
			int width = getOffsetWidth() == 0 ? 300 : getOffsetWidth();
			int height = getOffsetHeight() == 0 ? 300 : getOffsetHeight();

			height += -buttonHeight - marigTop - marigBottom;
			width += -marigLeft - marigRight;

			value.append("{width: '" + width + "px',");
			value.append("height: '" + height + "px',");
			value.append(options.substring(1));

			chart.getStyle().setMarginLeft(marigLeft, Unit.PX);
			chart.getStyle().setMarginRight(marigRight, Unit.PX);
			chart.getStyle().setWidth(width, Unit.PX);

			chart.getStyle().setMarginTop(marigTop, Unit.PX);
			chart.getStyle().setMarginBottom(marigBottom, Unit.PX);
			chart.getStyle().setHeight(height, Unit.PX);
		}
		return value.toString();
	}

	private void sendChartImageToServer() {
		if (downloadButtonEnabled || enableChartImageChangeEvent) {
			Scheduler.get().scheduleFixedDelay(new RepeatingCommand() {
				@Override
				public boolean execute() {
					fireEventForSendingChartImageToServer(getThis(),
							chart.getId());
					return false;
				}
			}, chartImageChangeDelay);
		}
	}

	private Map<String, String> getEventData(String id, String event,
			String data) {
		Map<String, String> eventData = new HashMap<String, String>();
		eventData.put("id", id == null ? new String() : id);
		eventData.put("event", event == null ? new String() : event);
		eventData.put("data", data == null ? "" : data);
		return eventData;
	}

	private void fireEvent(final String id, final String event,
			final String data) {
		if (chartId.equals(id)) {
			EventObject tempEventObject = new EventObject(id, event, data);
			if (!event.equals("rawImageData")
					&& (eventObject == null || !eventObject
							.equals(tempEventObject))) {
				eventObject = tempEventObject;
				EventProcessor.fireEvent(getThis(),
						getEventData(id, event, data));
			} else if (chartImageEventObject == null
					|| !chartImageEventObject.equals(tempEventObject)) {
				chartImageEventObject = tempEventObject;
				EventProcessor.fireEvent(getThis(),
						getEventData(id, event, data));
			}
		}
	}

	@Override
	public HandlerRegistration addValueChangeHandler(
			ValueChangeHandler<Object[]> handler) {
		HandlerRegistration registration = this.addHandler(handler,
				ValueChangeEvent.getType());
		return registration;
	}

	private boolean isValidChartData(Map<Integer, String> chartData) {
		return (chartId != null && chartData != null && chartData.size() > 0
				&& chartData.containsKey(ID) && chartId.equals(chartData
				.get(ID)));
	}

	public void setChartId(String chartId) {
		this.chartId = chartId;
	}

	public boolean isChartPrepared() {
		return (chart != null && chart.hasParentElement() && !chart.getId()
				.isEmpty());
	}

	public void prepareChart() {
		if (isValidChartData(chartData)) {
			// load JS libraries
			loadJQueryLibrary();
			loadJqPlotLibrary();

			chart = DOM.createDiv();
			chart.setId(chartId);
			Element downloadButton = DOM.getElementById(chart.getId()
					+ "-button");
			if (!downloadButtonEnabled) {
				getElement().appendChild(chart);
				downloadButton.removeFromParent();
			} else {
				switch (downloadButtonLocation) {
				case DOWNLOAD_BUTTON_LOCATION_TOP_LEFT:
					chart.getStyle().setTop(downloadButton.getOffsetHeight(),
							Unit.PX);
					getElement().appendChild(chart);
					downloadButton.getStyle().setFloat(Float.LEFT);
					break;
				case DOWNLOAD_BUTTON_LOCATION_TOP_RIGHT:
					chart.getStyle().setTop(downloadButton.getOffsetHeight(),
							Unit.PX);
					getElement().appendChild(chart);
					downloadButton.getStyle().setFloat(Float.RIGHT);
					break;
				case DOWNLOAD_BUTTON_LOCATION_BOTTOM_LEFT:
					getElement().insertFirst(chart);
					downloadButton.getStyle().setFloat(Float.LEFT);
					break;
				case DOWNLOAD_BUTTON_LOCATION_BOTTOM_RIGHT:
				default:
					getElement().insertFirst(chart);
					downloadButton.getStyle().setFloat(Float.RIGHT);
					break;
				}
			}
			processChartData(chartData);
			chartData.clear();
		}
	}

	public void processChartData(Map<Integer, String> chartData) {
		if (isValidChartData(chartData)) {
			if (!isChartPrepared()) {
				this.chartData = chartData;
				if (chartData.containsKey(DOWNLOAD_BUTTON_ENABLE)) {
					downloadButtonEnabled = Boolean.parseBoolean(chartData
							.get(DOWNLOAD_BUTTON_ENABLE));
				}
				if (chartData.containsKey(DOWNLOAD_BUTTON_LOCATION)) {
					downloadButtonLocation = Integer.parseInt(chartData
							.get(DOWNLOAD_BUTTON_LOCATION));
				}
			} else if (isChartPrepared()
					&& chartData.containsKey(REPLOT_CHART_CLEAR)
					&& chartData.containsKey(REPLOT_CHART_RESET_AXES)
					&& showChart) {
				boolean clear = Boolean.parseBoolean(chartData
						.get(REPLOT_CHART_CLEAR));
				boolean resetAxes = Boolean.parseBoolean(chartData
						.get(REPLOT_CHART_RESET_AXES));
				replotChart(this, chart.getId(), clear, resetAxes);
			} else {
				int marigTop = 0;
				int marigBottom = 0;
				if (chartData.containsKey(MARGIN_TOP)
						|| chartData.containsKey(MARGIN_BOTTOM)) {
					marigTop = chartData.containsKey(MARGIN_TOP) ? Integer
							.parseInt(chartData.get(MARGIN_TOP)) : marigTop;
					marigBottom = chartData.containsKey(MARGIN_BOTTOM) ? Integer
							.parseInt(chartData.get(MARGIN_BOTTOM))
							: marigBottom;
				}

				int marigLeft = 0;
				int marigRight = 0;
				if (chartData.containsKey(MARGIN_LEFT)
						|| chartData.containsKey(MARGIN_RIGHT)) {
					marigLeft = chartData.containsKey(MARGIN_LEFT) ? Integer
							.parseInt(chartData.get(MARGIN_LEFT)) : marigLeft;
					marigRight = chartData.containsKey(MARGIN_RIGHT) ? Integer
							.parseInt(chartData.get(MARGIN_RIGHT)) : marigRight;
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

				if (chartData.containsKey(CHART_IMAGE_CHANGE_DELAY)) {
					chartImageChangeDelay = Integer.parseInt(chartData
							.get(CHART_IMAGE_CHANGE_DELAY));
				}

				if (chartData.containsKey(CHART_IMAGE_CHANGE_EVENT)) {
					enableChartImageChangeEvent = Boolean
							.parseBoolean(chartData
									.get(CHART_IMAGE_CHANGE_EVENT));
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
				options = setChartDimensions(options, marigTop, marigRight,
						marigBottom, marigLeft);

				if (chartData.containsKey(SHOW_CHART)) {
					showChart = Boolean.parseBoolean(chartData.get(SHOW_CHART));
					if (showChart) {
						getElement().getStyle().clearDisplay();
						showChart(this, chartId, dataSeries, options,
								decimalSeparator, thousandsSeparator);
					} else {
						getElement().getStyle().setDisplay(Display.NONE);
					}
				}
			}
		}
	}

}
