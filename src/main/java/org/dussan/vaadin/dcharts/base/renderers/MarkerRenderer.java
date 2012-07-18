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
package org.dussan.vaadin.dcharts.base.renderers;

import org.dussan.vaadin.dcharts.base.BaseElement;
import org.dussan.vaadin.dcharts.defaults.renderers.DefaultMarkRenderer;
import org.dussan.vaadin.dcharts.helpers.JsonHelper;
import org.dussan.vaadin.dcharts.metadata.styles.MarkerStyles;

public class MarkerRenderer extends BaseElement<MarkerRenderer> {

	private static final long serialVersionUID = -4877366038538699897L;
	private Boolean show = null;
	private String style = null;
	private Integer lineWidth = null;
	private Float size = null;
	private String color = null;
	private Boolean shadow = null;
	private Integer shadowAngle = null;
	private Integer shadowOffset = null;
	private Integer shadowDepth = null;
	private String shadowAlpha = null;
	private ShadowRenderer shadowRenderer = null;
	private ShapeRenderer shapeRenderer = null;

	public MarkerRenderer() {
		super(new DefaultMarkRenderer());
		setShow(true);
	}

	public MarkerRenderer(boolean show, MarkerStyles style, int lineWidth,
			float size, String color, boolean shadow, int shadowAngle,
			int shadowOffset, int shadowDepth, String shadowAlpha,
			ShadowRenderer shadowRenderer, ShapeRenderer shapeRenderer) {
		super(new DefaultMarkRenderer());
		setShow(show);
		setStyle(style);
		setLineWidth(lineWidth);
		setSize(size);
		setColor(color);
		setShadow(shadow);
		setShadowAngle(shadowAngle);
		setShadowOffset(shadowOffset);
		setShadowDepth(shadowDepth);
		setShadowAlpha(shadowAlpha);
		setShadowRenderer(shadowRenderer);
		setShapeRenderer(shapeRenderer);
	}

	public boolean getShow() {
		return show;
	}

	public MarkerRenderer setShow(boolean show) {
		this.show = show;
		return this;
	}

	public String getStyle() {
		return style;
	}

	public MarkerRenderer setStyle(MarkerStyles style) {
		this.style = style.getStyle();
		return this;
	}

	public int getLineWidth() {
		return lineWidth;
	}

	public MarkerRenderer setLineWidth(int lineWidth) {
		this.lineWidth = lineWidth;
		return this;
	}

	public float getSize() {
		return size;
	}

	public MarkerRenderer setSize(float size) {
		this.size = size;
		return this;
	}

	public String getColor() {
		return color;
	}

	public MarkerRenderer setColor(String color) {
		this.color = color;
		return this;
	}

	public boolean getShadow() {
		return shadow;
	}

	public MarkerRenderer setShadow(boolean shadow) {
		this.shadow = shadow;
		return this;
	}

	public int getShadowAngle() {
		return shadowAngle;
	}

	public MarkerRenderer setShadowAngle(int shadowAngle) {
		this.shadowAngle = shadowAngle;
		return this;
	}

	public int getShadowOffset() {
		return shadowOffset;
	}

	public MarkerRenderer setShadowOffset(int shadowOffset) {
		this.shadowOffset = shadowOffset;
		return this;
	}

	public int getShadowDepth() {
		return shadowDepth;
	}

	public MarkerRenderer setShadowDepth(int shadowDepth) {
		this.shadowDepth = shadowDepth;
		return this;
	}

	public String getShadowAlpha() {
		return shadowAlpha;
	}

	public MarkerRenderer setShadowAlpha(String shadowAlpha) {
		this.shadowAlpha = shadowAlpha;
		return this;
	}

	public ShadowRenderer getShadowRenderer() {
		return shadowRenderer;
	}

	public MarkerRenderer setShadowRenderer(ShadowRenderer shadowRenderer) {
		this.shadowRenderer = shadowRenderer;
		return this;
	}

	public ShapeRenderer getShapeRenderer() {
		return shapeRenderer;
	}

	public MarkerRenderer setShapeRenderer(ShapeRenderer shapeRenderer) {
		this.shapeRenderer = shapeRenderer;
		return this;
	}

	@Override
	public String getValue() {
		return JsonHelper.toJsonString(this);
	}

}
