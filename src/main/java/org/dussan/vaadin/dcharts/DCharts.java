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

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.dussan.vaadin.dcharts.client.ui.VDCharts;
import org.dussan.vaadin.dcharts.data.DataSeries;
import org.dussan.vaadin.dcharts.events.ChartData;
import org.dussan.vaadin.dcharts.events.click.ChartDataClickEvent;
import org.dussan.vaadin.dcharts.events.click.ChartDataClickHandler;
import org.dussan.vaadin.dcharts.events.mouseenter.ChartDataMouseEnterEvent;
import org.dussan.vaadin.dcharts.events.mouseenter.ChartDataMouseEnterHandler;
import org.dussan.vaadin.dcharts.events.mouseleave.ChartDataMouseLeaveEvent;
import org.dussan.vaadin.dcharts.events.mouseleave.ChartDataMouseLeaveHandler;
import org.dussan.vaadin.dcharts.events.rightclick.ChartDataRightClickEvent;
import org.dussan.vaadin.dcharts.events.rightclick.ChartDataRightClickHandler;
import org.dussan.vaadin.dcharts.helpers.ChartDataHelper;
import org.dussan.vaadin.dcharts.helpers.ManifestHelper;
import org.dussan.vaadin.dcharts.options.Options;

import com.google.gwt.event.shared.HandlerManager;
import com.vaadin.terminal.PaintException;
import com.vaadin.terminal.PaintTarget;
import com.vaadin.ui.AbstractComponent;
import com.vaadin.ui.ClientWidget;
import com.vaadin.ui.Window.Notification;

@ClientWidget(VDCharts.class)
public class DCharts extends AbstractComponent {

	private static final long serialVersionUID = -7224003274781707144L;
	private HandlerManager handlerManager = null;

	private boolean showChart = false;
	private String decimalSeparator = null;
	private String thousandsSeparator = null;
	private int marginTop = 0;
	private int marginRight = 0;
	private int marginBottom = 0;
	private int marginLeft = 0;

	private String idChart = null;
	private DataSeries dataSeries = null;
	private Options options = null;

	private Boolean enableChartDataMouseEnterEvent = null;
	private Boolean enableChartDataMouseLeaveEvent = null;
	private Boolean enableChartDataClickEvent = null;
	private Boolean enableChartDataRightClickEvent = null;

	public DCharts() {
		// don't remove: it define dynamic widget's width
		setWidth("100%");
		idChart = "dCharts" + (new Date().getTime());
		handlerManager = new HandlerManager(this);

		// enable/disable mouse events
		enableChartDataMouseEnterEvent = false;
		enableChartDataMouseLeaveEvent = false;
		enableChartDataClickEvent = false;
		enableChartDataRightClickEvent = false;
	}

	public DCharts(String caption, String idChart, DataSeries dataSeries,
			Options options) {
		super();
		setCaption(caption);
		this.idChart = idChart;
		this.dataSeries = dataSeries;
		this.options = options;
	}

	public DCharts(String caption, DataSeries dataSeries, Options options) {
		super();
		setCaption(caption);
		this.dataSeries = dataSeries;
		this.options = options;
	}

	public DCharts(DataSeries dataSeries, Options options) {
		super();
		this.dataSeries = dataSeries;
		this.options = options;
	}

	public DCharts(String caption, DataSeries dataSeries) {
		super();
		setCaption(caption);
		this.dataSeries = dataSeries;
	}

	public DCharts(DataSeries dataSeries) {
		super();
		this.dataSeries = dataSeries;
	}

	public static String getVersion() {
		if (ManifestHelper.getManifest() != null) {
			return ManifestHelper.getManifest().getMainAttributes()
					.getValue("Implementation-Version");
		}
		return null;
	}

	public static String getGitVersion() {
		if (ManifestHelper.getManifest() != null) {
			return ManifestHelper.getManifest().getMainAttributes()
					.getValue("Git-Version");
		}
		return null;
	}

	public static String getJqPlotVersion() {
		if (ManifestHelper.getManifest() != null) {
			return ManifestHelper.getManifest().getMainAttributes()
					.getValue("JqPlot-Version");
		}
		return null;
	}

	public String getIdChart() {
		return idChart;
	}

	public DCharts setIdChart(String idChart) {
		this.idChart = idChart;
		return this;
	}

	public void autoSelectDecimalAndThousandsSeparator(Locale locale) {
		decimalSeparator = Character.toString(((DecimalFormat) NumberFormat
				.getNumberInstance(locale)).getDecimalFormatSymbols()
				.getDecimalSeparator());
		thousandsSeparator = Character.toString(((DecimalFormat) NumberFormat
				.getNumberInstance(locale)).getDecimalFormatSymbols()
				.getGroupingSeparator());
	}

