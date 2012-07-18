/**
 * Copyright (C) 2012  Dušan Vejnovič  <vaadin@dussan.org>
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

import org.dussan.vaadin.dcharts.base.elements.Option;
import org.dussan.vaadin.dcharts.base.renderers.LegendRenderer;
import org.dussan.vaadin.dcharts.defaults.DefaultLegend;
import org.dussan.vaadin.dcharts.helpers.JsonHelper;
import org.dussan.vaadin.dcharts.metadata.LegendPlacements;
import org.dussan.vaadin.dcharts.metadata.locations.LegendLocations;
import org.dussan.vaadin.dcharts.metadata.renderers.LegendRenderers;
import org.dussan.vaadin.dcharts.renderers.legend.EnhancedLegendRenderer;

public class Legend extends Option<Legend> {

	private static final long serialVersionUID = -7371728655049614842L;
	private Boolean show = null;
	private LegendLocations location = null;
	private String[] labels = null;
	private Boolean showLabels = null;
	private Boolean showSwatches = null;
	private LegendPlacements placement = null;
	private String border = null;
	private String background = null;
	private String textColor = null;
	private String fontFamily = null;
	private String fontSize = null;
	private String rowSpacing = null;
	private LegendRenderers renderer = null;
	private LegendRenderer<?> rendererOptions = null;
	private Boolean preDraw = null;
	private String marginTop = null;
	private String marginRight = null;
	private String marginBottom = null;
	private String marginLeft = null;
	private Boolean escapeHtml = null;

	public Legend() {
		super(new DefaultLegend());
	}

	public Legend(boolean show, LegendLocations location, String[] labels,
			boolean showLabels, boolean showSwatches,
			LegendPlacements legendPlacements, String border,
			String background, String textColor, String fontFamily,
			String fontSize, String rowSpacing,
			LegendRenderers legendRenderers, LegendRenderer<?> legendRenderer,
			boolean preDraw, String marginTop, String marginRight,
			String marginBottom, String marginLeft, boolean escapeHtml) {
		super(new DefaultLegend());
		setShow(show);
		setLocation(location);
		setLabels(labels);
		setShowLabels(showLabels);
		setShowSwatches(showSwatches);
		setPlacement(legendPlacements);
		setBorder(border);
		setBackground(background);
		setTextColor(textColor);
		setFontFamily(fontFamily);
		setFontSize(fontSize);
		setRowSpacing(rowSpacing);
		setRenderer(legendRenderers);
		setRendererOptions(legendRenderer);
		setPreDraw(preDraw);
		setMarginTop(marginTop);
		setMarginRight(marginRight);
		setMarginBottom(marginBottom);
		setMarginLeft(marginLeft);
		setEscapeHtml(escapeHtml);
	}

	public boolean getShow() {
		return show;
	}

	public Legend setShow(boolean show) {
		this.show = show;
		return this;
	}

	public LegendLocations getLocation() {
		return location;
	}

	public Legend setLocation(LegendLocations location) {
		this.location = location;
		return this;
	}

	public String[] getLabels() {
		return labels;
	}

	public Legend setLabels(String... labels) {
		this.labels = labels;
		return this;
	}

	public boolean getShowLabels() {
		return showLabels;
	}

	public Legend setShowLabels(boolean showLabels) {
		this.showLabels = showLabels;
		return this;
	}

	public boolean getShowSwatches() {
		return showSwatches;
	}

	public Legend setShowSwatches(boolean showSwatches) {
		this.showSwatches = showSwatches;
		return this;
	}

	public LegendPlacements getPlacement() {
		return placement;
	}

	public Legend setPlacement(LegendPlacements legendPlacements) {
		this.placement = legendPlacements;
		return this;
	}

	public String getBorder() {
		return border;
	}

	public Legend setBorder(String border) {
		this.border = border;
		return this;
	}

	public String getBackground() {
		return background;
	}

	public Legend setBackground(String background) {
		this.background = background;
		return this;
	}

	public String getTextColor() {
		return textColor;
	}

	public Legend setTextColor(String textColor) {
		this.textColor = textColor;
		return this;
	}

	public String getFontFamily() {
		return fontFamily;
	}

	public Legend setFontFamily(String fontFamily) {
		this.fontFamily = fontFamily;
		return this;
	}

	public String getFontSize() {
		return fontSize;
	}

	public Legend setFontSize(String fontSize) {
		this.fontSize = fontSize;
		return this;
	}

	public String getRowSpacing() {
		return rowSpacing;
	}

	public Legend setRowSpacing(String rowSpacing) {
		this.rowSpacing = rowSpacing;
		return this;
	}

	public LegendRenderers getRenderer() {
		return renderer;
	}

	public Legend setRenderer(LegendRenderers legendRenderers) {
		if (!legendRenderers.equals(this.renderer)) {
			this.rendererOptions = DefaultLegend.RENDERER_OPTIONS;
		}
		this.renderer = legendRenderers;
		return this;
	}

	public LegendRenderer<?> getRendererOptions() {
		return (EnhancedLegendRenderer) rendererOptions;
	}

	public Legend setRendererOptions(LegendRenderer<?> legendRenderer) {
		if (legendRenderer instanceof EnhancedLegendRenderer) {
			setRenderer(LegendRenderers.ENHANCED);
		}
		this.rendererOptions = legendRenderer;
		return this;
	}

	public boolean getPreDraw() {
		return preDraw;
	}

	public Legend setPreDraw(boolean preDraw) {
		this.preDraw = preDraw;
		return this;
	}

	public String getMarginTop() {
		return marginTop;
	}

	public Legend setMarginTop(String marginTop) {
		this.marginTop = marginTop;
		return this;
	}

	public String getMarginRight() {
		return marginRight;
	}

	public Legend setMarginRight(String marginRight) {
		this.marginRight = marginRight;
		return this;
	}

	public String getMarginBottom() {
		return marginBottom;
	}

	public Legend setMarginBottom(String marginBottom) {
		this.marginBottom = marginBottom;
		return this;
	}

	public String getMarginLeft() {
		return marginLeft;
	}

	public Legend setMarginLeft(String marginLeft) {
		this.marginLeft = marginLeft;
		return this;
	}

	public boolean getEscapeHtml() {
		return escapeHtml;
	}

	public Legend setEscapeHtml(boolean escapeHtml) {
		this.escapeHtml = escapeHtml;
		return this;
	}

	@Override
	public String getValue() {
		if (LegendRenderers.TABLE.equals(renderer)) {
			rendererOptions = DefaultLegend.RENDERER_OPTIONS;
		}
		return JsonHelper.toJsonString(this);
	}

}
