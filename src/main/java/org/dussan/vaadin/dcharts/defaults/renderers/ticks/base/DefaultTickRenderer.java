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
package org.dussan.vaadin.dcharts.defaults.renderers.ticks.base;

import org.dussan.vaadin.dcharts.metadata.ticks.TickFormatters;
import org.dussan.vaadin.dcharts.metadata.ticks.TickMarks;

public class DefaultTickRenderer {

	public static final TickMarks MARK = TickMarks.OUTSIDE;
	public static final Boolean SHOW_MARK = Boolean.TRUE;
	public static final Boolean SHOW_GRIDLINE = Boolean.TRUE;
	public static final Boolean IS_MINOR_TICK = Boolean.FALSE;
	public static final Integer MARK_SIZE = 6;
	public static final Boolean SHOW = Boolean.TRUE;
	public static final Boolean SHOW_LABEL = Boolean.TRUE;
	public static final TickFormatters FORMATTER = TickFormatters.DEFAULT;
	public static final String PREFIX = null;
	public static final String FORMAT_STRING = null;
	public static final String FONT_FAMILY = null;
	public static final String FONT_SIZE = null;
	public static final String TEXT_COLOR = null;

	public DefaultTickRenderer() {
	}

}
