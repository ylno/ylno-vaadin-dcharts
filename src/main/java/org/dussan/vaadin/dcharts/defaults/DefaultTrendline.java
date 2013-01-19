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
import org.dussan.vaadin.dcharts.metadata.TrendlineType;
import org.dussan.vaadin.dcharts.metadata.renderers.SeriesRenderers;

public class DefaultTrendline {

	public static final Boolean SHOW = Boolean.TRUE;
	public static final String COLOR = "#666666";
	public static final SeriesRenderers RENDERER = SeriesRenderers.LINE;
	public static final MarkerRenderer RENDERER_OPTIONS = new MarkerRenderer()
			.setShow(false);
	public static final String LABEL = null;
	public static final TrendlineType TYPE = TrendlineType.LINEAR;
	public static final Boolean SHADOW = Boolean.TRUE;
	public static final MarkerRenderer MARKER_RENDERER = new MarkerRenderer()
			.setShow(false);
	public static final Float LINE_WIDTH = 1.5f;
	public static final Integer SHADOW_ANGLE = 45;
	public static final Float SHADOW_OFFSET = 1.0f;
	public static final Float SHADOW_ALPHA = 0.07f;
	public static final Integer SHADOW_DEPTH = 3;

	public DefaultTrendline() {
	}

}
