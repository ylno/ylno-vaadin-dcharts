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
package org.dussan.vaadin.dcharts.renderers.series;

import org.dussan.vaadin.dcharts.base.renderers.SeriesRenderer;
import org.dussan.vaadin.dcharts.defaults.renderers.series.DefaultBarRenderer;
import org.dussan.vaadin.dcharts.metadata.directions.BarDirections;
import org.dussan.vaadin.dcharts.renderers.series.animations.BarAnimation;

public class BarRenderer extends SeriesRenderer<BarRenderer> {

	private static final long serialVersionUID = 8147585643831907847L;
	private Integer barPadding = null;
	private Integer barMargin = null;
	private BarDirections barDirection = null;
	private Integer barWidth = null;
	private Integer shadowOffset = null;
	private Integer shadowDepth = null;
	private Float shadowAlpha = null;
	private Boolean waterfall = null;
	private Integer groups = null;
	private Boolean varyBarColor = null;
	private Boolean highlightMouseOver = null;
	private Boolean highlightMouseDown = null;
	private String[] highlightColors = null;
	private Boolean transposedData = null;
	private BarAnimation animation = null;

	public BarRenderer() {
		super(new DefaultBarRenderer());
	}

	public BarRenderer(int barPadding, int barMargin,
			BarDirections barDirections, int barWidth, int shadowOffset,
			int shadowDepth, float shadowAlpha, boolean waterfall, int groups,
			boolean varyBarColor, boolean highlightMouseOver,
			boolean highlightMouseDown, String[] highlightColors,
			boolean transposedData, BarAnimation barAnimation) {
		super(new DefaultBarRenderer());
		setBarPadding(barPadding);
		setBarMargin(barMargin);
		setBarDirection(barDirections);
		setBarWidth(barWidth);
		setShadowOffset(shadowOffset);
		setShadowDepth(shadowDepth);
		setShadowAlpha(shadowAlpha);
		setWaterfall(waterfall);
		setGroups(groups);
		setVaryBarColor(varyBarColor);
		setHighlightMouseOver(highlightMouseOver);
		setHighlightMouseDown(highlightMouseDown);
		setHighlightColors(highlightColors);
		setTransposedData(transposedData);
		setAnimation(barAnimation);
	}

	public int getBarPadding() {
		return barPadding;
	}

	public BarRenderer setBarPadding(int barPadding) {
		this.barPadding = barPadding;
		return this;
	}

	public int getBarMargin() {
		return barMargin;
	}

	public BarRenderer setBarMargin(int barMargin) {
		this.barMargin = barMargin;
		return this;
	}

	public BarDirections getBarDirection() {
		return barDirection;
	}

	public BarRenderer setBarDirection(BarDirections barDirections) {
		this.barDirection = barDirections;
		return this;
	}

	public int getBarWidth() {
		return barWidth;
	}

	public BarRenderer setBarWidth(int barWidth) {
		this.barWidth = barWidth;
		return this;
	}

	public int getShadowOffset() {
		return shadowOffset;
	}

	public BarRenderer setShadowOffset(int shadowOffset) {
		this.shadowOffset = shadowOffset;
		return this;
	}

	public int getShadowDepth() {
		return shadowDepth;
	}

	public BarRenderer setShadowDepth(int shadowDepth) {
		this.shadowDepth = shadowDepth;
		return this;
	}

	public float getShadowAlpha() {
		return shadowAlpha;
	}

	public BarRenderer setShadowAlpha(float shadowAlpha) {
		this.shadowAlpha = shadowAlpha;
		return this;
	}

	public boolean getWaterfall() {
		return waterfall;
	}

	public BarRenderer setWaterfall(boolean waterfall) {
		this.waterfall = waterfall;
		return this;
	}

	public int getGroups() {
		return groups;
	}

	public BarRenderer setGroups(int groups) {
		this.groups = groups;
		return this;
	}

	public boolean getVaryBarColor() {
		return varyBarColor;
	}

	public BarRenderer setVaryBarColor(boolean varyBarColor) {
		this.varyBarColor = varyBarColor;
		return this;
	}

	public boolean getHighlightMouseOver() {
		return highlightMouseOver;
	}

	public BarRenderer setHighlightMouseOver(boolean highlightMouseOver) {
		this.highlightMouseOver = highlightMouseOver;
		return this;
	}

	public boolean getHighlightMouseDown() {
		return highlightMouseDown;
	}

	public BarRenderer setHighlightMouseDown(boolean highlightMouseDown) {
		this.highlightMouseDown = highlightMouseDown;
		return this;
	}

	public String[] getHighlightColors() {
		return highlightColors;
	}

	public BarRenderer setHighlightColors(String... highlightColors) {
		this.highlightColors = highlightColors;
		return this;
	}

	public boolean getTransposedData() {
		return transposedData;
	}

	public BarRenderer setTransposedData(boolean transposedData) {
		this.transposedData = transposedData;
		return this;
	}

	public BarAnimation getAnimation() {
		return animation;
	}

	public BarRenderer setAnimation(BarAnimation barAnimation) {
		this.animation = barAnimation;
		return this;
	}

}
