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
import org.dussan.vaadin.dcharts.metadata.TooltipAxes;
import org.dussan.vaadin.dcharts.metadata.TooltipFadeSpeeds;
import org.dussan.vaadin.dcharts.metadata.locations.TooltipLocations;

public class DefaultHighlighter {

	public static final Boolean show = Boolean.TRUE;
	public static final MarkerRenderer markerRenderer = new MarkerRenderer()
			.setShadow(false);
	public static final Boolean showMarker = Boolean.TRUE;
	public static final Float lineWidthAdjust = 2.5f;
	public static final Integer sizeAdjust = 5;
	public static final Boolean showTooltip = Boolean.TRUE;
	public static final TooltipLocations tooltipLocation = TooltipLocations.NORTH_WEST;
	public static final Boolean fadeTooltip = Boolean.TRUE;
	public static final TooltipFadeSpeeds tooltipFadeSpeed = TooltipFadeSpeeds.FAST;
	public static final Integer tooltipOffset = 2;
	public static final TooltipAxes tooltipAxes = TooltipAxes.BOTH;
	public static final String tooltipSeparator = ", ";
	// TODO: to be done
	public static final String tooltipContentEditor = null;
	public static final Boolean useAxesFormatters = Boolean.TRUE;
	public static final String tooltipFormatString = "%.5P";
	public static final String formatString = null;
	public static final Integer yvalues = 1;
	public static final Boolean bringSeriesToFront = Boolean.FALSE;

	public DefaultHighlighter() {
	}

}
