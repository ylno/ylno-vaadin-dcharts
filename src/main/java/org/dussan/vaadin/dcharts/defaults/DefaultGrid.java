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

import org.dussan.vaadin.dcharts.base.renderers.GridRenderer;
import org.dussan.vaadin.dcharts.metadata.renderers.GridRenderers;

public class DefaultGrid {

	public static final Boolean DRAW_GRIDLINES = Boolean.TRUE;
	public static final String GRID_LINE_COLOR = "#cccccc";
	public static final Float GRID_LINE_WIDTH = 1.0f;
	public static final String BACKGROUND = "#fffdf6";
	public static final String BORDER_COLOR = "#999999";
	public static final Float BORDER_WIDTH = 2.0f;
	public static final Boolean DRAW_BORDER = Boolean.TRUE;
	public static final Boolean SHADOW = Boolean.TRUE;
	public static final Integer SHADOW_ANGLE = 45;
	public static final Float SHADOW_OFFSET = 1.5f;
	public static final Integer SHADOW_WIDTH = 3;
	public static final Integer SHADOW_DEPTH = 3;
	public static final String SHADOW_COLOR = null;
	public static final Float SHADOW_ALPHA = 0.07f;
	public static final GridRenderers RENDERER = GridRenderers.CANVAS;
	public static final GridRenderer<?> RENDERER_OPTIONS = null;

	public DefaultGrid() {
	}

}
