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

import org.dussan.vaadin.dcharts.base.renderers.AxisRenderer;
import org.dussan.vaadin.dcharts.base.renderers.LabelRenderer;
import org.dussan.vaadin.dcharts.base.renderers.TickRenderer;
import org.dussan.vaadin.dcharts.data.Ticks;
import org.dussan.vaadin.dcharts.metadata.renderers.AxisRenderers;
import org.dussan.vaadin.dcharts.metadata.renderers.LabelRenderers;
import org.dussan.vaadin.dcharts.metadata.renderers.TickRenderers;

public class DefaultXYaxis {

	public static final Boolean SHOW = Boolean.FALSE;
	public static final TickRenderers TICK_RENDERER = TickRenderers.AXIS;
	public static final TickRenderer<?> TICK_OPTIONS = null;
	public static final LabelRenderers LABEL_RENDERER = LabelRenderers.AXIS;
	public static final LabelRenderer<?> LABEL_OPTIONS = null;
	public static final String LABEL = null;
	public static final Boolean SHOW_LABEL = Boolean.TRUE;
	public static final Object MIN = null;
	public static final Object MAX = null;
	public static final Boolean AUTOSCALE = Boolean.FALSE;
	public static final Float PAD = 1.2f;
	public static final Float PAD_MAX = null;
	public static final Float PAD_MIN = null;
	public static final Ticks TICKS = null;
	public static final Integer NUMBER_TICKS = null;
	public static final Float TICK_INTERVAL = null;
	public static final AxisRenderers RENDERER = AxisRenderers.LINEAR;
	public static final AxisRenderer<?> RENDERER_OPTIONS = null;
	public static final Boolean SHOW_TICKS = Boolean.TRUE;
	public static final Boolean SHOW_TICK_MARKS = Boolean.TRUE;
	public static final Boolean SHOW_MINOR_TICKS = Boolean.TRUE;
	public static final Boolean DRAW_MAJOR_GRIDLINES = Boolean.TRUE;
	public static final Boolean DRAW_MINOR_GRIDLINES = Boolean.FALSE;
	public static final Boolean DRAW_MAJOR_TICK_MARKS = Boolean.TRUE;
	public static final Boolean DRAW_MINOR_TICK_MARKS = Boolean.TRUE;
	public static final Boolean USE_SERIES_COLOR = Boolean.FALSE;
	public static final Float BORDER_WIDTH = null;
	public static final String BORDER_COLOR = null;
	public static final Boolean SYNC_TICKS = null;
	public static final Integer TICK_SPACING = 75;

	public DefaultXYaxis() {
	}

}
