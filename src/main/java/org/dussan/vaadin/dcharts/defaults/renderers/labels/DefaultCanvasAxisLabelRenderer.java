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
package org.dussan.vaadin.dcharts.defaults.renderers.labels;

import org.dussan.vaadin.dcharts.defaults.renderers.labels.base.DefaultLabelRenderer;
import org.dussan.vaadin.dcharts.metadata.FontWeights;

public class DefaultCanvasAxisLabelRenderer extends DefaultLabelRenderer {

	public static final Integer ANGLE = 0;
	public static final Boolean SHOW_LABEL = Boolean.TRUE;
	public static final FontWeights FONT_WEIGHT = FontWeights.NORMAL;
	public static final Float FONT_STRETCH = 1.0f;
	public static final Boolean ENABLE_FONT_SUPPORT = Boolean.TRUE;
	public static final Float PT2PX = null;

	public DefaultCanvasAxisLabelRenderer() {
	}

}
