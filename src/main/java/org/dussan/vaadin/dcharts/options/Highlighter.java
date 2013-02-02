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
package org.dussan.vaadin.dcharts.options;

import org.dussan.vaadin.dcharts.base.elements.Option;
import org.dussan.vaadin.dcharts.base.renderers.MarkerRenderer;
import org.dussan.vaadin.dcharts.defaults.DefaultHighlighter;
import org.dussan.vaadin.dcharts.helpers.JsonHelper;
import org.dussan.vaadin.dcharts.metadata.TooltipAxes;
import org.dussan.vaadin.dcharts.metadata.TooltipFadeSpeeds;
import org.dussan.vaadin.dcharts.metadata.TooltipMoveSpeeds;
import org.dussan.vaadin.dcharts.metadata.locations.TooltipLocations;

public class Highlighter extends Option<Highlighter> {

	private static final long serialVersionUID = 8085712463377681548L;
	private Boolean show = null;
	private MarkerRenderer markerRenderer = null;
	private Boolean showMarker = null;
	private Float lineWidthAdjust = null;
	private Integer sizeAdjust = null;
	private Boolean showTooltip = null;
	private Boolean keepTooltipInsideChart = null;
	private Boolean tooltipAlwaysVisible = null;
	private Object tooltipMoveSpeed = null;
	private TooltipLocations tooltipLocation = null;
	private Boolean fadeTooltip = null;
	private Object tooltipFadeSpeed = null;
	private Integer tooltipOffset = null;
	private TooltipAxes tooltipAxes = null;
	private String tooltipSeparator = null;
	// TODO: to be done
	private String tooltipContentEditor = null;
	private Boolean useAxesFormatters = null;
	private String tooltipFormatString = null;
	private String formatString = null;
	private Integer yvalues = null;
	private Boolean bringSeriesToFront = null;

	public Highlighter() {
		super(new DefaultHighlighter());
	}

	public Highlighter(boolean show, MarkerRenderer markerRenderer,
			boolean showMarker, float lineWidthAdjust, int sizeAdjust,
			boolean showTooltip, boolean keepTooltipInsideChart,
			boolean tooltipAlwaysVisible, TooltipMoveSpeeds tooltipMoveSpeed,
			TooltipLocations tooltipLocation, boolean fadeTooltip,
			TooltipFadeSpeeds tooltipFadeSpeed, int tooltipOffset,
			TooltipAxes tooltipAxes, String tooltipSeparator,
			String tooltipContentEditor, boolean useAxesFormatters,
			String tooltipFormatString, String formatString, int yvalues,
			boolean bringSeriesToFront) {
		super(new DefaultHighlighter());
		setShow(show);
		setMarkerRenderer(markerRenderer);
		setShowMarker(showMarker);
		setLineWidthAdjust(lineWidthAdjust);
		setSizeAdjust(sizeAdjust);
		setShowTooltip(showTooltip);
		setKeepTooltipInsideChart(keepTooltipInsideChart);
		setTooltipAlwaysVisible(tooltipAlwaysVisible);
		setTooltipMoveSpeed(tooltipMoveSpeed);
		setTooltipLocation(tooltipLocation);
		setFadeTooltip(fadeTooltip);
		setTooltipFadeSpeed(tooltipFadeSpeed);
		setTooltipOffset(tooltipOffset);
		setTooltipAxes(tooltipAxes);
		setTooltipSeparator(tooltipSeparator);
		setTooltipContentEditor(tooltipContentEditor);
		setUseAxesFormatters(useAxesFormatters);
		setTooltipFormatString(tooltipFormatString);
		setFormatString(formatString);
		setYvalues(yvalues);
		setBringSeriesToFront(bringSeriesToFront);
	}

	public Highlighter(boolean show, MarkerRenderer markerRenderer,
			boolean showMarker, float lineWidthAdjust, int sizeAdjust,
			boolean showTooltip, boolean keepTooltipInsideChart,
			boolean tooltipAlwaysVisible, int tooltipMoveSpeed,
			TooltipLocations tooltipLocation, boolean fadeTooltip,
			TooltipFadeSpeeds tooltipFadeSpeed, int tooltipOffset,
			TooltipAxes tooltipAxes, String tooltipSeparator,
			String tooltipContentEditor, boolean useAxesFormatters,
			String tooltipFormatString, String formatString, int yvalues,
			boolean bringSeriesToFront) {
		super(new DefaultHighlighter());
		setShow(show);
		setMarkerRenderer(markerRenderer);
		setShowMarker(showMarker);
		setLineWidthAdjust(lineWidthAdjust);
		setSizeAdjust(sizeAdjust);
		setShowTooltip(showTooltip);
		setKeepTooltipInsideChart(keepTooltipInsideChart);
		setTooltipAlwaysVisible(tooltipAlwaysVisible);
		setTooltipMoveSpeed(tooltipMoveSpeed);
		setTooltipLocation(tooltipLocation);
		setFadeTooltip(fadeTooltip);
		setTooltipFadeSpeed(tooltipFadeSpeed);
		setTooltipOffset(tooltipOffset);
		setTooltipAxes(tooltipAxes);
		setTooltipSeparator(tooltipSeparator);
		setTooltipContentEditor(tooltipContentEditor);
		setUseAxesFormatters(useAxesFormatters);
		setTooltipFormatString(tooltipFormatString);
		setFormatString(formatString);
		setYvalues(yvalues);
		setBringSeriesToFront(bringSeriesToFront);
	}

