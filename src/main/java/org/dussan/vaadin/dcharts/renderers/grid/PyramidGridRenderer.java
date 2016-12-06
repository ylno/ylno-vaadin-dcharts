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
package org.dussan.vaadin.dcharts.renderers.grid;

import org.dussan.vaadin.dcharts.base.renderers.GridRenderer;
import org.dussan.vaadin.dcharts.base.renderers.PlotBands;
import org.dussan.vaadin.dcharts.base.renderers.ShadowRenderer;
import org.dussan.vaadin.dcharts.defaults.renderers.grid.DefaultPyramidGridRenderer;

public class PyramidGridRenderer extends GridRenderer<PyramidGridRenderer> {

	private static final long serialVersionUID = 2418221612221921529L;
	private PlotBands plotBands = null;

	public PyramidGridRenderer() {
		super(new DefaultPyramidGridRenderer());
	}

	public PyramidGridRenderer(PlotBands plotBands,
			ShadowRenderer shadowRenderer) {
		super(new DefaultPyramidGridRenderer());
		setPlotBands(plotBands);
		setShadowRenderer(shadowRenderer);
	}

	public PlotBands getPlotBands() {
		return plotBands;
	}

	public PyramidGridRenderer setPlotBands(PlotBands plotBands) {
		this.plotBands = plotBands;
		return this;
	}

}
