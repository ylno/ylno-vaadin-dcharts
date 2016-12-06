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
package org.dussan.vaadin.dcharts.defaults.renderers.series;

import org.dussan.vaadin.dcharts.base.renderers.ShadowRenderer;
import org.dussan.vaadin.dcharts.base.renderers.ShapeRenderer;
import org.dussan.vaadin.dcharts.metadata.FillAxes;
import org.dussan.vaadin.dcharts.metadata.PyramidSides;
import org.dussan.vaadin.dcharts.metadata.lines.LineCaps;
import org.dussan.vaadin.dcharts.metadata.lines.LineJoins;

public class DefaultPyramidRenderer {

	public static final Integer BAR_PADDING = 10;
	public static final Integer BAR_WIDTH = null;
	public static final Boolean FILL = Boolean.TRUE;
	public static final Boolean HIGHLIGHT_MOUSEOVER = Boolean.TRUE;
	public static final Boolean HIGHLIGHT_MOUSEDOWN = Boolean.FALSE;
	public static final String[] HIGHLIGHT_COLORS = null;
	public static final Boolean OFFSET_BARS = Boolean.FALSE;
	public static final PyramidSides SIDE = PyramidSides.RIGHT;
	public static final FillAxes FILL_AXIS = FillAxes.Y;
	public static final ShapeRenderer SHAPE_RENDERER = new ShapeRenderer()
			.setLineJoin(LineJoins.MITER).setLineCap(LineCaps.BUTT)
			.setIsarc(false);
	public static final ShadowRenderer SHADOW_RENDERER = new ShadowRenderer()
			.setLineJoin(LineJoins.MITER).setLineCap(LineCaps.BUTT)
			.setIsarc(false);

	public DefaultPyramidRenderer() {
	}
}
