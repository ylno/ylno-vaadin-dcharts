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
package org.dussan.vaadin.dcharts.base.elements;

import org.dussan.vaadin.dcharts.base.BaseElement;
import org.dussan.vaadin.dcharts.base.renderers.MarkerRenderer;
import org.dussan.vaadin.dcharts.defaults.DefaultTrendline;
import org.dussan.vaadin.dcharts.helpers.JsonHelper;
import org.dussan.vaadin.dcharts.metadata.TrendlineType;

public class Trendline extends BaseElement<Trendline> {

	private static final long serialVersionUID = -231072495125799926L;
	private Boolean show = null;
	private String color = null;
	private String renderer = null;
	private String rendererOptions = null;
	private String label = null;
	private String type = null;
	private Boolean shadow = null;
	private String markerRenderer = null;
	private Float lineWidth = null;
	private Integer shadowAngle = null;
	private Float shadowOffset = null;
	private Float shadowAlpha = null;
	private Integer shadowDepth = null;

	public Trendline() {
		super(new DefaultTrendline());
		setShow(true);
	}

	public Trendline(boolean show, String color, String renderer,
			String rendererOptions, String label, TrendlineType type,
			boolean shadow, MarkerRenderer markerRenderer, float lineWidth,
			int shadowAngle, float shadowOffset, float shadowAlpha,
			int shadowDepth) {
		super(new DefaultTrendline());
		setShow(show);
		setColor(color);
		setRenderer(renderer);
		setRendererOptions(rendererOptions);
		setLabel(label);
		setType(type);
		setShadow(shadow);
		setMarkerRenderer(markerRenderer);
		setLineWidth(lineWidth);
		setShadowAngle(shadowAngle);
		setShadowOffset(shadowOffset);
		setShadowAlpha(shadowAlpha);
		setShadowDepth(shadowDepth);
	}

	public boolean getShow() {
		return show;
	}

	public Trendline setShow(boolean show) {
		this.show = show;
		return this;
	}

	public String getColor() {
		return color;
	}

	public Trendline setColor(String color) {
		this.color = color;
		return this;
	}

	public String getRenderer() {
		return renderer;
	}

	public Trendline setRenderer(String renderer) {
		this.renderer = renderer;
		return this;
	}

	public String getRendererOptions() {
		return rendererOptions;
	}

	public Trendline setRendererOptions(String rendererOptions) {
		this.rendererOptions = rendererOptions;
		return this;
	}

	public String getLabel() {
		return label;
	}

	public Trendline setLabel(String label) {
		this.label = label;
		return this;
	}

	public String getType() {
		return type;
	}

	public Trendline setType(TrendlineType type) {
		this.type = type.getType();
		return this;
	}

	public boolean getShadow() {
		return shadow;
	}

	public Trendline setShadow(boolean shadow) {
		this.shadow = shadow;
		return this;
	}

	public String getMarkerRenderer() {
		return markerRenderer;
	}

	public Trendline setMarkerRenderer(MarkerRenderer markerRenderer) {
		this.markerRenderer = markerRenderer.getValue();
		return this;
	}

	public float getLineWidth() {
		return lineWidth;
	}

	public Trendline setLineWidth(float lineWidth) {
		this.lineWidth = lineWidth;
		return this;
	}

	public int getShadowAngle() {
		return shadowAngle;
	}

	public Trendline setShadowAngle(int shadowAngle) {
		this.shadowAngle = shadowAngle;
		return this;
	}

	public float getShadowOffset() {
		return shadowOffset;
	}

	public Trendline setShadowOffset(float shadowOffset) {
		this.shadowOffset = shadowOffset;
		return this;
	}

	public float getShadowAlpha() {
		return shadowAlpha;
	}

	public Trendline setShadowAlpha(float shadowAlpha) {
		this.shadowAlpha = shadowAlpha;
		return this;
	}

	public int getShadowDepth() {
		return shadowDepth;
	}

	public Trendline setShadowDepth(int shadowDepth) {
		this.shadowDepth = shadowDepth;
		return this;
	}

	@Override
	public String getValue() {
		return JsonHelper.toJsonString(this);
	}

}
