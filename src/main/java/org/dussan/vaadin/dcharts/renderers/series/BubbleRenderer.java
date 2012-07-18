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
package org.dussan.vaadin.dcharts.renderers.series;

import org.apache.commons.lang3.ArrayUtils;
import org.dussan.vaadin.dcharts.base.renderers.SeriesRenderer;
import org.dussan.vaadin.dcharts.defaults.renderers.series.DefaultBubbleRenderer;

public class BubbleRenderer extends SeriesRenderer<BubbleRenderer> {

	private static final long serialVersionUID = -9032093693015798668L;
	private Boolean varyBubbleColors = null;
	private Boolean autoscaleBubbles = null;
	private Float autoscaleMultiplier = null;
	private Float autoscalePointsFactor = null;
	private Boolean escapeHtml = null;
	private Boolean highlightMouseOver = null;
	private Boolean highlightMouseDown = null;
	private String[] highlightColors = null;
	private Float bubbleAlpha = null;
	private Float highlightAlpha = null;
	private Boolean bubbleGradients = null;
	private Boolean showLabels = null;
	private Integer[] radii = null;
	private Integer maxRadius = null;
	private String[] labels = null;

	public BubbleRenderer() {
		super(new DefaultBubbleRenderer());
	}

	public BubbleRenderer(boolean varyBubbleColors, boolean autoscaleBubbles,
			float autoscaleMultiplier, float autoscalePointsFactor,
			boolean escapeHtml, boolean highlightMouseOver,
			boolean highlightMouseDown, String[] highlightColors,
			float bubbleAlpha, float highlightAlpha, boolean bubbleGradients,
			boolean showLabels, int[] radii, int maxRadius, String[] labels) {
		super(new DefaultBubbleRenderer());
		setVaryBubbleColors(varyBubbleColors);
		setAutoscaleBubbles(autoscaleBubbles);
		setAutoscaleMultiplier(autoscaleMultiplier);
		setAutoscalePointsFactor(autoscalePointsFactor);
		setEscapeHtml(escapeHtml);
		setHighlightMouseOver(highlightMouseOver);
		setHighlightMouseDown(highlightMouseDown);
		setHighlightColors(highlightColors);
		setBubbleAlpha(bubbleAlpha);
		setHighlightAlpha(highlightAlpha);
		setBubbleGradients(bubbleGradients);
		setShowLabels(showLabels);
		setRadii(radii);
		setMaxRadius(maxRadius);
		setLabels(labels);
	}

	public boolean getVaryBubbleColors() {
		return varyBubbleColors;
	}

	public BubbleRenderer setVaryBubbleColors(boolean varyBubbleColors) {
		this.varyBubbleColors = varyBubbleColors;
		return this;
	}

	public boolean getAutoscaleBubbles() {
		return autoscaleBubbles;
	}

	public BubbleRenderer setAutoscaleBubbles(boolean autoscaleBubbles) {
		this.autoscaleBubbles = autoscaleBubbles;
		return this;
	}

	public float getAutoscaleMultiplier() {
		return autoscaleMultiplier;
	}

	public BubbleRenderer setAutoscaleMultiplier(float autoscaleMultiplier) {
		this.autoscaleMultiplier = autoscaleMultiplier;
		return this;
	}

	public float getAutoscalePointsFactor() {
		return autoscalePointsFactor;
	}

	public BubbleRenderer setAutoscalePointsFactor(float autoscalePointsFactor) {
		this.autoscalePointsFactor = autoscalePointsFactor;
		return this;
	}

	public boolean getEscapeHtml() {
		return escapeHtml;
	}

	public BubbleRenderer setEscapeHtml(boolean escapeHtml) {
		this.escapeHtml = escapeHtml;
		return this;
	}

	public boolean getHighlightMouseOver() {
		return highlightMouseOver;
	}

	public BubbleRenderer setHighlightMouseOver(boolean highlightMouseOver) {
		this.highlightMouseOver = highlightMouseOver;
		return this;
	}

	public boolean getHighlightMouseDown() {
		return highlightMouseDown;
	}

	public BubbleRenderer setHighlightMouseDown(boolean highlightMouseDown) {
		this.highlightMouseDown = highlightMouseDown;
		return this;
	}

	public String[] getHighlightColors() {
		return highlightColors;
	}

	public BubbleRenderer setHighlightColors(String... highlightColors) {
		this.highlightColors = highlightColors;
		return this;
	}

	public float getBubbleAlpha() {
		return bubbleAlpha;
	}

	public BubbleRenderer setBubbleAlpha(float bubbleAlpha) {
		this.bubbleAlpha = bubbleAlpha;
		return this;
	}

	public float getHighlightAlpha() {
		return highlightAlpha;
	}

	public BubbleRenderer setHighlightAlpha(float highlightAlpha) {
		this.highlightAlpha = highlightAlpha;
		return this;
	}

	public boolean getBubbleGradients() {
		return bubbleGradients;
	}

	public BubbleRenderer setBubbleGradients(boolean bubbleGradients) {
		this.bubbleGradients = bubbleGradients;
		return this;
	}

	public boolean getShowLabels() {
		return showLabels;
	}

	public BubbleRenderer setShowLabels(boolean showLabels) {
		this.showLabels = showLabels;
		return this;
	}

	public int[] getRadii() {
		return ArrayUtils.toPrimitive(radii);
	}

	public BubbleRenderer setRadii(int... radii) {
		this.radii = ArrayUtils.toObject(radii);
		return this;
	}

	public int getMaxRadius() {
		return maxRadius;
	}

	public BubbleRenderer setMaxRadius(int maxRadius) {
		this.maxRadius = maxRadius;
		return this;
	}

	public String[] getLabels() {
		return labels;
	}

	public BubbleRenderer setLabels(String... labels) {
		this.labels = labels;
		return this;
	}

}
