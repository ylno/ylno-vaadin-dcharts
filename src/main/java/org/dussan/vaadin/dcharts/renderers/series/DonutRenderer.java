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

import org.dussan.vaadin.dcharts.base.renderers.SeriesRenderer;
import org.dussan.vaadin.dcharts.defaults.renderers.series.DefaultDonutRenderer;
import org.dussan.vaadin.dcharts.metadata.DataLabels;

public class DonutRenderer extends SeriesRenderer<DonutRenderer> {

	private static final long serialVersionUID = 2315572308433350776L;
	private Integer diameter = null;
	private Integer innerDiameter = null;
	private Integer thickness = null;
	private Integer padding = null;
	private Integer sliceMargin = null;
	private Integer ringMargin = null;
	private Boolean fill = null;
	private Integer shadowOffset = null;
	private Float shadowAlpha = null;
	private Integer shadowDepth = null;
	private Boolean highlightMouseOver = null;
	private Boolean highlightMouseDown = null;
	private String[] highlightColors = null;
	private DataLabels dataLabels = null;
	private Boolean showDataLabels = null;
	private String dataLabelFormatString = null;
	private Integer dataLabelThreshold = null;
	private Float dataLabelPositionFactor = null;
	private Integer dataLabelNudge = null;
	private Integer startAngle = null;

	public DonutRenderer() {
		super(new DefaultDonutRenderer());
	}

	public DonutRenderer(int diameter, int innerDiameter, int thickness,
			int padding, int sliceMargin, int ringMargin, boolean fill,
			int shadowOffset, float shadowAlpha, int shadowDepth,
			boolean highlightMouseOver, boolean highlightMouseDown,
			String[] highlightColors, DataLabels dataLabels,
			boolean showDataLabels, String dataLabelFormatString,
			int dataLabelThreshold, float dataLabelPositionFactor,
			int dataLabelNudge, int startAngle) {
		super(new DefaultDonutRenderer());
		setDiameter(diameter);
		setInnerDiameter(innerDiameter);
		setThickness(thickness);
		setPadding(padding);
		setSliceMargin(sliceMargin);
		setRingMargin(ringMargin);
		setFill(fill);
		setShadowOffset(shadowOffset);
		setShadowAlpha(shadowAlpha);
		setShadowDepth(shadowDepth);
		setHighlightMouseOver(highlightMouseOver);
		setHighlightMouseDown(highlightMouseDown);
		setHighlightColors(highlightColors);
		setDataLabels(dataLabels);
		setShowDataLabels(showDataLabels);
		setDataLabelFormatString(dataLabelFormatString);
		setDataLabelThreshold(dataLabelThreshold);
		setDataLabelPositionFactor(dataLabelPositionFactor);
		setDataLabelNudge(dataLabelNudge);
		setStartAngle(startAngle);
	}

	public int getDiameter() {
		return diameter;
	}

	public DonutRenderer setDiameter(int diameter) {
		this.diameter = diameter;
		return this;
	}

	public int getInnerDiameter() {
		return innerDiameter;
	}

	public DonutRenderer setInnerDiameter(int innerDiameter) {
		this.innerDiameter = innerDiameter;
		return this;
	}

	public int getThickness() {
		return thickness;
	}

	public DonutRenderer setThickness(int thickness) {
		this.thickness = thickness;
		return this;
	}

	public int getPadding() {
		return padding;
	}

	public DonutRenderer setPadding(int padding) {
		this.padding = padding;
		return this;
	}

	public int getSliceMargin() {
		return sliceMargin;
	}

	public DonutRenderer setSliceMargin(int sliceMargin) {
		this.sliceMargin = sliceMargin;
		return this;
	}

	public int getRingMargin() {
		return ringMargin;
	}

	public DonutRenderer setRingMargin(int ringMargin) {
		this.ringMargin = ringMargin;
		return this;
	}

	public boolean getFill() {
		return fill;
	}

	public DonutRenderer setFill(boolean fill) {
		this.fill = fill;
		return this;
	}

	public int getShadowOffset() {
		return shadowOffset;
	}

	public DonutRenderer setShadowOffset(int shadowOffset) {
		this.shadowOffset = shadowOffset;
		return this;
	}

	public float getShadowAlpha() {
		return shadowAlpha;
	}

	public DonutRenderer setShadowAlpha(float shadowAlpha) {
		this.shadowAlpha = shadowAlpha;
		return this;
	}

	public int getShadowDepth() {
		return shadowDepth;
	}

	public DonutRenderer setShadowDepth(int shadowDepth) {
		this.shadowDepth = shadowDepth;
		return this;
	}

	public boolean getHighlightMouseOver() {
		return highlightMouseOver;
	}

	public DonutRenderer setHighlightMouseOver(boolean highlightMouseOver) {
		this.highlightMouseOver = highlightMouseOver;
		return this;
	}

	public boolean getHighlightMouseDown() {
		return highlightMouseDown;
	}

	public DonutRenderer setHighlightMouseDown(boolean highlightMouseDown) {
		this.highlightMouseDown = highlightMouseDown;
		return this;
	}

	public String[] getHighlightColors() {
		return highlightColors;
	}

	public DonutRenderer setHighlightColors(String... highlightColors) {
		this.highlightColors = highlightColors;
		return this;
	}

	public DataLabels getDataLabels() {
		return dataLabels;
	}

	public DonutRenderer setDataLabels(DataLabels dataLabels) {
		this.dataLabels = dataLabels;
		return this;
	}

	public boolean getShowDataLabels() {
		return showDataLabels;
	}

	public DonutRenderer setShowDataLabels(boolean showDataLabels) {
		this.showDataLabels = showDataLabels;
		return this;
	}

	public String getDataLabelFormatString() {
		return dataLabelFormatString;
	}

	public DonutRenderer setDataLabelFormatString(String dataLabelFormatString) {
		this.dataLabelFormatString = dataLabelFormatString;
		return this;
	}

	public int getDataLabelThreshold() {
		return dataLabelThreshold;
	}

	public DonutRenderer setDataLabelThreshold(int dataLabelThreshold) {
		this.dataLabelThreshold = dataLabelThreshold;
		return this;
	}

	public float getDataLabelPositionFactor() {
		return dataLabelPositionFactor;
	}

	public DonutRenderer setDataLabelPositionFactor(
			float dataLabelPositionFactor) {
		this.dataLabelPositionFactor = dataLabelPositionFactor;
		return this;
	}

	public int getDataLabelNudge() {
		return dataLabelNudge;
	}

	public DonutRenderer setDataLabelNudge(int dataLabelNudge) {
		this.dataLabelNudge = dataLabelNudge;
		return this;
	}

	public int getStartAngle() {
		return startAngle;
	}

	public DonutRenderer setStartAngle(int startAngle) {
		this.startAngle = startAngle;
		return this;
	}

}
