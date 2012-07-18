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
package org.dussan.vaadin.dcharts.renderers.tick;

import org.dussan.vaadin.dcharts.base.renderers.TickRenderer;
import org.dussan.vaadin.dcharts.defaults.renderers.ticks.DefaultAxisTickRenderer;
import org.dussan.vaadin.dcharts.metadata.XYaxes;
import org.dussan.vaadin.dcharts.metadata.ticks.TickFormatters;
import org.dussan.vaadin.dcharts.metadata.ticks.TickMarks;

public class AxisTickRenderer extends TickRenderer<AxisTickRenderer> {

	private static final long serialVersionUID = -6984340001964880243L;
	private XYaxes axis = null;
	private Integer size = null;
	private Boolean escapeHTML = null;

	public AxisTickRenderer() {
		super(new DefaultAxisTickRenderer());
		setShow(true);
	}

	public AxisTickRenderer(TickMarks tickMarks, boolean showMark,
			boolean showGridline, boolean isMinorTick, int size, int markSize,
			boolean show, boolean showLabel, TickFormatters tickFormatters,
			String prefix, String formatString, String fontFamily,
			String fontSize, String textColor, boolean escapeHTML) {
		super(new DefaultAxisTickRenderer());
		setMark(tickMarks);
		setShowMark(showMark);
		setShowGridline(showGridline);
		setIsMinorTick(isMinorTick);
		setSize(size);
		setMarkSize(markSize);
		setShow(show);
		setShowLabel(showLabel);
		setFormatter(tickFormatters);
		setPrefix(prefix);
		setFormatString(formatString);
		setFontFamily(fontFamily);
		setFontSize(fontSize);
		setTextColor(textColor);
		setEscapeHTML(escapeHTML);
	}

	public XYaxes getAxis() {
		return axis;
	}

	public AxisTickRenderer setAxis(XYaxes xyAxes) {
		this.axis = xyAxes;
		return this;
	}

	public int getSize() {
		return size;
	}

	public AxisTickRenderer setSize(int size) {
		this.size = size;
		return this;
	}

	public boolean getEscapeHTML() {
		return escapeHTML;
	}

	public AxisTickRenderer setEscapeHTML(boolean escapeHTML) {
		this.escapeHTML = escapeHTML;
		return this;
	}

}
