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

public class DefaultSeriesDefaults {

	public static final Boolean SHOW = null;
	public static final Float GRID_BORDER_WIDTH = null;
	public static final SeriesRenderers RENDERER = SeriesRenderers.LINE;
	public static final SeriesRenderer<?> RENDERER_OPTIONS = null;
	public static final String LABEL = null;
	public static final Boolean SHOW_LABEL = null;
	public static final String COLOR = null;
	public static final String NEGATIVE_COLOR = null;
	public static final Float LINE_WIDTH = null;
	public static final LineJoins LINE_JOIN = LineJoins.ROUND;
	public static final LineCaps LINE_CAP = LineCaps.ROUND;
	public static final LinePatterns LINE_PATTERN = LinePatterns.SOLID;
	public static final Boolean SHADOW = null;
	public static final Integer SHADOW_ANGLE = null;
	public static final Float SHADOW_OFFSET = null;
	public static final Integer SHADOW_DEPTH = null;
	public static final Float SHADOW_ALPHA = null;
	public static final Boolean BREAK_ON_NULL = null;
	public static final MarkerRenderers MARKER_RENDERER = MarkerRenderers.MARKER;
	public static final MarkerRenderer MARKER_OPTIONS = null;
	public static final Boolean SHOW_LINE = null;
	public static final Boolean SHOW_MARKER = null;
	public static final Integer INDEX = null;
	public static final Boolean FILL = null;
	public static final String FILL_COLOR = null;
	public static final String FILL_ALPHA = null;
	public static final Boolean FILL_AND_STROKE = null;
	public static final Boolean DISABLE_STACK = null;
	public static final Integer NEIGHBOR_THRESHOLD = null;
	public static final Boolean FILL_TO_ZERO = null;
	public static final Integer FILL_TO_VALUE = null;
	public static final FillAxes FILL_AXIS = FillAxes.Y;
	public static final Boolean USE_NEGATIVE_COLORS = null;
	public static final String POINT_LABELS = "{}";
	public static final String TREND_LINE = "{}";

	public DefaultSeriesDefaults() {
	}

}
