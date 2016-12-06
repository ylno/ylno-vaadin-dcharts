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
package org.dussan.vaadin.dcharts.renderers.axis;

import org.dussan.vaadin.dcharts.base.renderers.AxisRenderer;
import org.dussan.vaadin.dcharts.defaults.renderers.axis.DefaultDateAxisRenderer;

public class DateAxisRenderer extends AxisRenderer<DateAxisRenderer> {

	private static final long serialVersionUID = -5712747379326317060L;
	private Float tickInset = null;
	private Boolean drawBaseline = null;
	private Integer baselineWidth = null;
	private String baselineColor = null;

	public DateAxisRenderer() {
		super(new DefaultDateAxisRenderer());
	}

	public DateAxisRenderer(float tickInset, boolean drawBaseline,
			int baselineWidth, String baselineColor) {
		super(new DefaultDateAxisRenderer());
		setTickInset(tickInset);
		setDrawBaseline(drawBaseline);
		setBaselineWidth(baselineWidth);
		setBaselineColor(baselineColor);
	}

	public float getTickInset() {
		return tickInset;
	}

	public DateAxisRenderer setTickInset(float tickInset) {
		this.tickInset = tickInset;
		return this;
	}

	public boolean getDrawBaseline() {
		return drawBaseline;
	}

	public DateAxisRenderer setDrawBaseline(boolean drawBaseline) {
		this.drawBaseline = drawBaseline;
		return this;
	}

	public int getBaselineWidth() {
		return baselineWidth;
	}

	public DateAxisRenderer setBaselineWidth(int baselineWidth) {
		this.baselineWidth = baselineWidth;
		return this;
	}

	public String getBaselineColor() {
		return baselineColor;
	}

	public DateAxisRenderer setBaselineColor(String baselineColor) {
		this.baselineColor = baselineColor;
		return this;
	}

}
