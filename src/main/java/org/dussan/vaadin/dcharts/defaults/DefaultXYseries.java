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

import org.dussan.vaadin.dcharts.base.renderers.MarkerRenderer;
import org.dussan.vaadin.dcharts.base.renderers.SeriesRenderer;
import org.dussan.vaadin.dcharts.metadata.FillAxes;
import org.dussan.vaadin.dcharts.metadata.lines.LineCaps;
import org.dussan.vaadin.dcharts.metadata.lines.LineJoins;
import org.dussan.vaadin.dcharts.metadata.lines.LinePatterns;
import org.dussan.vaadin.dcharts.metadata.renderers.MarkerRenderers;
import org.dussan.vaadin.dcharts.metadata.renderers.SeriesRenderers;

public class DefaultXYseries {

	public static final Boolean SHOW = Boolean.TRUE;
	public static final Float GRID_BORDER_WIDTH = 2.0f;
	public static final SeriesRenderers RENDERER = SeriesRenderers.LINE;
	public static final SeriesRenderer<?> RENDERER_OPTIONS = null;
	public static final String LABEL = null;
	public static final Boolean SHOW_LABEL = Boolean.TRUE;
	public static final String COLOR = null;
	public static final String NEGATIVE_COLOR = null;
	public static final Float LINE_WIDTH = 2.5f;
	public static final LineJoins LINE_JOIN = LineJoins.ROUND;
	public static final LineCaps LINE_CAP = LineCaps.ROUND;
	public static final LinePatterns LINE_PATTERN = LinePatterns.SOLID;
	public static final Boolean SHADOW = Boolean.TRUE;
	public static final Integer SHADOW_ANGLE = 45;
	public static final Float SHADOW_OFFSET = 1.25f;
	public static final Integer SHADOW_DEPTH = 3;
	public static final Float SHADOW_ALPHA = 0.1f;
	public static final Boolean BREAK_ON_NULL = Boolean.FALSE;
	public static final MarkerRenderers MARKER_RENDERER = MarkerRenderers.MARKER;
	public static final MarkerRenderer MARKER_OPTIONS = null;
	public static final Boolean SHOW_LINE = Boolean.TRUE;
	public static final Boolean SHOW_MARKER = Boolean.TRUE;
	public static final Integer INDEX = null;
	public static final Boolean FILL = Boolean.FALSE;
	public static final String FILL_COLOR = null;
	public static final String FILL_ALPHA = null;
	public static final Boolean FILL_AND_STROKE = Boolean.FALSE;
	public static final Boolean DISABLE_STACK = Boolean.FALSE;
	public static final Integer NEIGHBOR_THRESHOLD = 4;
	public static final Boolean FILL_TO_ZERO = Boolean.FALSE;
	public static final Integer FILL_TO_VALUE = 0;
	public static final FillAxes FILL_AXIS = FillAxes.Y;
	public static final Boolean USE_NEGATIVE_COLORS = Boolean.TRUE;
	public static final String POINT_LABELS = "{}";
	public static final String TRENDLINE = "{}";

	public DefaultXYseries() {
	}

}
