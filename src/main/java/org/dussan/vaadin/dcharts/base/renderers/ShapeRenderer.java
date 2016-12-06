/**
 * Copyright (C) 2012-2016  Dušan Vejnovič  <vaadin@dussan.org>
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
import org.dussan.vaadin.dcharts.defaults.renderers.DefaultShapeRenderer;
import org.dussan.vaadin.dcharts.helpers.JsonHelper;
import org.dussan.vaadin.dcharts.metadata.lines.LineCaps;
import org.dussan.vaadin.dcharts.metadata.lines.LineJoins;
import org.dussan.vaadin.dcharts.metadata.lines.LinePatterns;

public class ShapeRenderer extends BaseElement<ShapeRenderer> {

	private static final long serialVersionUID = -5780499830438418058L;
	private Float lineWidth = null;
	private String linePattern = null;
	private String lineJoin = null;
	private String lineCap = null;
	private Boolean closePath = null;
	private Boolean fill = null;
	private Boolean isarc = null;
	private Boolean fillRect = null;
	private Boolean strokeRect = null;
	private Boolean clearRect = null;
	private String strokeStyle = null;
	private String fillStyle = null;

	public ShapeRenderer() {
		super(new DefaultShapeRenderer());
	}

	public ShapeRenderer(float lineWidth, LinePatterns linePattern,
			LineJoins lineJoin, LineCaps lineCap, boolean closePath,
			boolean fill, boolean isarc, boolean fillRect, boolean strokeRect,
			boolean clearRect, String strokeStyle, String fillStyle) {
		super(new DefaultShapeRenderer());
		setLineWidth(lineWidth);
		setLinePattern(linePattern);
		setLineJoin(lineJoin);
		setLineCap(lineCap);
		setClosePath(closePath);
		setFill(fill);
		setIsarc(isarc);
		setFillRect(fillRect);
		setStrokeRect(strokeRect);
		setClearRect(clearRect);
		setStrokeStyle(strokeStyle);
		setFillStyle(fillStyle);
	}

	public float getLineWidth() {
		return lineWidth;
	}

	public ShapeRenderer setLineWidth(float lineWidth) {
		this.lineWidth = lineWidth;
		return this;
	}

	public String getLinePattern() {
		return linePattern;
	}

	public ShapeRenderer setLinePattern(LinePatterns linePattern) {
		this.linePattern = linePattern.getPattern();
		return this;
	}

	public String getLineJoin() {
		return lineJoin;
	}

	public ShapeRenderer setLineJoin(LineJoins lineJoin) {
		this.lineJoin = lineJoin.getJoin();
		return this;
	}

	public String getLineCap() {
		return lineCap;
	}

	public ShapeRenderer setLineCap(LineCaps lineCap) {
		this.lineCap = lineCap.getCap();
		return this;
	}

	public boolean getClosePath() {
		return closePath;
	}

	public ShapeRenderer setClosePath(boolean closePath) {
		this.closePath = closePath;
		return this;
	}

	public boolean getFill() {
		return fill;
	}

	public ShapeRenderer setFill(boolean fill) {
		this.fill = fill;
		return this;
	}

	public boolean getIsarc() {
		return isarc;
	}

	public ShapeRenderer setIsarc(boolean isarc) {
		this.isarc = isarc;
		return this;
	}

	public boolean getFillRect() {
		return fillRect;
	}

	public ShapeRenderer setFillRect(boolean fillRect) {
		this.fillRect = fillRect;
		return this;
	}

	public boolean getStrokeRect() {
		return strokeRect;
	}

	public ShapeRenderer setStrokeRect(boolean strokeRect) {
		this.strokeRect = strokeRect;
		return this;
	}

	public boolean getClearRect() {
		return clearRect;
	}

	public ShapeRenderer setClearRect(boolean clearRect) {
		this.clearRect = clearRect;
		return this;
	}

	public String getStrokeStyle() {
		return strokeStyle;
	}

	public ShapeRenderer setStrokeStyle(String strokeStyle) {
		this.strokeStyle = strokeStyle;
		return this;
	}

	public String getFillStyle() {
		return fillStyle;
	}

	public ShapeRenderer setFillStyle(String fillStyle) {
		this.fillStyle = fillStyle;
		return this;
	}

	@Override
	public String getValue() {
		return JsonHelper.toJsonString(this);
	}

}
