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
package org.dussan.vaadin.dcharts;

import org.dussan.vaadin.dcharts.base.elements.XYaxis;
import org.dussan.vaadin.dcharts.data.DataSeries;
import org.dussan.vaadin.dcharts.data.Ticks;
import org.dussan.vaadin.dcharts.metadata.renderers.AxisRenderers;
import org.dussan.vaadin.dcharts.metadata.renderers.SeriesRenderers;
import org.dussan.vaadin.dcharts.options.Axes;
import org.dussan.vaadin.dcharts.options.Highlighter;
import org.dussan.vaadin.dcharts.options.Options;
import org.dussan.vaadin.dcharts.options.SeriesDefaults;

import com.vaadin.Application;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

public class DChartsApplication extends Application {

	private static final long serialVersionUID = 6965636231736806289L;

	@Override
	public void init() {
		Window mainWindow = new Window("dCharts Application");
		setMainWindow(mainWindow);

		DCharts chart = new DCharts();
		chart.setWidth("600px");
		chart.setHeight("250px");
		mainWindow.addComponent(chart);

		Label version = new Label("dCharts version: " + DCharts.getVersion()
				+ "  ,  dChart git version: " + DCharts.getGitVersion()
				+ "  ,  dChart jqPlot version: " + DCharts.getJqPlotVersion());
		mainWindow.addComponent(version);

		DataSeries dataSeries = new DataSeries().add(2, 6, 7, 10);

		SeriesDefaults seriesDefaults = new SeriesDefaults()
				.setRenderer(SeriesRenderers.BAR);

		Axes axes = new Axes().addAxis(new XYaxis().setRenderer(
				AxisRenderers.CATEGORY).setTicks(
				new Ticks().add("a", "b", "c", "d")));

		Highlighter highlighter = new Highlighter().setShow(false);

		Options options = new Options().setSeriesDefaults(seriesDefaults)
				.setAxes(axes).setHighlighter(highlighter);

		chart.setDataSeries(dataSeries).setOptions(options).show();
	}

}
