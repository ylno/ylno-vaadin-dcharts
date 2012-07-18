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
package org.dussan.vaadin.dcharts.options;

import org.dussan.vaadin.dcharts.base.elements.Option;
import org.dussan.vaadin.dcharts.base.renderers.ShapeRenderer;
import org.dussan.vaadin.dcharts.data.TooltipAxisGroups;
import org.dussan.vaadin.dcharts.defaults.DefaultCursor;
import org.dussan.vaadin.dcharts.helpers.JsonHelper;
import org.dussan.vaadin.dcharts.metadata.ConstrainZoomTo;
import org.dussan.vaadin.dcharts.metadata.XYaxes;
import org.dussan.vaadin.dcharts.metadata.locations.TooltipLocations;
import org.dussan.vaadin.dcharts.metadata.styles.CursorStyles;

public class Cursor extends Option<Cursor> {

	private static final long serialVersionUID = -1513551683522022L;
	private CursorStyles style = null;
	private Boolean show = null;
	private Boolean showTooltip = null;
	private Boolean followMouse = null;
	private TooltipLocations tooltipLocation = null;
	private Integer tooltipOffset = null;
	private Boolean showTooltipGridPosition = null;
	private Boolean showTooltipUnitPosition = null;
	private Boolean showTooltipDataPosition = null;
	private String tooltipFormatString = null;
	private Boolean useAxesFormatters = null;
	private Object tooltipAxisGroups = null;
	private Boolean zoom = null;
	private Boolean looseZoom = null;
	private Boolean clickReset = null;
	private Boolean dblClickReset = null;
	private Boolean showVerticalLine = null;
	private Boolean showHorizontalLine = null;
	private ConstrainZoomTo constrainZoomTo = null;
	private ShapeRenderer shapeRenderer = null;
	private Integer intersectionThreshold = null;
	private Boolean showCursorLegend = null;
	private String cursorLegendFormatString = null;
	private Boolean constrainOutsideZoom = null;
	private Boolean showTooltipOutsideZoom = null;
	private Boolean onGrid = null;

	public Cursor() {
		super(new DefaultCursor());
	}

	public Cursor(CursorStyles cursorStyles, boolean show, boolean showTooltip,
			boolean followMouse, TooltipLocations tooltipLocations,
			int tooltipOffset, boolean showTooltipGridPosition,
			boolean showTooltipUnitPosition, boolean showTooltipDataPosition,
			String tooltipFormatString, boolean useAxesFormatters,
			TooltipAxisGroups tooltipAxisGroups, boolean zoom,
			boolean looseZoom, boolean clickReset, boolean dblClickReset,
			boolean showVerticalLine, boolean showHorizontalLine,
			ConstrainZoomTo constrainZoomTo, ShapeRenderer shapeRenderer,
			int intersectionThreshold, boolean showCursorLegend,
			String cursorLegendFormatString, boolean constrainOutsideZoom,
			boolean showTooltipOutsideZoom, boolean onGrid) {
		super(new DefaultCursor());
		setStyle(cursorStyles);
		setShow(show);
		setShowTooltip(showTooltip);
		setFollowMouse(followMouse);
		setTooltipLocation(tooltipLocations);
		setTooltipOffset(tooltipOffset);
		setShowTooltipGridPosition(showTooltipGridPosition);
		setShowTooltipUnitPosition(showTooltipUnitPosition);
		setShowTooltipDataPosition(showTooltipDataPosition);
		setTooltipFormatString(tooltipFormatString);
		setUseAxesFormatters(useAxesFormatters);
		setTooltipAxisGroups(tooltipAxisGroups);
		setZoom(zoom);
		setLooseZoom(looseZoom);
		setClickReset(clickReset);
		setDblClickReset(dblClickReset);
		setShowVerticalLine(showVerticalLine);
		setShowHorizontalLine(showHorizontalLine);
		setConstrainZoomTo(constrainZoomTo);
		setShapeRenderer(shapeRenderer);
		setIntersectionThreshold(intersectionThreshold);
		setShowCursorLegend(showCursorLegend);
		setCursorLegendFormatString(cursorLegendFormatString);
		setConstrainOutsideZoom(constrainOutsideZoom);
		setShowTooltipOutsideZoom(showTooltipOutsideZoom);
		setOnGrid(onGrid);

		setTooltipAxisGroups(new TooltipAxisGroups().add(XYaxes.X, XYaxes.Y)
				.add(XYaxes.X, XYaxes.Y));
	}

	public CursorStyles getStyle() {
		return style;
	}

	public Cursor setStyle(CursorStyles cursorStyles) {
		this.style = cursorStyles;
		return this;
	}

	public boolean getShow() {
		return show;
	}

	public Cursor setShow(boolean show) {
		this.show = show;
		return this;
	}

	public boolean getShowTooltip() {
		return showTooltip;
	}

	public Cursor setShowTooltip(boolean showTooltip) {
		this.showTooltip = showTooltip;
		return this;
	}

	public boolean getFollowMouse() {
		return followMouse;
	}

	public Cursor setFollowMouse(boolean followMouse) {
		this.followMouse = followMouse;
		return this;
	}

	public TooltipLocations getTooltipLocation() {
		return tooltipLocation;
	}

