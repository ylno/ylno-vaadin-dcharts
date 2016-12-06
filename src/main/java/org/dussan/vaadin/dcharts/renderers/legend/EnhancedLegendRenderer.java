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
package org.dussan.vaadin.dcharts.renderers.legend;

import org.dussan.vaadin.dcharts.base.renderers.LegendRenderer;
import org.dussan.vaadin.dcharts.defaults.renderers.DefaultEnhancedLegendRenderer;
import org.dussan.vaadin.dcharts.metadata.SeriesToggles;

public class EnhancedLegendRenderer extends
		LegendRenderer<EnhancedLegendRenderer> {

	private static final long serialVersionUID = -4747614600285420366L;
	private Integer numberRows = null;
	private Integer numberColumns = null;
	private Object seriesToggle = null;
	private Object seriesToggleReplot = null;
	private Boolean disableIEFading = null;

	public EnhancedLegendRenderer() {
		super(new DefaultEnhancedLegendRenderer());
	}

	public EnhancedLegendRenderer(int numberRows, int numberColumns,
			boolean seriesToggle, boolean seriesToggleReplot,
			boolean disableIEFading) {
		super(new DefaultEnhancedLegendRenderer());
		setNumberRows(numberRows);
		setNumberColumns(numberColumns);
		setSeriesToggle(seriesToggle);
		setSeriesToggleReplot(seriesToggleReplot);
		setDisableIEFading(disableIEFading);
	}

	public int getNumberRows() {
		return numberRows;
	}

	public EnhancedLegendRenderer setNumberRows(int numberRows) {
		this.numberRows = numberRows;
		return this;
	}

	public int getNumberColumns() {
		return numberColumns;
	}

	public EnhancedLegendRenderer setNumberColumns(int numberColumns) {
		this.numberColumns = numberColumns;
		return this;
	}

	public Object getSeriesToggle() {
		return seriesToggle;
	}

	public EnhancedLegendRenderer setSeriesToggle(boolean seriesToggle) {
		this.seriesToggle = Boolean.valueOf(seriesToggle);
		return this;
	}

	public EnhancedLegendRenderer setSeriesToggle(int seriesToggle) {
		this.seriesToggle = Integer.valueOf(seriesToggle < 0 ? 100
				: seriesToggle);
		return this;
	}

	public EnhancedLegendRenderer setSeriesToggle(SeriesToggles seriesToggle) {
		this.seriesToggle = seriesToggle;
		return this;
	}

	public Object getSeriesToggleReplot() {
		return seriesToggleReplot;
	}

	public EnhancedLegendRenderer setSeriesToggleReplot(
			boolean seriesToggleReplot) {
		this.seriesToggleReplot = !seriesToggleReplot ? Boolean
				.valueOf(seriesToggleReplot) : new String("{resetAxes:true}");
		return this;
	}

	public boolean getDisableIEFading() {
		return disableIEFading;
	}

	public EnhancedLegendRenderer setDisableIEFading(boolean disableIEFading) {
		this.disableIEFading = disableIEFading;
		return this;
	}

}
