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
package org.dussan.vaadin.dcharts.client.js;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.TextResource;

public interface JqPlot extends ClientBundle {

	public static final JqPlot CODE = GWT.create(JqPlot.class);

	@Source("code/jqplot/jquery.jqplot.min.css")
	@CssResource.NotStrict
	public CssResource css();

	@Source("code/jqplot/jquery.min.js")
	public TextResource jQuery();

	// code to bind a listener function to any HTML element on attribute change
	@Source("code/jqplot/attrchange.min.js")
	public TextResource attrChange();

	@Source("code/jqplot/jquery.jqplot.min.js")
	public TextResource jqPlot();

	@Source("code/jqplot/excanvas.min.js")
	public TextResource exCanvas();

	// jqPlot plugins
	@Source("code/jqplot/plugins/jqplot.barRenderer.min.js")
	public TextResource barRenderer();

	@Source("code/jqplot/plugins/jqplot.BezierCurveRenderer.min.js")
	public TextResource bezierCurveRenderer();

	@Source("code/jqplot/plugins/jqplot.blockRenderer.min.js")
	public TextResource blockRenderer();

	@Source("code/jqplot/plugins/jqplot.bubbleRenderer.min.js")
	public TextResource bubbleRenderer();

	@Source("code/jqplot/plugins/jqplot.canvasAxisLabelRenderer.min.js")
	public TextResource canvasAxisLabelRenderer();

	@Source("code/jqplot/plugins/jqplot.canvasAxisTickRenderer.min.js")
	public TextResource canvasAxisTickRenderer();

	@Source("code/jqplot/plugins/jqplot.canvasOverlay.min.js")
	public TextResource canvasOverlay();

	@Source("code/jqplot/plugins/jqplot.canvasTextRenderer.min.js")
	public TextResource canvasTextRenderer();

	@Source("code/jqplot/plugins/jqplot.categoryAxisRenderer.min.js")
	public TextResource categoryAxisRenderer();

	@Source("code/jqplot/plugins/jqplot.ciParser.min.js")
	public TextResource ciParser();

	@Source("code/jqplot/plugins/jqplot.cursor.min.js")
	public TextResource cursor();

	@Source("code/jqplot/plugins/jqplot.dateAxisRenderer.min.js")
	public TextResource dateAxisRenderer();

	@Source("code/jqplot/plugins/jqplot.donutRenderer.min.js")
	public TextResource donutRenderer();

	@Source("code/jqplot/plugins/jqplot.dragable.min.js")
	public TextResource dragable();

	@Source("code/jqplot/plugins/jqplot.enhancedLegendRenderer.min.js")
	public TextResource enhancedLegendRenderer();

	@Source("code/jqplot/plugins/jqplot.funnelRenderer.min.js")
	public TextResource funnelRenderer();

	@Source("code/jqplot/plugins/jqplot.highlighter.min.js")
	public TextResource highlighter();

	@Source("code/jqplot/plugins/jqplot.json2.min.js")
	public TextResource json2();

	@Source("code/jqplot/plugins/jqplot.logAxisRenderer.min.js")
	public TextResource logAxisRenderer();

	@Source("code/jqplot/plugins/jqplot.mekkoAxisRenderer.min.js")
	public TextResource mekkoAxisRenderer();

	@Source("code/jqplot/plugins/jqplot.mekkoRenderer.min.js")
	public TextResource mekkoRenderer();

	@Source("code/jqplot/plugins/jqplot.meterGaugeRenderer.min.js")
	public TextResource meterGaugeRenderer();

	@Source("code/jqplot/plugins/jqplot.ohlcRenderer.min.js")
	public TextResource ohlcRenderer();

	@Source("code/jqplot/plugins/jqplot.pieRenderer.min.js")
	public TextResource pieRenderer();

	@Source("code/jqplot/plugins/jqplot.pointLabels.min.js")
	public TextResource pointLabels();

	@Source("code/jqplot/plugins/jqplot.pyramidAxisRenderer.min.js")
	public TextResource pyramidAxisRenderer();

	@Source("code/jqplot/plugins/jqplot.pyramidGridRenderer.min.js")
	public TextResource pyramidGridRenderer();

	@Source("code/jqplot/plugins/jqplot.pyramidRenderer.min.js")
	public TextResource pyramidRenderer();

	@Source("code/jqplot/plugins/jqplot.trendline.min.js")
	public TextResource trendline();

}
