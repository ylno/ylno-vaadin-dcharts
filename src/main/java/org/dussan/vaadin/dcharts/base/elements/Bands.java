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
package org.dussan.vaadin.dcharts.base.elements;

import org.dussan.vaadin.dcharts.base.BaseElement;
import org.dussan.vaadin.dcharts.defaults.DefaultBands;
import org.dussan.vaadin.dcharts.helpers.JsonHelper;
import org.dussan.vaadin.dcharts.helpers.ObjectHelper;

public class Bands extends BaseElement<Bands> {

	private static final long serialVersionUID = -1412286451731459408L;
	private Boolean show = null;
	private Object[] hiData = null;
	private Object[] lowData = null;
	private String color = null;
	private Boolean showLines = null;
	private Boolean fill = null;
	private String fillColor = null;
	private String interval = null;

	public Bands() {
		super(new DefaultBands());
		setShow(true);
	}

	public Bands(boolean show, Object[] hiData, Object[] lowData, String color,
			boolean showLines, boolean fill, String fillColor, Object interval) {
		super(new DefaultBands());
		setShow(show);
		setHiData(hiData);
		setLowData(lowData);
		setColor(color);
		setShowLines(showLines);
		setFill(fill);
		setFillColor(fillColor);
		setInterval(interval);
	}

	public Bands(boolean show, Object[] hiData, Object[] lowData, String color,
			boolean showLines, boolean fill, String fillColor,
			Object upperInterval, Object lowerInterval) {
		super(new DefaultBands());
		setShow(show);
		setHiData(hiData);
		setLowData(lowData);
		setColor(color);
		setShowLines(showLines);
		setFill(fill);
		setFillColor(fillColor);
		setInterval(upperInterval, lowerInterval);
	}

	public boolean getShow() {
		return show;
	}

	public Bands setShow(boolean show) {
		this.show = show;
		return this;
	}

	public Object[] getHiData() {
		return hiData;
	}

	public Bands setHiData(Object[] hiData) {
		this.hiData = hiData;
		return this;
	}

	public Object[] getLowData() {
		return lowData;
	}

	public Bands setLowData(Object[] lowData) {
		this.lowData = lowData;
		return this;
	}

	public String getColor() {
		return color;
	}

	public Bands setColor(String color) {
		this.color = color;
		return this;
	}

	public boolean getShowLines() {
		return showLines;
	}

	public Bands setShowLines(boolean showLines) {
		this.showLines = showLines;
		return this;
	}

	public boolean getFill() {
		return fill;
	}

	public Bands setFill(boolean fill) {
		this.fill = fill;
		return this;
	}

	public String getFillColor() {
		return fillColor;
	}

	public Bands setFillColor(String fillColor) {
		this.fillColor = fillColor;
		return this;
	}

	public String getInterval() {
		return interval;
	}

	public Bands setInterval(Object interval) {
		this.interval = interval.toString();
		return this;
	}

	public Bands setInterval(Object upperInterval, Object lowerInterval) {
		this.interval = ObjectHelper
				.toArrayString(upperInterval, lowerInterval);
		return this;
	}

	@Override
	public String getValue() {
		return JsonHelper.toJsonString(this);
	}

}
