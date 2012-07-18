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
package org.dussan.vaadin.dcharts.renderers.axis;

import org.dussan.vaadin.dcharts.base.renderers.AxisRenderer;
import org.dussan.vaadin.dcharts.defaults.renderers.axis.DefaultLogAxisRenderer;

public class LogAxisRenderer extends AxisRenderer<LogAxisRenderer> {

	private static final long serialVersionUID = -2244104113932175933L;
	private Boolean drawBaseline = null;
	private Object minorTicks = null;

	public LogAxisRenderer() {
		super(new DefaultLogAxisRenderer());
	}

	public LogAxisRenderer(boolean drawBaseline, int minorTicks) {
		super(new DefaultLogAxisRenderer());
		setDrawBaseline(drawBaseline);
		setMinorTicks(minorTicks);
	}

	public boolean getDrawBaseline() {
		return drawBaseline;
	}

	public LogAxisRenderer setDrawBaseline(boolean drawBaseline) {
		this.drawBaseline = drawBaseline;
		return this;
	}

	public Object getMinorTicks() {
		return minorTicks;
	}

	public LogAxisRenderer setMinorTicks(int minorTicks) {
		this.minorTicks = minorTicks;
		return this;
	}

}
