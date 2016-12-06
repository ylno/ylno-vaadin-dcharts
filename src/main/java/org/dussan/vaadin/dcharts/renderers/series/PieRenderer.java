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
package org.dussan.vaadin.dcharts.renderers.series;

import org.dussan.vaadin.dcharts.base.renderers.SeriesRenderer;
import org.dussan.vaadin.dcharts.defaults.renderers.series.DefaultPieRenderer;
import org.dussan.vaadin.dcharts.metadata.DataLabels;

public class PieRenderer extends SeriesRenderer<PieRenderer> {

	private static final long serialVersionUID = 4740029827920236226L;
	private Integer diameter = null;
	private Integer padding = null;
	private Integer sliceMargin = null;
	private Boolean fill = null;
	private Integer shadowOffset = null;
	private Float shadowAlpha = null;
	private Integer shadowDepth = null;
	private Boolean highlightMouseOver = null;
	private Boolean highlightMouseDown = null;
	private String[] highlightColors = null;
	private Object dataLabels = null;
	private Boolean showDataLabels = null;
	private String dataLabelFormatString = null;
	private Integer dataLabelThreshold = null;
	private Float dataLabelPositionFactor = null;
	private Integer dataLabelNudge = null;
	private Boolean dataLabelCenterOn = null;
	private Integer startAngle = null;
	private Integer lineWidth = null;

	public PieRenderer() {
		super(new DefaultPieRenderer());
	}

	public PieRenderer(int diameter, int padding, int sliceMargin,
			boolean fill, int shadowOffset, float shadowAlpha, int shadowDepth,
			boolean highlightMouseOver, boolean highlightMouseDown,
			String[] highlightColors, DataLabels dataLabels,
			boolean showDataLabels, String dataLabelFormatString,
			int dataLabelThreshold, float dataLabelPositionFactor,
			int dataLabelNudge, boolean dataLabelCenterOn, int startAngle,
			int lineWidth) {
		super(new DefaultPieRenderer());
		setDiameter(diameter);
		setPadding(padding);
		setSliceMargin(sliceMargin);
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
		setDataLabelCenterOn(dataLabelCenterOn);
		setStartAngle(startAngle);
		setLineWidth(lineWidth);
	}

	public PieRenderer(int diameter, int padding, int sliceMargin,
			boolean fill, int shadowOffset, float shadowAlpha, int shadowDepth,
			boolean highlightMouseOver, boolean highlightMouseDown,
			String[] highlightColors, String[] dataLabels,
			boolean showDataLabels, String dataLabelFormatString,
			int dataLabelThreshold, float dataLabelPositionFactor,
			int dataLabelNudge, boolean dataLabelCenterOn, int startAngle,
			int lineWidth) {
		super(new DefaultPieRenderer());
		setDiameter(diameter);
		setPadding(padding);
		setSliceMargin(sliceMargin);
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
		setDataLabelCenterOn(dataLabelCenterOn);
		setStartAngle(startAngle);
		setLineWidth(lineWidth);
	}

	public int getDiameter() {
		return diameter;
	}

	public PieRenderer setDiameter(int diameter) {
		this.diameter = diameter;
		return this;
	}

	public int getPadding() {
		return padding;
	}

	public PieRenderer setPadding(int padding) {
		this.padding = padding;
		return this;
	}

	public int getSliceMargin() {
		return sliceMargin;
	}

	public PieRenderer setSliceMargin(int sliceMargin) {
		this.sliceMargin = sliceMargin;
		return this;
	}

	public boolean getFill() {
		return fill;
	}

	public PieRenderer setFill(boolean fill) {
		this.fill = fill;
		return this;
	}

	public int getShadowOffset() {
		return shadowOffset;
	}

	public PieRenderer setShadowOffset(int shadowOffset) {
		this.shadowOffset = shadowOffset;
		return this;
	}

	public float getShadowAlpha() {
		return shadowAlpha;
	}

	public PieRenderer setShadowAlpha(float shadowAlpha) {
		this.shadowAlpha = shadowAlpha;
		return this;
	}

	public int getShadowDepth() {
		return shadowDepth;
	}

	public PieRenderer setShadowDepth(int shadowDepth) {
		this.shadowDepth = shadowDepth;
		return this;
	}

	public boolean getHighlightMouseOver() {
		return highlightMouseOver;
	}

	public PieRenderer setHighlightMouseOver(boolean highlightMouseOver) {
		this.highlightMouseOver = highlightMouseOver;
		return this;
	}

	public boolean getHighlightMouseDown() {
		return highlightMouseDown;
	}

	public PieRenderer setHighlightMouseDown(boolean highlightMouseDown) {
		this.highlightMouseDown = highlightMouseDown;
		return this;
	}

	public String[] getHighlightColors() {
		return highlightColors;
	}

	public PieRenderer setHighlightColors(String... highlightColors) {
		this.highlightColors = highlightColors;
		return this;
	}

	public Object getDataLabels() {
		return dataLabels;
	}

	public PieRenderer setDataLabels(DataLabels dataLabels) {
		this.dataLabels = dataLabels;
		return this;
	}

	public PieRenderer setDataLabels(String... dataLabels) {
		this.dataLabels = dataLabels;
		return this;
	}

	public boolean getShowDataLabels() {
		return showDataLabels;
	}

	public PieRenderer setShowDataLabels(boolean showDataLabels) {
		this.showDataLabels = showDataLabels;
		return this;
	}

	public String getDataLabelFormatString() {
		return dataLabelFormatString;
	}

	public PieRenderer setDataLabelFormatString(String dataLabelFormatString) {
		this.dataLabelFormatString = dataLabelFormatString;
		return this;
	}

	public int getDataLabelThreshold() {
		return dataLabelThreshold;
	}

	public PieRenderer setDataLabelThreshold(int dataLabelThreshold) {
		this.dataLabelThreshold = dataLabelThreshold;
		return this;
	}

	public float getDataLabelPositionFactor() {
		return dataLabelPositionFactor;
	}

	public PieRenderer setDataLabelPositionFactor(float dataLabelPositionFactor) {
		this.dataLabelPositionFactor = dataLabelPositionFactor;
		return this;
	}

	public int getDataLabelNudge() {
		return dataLabelNudge;
	}

	public PieRenderer setDataLabelNudge(int dataLabelNudge) {
		this.dataLabelNudge = dataLabelNudge;
		return this;
	}

	public boolean getDataLabelCenterOn() {
		return dataLabelCenterOn;
	}

	public PieRenderer setDataLabelCenterOn(boolean dataLabelCenterOn) {
		this.dataLabelCenterOn = dataLabelCenterOn;
		return this;
	}

	public int getStartAngle() {
		return startAngle;
	}

	public PieRenderer setStartAngle(int startAngle) {
		this.startAngle = startAngle;
		return this;
	}

	public Integer getLineWidth() {
		return lineWidth;
	}

	public PieRenderer setLineWidth(Integer lineWidth) {
		this.lineWidth = lineWidth;
		return this;
	}

}
