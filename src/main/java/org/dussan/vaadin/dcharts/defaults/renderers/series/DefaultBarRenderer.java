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
package org.dussan.vaadin.dcharts.defaults.renderers.series;

import org.dussan.vaadin.dcharts.metadata.directions.BarDirections;
import org.dussan.vaadin.dcharts.renderers.series.animations.BarAnimation;

public class DefaultBarRenderer {

	public static final Integer BAR_PADDING = 8;
	public static final Integer BAR_MARGIN = 10;
	public static final BarDirections BAR_DIRECTION = BarDirections.VERTICAL;
	public static final Integer BAR_WIDTH = null;
	public static final Integer SHADOW_OFFSET = 2;
	public static final Integer SHADOW_DEPTH = 5;
	public static final Float SHADOW_ALPHA = 0.08f;
	public static final Boolean WATERFALL = Boolean.FALSE;
	public static final Integer GROUPS = 1;
	public static final Boolean VARY_BAR_COLOR = Boolean.FALSE;
	public static final Boolean HIGHLIGHT_MOUSE_OVER = Boolean.TRUE;
	public static final Boolean HIGHLIGHT_MOUSE_DOWN = Boolean.FALSE;
	public static final String[] HIGHLIGHT_COLORS = new String[] {
			"rgb(129,201,214)", "rgb(129,201,214)", "rgb(129,201,214)",
			"rgb(129,201,214)", "rgb(129,201,214)", "rgb(129,201,214)",
			"rgb(129,201,214)", "rgb(129,201,214)" };
	public static final Boolean TRANSPOSED_DATA = Boolean.TRUE;
	public static final BarAnimation ANIMATION = new BarAnimation()
			.setDefault(true);

	public DefaultBarRenderer() {
	}

}
