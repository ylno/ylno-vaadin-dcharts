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

	public MeterGaugeRenderer(Float diameter, Integer padding,
			Float shadowOffset, Float shadowAlpha, Integer shadowDepth,
			String background, String ringColor, String needleColor,
			String tickColor, Float ringWidth, Float min, Float max,
			Float[] ticks, Boolean showTicks, Boolean showTickLabels,
			String label, Integer labelHeightAdjust,
			LabelPositions labelPosition, Float[] intervals,
			String[] intervalColors, Float intervalInnerRadius,
			Float intervalOuterRadius, TickRenderers tickRenderer,
			Float[] tickPositions, Integer tickSpacing,
			Integer numberMinorTicks, Float hubRadius, Float tickPadding,
			Float needleThickness, Integer needlePad, Boolean pegNeedle) {
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

	public Float getDiameter() {
		return diameter;
	}

	public MeterGaugeRenderer setDiameter(Float diameter) {
		this.diameter = diameter;
		return this;
	}

	public Integer getPadding() {
		return padding;
	}

	public MeterGaugeRenderer setPadding(Integer padding) {
		this.padding = padding;
		return this;
	}

	public Float getShadowOffset() {
		return shadowOffset;
	}

	public MeterGaugeRenderer setShadowOffset(Float shadowOffset) {
		this.shadowOffset = shadowOffset;
		return this;
	}

	public Float getShadowAlpha() {
		return shadowAlpha;
	}

	public MeterGaugeRenderer setShadowAlpha(Float shadowAlpha) {
		this.shadowAlpha = shadowAlpha;
		return this;
	}

	public Integer getShadowDepth() {
		return shadowDepth;
	}

	public MeterGaugeRenderer setShadowDepth(Integer shadowDepth) {
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

	public Float getRingWidth() {
		return ringWidth;
	}

	public MeterGaugeRenderer setRingWidth(Float ringWidth) {
		this.ringWidth = ringWidth;
		return this;
	}

	public Float getMin() {
		return min;
	}

	public MeterGaugeRenderer setMin(Float min) {
		this.min = min;
		return this;
	}

	public Float getMax() {
		return max;
	}

	public MeterGaugeRenderer setMax(Float max) {
		this.max = max;
		return this;
	}

	public Float[] getTicks() {
		return ticks;
	}

	public MeterGaugeRenderer setTicks(Float[] ticks) {
		this.ticks = ticks;
		return this;
	}

	public Boolean getShowTicks() {
		return showTicks;
	}

	public MeterGaugeRenderer setShowTicks(Boolean showTicks) {
		this.showTicks = showTicks;
		return this;
	}

	public Boolean getShowTickLabels() {
		return showTickLabels;
	}

	public MeterGaugeRenderer setShowTickLabels(Boolean showTickLabels) {
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

	public Integer getLabelHeightAdjust() {
		return labelHeightAdjust;
	}

	public MeterGaugeRenderer setLabelHeightAdjust(Integer labelHeightAdjust) {
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

	public Float[] getIntervals() {
		return intervals;
	}

	public MeterGaugeRenderer setIntervals(Float[] intervals) {
		this.intervals = intervals;
		return this;
	}

	public String[] getIntervalColors() {
		return intervalColors;
	}

	public MeterGaugeRenderer setIntervalColors(String[] intervalColors) {
		this.intervalColors = intervalColors;
		return this;
	}

	public Float getIntervalInnerRadius() {
		return intervalInnerRadius;
	}

	public MeterGaugeRenderer setIntervalInnerRadius(Float intervalInnerRadius) {
		this.intervalInnerRadius = intervalInnerRadius;
		return this;
	}

	public Float getIntervalOuterRadius() {
		return intervalOuterRadius;
	}

	public MeterGaugeRenderer setIntervalOuterRadius(Float intervalOuterRadius) {
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

	public Float[] getTickPositions() {
		return tickPositions;
	}

	public MeterGaugeRenderer setTickPositions(Float[] tickPositions) {
		this.tickPositions = tickPositions;
		return this;
	}

	public Integer getTickSpacing() {
		return tickSpacing;
	}

	public MeterGaugeRenderer setTickSpacing(Integer tickSpacing) {
		this.tickSpacing = tickSpacing;
		return this;
	}

	public Integer getNumberMinorTicks() {
		return numberMinorTicks;
	}

	public MeterGaugeRenderer setNumberMinorTicks(Integer numberMinorTicks) {
		this.numberMinorTicks = numberMinorTicks;
		return this;
	}

	public Float getHubRadius() {
		return hubRadius;
	}

	public MeterGaugeRenderer setHubRadius(Float hubRadius) {
		this.hubRadius = hubRadius;
		return this;
	}

	public Float getTickPadding() {
		return tickPadding;
	}

	public MeterGaugeRenderer setTickPadding(Float tickPadding) {
		this.tickPadding = tickPadding;
		return this;
	}

	public Float getNeedleThickness() {
		return needleThickness;
	}

	public MeterGaugeRenderer setNeedleThickness(Float needleThickness) {
		this.needleThickness = needleThickness;
		return this;
	}

	public Integer getNeedlePad() {
		return needlePad;
	}

	public MeterGaugeRenderer setNeedlePad(Integer needlePad) {
		this.needlePad = needlePad;
		return this;
	}

	public Boolean getPegNeedle() {
		return pegNeedle;
	}

	public MeterGaugeRenderer setPegNeedle(Boolean pegNeedle) {
		this.pegNeedle = pegNeedle;
		return this;
	}

}