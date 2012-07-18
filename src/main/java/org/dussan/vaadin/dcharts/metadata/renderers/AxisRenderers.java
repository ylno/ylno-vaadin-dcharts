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
package org.dussan.vaadin.dcharts.metadata.renderers;

public enum AxisRenderers {

	CATEGORY("$wnd.jQuery.jqplot.CategoryAxisRenderer"), //
	DATE("$wnd.jQuery.jqplot.DateAxisRenderer"), //
	LINEAR("$wnd.jQuery.jqplot.LinearAxisRenderer"), //
	LOG("$wnd.jQuery.jqplot.LogAxisRenderer"), //
	PYRAMID("$wnd.jQuery.jqplot.PyramidAxisRenderer");

	private String renderer;

	private AxisRenderers(String renderer) {
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
