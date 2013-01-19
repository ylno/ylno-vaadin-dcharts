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
import org.dussan.vaadin.dcharts.defaults.renderers.labels.DefaultCanvasAxisLabelRenderer;
import org.dussan.vaadin.dcharts.metadata.FontWeights;
import org.dussan.vaadin.dcharts.metadata.XYaxes;

public class CanvasAxisLabelRenderer extends
		LabelRenderer<CanvasAxisLabelRenderer> {

	private static final long serialVersionUID = 8512250394756937798L;
	private Integer angle = null;
	private XYaxes axis = null;
	private Boolean showLabel = null;
	private FontWeights fontWeight = null;
	private Float fontStretch = null;
	private Boolean enableFontSupport = null;
	private Float pt2px = null;

	public CanvasAxisLabelRenderer() {
		super(new DefaultCanvasAxisLabelRenderer());
		setShow(true);
	}

	public CanvasAxisLabelRenderer(int angle, boolean show, boolean showLabel,
			String label, String fontFamily, String fontSize,
			FontWeights fontWeights, float fontStretch, String textColor,
			boolean enableFontSupport, float pt2px) {
		super(new DefaultCanvasAxisLabelRenderer());
		setAngle(angle);
		setShow(show);
		setShowLabel(showLabel);
		setLabel(label);
		setFontFamily(fontFamily);
		setFontSize(fontSize);
		setFontWeight(fontWeights);
		setFontStretch(fontStretch);
		setTextColor(textColor);
		setEnableFontSupport(enableFontSupport);
		setPt2px(pt2px);
	}

	public int getAngle() {
		return angle;
	}

	public CanvasAxisLabelRenderer setAngle(int angle) {
		this.angle = angle;
		return this;
	}

	public XYaxes getAxis() {
		return axis;
	}

	public CanvasAxisLabelRenderer setAxis(XYaxes axis) {
		this.axis = axis;
		return this;
	}

	public boolean getShowLabel() {
		return showLabel;
	}

	public CanvasAxisLabelRenderer setShowLabel(boolean showLabel) {
		this.showLabel = showLabel;
		return this;
	}

	public FontWeights getFontWeight() {
		return fontWeight;
	}

	public CanvasAxisLabelRenderer setFontWeight(FontWeights fontWeights) {
		this.fontWeight = fontWeights;
		return this;
	}

	public float getFontStretch() {
		return fontStretch;
	}

	public CanvasAxisLabelRenderer setFontStretch(float fontStretch) {
		this.fontStretch = fontStretch;
		return this;
	}

	public boolean getEnableFontSupport() {
		return enableFontSupport;
	}

	public CanvasAxisLabelRenderer setEnableFontSupport(
			boolean enableFontSupport) {
		this.enableFontSupport = enableFontSupport;
		return this;
	}

	public float getPt2px() {
		return pt2px;
	}

	public CanvasAxisLabelRenderer setPt2px(float pt2px) {
		this.pt2px = pt2px;
		return this;
	}

}
