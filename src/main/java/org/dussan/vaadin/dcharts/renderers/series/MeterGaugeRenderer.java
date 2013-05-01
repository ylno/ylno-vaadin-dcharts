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

import org.apache.commons.lang3.ArrayUtils;
import org.dussan.vaadin.dcharts.base.renderers.SeriesRenderer;
import org.dussan.vaadin.dcharts.defaults.renderers.series.DefaultMeterGaugeRenderer;
import org.dussan.vaadin.dcharts.metadata.LabelPositions;
import org.dussan.vaadin.dcharts.metadata.renderers.TickRenderers;

public class MeterGaugeRenderer extends SeriesRenderer<MeterGaugeRenderer> {

	private static final long serialVersionUID = -7448206683514604156L;
	private Float diameter = null;
	private Integer padding = null;
	private Float shadowOffset = null;
	private Float shadowAlpha = null;
	private Integer shadowDepth = 4;
	private String background = "#efefef";
	private String ringColor = "#BBC6D0";
	private String needleColor = "#C3D3E5";
	private String tickColor = "989898";
	private Float ringWidth = null;
	private Float min = null;
	private Float max = null;
	private Float[] ticks = null;
	private Boolean showTicks = true;
	private Boolean showTickLabels = true;
	private String label = null;
	private Integer labelHeightAdjust = null;
	private LabelPositions labelPosition = null;
	private Float[] intervals = null;
	private String[] intervalColors = null;
	private Float intervalInnerRadius = null;
	private Float intervalOuterRadius = null;
	private TickRenderers tickRenderer = null;
	private Float[] tickPositions = null;
	private Integer tickSpacing = null;
	private Integer numberMinorTicks = null;
	private Float hubRadius = null;
	private Float tickPadding = null;
	private Float needleThickness = null;
	private Integer needlePad = null;
	private Boolean pegNeedle = null;

	public MeterGaugeRenderer() {
		super(new DefaultMeterGaugeRenderer());
	}

	public MeterGaugeRenderer(float diameter, int padding, float shadowOffset,
			float shadowAlpha, int shadowDepth, String background,
			String ringColor, String needleColor, String tickColor,
			float ringWidth, float min, float max, float[] ticks,
			boolean showTicks, boolean showTickLabels, String label,
			int labelHeightAdjust, LabelPositions labelPosition,
			float[] intervals, String[] intervalColors,
			float intervalInnerRadius, float intervalOuterRadius,
			TickRenderers tickRenderer, float[] tickPositions, int tickSpacing,
			int numberMinorTicks, float hubRadius, float tickPadding,
			float needleThickness, int needlePad, boolean pegNeedle) {
		super(new DefaultMeterGaugeRenderer());
		setDiameter(diameter);
		setPadding(padding);
		setShadowOffset(shadowOffset);
		setShadowAlpha(shadowAlpha);
		setShadowDepth(shadowDepth);
		setBackground(background);
		setRingColor(ringColor);
		setNeedleColor(needleColor);
		setTickColor(tickColor);
		setRingWidth(ringWidth);
		setMin(min);
		setMax(max);
		setTicks(ticks);
		setShowTicks(showTicks);
		setShowTickLabels(showTickLabels);
		setLabel(label);
		setLabelHeightAdjust(labelHeightAdjust);
		setLabelPosition(labelPosition);
		setIntervals(intervals);
		setIntervalColors(intervalColors);
		setIntervalInnerRadius(intervalInnerRadius);
		setIntervalOuterRadius(intervalOuterRadius);
		setTickRenderer(tickRenderer);
		setTickPositions(tickPositions);
		setTickSpacing(tickSpacing);
		setNumberMinorTicks(numberMinorTicks);
		setHubRadius(hubRadius);
		setTickPadding(tickPadding);
		setNeedleThickness(needleThickness);
		setNeedlePad(needlePad);
		setPegNeedle(pegNeedle);
	}

	public float getDiameter() {
		return diameter;
	}

	public MeterGaugeRenderer setDiameter(float diameter) {
		this.diameter = diameter;
		return this;
	}

	public int getPadding() {
		return padding;
	}

	public MeterGaugeRenderer setPadding(int padding) {
		this.padding = padding;
		return this;
	}

	public float getShadowOffset() {
		return shadowOffset;
	}

	public MeterGaugeRenderer setShadowOffset(float shadowOffset) {
		this.shadowOffset = shadowOffset;
		return this;
	}

	public float getShadowAlpha() {
		return shadowAlpha;
	}

	public MeterGaugeRenderer setShadowAlpha(float shadowAlpha) {
		this.shadowAlpha = shadowAlpha;
		return this;
	}

	public int getShadowDepth() {
		return shadowDepth;
	}

	public MeterGaugeRenderer setShadowDepth(int shadowDepth) {
		this.shadowDepth = shadowDepth;
		return this;
	}

	public String getBackground() {
		return background;
	}

	public MeterGaugeRenderer setBackground(String background) {
		this.background = background;
		return this;
	}

	public String getRingColor() {
		return ringColor;
	}