	public Highlighter(boolean show, MarkerRenderer markerRenderer,
			boolean showMarker, float lineWidthAdjust, int sizeAdjust,
			boolean showTooltip, boolean keepTooltipInsideChart,
			boolean tooltipAlwaysVisible, TooltipMoveSpeeds tooltipMoveSpeed,
			TooltipLocations tooltipLocation, boolean fadeTooltip,
			int tooltipFadeSpeed, int tooltipOffset, TooltipAxes tooltipAxes,
			String tooltipSeparator, String tooltipContentEditor,
			boolean useAxesFormatters, String tooltipFormatString,
			String formatString, int yvalues, boolean bringSeriesToFront) {
		super(new DefaultHighlighter());
		setShow(show);
		setMarkerRenderer(markerRenderer);
		setShowMarker(showMarker);
		setLineWidthAdjust(lineWidthAdjust);
		setSizeAdjust(sizeAdjust);
		setShowTooltip(showTooltip);
		setKeepTooltipInsideChart(keepTooltipInsideChart);
		setTooltipAlwaysVisible(tooltipAlwaysVisible);
		setTooltipMoveSpeed(tooltipMoveSpeed);
		setTooltipLocation(tooltipLocation);
		setFadeTooltip(fadeTooltip);
		setTooltipFadeSpeed(tooltipFadeSpeed);
		setTooltipOffset(tooltipOffset);
		setTooltipAxes(tooltipAxes);
		setTooltipSeparator(tooltipSeparator);
		setTooltipContentEditor(tooltipContentEditor);
		setUseAxesFormatters(useAxesFormatters);
		setTooltipFormatString(tooltipFormatString);
		setFormatString(formatString);
		setYvalues(yvalues);
		setBringSeriesToFront(bringSeriesToFront);
	}

	public Highlighter(boolean show, MarkerRenderer markerRenderer,
			boolean showMarker, float lineWidthAdjust, int sizeAdjust,
			boolean showTooltip, boolean keepTooltipInsideChart,
			boolean tooltipAlwaysVisible, int tooltipMoveSpeed,
			TooltipLocations tooltipLocation, boolean fadeTooltip,
			int tooltipFadeSpeed, int tooltipOffset, TooltipAxes tooltipAxes,
			String tooltipSeparator, String tooltipContentEditor,
			boolean useAxesFormatters, String tooltipFormatString,
			String formatString, int yvalues, boolean bringSeriesToFront) {
		super(new DefaultHighlighter());
		setShow(show);
		setMarkerRenderer(markerRenderer);
		setShowMarker(showMarker);
		setLineWidthAdjust(lineWidthAdjust);
		setSizeAdjust(sizeAdjust);
		setShowTooltip(showTooltip);
		setKeepTooltipInsideChart(keepTooltipInsideChart);
		setTooltipAlwaysVisible(tooltipAlwaysVisible);
		setTooltipMoveSpeed(tooltipMoveSpeed);
		setTooltipLocation(tooltipLocation);
		setFadeTooltip(fadeTooltip);
		setTooltipFadeSpeed(tooltipFadeSpeed);
		setTooltipOffset(tooltipOffset);
		setTooltipAxes(tooltipAxes);
		setTooltipSeparator(tooltipSeparator);
		setTooltipContentEditor(tooltipContentEditor);
		setUseAxesFormatters(useAxesFormatters);
		setTooltipFormatString(tooltipFormatString);
		setFormatString(formatString);
		setYvalues(yvalues);
		setBringSeriesToFront(bringSeriesToFront);
	}

	public boolean getShow() {
		return show;
	}

	public Highlighter setShow(boolean show) {
		this.show = show;
		return this;
	}

	public MarkerRenderer getMarkerRenderer() {
		return markerRenderer;
	}

	public Highlighter setMarkerRenderer(MarkerRenderer markerRenderer) {
		this.markerRenderer = markerRenderer;
		return this;
	}

	public boolean getShowMarker() {
		return showMarker;
	}

	public Highlighter setShowMarker(boolean showMarker) {
		this.showMarker = showMarker;
		return this;
	}

	public float getLineWidthAdjust() {
		return lineWidthAdjust;
	}