	public void autoSelectDecimalSeparator(Locale locale) {
		decimalSeparator = Character.toString(((DecimalFormat) NumberFormat
				.getNumberInstance(locale)).getDecimalFormatSymbols()
				.getDecimalSeparator());
	}

	public void autoSelectThousandsSeparator(Locale locale) {
		thousandsSeparator = Character.toString(((DecimalFormat) NumberFormat
				.getNumberInstance(locale)).getDecimalFormatSymbols()
				.getGroupingSeparator());
	}

	public String getDecimalSeparator() {
		return decimalSeparator;
	}

	public void setDecimalSeparator(String decimalSeparator) {
		this.decimalSeparator = decimalSeparator;
	}

	public String getThousandsSeparator() {
		return thousandsSeparator;
	}

	public void setThousandsSeparator(String thousandsSeparator) {
		this.thousandsSeparator = thousandsSeparator;
	}

	public DCharts setMargins(int marginTop, int marginRight, int marginBottom,
			int marginLeft) {
		this.marginTop = marginTop;
		this.marginRight = marginRight;
		this.marginBottom = marginBottom;
		this.marginLeft = marginLeft;
		return this;
	}

	public int getMarginTop() {
		return marginTop;
	}

	public DCharts setMarginTop(int marginTop) {
		this.marginTop = marginTop;
		return this;
	}

	public int getMarginRight() {
		return marginRight;
	}

	public DCharts setMarginRight(int marginRight) {
		this.marginRight = marginRight;
		return this;
	}

	public int getMarginBottom() {
		return marginBottom;
	}

	public DCharts setMarginBottom(int marginBottom) {
		this.marginBottom = marginBottom;
		return this;
	}

	public int getMarginLeft() {
		return marginLeft;
	}

	public DCharts setMarginLeft(int marginLeft) {
		this.marginLeft = marginLeft;
		return this;
	}

	public DataSeries getDataSeries() {
		return dataSeries;
	}

	public DCharts setDataSeries(DataSeries dataSeries) {
		this.dataSeries = dataSeries;
		return this;
	}

	public Options getOptions() {
		return options;
	}

	public DCharts setOptions(Options options) {
		this.options = options;
		return this;
	}

	public boolean isEnableChartDataMouseEnterEvent() {
		return enableChartDataMouseEnterEvent;
	}

	public void setEnableChartDataMouseEnterEvent(
			boolean enableChartDataMouseEnterEvent) {
		this.enableChartDataMouseEnterEvent = enableChartDataMouseEnterEvent;
	}

	public boolean isEnableChartDataMouseLeaveEvent() {
		return enableChartDataMouseLeaveEvent;
	}

	public void setEnableChartDataMouseLeaveEvent(
			boolean enableChartDataMouseLeaveEvent) {
		this.enableChartDataMouseLeaveEvent = enableChartDataMouseLeaveEvent;
	}

	public boolean isEnableChartDataClickEvent() {
		return enableChartDataClickEvent;
	}

	public void setEnableChartDataClickEvent(boolean enableChartDataClickEvent) {
		this.enableChartDataClickEvent = enableChartDataClickEvent;
	}

	public boolean isEnableChartDataRightClickEvent() {
		return enableChartDataRightClickEvent;
	}

	public void setEnableChartDataRightClickEvent(
			boolean enableChartDataRightClickEvent) {
		this.enableChartDataRightClickEvent = enableChartDataRightClickEvent;
	}

	public DCharts show() {
		this.showChart = true;
		if (!showChart
				|| (showChart && dataSeries != null && !dataSeries.isEmpty())) {
			requestRepaint();
		}
		return this;
	}

	public DCharts hide() {
		this.showChart = false;
		requestRepaint();
		return this;
	}

