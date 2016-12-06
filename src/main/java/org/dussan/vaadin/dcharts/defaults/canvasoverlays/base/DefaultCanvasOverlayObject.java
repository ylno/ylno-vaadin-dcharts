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
package org.dussan.vaadin.dcharts.defaults.canvasoverlays.base;

import org.dussan.vaadin.dcharts.metadata.TooltipFadeSpeeds;
import org.dussan.vaadin.dcharts.metadata.XYaxes;
import org.dussan.vaadin.dcharts.metadata.lines.LineCaps;
import org.dussan.vaadin.dcharts.metadata.locations.TooltipLocations;

public class DefaultCanvasOverlayObject {

	public static final Boolean SHOW = Boolean.TRUE;
	public static final Integer LINE_WIDTH = 2;
	public static final String LINE_CAP = LineCaps.ROUND.getCap();
	public static final String COLOR = "#666666";
	public static final Boolean SHADOW = Boolean.TRUE;
	public static final Integer SHADOW_ANGLE = 45;
	public static final Integer SHADOW_OFFSET = 1;
	public static final Integer SHADOW_DEPTH = 3;
	public static final String SHADOW_ALPHA = "0.07";
	public static final String XAXIS = XYaxes.X.getAxis();
	public static final String YAXIS = XYaxes.Y.getAxis();
	public static final Boolean SHOW_TOOLTIP = Boolean.FALSE;
	public static final Float SHOW_TOOLTIP_PRECISION = 0.6f;
	public static final String TOOLTIP_LOCATION = TooltipLocations.NORTH_WEST
			.getLocation();
	public static final Boolean FADE_TOOLTIP = Boolean.TRUE;
	public static final String TOOLTIP_FADE_SPEED = TooltipFadeSpeeds.FAST
			.getSpeed();
	public static final Integer TOOLTIP_OFFSET = 4;
	public static final String TOOLTIP_FORMAT_STRING = "%d, %d";

	public DefaultCanvasOverlayObject() {
	}

}
