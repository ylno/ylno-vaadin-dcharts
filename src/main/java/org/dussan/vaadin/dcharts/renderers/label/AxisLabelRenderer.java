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
package org.dussan.vaadin.dcharts.renderers.label;

import org.dussan.vaadin.dcharts.base.renderers.LabelRenderer;
import org.dussan.vaadin.dcharts.defaults.renderers.labels.DefaultAxisLabelRenderer;
import org.dussan.vaadin.dcharts.metadata.XYaxes;

public class AxisLabelRenderer extends LabelRenderer<AxisLabelRenderer> {

	private static final long serialVersionUID = -380785700518051859L;
	private XYaxes axis = null;
	private Boolean escapeHTML = null;

	public AxisLabelRenderer() {
		super(new DefaultAxisLabelRenderer());
		setShow(true);
	}

	public AxisLabelRenderer(boolean show, String label, String fontFamily,
			String fontSize, String textColor, boolean escapeHTML) {
		super(new DefaultAxisLabelRenderer());
		setShow(show);
		setLabel(label);
		setFontFamily(fontFamily);
		setFontSize(fontSize);
		setTextColor(textColor);
		setEscapeHTML(escapeHTML);
	}

	public XYaxes getAxis() {
		return axis;
	}

	public AxisLabelRenderer setAxis(XYaxes axis) {
		this.axis = axis;
		return this;
	}

	public boolean getEscapeHTML() {
		return escapeHTML;
	}

	public AxisLabelRenderer setEscapeHTML(boolean escapeHTML) {
		this.escapeHTML = escapeHTML;
		return this;
	}

}