	public Highlighter setLineWidthAdjust(float lineWidthAdjust) {
		this.lineWidthAdjust = lineWidthAdjust;
		return this;
	}

	public int getSizeAdjust() {
		return sizeAdjust;
	}

	public Highlighter setSizeAdjust(int sizeAdjust) {
		this.sizeAdjust = sizeAdjust;
		return this;
	}

	public boolean getShowTooltip() {
		return showTooltip;
	}

	public Highlighter setShowTooltip(boolean showTooltip) {
		this.showTooltip = showTooltip;
		return this;
	}

	public Boolean getKeepTooltipInsideChart() {
		return keepTooltipInsideChart;
	}

	public Highlighter setKeepTooltipInsideChart(boolean keepTooltipInsideChart) {
		this.keepTooltipInsideChart = keepTooltipInsideChart;
		return this;
	}

	public Boolean getTooltipAlwaysVisible() {
		return tooltipAlwaysVisible;
	}

	public Highlighter setTooltipAlwaysVisible(boolean tooltipAlwaysVisible) {
		this.tooltipAlwaysVisible = tooltipAlwaysVisible;
		return this;
	}

	public Object getTooltipMoveSpeed() {
		return tooltipMoveSpeed;
	}

	public Highlighter setTooltipMoveSpeed(int tooltipMoveSpeed) {
		this.tooltipMoveSpeed = tooltipMoveSpeed < 0 ? DefaultHighlighter.TOOLTIP_MOVE_SPEED
				: Integer.valueOf(tooltipMoveSpeed);
		return this;
	}

	public Highlighter setTooltipMoveSpeed(TooltipMoveSpeeds tooltipMoveSpeed) {
		this.tooltipMoveSpeed = tooltipMoveSpeed;
		return this;
	}

	public TooltipLocations getTooltipLocation() {
		return tooltipLocation;
	}

	public Highlighter setTooltipLocation(TooltipLocations tooltipLocation) {
		this.tooltipLocation = tooltipLocation;
		return this;
	}

	public boolean getFadeTooltip() {
		return fadeTooltip;
	}

	public Highlighter setFadeTooltip(boolean fadeTooltip) {
		this.fadeTooltip = fadeTooltip;
		return this;
	}

	public Object getTooltipFadeSpeed() {
		return tooltipFadeSpeed;
	}

	public Highlighter setTooltipFadeSpeed(int tooltipFadeSpeed) {
		this.tooltipFadeSpeed = Integer.valueOf(tooltipFadeSpeed < 0 ? 50
				: tooltipFadeSpeed);
		return this;
	}

	public Highlighter setTooltipFadeSpeed(TooltipFadeSpeeds tooltipFadeSpeeds) {
		this.tooltipFadeSpeed = tooltipFadeSpeeds;
		return this;
	}

	public int getTooltipOffset() {
		return tooltipOffset;
	}

	public Highlighter setTooltipOffset(int tooltipOffset) {
		this.tooltipOffset = tooltipOffset;
		return this;
	}

	public TooltipAxes getTooltipAxes() {
		return tooltipAxes;
	}

	public Highlighter setTooltipAxes(TooltipAxes tooltipAxes) {
		this.tooltipAxes = tooltipAxes;
		return this;
	}

	public String getTooltipSeparator() {
		return tooltipSeparator;
	}

	public Highlighter setTooltipSeparator(String tooltipSeparator) {
		this.tooltipSeparator = tooltipSeparator;
		return this;
	}

	public String getTooltipContentEditor() {
		return tooltipContentEditor;
	}

	public Highlighter setTooltipContentEditor(String tooltipContentEditor) {
		this.tooltipContentEditor = tooltipContentEditor;
		return this;
	}

	public boolean getUseAxesFormatters() {
		return useAxesFormatters;
	}

	public Highlighter setUseAxesFormatters(boolean useAxesFormatters) {
		this.useAxesFormatters = useAxesFormatters;
		return this;
	}

	public String getTooltipFormatString() {
		return tooltipFormatString;
	}

	public Highlighter setTooltipFormatString(String tooltipFormatString) {
		this.tooltipFormatString = tooltipFormatString;
		return this;
	}

	public String getFormatString() {
		return formatString;
	}

	public Highlighter setFormatString(String formatString) {
		this.formatString = formatString;
		return this;
	}

	public int getYvalues() {
		return yvalues;
	}

	public Highlighter setYvalues(int yvalues) {
		this.yvalues = yvalues;
		return this;
	}

	public boolean getBringSeriesToFront() {
		return bringSeriesToFront;
	}

	public Highlighter setBringSeriesToFront(boolean bringSeriesToFront) {
		this.bringSeriesToFront = bringSeriesToFront;
		return this;
	}

	@Override
	public String getValue() {
		return JsonHelper.toJsonString(this);
	}

}
