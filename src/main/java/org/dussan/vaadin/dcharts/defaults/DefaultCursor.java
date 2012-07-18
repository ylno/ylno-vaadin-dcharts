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
package org.dussan.vaadin.dcharts.defaults;

import org.dussan.vaadin.dcharts.base.renderers.ShapeRenderer;
import org.dussan.vaadin.dcharts.metadata.ConstrainZoomTo;
import org.dussan.vaadin.dcharts.metadata.locations.TooltipLocations;
import org.dussan.vaadin.dcharts.metadata.styles.CursorStyles;

public class DefaultCursor {

	public static final String STYLE = CursorStyles.CROSSHAIR.getStyle();
	public static final Boolean SHOW = Boolean.TRUE;
	public static final Boolean SHOW_TOOLTIP = Boolean.TRUE;
	public static final Boolean FOLLOW_MOUSE = Boolean.FALSE;
	public static final TooltipLocations TOOLTIP_LOCATION = TooltipLocations.SOUTH_EAST;
	public static final Integer TOOLTIP_OFFSET = 6;
	public static final Boolean SHOW_TOOLTIP_GRID_POSITION = Boolean.FALSE;
	public static final Boolean SHOW_TOOLTIP_UNIT_POSITION = Boolean.TRUE;
	public static final Boolean SHOW_TOOLTIP_DATA_POSITION = Boolean.FALSE;
	public static final String TOOLTIP_FORMAT_STRING = "%.4P, %.4P";
	public static final Boolean USE_AXES_FORMATTERS = Boolean.TRUE;
	public static final String TOOLTIP_AXIS_GROUPS = null;
	public static final Boolean ZOOM = Boolean.FALSE;
	public static final Boolean LOOSE_ZOOM = Boolean.TRUE;
	public static final Boolean CLICK_RESET = Boolean.FALSE;
	public static final Boolean DBL_CLICK_RESET = Boolean.TRUE;
	public static final Boolean SHOW_VERTICAL_LINE = Boolean.FALSE;
	public static final Boolean SHOW_HORIZONTAL_LINE = Boolean.FALSE;
	public static final ConstrainZoomTo CONSTRAIN_ZOOM_TO = ConstrainZoomTo.NONE;
	public static final ShapeRenderer SHAPE_RENDERER = new ShapeRenderer()
			.setDefault(true);
	public static final Integer INTERSECTION_THRESHOLD = 2;
	public static final Boolean SHOW_CURSOR_LEGEND = Boolean.FALSE;
	public static final String CURSOR_LEGEND_FORMAT_STRING = "%s x:%s, y:%s";
	public static final Boolean CONSTRAIN_OUTSIDE_ZOOM = Boolean.TRUE;
	public static final Boolean SHOW_TOOLTIP_OUTSIDE_ZOOM = Boolean.FALSE;
	public static final Boolean ON_GRID = Boolean.FALSE;

	public DefaultCursor() {
	}

}
