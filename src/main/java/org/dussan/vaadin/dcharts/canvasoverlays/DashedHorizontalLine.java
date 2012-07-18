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
package org.dussan.vaadin.dcharts.canvasoverlays;

import org.dussan.vaadin.dcharts.base.elements.CanvasOverlayObject;
import org.dussan.vaadin.dcharts.defaults.canvasoverlays.DefaultDashedHorizontalLine;
import org.dussan.vaadin.dcharts.helpers.JsonHelper;
import org.dussan.vaadin.dcharts.helpers.ObjectHelper;
import org.dussan.vaadin.dcharts.metadata.CanvasOverlayObjects;
import org.dussan.vaadin.dcharts.metadata.TooltipFadeSpeeds;
import org.dussan.vaadin.dcharts.metadata.XYaxes;
import org.dussan.vaadin.dcharts.metadata.lines.LineCaps;
import org.dussan.vaadin.dcharts.metadata.locations.TooltipLocations;

public class DashedHorizontalLine extends
		CanvasOverlayObject<DashedHorizontalLine> {

	private static final long serialVersionUID = -4160349364942773081L;
	private Object y = null;
	private Object xmin = null;
	private Object xmax = null;
	private Object xOffset = null;
	private Object xminOffset = null;
	private Object xmaxOffset = null;
	private Object dashPattern = null;

	public DashedHorizontalLine() {
		super(new DefaultDashedHorizontalLine());
		setName(CanvasOverlayObjects.DASHED_HORIZONTAL_LINE);
		setShow(true);
	}

	public DashedHorizontalLine(boolean show, int lineWidth, LineCaps lineCaps,
			String color, boolean shadow, int shadowAngle, int shadowOffset,
			int shadowDepth, String shadowAlpha, XYaxes xaxis, XYaxes yaxis,
			boolean showTooltip, float showTooltipPrecision,
			TooltipLocations tooltipLocations, boolean fadeTooltip,
			TooltipFadeSpeeds tooltipFadeSpeeds, int tooltipOffset,
			String tooltipFormatString, Object y, Object xmin, Object xmax,
			Object xOffset, Object xminOffset, Object xmaxOffset,
			int[] dashPattern) {
		super(new DefaultDashedHorizontalLine());
		setName(CanvasOverlayObjects.DASHED_HORIZONTAL_LINE);
		setShow(show);
		setLineWidth(lineWidth);
		setLineCap(lineCaps);
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
		setY(y);
		setXmin(xmin);
		setXmax(xmax);
		setxOffset(xOffset);
		setXminOffset(xminOffset);
		setXmaxOffset(xmaxOffset);
		setDashPattern(dashPattern);
	}

	public Object getY() {
		return y;
	}

	public DashedHorizontalLine setY(Object y) {
		this.y = y;
		return this;
	}

	public Object getXmin() {
		return xmin;
	}

	public DashedHorizontalLine setXmin(Object xmin) {
		this.xmin = xmin;
		return this;
	}

	public Object getXmax() {
		return xmax;
	}

	public DashedHorizontalLine setXmax(Object xmax) {
		this.xmax = xmax;
		return this;
	}

	public Object getxOffset() {
		return xOffset;
	}

	public DashedHorizontalLine setxOffset(Object xOffset) {
		this.xOffset = xOffset;
		return this;
	}

	public Object getXminOffset() {
		return xminOffset;
	}

	public DashedHorizontalLine setXminOffset(Object xminOffset) {
		this.xminOffset = xminOffset;
		return this;
	}

	public Object getXmaxOffset() {
		return xmaxOffset;
	}

	public DashedHorizontalLine setXmaxOffset(Object xmaxOffset) {
		this.xmaxOffset = xmaxOffset;
		return this;
	}

	public Object getDashPattern() {
		return dashPattern;
	}

	public DashedHorizontalLine setDashPattern(int[] dashPattern) {
		this.dashPattern = ObjectHelper.toArrayString(dashPattern);
		return this;
	}

	@Override
	public String getValue() {
		return JsonHelper.toJsonString(this);
	}

}
