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
package org.dussan.vaadin.dcharts.base.renderers;

import org.dussan.vaadin.dcharts.base.BaseElement;
import org.dussan.vaadin.dcharts.defaults.DefaultPlotBands;
import org.dussan.vaadin.dcharts.helpers.JsonHelper;
import org.dussan.vaadin.dcharts.metadata.BandAxes;

public class PlotBands extends BaseElement<PlotBands> {

	private static final long serialVersionUID = 5763222398408909878L;
	private Boolean show = null;
	private String color = null;
	private String axis = null;
	private String start = null;
	private String interval = null;

	public PlotBands() {
		super(new DefaultPlotBands());
		setShow(true);
	}

	public PlotBands(boolean show, String color, BandAxes axis, String start,
			String interval) {
		super(new DefaultPlotBands());
		setShow(show);
		setColor(color);
		setAxis(axis);
		setStart(start);
		setInterval(interval);
	}

	public boolean getShow() {
		return show;
	}

	public PlotBands setShow(boolean show) {
		this.show = show;
		return this;
	}

	public String getColor() {
		return color;
	}

	public PlotBands setColor(String color) {
		this.color = color;
		return this;
	}

	public String getAxis() {
		return axis;
	}

	public PlotBands setAxis(BandAxes axis) {
		this.axis = axis.getAxis();
		return this;
	}

	public String getStart() {
		return start;
	}

	public PlotBands setStart(String start) {
		this.start = start;
		return this;
	}

	public String getInterval() {
		return interval;
	}

	public PlotBands setInterval(String interval) {
		this.interval = interval;
		return this;
	}

	@Override
	public String getValue() {
		return JsonHelper.toJsonString(this);
	}

}