	public Cursor setTooltipLocation(TooltipLocations tooltipLocations) {
		this.tooltipLocation = tooltipLocations;
		return this;
	}

	public int getTooltipOffset() {
		return tooltipOffset;
	}

	public Cursor setTooltipOffset(int tooltipOffset) {
		this.tooltipOffset = tooltipOffset;
		return this;
	}

	public boolean getShowTooltipGridPosition() {
		return showTooltipGridPosition;
	}

	public Cursor setShowTooltipGridPosition(boolean showTooltipGridPosition) {
		this.showTooltipGridPosition = showTooltipGridPosition;
		return this;
	}

	public boolean getShowTooltipUnitPosition() {
		return showTooltipUnitPosition;
	}

	public Cursor setShowTooltipUnitPosition(boolean showTooltipUnitPosition) {
		this.showTooltipUnitPosition = showTooltipUnitPosition;
		return this;
	}

	public boolean getShowTooltipDataPosition() {
		return showTooltipDataPosition;
	}

	public Cursor setShowTooltipDataPosition(boolean showTooltipDataPosition) {
		this.showTooltipDataPosition = showTooltipDataPosition;
		return this;
	}

	public String getTooltipFormatString() {
		return tooltipFormatString;
	}

	public Cursor setTooltipFormatString(String tooltipFormatString) {
		this.tooltipFormatString = tooltipFormatString;
		return this;
	}

	public boolean getUseAxesFormatters() {
		return useAxesFormatters;
	}

	public Cursor setUseAxesFormatters(boolean useAxesFormatters) {
		this.useAxesFormatters = useAxesFormatters;
		return this;
	}

	public Object getTooltipAxisGroups() {
		return tooltipAxisGroups;
	}

	public Cursor setTooltipAxisGroups(TooltipAxisGroups tooltipAxisGroups) {
		this.tooltipAxisGroups = tooltipAxisGroups == null ? DefaultCursor.TOOLTIP_AXIS_GROUPS
				: tooltipAxisGroups;
		return this;
	}

	public boolean getZoom() {
		return zoom;
	}

	public Cursor setZoom(boolean zoom) {
		this.zoom = zoom;
		return this;
	}

	public boolean getLooseZoom() {
		return looseZoom;
	}

	public Cursor setLooseZoom(boolean looseZoom) {
		this.looseZoom = looseZoom;
		return this;
	}

	public boolean getClickReset() {
		return clickReset;
	}

	public Cursor setClickReset(boolean clickReset) {
		this.clickReset = clickReset;
		return this;
	}

	public boolean getDblClickReset() {
		return dblClickReset;
	}

	public Cursor setDblClickReset(boolean dblClickReset) {
		this.dblClickReset = dblClickReset;
		return this;
	}

	public boolean getShowVerticalLine() {
		return showVerticalLine;
	}

	public Cursor setShowVerticalLine(boolean showVerticalLine) {
		this.showVerticalLine = showVerticalLine;
		return this;
	}

	public boolean getShowHorizontalLine() {
		return showHorizontalLine;
	}

	public Cursor setShowHorizontalLine(boolean showHorizontalLine) {
		this.showHorizontalLine = showHorizontalLine;
		return this;
	}

	public ConstrainZoomTo getConstrainZoomTo() {
		return constrainZoomTo;
	}

	public Cursor setConstrainZoomTo(ConstrainZoomTo constrainZoomTo) {
		this.constrainZoomTo = constrainZoomTo;
		return this;
	}

	public ShapeRenderer getShapeRenderer() {
		return shapeRenderer;
	}

	public Cursor setShapeRenderer(ShapeRenderer shapeRenderer) {
		this.shapeRenderer = shapeRenderer;
		return this;
	}

	public int getIntersectionThreshold() {
		return intersectionThreshold;
	}

	public Cursor setIntersectionThreshold(int intersectionThreshold) {
		this.intersectionThreshold = intersectionThreshold;
		return this;
	}

	public boolean getShowCursorLegend() {
		return showCursorLegend;
	}

	public Cursor setShowCursorLegend(boolean showCursorLegend) {
		this.showCursorLegend = showCursorLegend;
		return this;
	}

	public String getCursorLegendFormatString() {
		return cursorLegendFormatString;
	}

	public Cursor setCursorLegendFormatString(String cursorLegendFormatString) {
		this.cursorLegendFormatString = cursorLegendFormatString;
		return this;
	}

	public boolean getConstrainOutsideZoom() {
		return constrainOutsideZoom;
	}

	public Cursor setConstrainOutsideZoom(boolean constrainOutsideZoom) {
		this.constrainOutsideZoom = constrainOutsideZoom;
		return this;
	}

	public boolean getShowTooltipOutsideZoom() {
		return showTooltipOutsideZoom;
	}

	public Cursor setShowTooltipOutsideZoom(boolean showTooltipOutsideZoom) {
		this.showTooltipOutsideZoom = showTooltipOutsideZoom;
		return this;
	}

	public boolean getOnGrid() {
		return onGrid;
	}

	public Cursor setOnGrid(boolean onGrid) {
		this.onGrid = onGrid;
		return this;
	}

	@Override
	public String getValue() {
		return JsonHelper.toJsonString(this);
	}

}
