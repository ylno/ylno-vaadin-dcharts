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
import org.dussan.vaadin.dcharts.defaults.renderers.axis.DefaultLinearAxisRenderer;

public class LinearAxisRenderer extends AxisRenderer<LinearAxisRenderer> {

	private static final long serialVersionUID = -7815871683617633916L;
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

	public LinearAxisRenderer() {
		super(new DefaultLinearAxisRenderer());
	}

	public LinearAxisRenderer(boolean drawBaseline, int baselineWidth,
			String baselineColor, boolean forceTickAt0, boolean forceTickAt100,
			float tickInset, int minorTicks, boolean alignTicks) {
		super(new DefaultLinearAxisRenderer());
		setDrawBaseline(drawBaseline);
		setBaselineWidth(baselineWidth);
		setBaselineColor(baselineColor);
		setForceTickAt0(forceTickAt0);
		setForceTickAt100(forceTickAt100);
		setTickInset(tickInset);
		setMinorTicks(minorTicks);
		setAlignTicks(alignTicks);
	}

	public boolean getDrawBaseline() {
		return drawBaseline;
	}

	public LinearAxisRenderer setDrawBaseline(boolean drawBaseline) {
		this.drawBaseline = drawBaseline;return this;
	}

	public int getBaselineWidth() {
		return baselineWidth;
	}

	public LinearAxisRenderer setBaselineWidth(int baselineWidth) {
		this.baselineWidth = baselineWidth;return this;
	}

	public String getBaselineColor() {
		return baselineColor;
	}

	public LinearAxisRenderer setBaselineColor(String baselineColor) {
		this.baselineColor = baselineColor;return this;
	}

	public boolean getForceTickAt0() {
		return forceTickAt0;
	}

	public LinearAxisRenderer setForceTickAt0(boolean forceTickAt0) {
		this.forceTickAt0 = forceTickAt0;return this;
	}

	public boolean getForceTickAt100() {
		return forceTickAt100;
	}

	public LinearAxisRenderer setForceTickAt100(boolean forceTickAt100) {
		this.forceTickAt100 = forceTickAt100;return this;
	}

	public float getTickInset() {
		return tickInset;
	}

	public LinearAxisRenderer setTickInset(float tickInset) {
		this.tickInset = tickInset;return this;
	}

	public int getMinorTicks() {
		return minorTicks;
	}

	public LinearAxisRenderer setMinorTicks(int minorTicks) {
		this.minorTicks = minorTicks;return this;
	}

	public boolean getAlignTicks() {
		return alignTicks;
	}

	public LinearAxisRenderer setAlignTicks(boolean alignTicks) {
		this.alignTicks = alignTicks;
		return this;
	}

}
