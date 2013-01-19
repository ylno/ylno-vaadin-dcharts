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
package org.dussan.vaadin.dcharts.renderers.axis;

import org.dussan.vaadin.dcharts.base.renderers.AxisRenderer;
import org.dussan.vaadin.dcharts.defaults.renderers.axis.DefaultPyramidAxisRenderer;
import org.dussan.vaadin.dcharts.metadata.PyramidAxesPositions;

public class PyramidAxisRenderer extends AxisRenderer<PyramidAxisRenderer> {

	private static final long serialVersionUID = 3775035905006841263L;
	private PyramidAxesPositions position = null;
	// EXPERIMENTAL
	// private Integer[] breakPoints = null;
	// EXPERIMENTAL
	// private String breakTickLabel = null;
	private Boolean drawBaseline = null;
	private Integer baselineWidth = null;
	private String baselineColor = null;
	private Boolean forceTickAt0 = null;
	private Boolean forceTickAt100 = null;
	private Float tickInset = null;
	private Integer minorTicks = null;
	private Boolean alignTicks = null;
	private Integer tickSpacingFactor = null;
	private Boolean category = null;

	public PyramidAxisRenderer() {
		super(new DefaultPyramidAxisRenderer());
	}

	public PyramidAxisRenderer(PyramidAxesPositions pyramidAxesPositions,
			boolean drawBaseline, int baselineWidth, String baselineColor,
			boolean forceTickAt0, boolean forceTickAt100, float tickInset,
			int minorTicks, boolean alignTicks, int tickSpacingFactor,
			boolean category) {
		super(new DefaultPyramidAxisRenderer());
		setPosition(pyramidAxesPositions);
		setDrawBaseline(drawBaseline);
		setBaselineWidth(baselineWidth);
		setBaselineColor(baselineColor);
		setForceTickAt0(forceTickAt0);
		setForceTickAt100(forceTickAt100);
		setTickInset(tickInset);
		setMinorTicks(minorTicks);
		setAlignTicks(alignTicks);
	}

	public PyramidAxesPositions getPosition() {
		return position;
	}

	public PyramidAxisRenderer setPosition(
			PyramidAxesPositions pyramidAxesPositions) {
		this.position = pyramidAxesPositions;
		return this;
	}

	public boolean getDrawBaseline() {
		return drawBaseline;
	}

	public PyramidAxisRenderer setDrawBaseline(boolean drawBaseline) {
		this.drawBaseline = drawBaseline;
		return this;
	}

	public int getBaselineWidth() {
		return baselineWidth;
	}

	public PyramidAxisRenderer setBaselineWidth(int baselineWidth) {
		this.baselineWidth = baselineWidth;
		return this;
	}

	public String getBaselineColor() {
		return baselineColor;
	}

	public PyramidAxisRenderer setBaselineColor(String baselineColor) {
		this.baselineColor = baselineColor;
		return this;
	}

	public boolean getForceTickAt0() {
		return forceTickAt0;
	}

	public PyramidAxisRenderer setForceTickAt0(boolean forceTickAt0) {
		this.forceTickAt0 = forceTickAt0;
		return this;
	}

	public boolean getForceTickAt100() {
		return forceTickAt100;
	}

	public PyramidAxisRenderer setForceTickAt100(boolean forceTickAt100) {
		this.forceTickAt100 = forceTickAt100;
		return this;
	}

	public float getTickInset() {
		return tickInset;
	}

	public PyramidAxisRenderer setTickInset(float tickInset) {
		this.tickInset = tickInset;
		return this;
	}

	public int getMinorTicks() {
		return minorTicks;
	}

	public PyramidAxisRenderer setMinorTicks(int minorTicks) {
		this.minorTicks = minorTicks;
		return this;
	}

	public boolean getAlignTicks() {
		return alignTicks;
	}

	public PyramidAxisRenderer setAlignTicks(boolean alignTicks) {
		this.alignTicks = alignTicks;
		return this;
	}

	public Integer getTickSpacingFactor() {
		return tickSpacingFactor;
	}

	public PyramidAxisRenderer setTickSpacingFactor(Integer tickSpacingFactor) {
		this.tickSpacingFactor = tickSpacingFactor;
		return this;
	}

	public boolean getCategory() {
		return category;
	}

	public PyramidAxisRenderer setCategory(boolean category) {
		this.category = category;
		return this;
	}

}
