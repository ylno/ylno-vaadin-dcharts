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
package org.dussan.vaadin.dcharts.metadata.renderers;

public enum SeriesRenderers {

	BAR("$wnd.jQuery.jqplot.BarRenderer"), //
	BUBBLE("$wnd.jQuery.jqplot.BubbleRenderer"), //
	DONUT("$wnd.jQuery.jqplot.DonutRenderer"), //
	LINE("$wnd.jQuery.jqplot.LineRenderer"), //
	PIE("$wnd.jQuery.jqplot.PieRenderer"), //
	PYRAMID("$wnd.jQuery.jqplot.PyramidRenderer");

	private String renderer;

	private SeriesRenderers(String renderer) {
		this.renderer = renderer;
	}

	public String getRenderer() {
		return renderer;
	}

	@Override
	public String toString() {
		return getRenderer();
	}

}