	@Override
	public void paintContent(PaintTarget target) throws PaintException {
		super.paintContent(target);
		if (showChart) {
			target.addAttribute("showChart", (boolean) showChart);
			target.addAttribute("marginTop", marginTop);
			target.addAttribute("marginRight", marginRight);
			target.addAttribute("marginBottom", marginBottom);
			target.addAttribute("marginLeft", marginLeft);

			target.addAttribute("enableChartDataMouseEnterEvent",
					isEnableChartDataMouseEnterEvent());
			target.addAttribute("enableChartDataMouseLeaveEvent",
					isEnableChartDataMouseLeaveEvent());
			target.addAttribute("enableChartDataClickEvent",
					isEnableChartDataClickEvent());
			target.addAttribute("enableChartDataRightClickEvent",
					isEnableChartDataRightClickEvent());

			if (idChart != null && idChart.length() > 0) {
				target.addAttribute("idChart", (String) idChart);
			}

			if (decimalSeparator != null && decimalSeparator.length() > 0) {
				target.addAttribute("decimalSeparator", decimalSeparator);
			}

			if (thousandsSeparator != null && thousandsSeparator.length() > 0) {
				target.addAttribute("thousandsSeparator", thousandsSeparator);
			}

			if (dataSeries != null && !dataSeries.isEmpty()) {
				target.addAttribute("dataSeries",
						(String) dataSeries.getValue());
			}

			if (options != null && !options.isEmpty()) {
				target.addAttribute("options", (String) options.getValue());
			}
		} else if (!showChart) {
			target.addAttribute("showChart", (boolean) showChart);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void changeVariables(Object source, Map<String, Object> variables) {
		super.changeVariables(source, variables);
		Map<String, Object> request = (Map<String, Object>) variables
				.get("request");

		if (request == null || request.isEmpty()) {
			requestRepaint();
		} else {
			ChartData chartData = ChartDataHelper.process(request);
			if (chartData.getSeriesIndex() != null
					&& chartData.getPointIndex() != null) {
				chartData.setOriginData(dataSeries.getSeriesValue(chartData
						.getSeriesIndex().intValue(), chartData.getPointIndex()
						.intValue()));
			}

			if (chartData != null) {
				switch (chartData.getChartEventType()) {
				case BAR_MOUSE_ENTER:
				case BUBBLE_MOUSE_ENTER:
				case DONUT_MOUSE_ENTER:
				case OHLC_MOUSE_ENTER:
				case PIE_MOUSE_ENTER:
				case PYRAMID_MOUSE_ENTER:
					handlerManager.fireEvent(new ChartDataMouseEnterEvent(
							chartData));
					break;

				case BAR_MOUSE_LEAVE:
				case BUBBLE_MOUSE_LEAVE:
				case DONUT_MOUSE_LEAVE:
				case OHLC_MOUSE_LEAVE:
				case PIE_MOUSE_LEAVE:
				case PYRAMID_MOUSE_LEAVE:
					handlerManager.fireEvent(new ChartDataMouseLeaveEvent(
							chartData));
					break;

				case BAR_CLICK:
				case BUBBLE_CLICK:
				case DONUT_CLICK:
				case LINE_CLICK:
				case OHLC_CLICK:
				case PIE_CLICK:
					handlerManager
							.fireEvent(new ChartDataClickEvent(chartData));
					break;

				case BAR_RIGHT_CLICK:
				case BUBBLE_RIGHT_CLICK:
				case DONUT_RIGHT_CLICK:
				case LINE_RIGHT_CLICK:
				case PIE_RIGHT_CLICK:
					handlerManager.fireEvent(new ChartDataRightClickEvent(
							chartData));
					break;

				case NOT_DEFINED:
				default:
					String caption = "UNKNOWN EVENT";
					String description = "Cannot process unknown chart data event!";
					getWindow().showNotification(caption, description,
							Notification.TYPE_ERROR_MESSAGE);
					break;
				}
			}
		}
	}

	public void addHandler(ChartDataMouseEnterHandler handler) {
		if (isEnableChartDataMouseEnterEvent()) {
			handlerManager.addHandler(ChartDataMouseEnterEvent.getType(),
					handler);
		}
	}

	public void removeHandler(ChartDataMouseEnterHandler handler) {
		if (handlerManager.isEventHandled(ChartDataMouseEnterEvent.getType())) {
			handlerManager.removeHandler(ChartDataMouseEnterEvent.getType(),
					handler);
		}
	}

	public void addHandler(ChartDataMouseLeaveHandler handler) {
		if (isEnableChartDataMouseLeaveEvent()) {
			handlerManager.addHandler(ChartDataMouseLeaveEvent.getType(),
					handler);
		}
	}

	public void removeHandler(ChartDataMouseLeaveHandler handler) {
		if (handlerManager.isEventHandled(ChartDataMouseLeaveEvent.getType())) {
			handlerManager.removeHandler(ChartDataMouseLeaveEvent.getType(),
					handler);
		}
	}

	public void addHandler(ChartDataClickHandler handler) {
		if (isEnableChartDataClickEvent()) {
			handlerManager.addHandler(ChartDataClickEvent.getType(), handler);
		}
	}

	public void removeHandler(ChartDataClickHandler handler) {
		if (handlerManager.isEventHandled(ChartDataClickEvent.getType())) {
			handlerManager
					.removeHandler(ChartDataClickEvent.getType(), handler);
		}
	}

	public void addHandler(ChartDataRightClickHandler handler) {
		if (isEnableChartDataRightClickEvent()) {
			handlerManager.addHandler(ChartDataRightClickEvent.getType(),
					handler);
		}
	}

	public void removeHandler(ChartDataRightClickHandler handler) {
		if (handlerManager.isEventHandled(ChartDataRightClickEvent.getType())) {
			handlerManager.removeHandler(ChartDataRightClickEvent.getType(),
					handler);
		}
	}

}
