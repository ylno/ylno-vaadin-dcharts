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

import java.util.ArrayList;
import java.util.List;

import org.dussan.vaadin.dcharts.base.elements.Option;
import org.dussan.vaadin.dcharts.base.elements.XYseries;
import org.dussan.vaadin.dcharts.metadata.XYaxes;
import org.dussan.vaadin.dcharts.metadata.renderers.SeriesRenderers;

public class Series extends Option<Series> {

	private static final long serialVersionUID = 8376818951054459070L;
	private List<XYseries> series = null;

	public Series() {
		series = new ArrayList<XYseries>();
	}

	public List<XYseries> getSeries() {
		return series;
	}

	public XYseries getSeries(XYaxes xAxis, XYaxes yAxis) {
		for (XYseries series : this.series) {
			if (series.getName().equals(xAxis.getAxis() + yAxis.getAxis())) {
				return series;
			}
		}
		return null;
	}

	public Series addSeries(XYseries series) {
		this.series.add(series);
		return this;
	}

	public boolean seriesContainsPyramidRenderer() {
		for (XYseries series : this.series) {
			if (SeriesRenderers.PYRAMID.equals(series.getRenderer())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String getValue() {
		StringBuilder value = new StringBuilder();
		for (XYseries series : this.series) {
			if (series != null) {
				value.append(value.length() > 0 ? "," : "");
				value.append(series.getValue());
			}
		}

		return (value.length() > 0 ? value.insert(0, "[").append("]")
				.toString() : null);
	}

}
