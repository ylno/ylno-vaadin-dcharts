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
package org.dussan.vaadin.dcharts.base.elements;

import org.dussan.vaadin.dcharts.base.BaseElement;
import org.dussan.vaadin.dcharts.defaults.DefaultPointLabels;
import org.dussan.vaadin.dcharts.helpers.JsonHelper;
import org.dussan.vaadin.dcharts.metadata.locations.PointLabelLocations;
import org.dussan.vaadin.dcharts.metadata.ticks.TickFormatters;

public class PointLabels extends BaseElement<PointLabels> {

	private static final long serialVersionUID = 471943357672977491L;
	private Boolean show = null;
	private String location = null;
	private Boolean labelsFromSeries = null;
	private Integer seriesLabelIndex = null;
	private String[] labels = null;
	private Boolean stackedValue = null;
	private Integer ypadding = null;
	private Integer xpadding = null;
	private Boolean escapeHTML = null;
	private Integer edgeTolerance = null;
	private String formatter = null;
	private String formatString = null;
	private Boolean hideZeros = null;

	public PointLabels() {
		super(new DefaultPointLabels());
	}

	public PointLabels(boolean show, PointLabelLocations location,
			boolean labelsFromSeries, int seriesLabelIndex, String[] labels,
			boolean stackedValue, int ypadding, int xpadding,
			boolean escapeHTML, int edgeTolerance, TickFormatters formatter,
			String formatString, boolean hideZeros) {
		super(new DefaultPointLabels());
		setShow(show);
		setLocation(location);
		setLabelsFromSeries(labelsFromSeries);
		setSeriesLabelIndex(seriesLabelIndex);
		setLabels(labels);
		setStackedValue(stackedValue);
		setYpadding(ypadding);
		setXpadding(xpadding);
		setEscapeHTML(escapeHTML);
		setEdgeTolerance(edgeTolerance);
		setFormatter(formatter);
		setFormatString(formatString);
		setHideZeros(hideZeros);
	}

	public boolean getShow() {
		return show;
	}

	public PointLabels setShow(boolean show) {
		this.show = show;
		return this;
	}

	public String getLocation() {
		return location;
	}

	public PointLabels setLocation(PointLabelLocations location) {
		this.location = location.getLocation();
		return this;
	}

	public boolean getLabelsFromSeries() {
		return labelsFromSeries;
	}

	public PointLabels setLabelsFromSeries(boolean labelsFromSeries) {
		this.labelsFromSeries = labelsFromSeries;
		return this;
	}

	public int getSeriesLabelIndex() {
		return seriesLabelIndex;
	}

	public PointLabels setSeriesLabelIndex(int seriesLabelIndex) {
		this.seriesLabelIndex = seriesLabelIndex;
		return this;
	}

	public String[] getLabels() {
		return labels;
	}

	public PointLabels setLabels(String... labels) {
		this.labels = labels;
		return this;
	}

	public boolean getStackedValue() {
		return stackedValue;
	}

	public PointLabels setStackedValue(boolean stackedValue) {
		this.stackedValue = stackedValue;
		return this;
	}

	public int getYpadding() {
		return ypadding;
	}

	public PointLabels setYpadding(int ypadding) {
		this.ypadding = ypadding;
		return this;
	}

	public int getXpadding() {
		return xpadding;
	}

	public PointLabels setXpadding(int xpadding) {
		this.xpadding = xpadding;
		return this;
	}

	public boolean getEscapeHTML() {
		return escapeHTML;
	}

	public PointLabels setEscapeHTML(boolean escapeHTML) {
		this.escapeHTML = escapeHTML;
		return this;
	}

	public int getEdgeTolerance() {
		return edgeTolerance;
	}

	public PointLabels setEdgeTolerance(int edgeTolerance) {
		this.edgeTolerance = edgeTolerance;
		return this;
	}

	public String getFormatter() {
		return formatter;
	}

	public PointLabels setFormatter(TickFormatters formatter) {
		if (!formatter.getFormatter().equals(this.formatter)) {
			formatString = DefaultPointLabels.FORMAT_STRING;
		}
		this.formatter = formatter.getFormatter();
		return this;
	}

	public String getFormatString() {
		return formatString;
	}

	public PointLabels setFormatString(String formatString) {
		this.formatString = formatString;
		return this;
	}

	public boolean getHideZeros() {
		return hideZeros;
	}

	public PointLabels setHideZeros(boolean hideZeros) {
		this.hideZeros = hideZeros;
		return this;
	}

	@Override
	public String getValue() {
		return JsonHelper.toJsonString(this);
	}

}
