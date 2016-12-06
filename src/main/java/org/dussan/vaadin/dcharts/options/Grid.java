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

import org.dussan.vaadin.dcharts.base.elements.Option;
import org.dussan.vaadin.dcharts.base.renderers.GridRenderer;
import org.dussan.vaadin.dcharts.defaults.DefaultGrid;
import org.dussan.vaadin.dcharts.helpers.JsonHelper;
import org.dussan.vaadin.dcharts.metadata.renderers.GridRenderers;
import org.dussan.vaadin.dcharts.renderers.grid.CanvasGridRenderer;
import org.dussan.vaadin.dcharts.renderers.grid.PyramidGridRenderer;

public class Grid extends Option<Grid> {

	private static final long serialVersionUID = 6861879150602910337L;
	private Boolean drawGridlines = null;
	private String gridLineColor = null;
	private Float gridLineWidth = null;
	private String background = null;
	private String borderColor = null;
	private Float borderWidth = null;
	private Boolean drawBorder = null;
	private Boolean shadow = null;
	private Integer shadowAngle = null;
	private Float shadowOffset = null;
	private Integer shadowWidth = null;
	private Integer shadowDepth = null;
	private String shadowColor = null;
	private Float shadowAlpha = null;
	private GridRenderers renderer = null;
	private GridRenderer<?> rendererOptions = null;

	public Grid() {
		super(new DefaultGrid());
		setRenderer(DefaultGrid.RENDERER);
	}

	public Grid(boolean drawGridlines, String gridLineColor,
			float gridLineWidth, String background, String borderColor,
			float borderWidth, boolean drawBorder, boolean shadow,
			int shadowAngle, float shadowOffset, int shadowWidth,
			int shadowDepth, String shadowColor, float shadowAlpha,
			GridRenderers gridRenderers, GridRenderer<?> gridRenderer) {
		super(new DefaultGrid());
		setDrawGridlines(drawGridlines);
		setGridLineColor(gridLineColor);
		setGridLineWidth(gridLineWidth);
		setBackground(background);
		setBorderColor(borderColor);
		setBorderWidth(borderWidth);
		setDrawBorder(drawBorder);
		setShadow(shadow);
		setShadowAngle(shadowAngle);
		setShadowOffset(shadowOffset);
		setShadowWidth(shadowWidth);
		setShadowDepth(shadowDepth);
		setShadowColor(shadowColor);
		setShadowAlpha(shadowAlpha);
		setRenderer(gridRenderers);
		setRendererOptions(gridRenderer);

		if (getRenderer() == null) {
			setRenderer(DefaultGrid.RENDERER);
		}
	}

	public Boolean getDrawGridlines() {
		return drawGridlines;
	}

	public Grid setDrawGridlines(boolean drawGridlines) {
		this.drawGridlines = drawGridlines;
		return this;
	}

	public String getGridLineColor() {
		return gridLineColor;
	}

	public Grid setGridLineColor(String gridLineColor) {
		this.gridLineColor = gridLineColor;
		return this;
	}

	public float getGridLineWidth() {
		return gridLineWidth;
	}

	public Grid setGridLineWidth(float gridLineWidth) {
		this.gridLineWidth = gridLineWidth;
		return this;
	}

	public String getBackground() {
		return background;
	}

	public Grid setBackground(String background) {
		this.background = background;
		return this;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public Grid setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	public float getBorderWidth() {
		return borderWidth;
	}

	public Grid setBorderWidth(float borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	public Boolean getDrawBorder() {
		return drawBorder;
	}

	public Grid setDrawBorder(boolean drawBorder) {
		this.drawBorder = drawBorder;
		return this;
	}

	public Boolean getShadow() {
		return shadow;
	}

	public Grid setShadow(boolean shadow) {
		this.shadow = shadow;
		return this;
	}

	public Integer getShadowAngle() {
		return shadowAngle;
	}

	public Grid setShadowAngle(int shadowAngle) {
		this.shadowAngle = shadowAngle;
		return this;
	}

	public float getShadowOffset() {
		return shadowOffset;
	}

	public Grid setShadowOffset(float shadowOffset) {
		this.shadowOffset = shadowOffset;
		return this;
	}

	public Integer getShadowWidth() {
		return shadowWidth;
	}

	public Grid setShadowWidth(int shadowWidth) {
		this.shadowWidth = shadowWidth;
		return this;
	}

	public Integer getShadowDepth() {
		return shadowDepth;
	}

	public Grid setShadowDepth(int shadowDepth) {
		this.shadowDepth = shadowDepth;
		return this;
	}

	public String getShadowColor() {
		return shadowColor;
	}

	public Grid setShadowColor(String shadowColor) {
		this.shadowColor = shadowColor;
		return this;
	}

	public float getShadowAlpha() {
		return shadowAlpha;
	}

	public Grid setShadowAlpha(float shadowAlpha) {
		this.shadowAlpha = shadowAlpha;
		return this;
	}

	public GridRenderers getRenderer() {
		return renderer;
	}

	public Grid setRenderer(GridRenderers gridRenderers) {
		if (!gridRenderers.equals(this.renderer)) {
			rendererOptions = DefaultGrid.RENDERER_OPTIONS;
		}
		this.renderer = gridRenderers;
		return this;
	}

	public GridRenderer<?> getRendererOptions() {
		return rendererOptions;
	}

	public Grid setRendererOptions(GridRenderer<?> gridRenderer) {
		if (gridRenderer instanceof CanvasGridRenderer) {
			setRenderer(GridRenderers.CANVAS);
		} else if (gridRenderer instanceof PyramidGridRenderer) {
			setRenderer(GridRenderers.PYRAMID);
		}
		this.rendererOptions = gridRenderer;
		return this;
	}

	@Override
	public String getValue() {
		return JsonHelper.toJsonString(this);
	}

}
