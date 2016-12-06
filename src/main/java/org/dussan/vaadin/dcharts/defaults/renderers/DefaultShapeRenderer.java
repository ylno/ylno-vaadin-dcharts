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
package org.dussan.vaadin.dcharts.defaults.renderers;

import org.dussan.vaadin.dcharts.metadata.lines.LineCaps;
import org.dussan.vaadin.dcharts.metadata.lines.LineJoins;
import org.dussan.vaadin.dcharts.metadata.lines.LinePatterns;

public class DefaultShapeRenderer {

	public static final Float LINE_WIDTH = 1.5f;
	public static final String LINE_PATTERN = LinePatterns.SOLID.getPattern();
	public static final String LINE_JOIN = LineJoins.MITER.getJoin();
	public static final String LINE_CAP = LineCaps.ROUND.getCap();
	public static final Boolean CLOSE_PATH = Boolean.FALSE;
	public static final Boolean FILL = Boolean.FALSE;
	public static final Boolean ISARC = Boolean.FALSE;
	public static final Boolean FILL_RECT = Boolean.FALSE;
	public static final Boolean STROKE_RECT = Boolean.FALSE;
	public static final Boolean CLEAR_RECT = Boolean.FALSE;
	public static final String STROKE_STYLE = "#999999";
	public static final String FILL_STYLE = "#999999";

	public DefaultShapeRenderer() {
	}

}
