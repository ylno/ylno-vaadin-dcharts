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
import org.dussan.vaadin.dcharts.defaults.renderers.ticks.DefaultCanvasAxisTickRenderer;
import org.dussan.vaadin.dcharts.metadata.FontWeights;
import org.dussan.vaadin.dcharts.metadata.ticks.TickFormatters;
import org.dussan.vaadin.dcharts.metadata.ticks.TickLabelPositions;
import org.dussan.vaadin.dcharts.metadata.ticks.TickMarks;

public class CanvasAxisTickRenderer extends
		TickRenderer<CanvasAxisTickRenderer> {

	private static final long serialVersionUID = -6825411106978770368L;
	private Integer angle = null;
	private TickLabelPositions labelPosition = null;
	private FontWeights fontWeight = null;
	private Float fontStretch = null;
	private Boolean enableFontSupport = null;
	private Float pt2px = null;

	public CanvasAxisTickRenderer() {
		super(new DefaultCanvasAxisTickRenderer());
		setShow(true);
	}

	public CanvasAxisTickRenderer(TickMarks tickMarks, boolean showMark,
			boolean showGridline, boolean isMinorTick, int angle, int markSize,
			boolean show, boolean showLabel,
			TickLabelPositions tickLabelPositions,
			TickFormatters tickFormatters, String formatString, String prefix,
			String fontFamily, String fontSize, FontWeights fontWeights,
			float fontStretch, String textColor, boolean enableFontSupport,
			float pt2px) {
		super(new DefaultCanvasAxisTickRenderer());
		setMark(tickMarks);
		setShowMark(showMark);
		setShowGridline(showGridline);
		setIsMinorTick(isMinorTick);
		setAngle(angle);
		setMarkSize(markSize);
		setShow(show);
		setShowLabel(showLabel);
		setLabelPosition(tickLabelPositions);
		setFormatter(tickFormatters);
		setFormatString(formatString);
		setPrefix(prefix);
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

	public CanvasAxisTickRenderer setAngle(int angle) {
		this.angle = angle;
		return this;
	}

	public TickLabelPositions getLabelPosition() {
		return labelPosition;
	}

	public CanvasAxisTickRenderer setLabelPosition(
			TickLabelPositions tickLabelPositions) {
		this.labelPosition = tickLabelPositions;
		return this;
	}

	public FontWeights getFontWeight() {
		return fontWeight;
	}

	public CanvasAxisTickRenderer setFontWeight(FontWeights fontWeights) {
		this.fontWeight = fontWeights;
		return this;
	}

	public float getFontStretch() {
		return fontStretch;
	}

	public CanvasAxisTickRenderer setFontStretch(float fontStretch) {
		this.fontStretch = fontStretch;
		return this;
	}

	public boolean getEnableFontSupport() {
		return enableFontSupport;
	}

	public CanvasAxisTickRenderer setEnableFontSupport(boolean enableFontSupport) {
		this.enableFontSupport = enableFontSupport;
		return this;
	}

	public float getPt2px() {
		return pt2px;
	}

	public CanvasAxisTickRenderer setPt2px(float pt2px) {
		this.pt2px = pt2px;
		return this;
	}

}
