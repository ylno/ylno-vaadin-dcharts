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
package org.dussan.vaadin.dcharts.base.elements;

import org.dussan.vaadin.dcharts.base.BaseElement;
import org.dussan.vaadin.dcharts.metadata.TooltipFadeSpeeds;
import org.dussan.vaadin.dcharts.metadata.XYaxes;
import org.dussan.vaadin.dcharts.metadata.lines.LineCaps;
import org.dussan.vaadin.dcharts.metadata.locations.TooltipLocations;

@SuppressWarnings({ "serial", "unchecked" })
public abstract class CanvasOverlayObject<T> extends BaseElement<T> {

	private String name = null;
	private Boolean show = null;
	private Integer lineWidth = null;
	private LineCaps lineCap = null;
	private String color = null;
	private Boolean shadow = null;
	private Integer shadowAngle = null;
	private Integer shadowOffset = null;
	private Integer shadowDepth = null;
	private String shadowAlpha = null;
	private XYaxes xaxis = null;
	private XYaxes yaxis = null;
	private Boolean showTooltip = null;
	private Float showTooltipPrecision = null;
	private TooltipLocations tooltipLocation = null;
	private Boolean fadeTooltip = null;
	private TooltipFadeSpeeds tooltipFadeSpeed = null;
	private Integer tooltipOffset = null;
	private String tooltipFormatString = null;

	public CanvasOverlayObject(Object defaultOverlayLineBase) {
		super(defaultOverlayLineBase);
		setShow(true);
	}

	public CanvasOverlayObject(String name, boolean show, int lineWidth,
			LineCaps lineCaps, String color, boolean shadow, int shadowAngle,
			int shadowOffset, int shadowDepth, String shadowAlpha,
			XYaxes xaxis, XYaxes yaxis, boolean showTooltip,
			float showTooltipPrecision, TooltipLocations tooltipLocations,
			boolean fadeTooltip, TooltipFadeSpeeds tooltipFadeSpeeds,
			int tooltipOffset, String tooltipFormatString) {
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
	}

	public String getName() {
		return name;
	}

	public T setName(String name) {
		this.name = name;
		return (T) this;
	}

	public boolean getShow() {
		return show;
	}

	public T setShow(boolean show) {
		this.show = show;
		return (T) this;
	}

	public int getLineWidth() {
		return lineWidth;
	}

	public T setLineWidth(int lineWidth) {
		this.lineWidth = lineWidth;
		return (T) this;
	}

	public LineCaps getLineCap() {
		return lineCap;
	}

	public T setLineCap(LineCaps lineCaps) {
		this.lineCap = lineCaps;
		return (T) this;
	}

	public String getColor() {
		return color;
	}

	public T setColor(String color) {
		this.color = color;
		return (T) this;
	}

	public boolean getShadow() {
		return shadow;
	}

	public T setShadow(boolean shadow) {
		this.shadow = shadow;
		return (T) this;
	}

	public int getShadowAngle() {
		return shadowAngle;
	}

	public T setShadowAngle(int shadowAngle) {
		this.shadowAngle = shadowAngle;
		return (T) this;
	}

	public int getShadowOffset() {
		return shadowOffset;
	}

	public T setShadowOffset(int shadowOffset) {
		this.shadowOffset = shadowOffset;
		return (T) this;
	}

	public int getShadowDepth() {
		return shadowDepth;
	}

	public T setShadowDepth(int shadowDepth) {
		this.shadowDepth = shadowDepth;
		return (T) this;
	}

	public String getShadowAlpha() {
		return shadowAlpha;
	}

	public T setShadowAlpha(String shadowAlpha) {
		this.shadowAlpha = shadowAlpha;
		return (T) this;
	}

	public XYaxes getXaxis() {
		return xaxis;
	}

	public T setXaxis(XYaxes xaxis) {
		this.xaxis = xaxis;
		return (T) this;
	}

	public XYaxes getYaxis() {
		return yaxis;
	}

	public T setYaxis(XYaxes yaxis) {
		this.yaxis = yaxis;
		return (T) this;
	}

	public boolean getShowTooltip() {
		return showTooltip;
	}

	public T setShowTooltip(boolean showTooltip) {
		this.showTooltip = showTooltip;
		return (T) this;
	}

	public float getShowTooltipPrecision() {
		return showTooltipPrecision;
	}

	public T setShowTooltipPrecision(float showTooltipPrecision) {
		this.showTooltipPrecision = showTooltipPrecision;
		return (T) this;
	}

	public TooltipLocations getTooltipLocation() {
		return tooltipLocation;
	}

	public T setTooltipLocation(TooltipLocations tooltipLocations) {
		this.tooltipLocation = tooltipLocations;
		return (T) this;
	}

	public boolean getFadeTooltip() {
		return fadeTooltip;
	}

	public T setFadeTooltip(boolean fadeTooltip) {
		this.fadeTooltip = fadeTooltip;
		return (T) this;
	}

	public TooltipFadeSpeeds getTooltipFadeSpeed() {
		return tooltipFadeSpeed;
	}

	public T setTooltipFadeSpeed(TooltipFadeSpeeds tooltipFadeSpeeds) {
		this.tooltipFadeSpeed = tooltipFadeSpeeds;
		return (T) this;
	}

	public int getTooltipOffset() {
		return tooltipOffset;
	}

	public T setTooltipOffset(int tooltipOffset) {
		this.tooltipOffset = tooltipOffset;
		return (T) this;
	}

	public String getTooltipFormatString() {
		return tooltipFormatString;
	}

	public T setTooltipFormatString(String tooltipFormatString) {
		this.tooltipFormatString = tooltipFormatString;
		return (T) this;
	}

}
