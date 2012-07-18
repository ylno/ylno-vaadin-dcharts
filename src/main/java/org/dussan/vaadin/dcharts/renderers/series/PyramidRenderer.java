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
package org.dussan.vaadin.dcharts.renderers.series;

import org.dussan.vaadin.dcharts.base.renderers.SeriesRenderer;
import org.dussan.vaadin.dcharts.base.renderers.ShadowRenderer;
import org.dussan.vaadin.dcharts.base.renderers.ShapeRenderer;
import org.dussan.vaadin.dcharts.defaults.renderers.series.DefaultPyramidRenderer;
import org.dussan.vaadin.dcharts.metadata.FillAxes;
import org.dussan.vaadin.dcharts.metadata.PyramidSides;

public class PyramidRenderer extends SeriesRenderer<PyramidRenderer> {

	private static final long serialVersionUID = 7312222588231715332L;
	private Integer barPadding = null;
	private Integer barWidth = null;
	private Boolean fill = null;
	private Boolean highlightMouseOver = null;
	private Boolean highlightMouseDown = null;
	private String[] highlightColors = null;
	private Boolean offsetBars = null;
	private String side = null;
	private FillAxes fillAxis = null;
	private ShapeRenderer shapeRenderer = null;
	private ShadowRenderer shadowRenderer = null;

	public PyramidRenderer() {
		super(new DefaultPyramidRenderer());
	}

	public PyramidRenderer(int barPadding, int barWidth, boolean fill,
			boolean highlightMouseOver, boolean highlightMouseDown,
			String[] highlightColors, boolean offsetBars, PyramidSides side,
			FillAxes fillAxis, ShapeRenderer shapeRenderer,
			ShadowRenderer shadowRenderer) {
		super(new DefaultPyramidRenderer());
		setBarPadding(barPadding);
		setBarWidth(barWidth);
		setFill(fill);
		setHighlightMouseOver(highlightMouseOver);
		setHighlightMouseDown(highlightMouseDown);
		setHighlightColors(highlightColors);
		setOffsetBars(offsetBars);
		setSide(side);
		setFillAxis(fillAxis);
		setShapeRenderer(shapeRenderer);
		setShadowRenderer(shadowRenderer);
	}

	public int getBarPadding() {
		return barPadding;
	}

	public PyramidRenderer setBarPadding(int barPadding) {
		this.barPadding = barPadding;
		return this;
	}

	public int getBarWidth() {
		return barWidth;
	}

	public PyramidRenderer setBarWidth(int barWidth) {
		this.barWidth = barWidth;
		return this;
	}

	public boolean getFill() {
		return fill;
	}

	public PyramidRenderer setFill(boolean fill) {
		this.fill = fill;
		return this;
	}

	public boolean getHighlightMouseOver() {
		return highlightMouseOver;
	}

	public PyramidRenderer setHighlightMouseOver(boolean highlightMouseOver) {
		this.highlightMouseOver = highlightMouseOver;
		return this;
	}

	public boolean getHighlightMouseDown() {
		return highlightMouseDown;
	}

	public PyramidRenderer setHighlightMouseDown(boolean highlightMouseDown) {
		this.highlightMouseDown = highlightMouseDown;
		return this;
	}

	public String[] getHighlightColors() {
		return highlightColors;
	}

	public PyramidRenderer setHighlightColors(String[] highlightColors) {
		this.highlightColors = highlightColors;
		return this;
	}

	public boolean getOffsetBars() {
		return offsetBars;
	}

	public PyramidRenderer setOffsetBars(boolean offsetBars) {
		this.offsetBars = offsetBars;
		return this;
	}

	public String getSide() {
		return side;
	}

	public PyramidRenderer setSide(PyramidSides side) {
		this.side = side.getSide();
		return this;
	}

	public FillAxes getFillAxis() {
		return fillAxis;
	}

	public PyramidRenderer setFillAxis(FillAxes fillAxis) {
		this.fillAxis = fillAxis;
		return this;
	}

	public ShapeRenderer getShapeRenderer() {
		return shapeRenderer;
	}

	public PyramidRenderer setShapeRenderer(ShapeRenderer shapeRenderer) {
		this.shapeRenderer = shapeRenderer;
		return this;
	}

	public ShadowRenderer getShadowRenderer() {
		return shadowRenderer;
	}

	public PyramidRenderer setShadowRenderer(ShadowRenderer shadowRenderer) {
		this.shadowRenderer = shadowRenderer;
		return this;
	}

}