	public MeterGaugeRenderer setRingColor(String ringColor) {
		this.ringColor = ringColor;
		return this;
	}

	public String getNeedleColor() {
		return needleColor;
	}

	public MeterGaugeRenderer setNeedleColor(String needleColor) {
		this.needleColor = needleColor;
		return this;
	}

	public String getTickColor() {
		return tickColor;
	}

	public MeterGaugeRenderer setTickColor(String tickColor) {
		this.tickColor = tickColor;
		return this;
	}

	public float getRingWidth() {
		return ringWidth;
	}

	public MeterGaugeRenderer setRingWidth(float ringWidth) {
		this.ringWidth = ringWidth;
		return this;
	}

	public float getMin() {
		return min;
	}

	public MeterGaugeRenderer setMin(float min) {
		this.min = min;
		return this;
	}

	public float getMax() {
		return max;
	}

	public MeterGaugeRenderer setMax(float max) {
		this.max = max;
		return this;
	}

	public float[] getTicks() {
		return ArrayUtils.toPrimitive(ticks);
	}

	public MeterGaugeRenderer setTicks(float... ticks) {
		this.ticks = ArrayUtils.toObject(ticks);
		return this;
	}

	public boolean getShowTicks() {
		return showTicks;
	}

	public MeterGaugeRenderer setShowTicks(boolean showTicks) {
		this.showTicks = showTicks;
		return this;
	}

	public boolean getShowTickLabels() {
		return showTickLabels;
	}

	public MeterGaugeRenderer setShowTickLabels(boolean showTickLabels) {
		this.showTickLabels = showTickLabels;
		return this;
	}

	public String getLabel() {
		return label;
	}

	public MeterGaugeRenderer setLabel(String label) {
		this.label = label;
		return this;
	}

	public int getLabelHeightAdjust() {
		return labelHeightAdjust;
	}

	public MeterGaugeRenderer setLabelHeightAdjust(int labelHeightAdjust) {
		this.labelHeightAdjust = labelHeightAdjust;
		return this;
	}

	public LabelPositions getLabelPosition() {
		return labelPosition;
	}

	public MeterGaugeRenderer setLabelPosition(LabelPositions labelPosition) {
		this.labelPosition = labelPosition;
		return this;
	}

	public float[] getIntervals() {
		return ArrayUtils.toPrimitive(intervals);
	}

	public MeterGaugeRenderer setIntervals(float... intervals) {
		this.intervals = ArrayUtils.toObject(intervals);
		return this;
	}

	public String[] getIntervalColors() {
		return intervalColors;
	}

	public MeterGaugeRenderer setIntervalColors(String... intervalColors) {
		this.intervalColors = intervalColors;
		return this;
	}

	public float getIntervalInnerRadius() {
		return intervalInnerRadius;
	}

	public MeterGaugeRenderer setIntervalInnerRadius(float intervalInnerRadius) {
		this.intervalInnerRadius = intervalInnerRadius;
		return this;
	}

	public float getIntervalOuterRadius() {
		return intervalOuterRadius;
	}

	public MeterGaugeRenderer setIntervalOuterRadius(float intervalOuterRadius) {
		this.intervalOuterRadius = intervalOuterRadius;
		return this;
	}

	public TickRenderers getTickRenderer() {
		return tickRenderer;
	}

	public MeterGaugeRenderer setTickRenderer(TickRenderers tickRenderer) {
		this.tickRenderer = tickRenderer;
		return this;
	}

	public float[] getTickPositions() {
		return ArrayUtils.toPrimitive(tickPositions);
	}

	public MeterGaugeRenderer setTickPositions(float... tickPositions) {
		this.tickPositions = ArrayUtils.toObject(tickPositions);
		return this;
	}

	public int getTickSpacing() {
		return tickSpacing;
	}

	public MeterGaugeRenderer setTickSpacing(int tickSpacing) {
		this.tickSpacing = tickSpacing;
		return this;
	}

	public int getNumberMinorTicks() {
		return numberMinorTicks;
	}

	public MeterGaugeRenderer setNumberMinorTicks(int numberMinorTicks) {
		this.numberMinorTicks = numberMinorTicks;
		return this;
	}

	public float getHubRadius() {
		return hubRadius;
	}

	public MeterGaugeRenderer setHubRadius(float hubRadius) {
		this.hubRadius = hubRadius;
		return this;
	}

	public float getTickPadding() {
		return tickPadding;
	}

	public MeterGaugeRenderer setTickPadding(float tickPadding) {
		this.tickPadding = tickPadding;
		return this;
	}

	public float getNeedleThickness() {
		return needleThickness;
	}

	public MeterGaugeRenderer setNeedleThickness(float needleThickness) {
		this.needleThickness = needleThickness;
		return this;
	}

	public int getNeedlePad() {
		return needlePad;
	}

	public MeterGaugeRenderer setNeedlePad(int needlePad) {
		this.needlePad = needlePad;
		return this;
	}

	public boolean getPegNeedle() {
		return pegNeedle;
	}

	public MeterGaugeRenderer setPegNeedle(boolean pegNeedle) {
		this.pegNeedle = pegNeedle;
		return this;
	}

}