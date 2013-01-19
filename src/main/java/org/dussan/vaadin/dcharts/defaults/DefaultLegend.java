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
package org.dussan.vaadin.dcharts.defaults;

import org.dussan.vaadin.dcharts.base.renderers.LegendRenderer;
import org.dussan.vaadin.dcharts.metadata.LegendPlacements;
import org.dussan.vaadin.dcharts.metadata.locations.LegendLocations;
import org.dussan.vaadin.dcharts.metadata.renderers.LegendRenderers;

public class DefaultLegend {

	public static final Boolean SHOW = Boolean.FALSE;
	public static final LegendLocations LOCATION = LegendLocations.NORTH_EAST;
	public static final String LABELS = null;
	public static final Boolean SHOW_LABELS = Boolean.TRUE;
	public static final Boolean SHOW_SWATCHES = Boolean.TRUE;
	public static final LegendPlacements PLACEMENT = LegendPlacements.INSIDE_GRID;
	public static final String BORDER = null;
	public static final String BACKGROUND = null;
	public static final String TEXT_COLOR = null;
	public static final String FONT_FAMILY = null;
	public static final String FONT_SIZE = "0.75em";
	public static final String ROW_SPACING = "0.5em";
	public static final LegendRenderers RENDERER = LegendRenderers.TABLE;
	public static final LegendRenderer<?> RENDERER_OPTIONS = null;
	public static final Boolean PRE_DRAW = Boolean.FALSE;
	public static final String MARGIN_TOP = null;
	public static final String MARGIN_RIGHT = null;
	public static final String MARGIN_BOTTOM = null;
	public static final String MARGIN_LEFT = null;
	public static final Boolean ESCAPE_HTML = Boolean.FALSE;

	public DefaultLegend() {
	}

}
