/**
 * Copyright (C) 2012-2016  Dušan Vejnovič  <vaadin@dussan.org>
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
package org.dussan.vaadin.dcharts.options;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.dussan.vaadin.dcharts.base.elements.Option;
import org.dussan.vaadin.dcharts.base.elements.XYaxis;
import org.dussan.vaadin.dcharts.base.elements.XYseries;
import org.dussan.vaadin.dcharts.defaults.DefaultOptions;
import org.dussan.vaadin.dcharts.helpers.ObjectHelper;
import org.dussan.vaadin.dcharts.metadata.renderers.AxisRenderers;
import org.dussan.vaadin.dcharts.metadata.renderers.GridRenderers;
import org.dussan.vaadin.dcharts.metadata.renderers.SeriesRenderers;
import org.dussan.vaadin.dcharts.renderers.axis.PyramidAxisRenderer;
import org.dussan.vaadin.dcharts.renderers.grid.PyramidGridRenderer;
import org.dussan.vaadin.dcharts.renderers.series.PyramidRenderer;

public class Options extends Option<Options> {

	private static final long serialVersionUID = -774909561377188637L;
	private Map<String, Option<?>> options = null;
	private Boolean animate = null;
	private Boolean animateReplot = null;
	private Boolean captureRightClick = null;
	private Integer defaultAxisStart = null;
	private Boolean drawIfHidden = null;
	private String fontFamily = null;
	private String fontSize = null;
	private String[] negativeSeriesColors = null;
	private String[] seriesColors = null;
	private Boolean sortData = null;
	private Boolean stackSeries = null;
	private Boolean syncXTicks = null;
	private Boolean syncYTicks = null;
	private String target = null;
	private String targetId = null;
	private String textColor = null;

	public Options() {
		super(new DefaultOptions());
		options = new HashMap<String, Option<?>>();
	}

	private void checkOptionsForPyramidRenderer() {
		if ((options.containsKey("series") && getSeries()
				.seriesContainsPyramidRenderer())
				|| (options.containsKey("seriesDefaults") && getSeriesDefaults()
						.seriesContainsPyramidRenderer())) {
			if (options.containsKey("seriesDefaults")
					&& !getSeriesDefaults().seriesContainsPyramidRenderer()) {
				SeriesDefaults seriesDefaults = getSeriesDefaults();
				seriesDefaults.setRendererOptions(new PyramidRenderer());
				addOption(seriesDefaults);
			}

			if (options.containsKey("series")) {
				Series series = new Series();
				for (XYseries xySeries : getSeries().getSeries()) {
					if (!SeriesRenderers.PYRAMID.equals(xySeries.getRenderer())) {
						xySeries.setRendererOptions(new PyramidRenderer());
					}
					series.addSeries(xySeries);
				}
				setSeries(series);
			}

			if (options.containsKey("axesDefaults")) {
				if (!AxisRenderers.PYRAMID.equals(getAxesDefaults()
						.getRenderer())) {
					AxesDefaults axesDefaults = getAxesDefaults();
					axesDefaults.setRendererOptions(new PyramidAxisRenderer());
					addOption(axesDefaults);
				}
			} else {
				addOption(new AxesDefaults()
						.setRendererOptions(new PyramidAxisRenderer()));
			}

			if (options.containsKey("axes")) {
				Axes axes = new Axes();
				for (XYaxis xyAxis : getAxes().getAxes()) {
					if (!AxisRenderers.PYRAMID.equals(xyAxis.getRenderer())) {
						xyAxis.setRendererOptions(new PyramidAxisRenderer());
					}
					axes.addAxis(xyAxis);
				}
				setAxes(axes);
			}

			if (options.containsKey("grid")) {
				if (!GridRenderers.PYRAMID.equals(getGrid().getRenderer())) {
					Grid grid = getGrid();
					grid.setRendererOptions(new PyramidGridRenderer());
					addOption(grid);
				}
			} else {
				addOption(new Grid()
						.setRendererOptions(new PyramidGridRenderer()));
			}
		}
	}

	public boolean getAnimate() {
		return animate;
	}

	public Options setAnimate(boolean animate) {
		this.animate = animate;
		return this;
	}

	public boolean getAnimateReplot() {
		return animateReplot;
	}

	public Options setAnimateReplot(boolean animateReplot) {
		this.animateReplot = animateReplot;
		return this;
	}

	public boolean getCaptureRightClick() {
		return captureRightClick;
	}

	public Options setCaptureRightClick(boolean captureRightClick) {
		this.captureRightClick = captureRightClick;
		return this;
	}

	public int getDefaultAxisStart() {
		return defaultAxisStart;
	}

	public Options setDefaultAxisStart(int defaultAxisStart) {
		this.defaultAxisStart = defaultAxisStart;
		return this;
	}

	public boolean getDrawIfHidden() {
		return drawIfHidden;
	}

	public Options setDrawIfHidden(boolean drawIfHidden) {
		this.drawIfHidden = drawIfHidden;
		return this;
	}

	public String getFontFamily() {
		return fontFamily;
	}

	public Options setFontFamily(String fontFamily) {
		this.fontFamily = fontFamily;
		return this;
	}

	public String getFontSize() {
		return fontSize;
	}

	public Options setFontSize(String fontSize) {
		this.fontSize = fontSize;
		return this;
	}

	public String[] getNegativeSeriesColors() {
		return negativeSeriesColors;
	}

	public Options setNegativeSeriesColors(String... negativeSeriesColors) {
		this.negativeSeriesColors = negativeSeriesColors;
		return this;
	}

	public String[] getSeriesColors() {
		return seriesColors;
	}

	public Options setSeriesColors(String... seriesColors) {
		this.seriesColors = seriesColors;
		return this;
	}

	public boolean getSortData() {
		return sortData;
	}

	public Options setSortData(boolean sortData) {
		this.sortData = sortData;
		return this;
	}

	public boolean getStackSeries() {
		return stackSeries;
	}

	public Options setStackSeries(boolean stackSeries) {
		this.stackSeries = stackSeries;
		return this;
	}

	public boolean getSyncXTicks() {
		return syncXTicks;
	}

	public Options setSyncXTicks(boolean syncXTicks) {
		this.syncXTicks = syncXTicks;
		return this;
	}

	public boolean getSyncYTicks() {
		return syncYTicks;
	}

	public Options setSyncYTicks(boolean syncYTicks) {
		this.syncYTicks = syncYTicks;
		return this;
	}

	public String getTarget() {
		return target;
	}

	public Options setTarget(String target) {
		this.target = target;
		return this;
	}

	public String getTargetId() {
		return targetId;
	}

	public Options setTargetId(String targetId) {
		this.targetId = targetId;
		return this;
	}

	public String getTextColor() {
		return textColor;
	}

	public Options setTextColor(String textColor) {
		this.textColor = textColor;
		return this;
	}

	public Map<String, Option<?>> getOptions() {
		return options;
	}

	public Option<?> getOption(String option) {
		return options.get(option);
	}

	public Options addOption(Option<?> option) {
		options.put(option.getName(), option);
		return this;
	}

	public Axes getAxes() {
		return (Axes) getOption("axes");
	}

	public Options setAxes(Option<Axes> axes) {
		addOption(axes);
		return this;
	}

	public AxesDefaults getAxesDefaults() {
		return (AxesDefaults) getOption("axesDefaults");
	}

	public Options setAxesDefaults(Option<AxesDefaults> axesDefaults) {
		addOption(axesDefaults);
		return this;
	}

	public Cursor getCanvasOverlay() {
		return (Cursor) getOption("canvasOverlay");
	}

	public Options setCanvasOverlay(Option<CanvasOverlay> canvasOverlay) {
		addOption(canvasOverlay);
		return this;
	}

	public Cursor getCursor() {
		return (Cursor) getOption("cursor");
	}

	public Options setCursor(Option<Cursor> cursor) {
		addOption(cursor);
		return this;
	}

	public Grid getGrid() {
		return (Grid) getOption("grid");
	}

	public Options setGrid(Option<Grid> grid) {
		addOption(grid);
		return this;
	}

	public Highlighter getHighlighter() {
		return (Highlighter) getOption("highlighter");
	}

	public Options setHighlighter(Option<Highlighter> highlighter) {
		addOption(highlighter);
		return this;
	}

	public Legend getLegend() {
		return (Legend) getOption("legend");
	}

	public Options setLegend(Option<Legend> legend) {
		addOption(legend);
		return this;
	}

	public Series getSeries() {
		return (Series) getOption("series");
	}

	public Options setSeries(Option<Series> series) {
		addOption(series);
		return this;
	}

	public SeriesDefaults getSeriesDefaults() {
		return (SeriesDefaults) getOption("seriesDefaults");
	}

	public Options setSeriesDefaults(Option<SeriesDefaults> seriesDefaults) {
		addOption(seriesDefaults);
		return this;
	}

	public Title getTitle() {
		return (Title) getOption("title");
	}

	public Options setTitle(String title) {
		Title tempTitle = (Title) getOption("title");
		if (tempTitle == null) {
			tempTitle = new Title();
		}
		tempTitle.setText(title);
		addOption(tempTitle);
		return this;
	}

	public Options setTitle(Option<Title> title) {
		addOption(title);
		return this;
	}

	@Override
	public String getValue() {
		// preparing variables
		Map<String, Object> tempValues = new HashMap<String, Object>();
		tempValues.put("animate", animate);
		tempValues.put("animateReplot", animateReplot);
		tempValues.put("captureRightClick", captureRightClick);
		tempValues.put("defaultAxisStart", defaultAxisStart);
		tempValues.put("drawIfHidden", drawIfHidden);
		tempValues.put("fontFamily", fontFamily);
		tempValues.put("fontSize", fontSize);
		tempValues.put("negativeSeriesColors",
				ObjectHelper.toArrayString((Object[]) negativeSeriesColors));
		tempValues.put("seriesColors",
				ObjectHelper.toArrayString((Object[]) seriesColors));
		tempValues.put("sortData", sortData);
		tempValues.put("stackSeries", stackSeries);
		tempValues.put("syncXTicks", syncXTicks);
		tempValues.put("syncYTicks", syncYTicks);
		tempValues.put("target", target);
		tempValues.put("targetId", targetId);
		tempValues.put("textColor", textColor);

		// if using pyramid renderer then have to activate/load
		// pyramid renderer for axes and grid
		checkOptionsForPyramidRenderer();

		// preparing option objects
		StringBuilder options = new StringBuilder();
		for (Entry<String, Option<?>> entry : this.options.entrySet()) {
			String name = entry.getKey();
			String tempValue = entry.getValue().getValue();
			if (tempValue != null) {
				options.append(options.length() > 0 ? ", " : "");
				options.append(name + ": ");
				options.append(tempValue);
			}
		}

		// adding variables
		StringBuilder value = new StringBuilder();
		for (Entry<String, Object> entry : tempValues.entrySet()) {
			String name = entry.getKey();
			Object tempValue = entry.getValue();
			if (tempValue != null) {
				value.append(value.length() > 0 ? ", " : "");
				value.append(name + ": ");
				value.append(ObjectHelper.isString(tempValue) ? "\"" : "");
				value.append(tempValue);
				value.append(ObjectHelper.isString(tempValue) ? "\"" : "");
			}
		}

		// adding option objects
		if (options.length() > 0) {
			value.append(value.length() > 0 ? ", " : "");
			value.append(options);
		}

		return value.insert(0, "{").append("}").toString();
	}

}
