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

import java.util.Map;

import org.dussan.vaadin.dcharts.client.ui.VDCharts;
import org.dussan.vaadin.dcharts.data.DataSeries;
import org.dussan.vaadin.dcharts.helpers.ManifestHelper;
import org.dussan.vaadin.dcharts.options.Options;

import com.vaadin.terminal.PaintException;
import com.vaadin.terminal.PaintTarget;
import com.vaadin.ui.AbstractComponent;
import com.vaadin.ui.ClientWidget;

@ClientWidget(VDCharts.class)
public class DCharts extends AbstractComponent {

	private static final long serialVersionUID = -7224003274781707144L;
	private boolean showChart = false;
	private String title = null;
	private String idChart = null;
	private int marginTop = 0;
	private int marginRight = 0;
	private int marginBottom = 0;
	private int marginLeft = 0;
	private DataSeries dataSeries = null;
	private Options options = null;

	public DCharts() {
		// don't remove: it define dynamic widget's width
		setWidth("100%");
	}

	public DCharts(String title, String idChart, DataSeries dataSeries,
			Options options) {
		super();
		this.title = title;
		this.idChart = idChart;
		this.dataSeries = dataSeries;
		this.options = options;
	}

	public DCharts(String title, DataSeries dataSeries, Options options) {
		super();
		this.title = title;
		this.dataSeries = dataSeries;
		this.options = options;
	}

	public DCharts(DataSeries dataSeries, Options options) {
		super();
		this.dataSeries = dataSeries;
		this.options = options;
	}

	public DCharts(String title, DataSeries dataSeries) {
		super();
		this.title = title;
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

	public String getTitle() {
		return title;
	}

	public DCharts setTitle(String title) {
		this.title = title;
		return this;
	}

	public String getIdChart() {
		return idChart;
	}

	public DCharts setIdChart(String idChart) {
		this.idChart = idChart;
		return this;
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

			if (title != null && title.length() > 0) {
				target.addAttribute("title", (String) title);
			}

			if (idChart != null && idChart.length() > 0) {
				target.addAttribute("idChart", (String) idChart);
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
		}
	}

}
