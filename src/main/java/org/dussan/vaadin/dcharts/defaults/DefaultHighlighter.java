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
package org.dussan.vaadin.dcharts.defaults;

import org.dussan.vaadin.dcharts.base.renderers.MarkerRenderer;
import org.dussan.vaadin.dcharts.metadata.TooltipAxes;
import org.dussan.vaadin.dcharts.metadata.TooltipFadeSpeeds;
import org.dussan.vaadin.dcharts.metadata.TooltipMoveSpeeds;
import org.dussan.vaadin.dcharts.metadata.locations.TooltipLocations;

public class DefaultHighlighter {

	public static final Boolean SHOW = Boolean.TRUE;
	public static final MarkerRenderer MARKER_RENDERER = new MarkerRenderer()
			.setShadow(false);
	public static final Boolean SHOW_MARKER = Boolean.TRUE;
	public static final Float LINE_WIDTH_ADJUST = 2.5f;
	public static final Integer SIZE_ADJUST = 5;
	public static final Boolean SHOW_TOOLTIP = Boolean.TRUE;
	public static final Boolean KEEP_TOOLTIP_INSIDE_CHART = Boolean.TRUE;
	public static final Boolean TOOLTIP_ALWAYS_VISIBLE = Boolean.FALSE;
	public static final TooltipMoveSpeeds TOOLTIP_MOVE_SPEED = TooltipMoveSpeeds.FAST;
	public static final TooltipLocations TOOLTIP_LOCATION = TooltipLocations.EAST;
	public static final Boolean FADE_TOOLTIP = Boolean.TRUE;
	public static final TooltipFadeSpeeds tooltip_Fade_Speed = TooltipFadeSpeeds.FAST;
	public static final Integer TOOLTIP_OFFSET = 2;
	public static final TooltipAxes TOOLTIP_AXES = TooltipAxes.BOTH;
	public static final String TOOLTIP_SEPARATOR = ", ";
	// TODO: to be done
	public static final String TOOLTIP_CONTENT_EDITOR = null;
	public static final Boolean USE_AXES_FORMATTERS = Boolean.TRUE;
	public static final String TOOLTIP_FORMAT_STRING = "%.5P";
	public static final String FORMAT_STRING = null;
	public static final Integer YVALUES = 1;
	public static final Boolean BRING_SERIES_TOFRONT = Boolean.FALSE;

	public DefaultHighlighter() {
	}

}
