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
package org.dussan.vaadin.dcharts.renderers.series;

import org.dussan.vaadin.dcharts.base.elements.Bands;
import org.dussan.vaadin.dcharts.base.renderers.SeriesRenderer;
import org.dussan.vaadin.dcharts.base.renderers.ShadowRenderer;
import org.dussan.vaadin.dcharts.base.renderers.ShapeRenderer;
import org.dussan.vaadin.dcharts.data.BandData;
import org.dussan.vaadin.dcharts.defaults.renderers.series.DefaultLineRenderer;
import org.dussan.vaadin.dcharts.renderers.series.animations.LineAnimation;

public class LineRenderer extends SeriesRenderer<LineRenderer> {

	private static final long serialVersionUID = -7770190199911764702L;
	private LineAnimation animation = null;
	private Object smooth = null;
	private Integer tension = null;
	private Boolean constrainSmoothing = null;
	private BandData bandData = null;
	private Bands bands = null;
	private Boolean highlightMouseOver = null;
	private Boolean highlightMouseDown = null;
	private String[] highlightColors = null;
	private String shapeRenderer = null;
	private String shadowRenderer = null;

	public LineRenderer() {
		super(new DefaultLineRenderer());
	}

	public LineRenderer(LineAnimation animation, boolean smooth, int tension,
			boolean constrainSmoothing, BandData bandData, Bands bands,
			boolean highlightMouseOver, boolean highlightMouseDown,
			String[] highlightColors, ShapeRenderer shapeRenderer,
			ShadowRenderer shadowRenderer) {
		super(new DefaultLineRenderer());
		setAnimation(animation);
		setSmooth(smooth);
		setTension(tension);
		setConstrainSmoothing(constrainSmoothing);
		setBandData(bandData);
		setBands(bands);
		setShapeRenderer(shapeRenderer);
		setShadowRenderer(shadowRenderer);
	}

	public LineRenderer(LineAnimation animation, int smooth, int tension,
			boolean constrainSmoothing, BandData bandData, Bands bands,
			boolean highlightMouseOver, boolean highlightMouseDown,
			String[] highlightColors, ShapeRenderer shapeRenderer,
			ShadowRenderer shadowRenderer) {
		super(new DefaultLineRenderer());
		setAnimation(animation);
		setSmooth(smooth);
		setTension(tension);
		setConstrainSmoothing(constrainSmoothing);
		setBandData(bandData);
		setBands(bands);
		setShapeRenderer(shapeRenderer);
		setShadowRenderer(shadowRenderer);
	}

	public LineAnimation getAnimation() {
		return animation;
	}

	public LineRenderer setAnimation(LineAnimation animation) {
		this.animation = animation;
		return this;
	}

	public Object getSmooth() {
		return smooth;
	}

	public LineRenderer setSmooth(boolean smooth) {
		this.smooth = Boolean.valueOf(smooth);
		return this;
	}

	public LineRenderer setSmooth(int smooth) {
		this.smooth = Integer.valueOf(smooth > 2 ? smooth : 3);
		return this;
	}

	public int getTension() {
		return tension;
	}

	public LineRenderer setTension(int tension) {
		this.tension = tension > 6 ? tension : 7;
		return this;
	}

	public boolean getConstrainSmoothing() {
		return constrainSmoothing;
	}

	public LineRenderer setConstrainSmoothing(boolean constrainSmoothing) {
		this.constrainSmoothing = constrainSmoothing;
		return this;
	}

	public BandData getBandData() {
		return bandData;
	}

	public LineRenderer setBandData(BandData bandData) {
		this.bandData = bandData;
		return this;
	}

	public Bands getBands() {
		return bands;
	}

	public LineRenderer setBands(Bands bands) {
		this.bands = bands;
		return this;
	}

	public boolean getHighlightMouseOver() {
		return highlightMouseOver;
	}

	public LineRenderer setHighlightMouseOver(boolean highlightMouseOver) {
		this.highlightMouseOver = highlightMouseOver;
		return this;
	}

	public boolean getHighlightMouseDown() {
		return highlightMouseDown;
	}

	public LineRenderer setHighlightMouseDown(boolean highlightMouseDown) {
		this.highlightMouseDown = highlightMouseDown;
		return this;
	}

	public String[] getHighlightColors() {
		return highlightColors;
	}

	public LineRenderer setHighlightColors(String[] highlightColors) {
		this.highlightColors = highlightColors;
		return this;
	}

	public String getShapeRenderer() {
		return shapeRenderer;
	}

	public LineRenderer setShapeRenderer(ShapeRenderer shapeRenderer) {
		this.shapeRenderer = shapeRenderer.getValue();
		return this;
	}

	public String getShadowRenderer() {
		return shadowRenderer;
	}

	public LineRenderer setShadowRenderer(ShadowRenderer shadowRenderer) {
		this.shadowRenderer = shadowRenderer.getValue();
		return this;
	}

}
