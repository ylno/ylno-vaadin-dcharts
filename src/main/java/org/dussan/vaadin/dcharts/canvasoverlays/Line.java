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
package org.dussan.vaadin.dcharts.canvasoverlays;

import org.dussan.vaadin.dcharts.base.elements.CanvasOverlayObject;
import org.dussan.vaadin.dcharts.defaults.canvasoverlays.DefaultLine;
import org.dussan.vaadin.dcharts.helpers.JsonHelper;
import org.dussan.vaadin.dcharts.metadata.TooltipFadeSpeeds;
import org.dussan.vaadin.dcharts.metadata.XYaxes;
import org.dussan.vaadin.dcharts.metadata.lines.LineCaps;
import org.dussan.vaadin.dcharts.metadata.locations.TooltipLocations;

public class Line extends CanvasOverlayObject<Line> {

	private static final long serialVersionUID = 130184348284953408L;
	private Object[][] start = null;
	private Object[][] stop = null;

	public Line() {
		super(new DefaultLine());
		setShow(true);
	}

	public Line(String name, boolean show, int lineWidth, LineCaps lineCap, String color,
			boolean shadow, int shadowAngle, int shadowOffset, int shadowDepth,
			String shadowAlpha, XYaxes xaxis, XYaxes yaxis,
			boolean showTooltip, float showTooltipPrecision,
			TooltipLocations tooltipLocations, boolean fadeTooltip,
			TooltipFadeSpeeds tooltipFadeSpeeds, int tooltipOffset,
			String tooltipFormatString, Object[][] start, Object[][] stop) {
		super(new DefaultLine());
		setName(name);
		setShow(show);
		setLineWidth(lineWidth);
		setLineCap(lineCap);
		setColor(color);
		setShadow(shadow);
		setShadowAngle(shadowAngle);
		setShadowOffset(shadowOffset);
		setShadowDepth(shadowDepth);
		setShadowAlpha(shadowAlpha);
		setXaxis(xaxis);
		setYaxis(yaxis);
		setShowTooltip(showTooltip);
		setShowTooltipPrecision(showTooltipPrecision);
		setTooltipLocation(tooltipLocations);
		setFadeTooltip(fadeTooltip);
		setTooltipFadeSpeed(tooltipFadeSpeeds);
		setTooltipOffset(tooltipOffset);
		setTooltipFormatString(tooltipFormatString);
		setStart(start);
		setStop(stop);
	}

	public Object[][] getStart() {
		return start;
	}

	public Line setStart(Object[][] start) {
		this.start = start;
		return this;
	}

	public Object[][] getStop() {
		return stop;
	}

	public Line setStop(Object[][] stop) {
		this.stop = stop;
		return this;
	}

	@Override
	public String getValue() {
		return JsonHelper.toJsonString(this);
	}

}
