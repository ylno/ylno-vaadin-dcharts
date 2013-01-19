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
package org.dussan.vaadin.dcharts.base.renderers;

import org.dussan.vaadin.dcharts.base.BaseElement;
import org.dussan.vaadin.dcharts.defaults.renderers.DefaultShadowRenderer;
import org.dussan.vaadin.dcharts.helpers.JsonHelper;
import org.dussan.vaadin.dcharts.metadata.lines.LineCaps;
import org.dussan.vaadin.dcharts.metadata.lines.LineJoins;

public class ShadowRenderer extends BaseElement<ShadowRenderer> {

	private static final long serialVersionUID = 5539486637181974635L;
	private Integer angle = null;
	private Integer offset = null;
	private Float alpha = null;
	private Float lineWidth = null;
	private String lineJoin = null;
	private String lineCap = null;
	private Boolean closePath = null;
	private Boolean fill = null;
	private Integer depth = null;
	private String strokeStyle = null;
	private Boolean isarc = null;

	public ShadowRenderer() {
		super(new DefaultShadowRenderer());
	}

	public ShadowRenderer(int angle, int offset, float alpha, float lineWidth,
			LineJoins lineJoin, LineCaps lineCap, boolean closePath,
			boolean fill, int depth, String strokeStyle, boolean isarc) {
		super(new DefaultShadowRenderer());
		setAngle(angle);
		setOffset(offset);
		setAlpha(alpha);
		setLineWidth(lineWidth);
		setLineJoin(lineJoin);
		setLineCap(lineCap);
		setClosePath(closePath);
		setFill(fill);
		setDepth(depth);
		setStrokeStyle(strokeStyle);
		setIsarc(isarc);
	}

	public int getAngle() {
		return angle;
	}

	public ShadowRenderer setAngle(int angle) {
		this.angle = angle;
		return this;
	}

	public int getOffset() {
		return offset;
	}

	public ShadowRenderer setOffset(int offset) {
		this.offset = offset;
		return this;
	}

	public float getAlpha() {
		return alpha;
	}

	public ShadowRenderer setAlpha(float alpha) {
		this.alpha = alpha;
		return this;
	}

	public float getLineWidth() {
		return lineWidth;
	}

	public ShadowRenderer setLineWidth(float lineWidth) {
		this.lineWidth = lineWidth;
		return this;
	}

	public String getLineJoin() {
		return lineJoin;
	}

	public ShadowRenderer setLineJoin(LineJoins lineJoin) {
		this.lineJoin = lineJoin.getJoin();
		return this;
	}

	public String getLineCap() {
		return lineCap;
	}

	public ShadowRenderer setLineCap(LineCaps lineCap) {
		this.lineCap = lineCap.getCap();
		return this;
	}

	public boolean getClosePath() {
		return closePath;
	}

	public ShadowRenderer setClosePath(boolean closePath) {
		this.closePath = closePath;
		return this;
	}

	public boolean getFill() {
		return fill;
	}

	public ShadowRenderer setFill(boolean fill) {
		this.fill = fill;
		return this;
	}

	public int getDepth() {
		return depth;
	}

	public ShadowRenderer setDepth(int depth) {
		this.depth = depth;
		return this;
	}

	public String getStrokeStyle() {
		return strokeStyle;
	}

	public ShadowRenderer setStrokeStyle(String strokeStyle) {
		this.strokeStyle = strokeStyle;
		return this;
	}

	public boolean getIsarc() {
		return isarc;
	}

	public ShadowRenderer setIsarc(boolean isarc) {
		this.isarc = isarc;
		return this;
	}

	@Override
	public String getValue() {
		return JsonHelper.toJsonString(this);
	}

}
