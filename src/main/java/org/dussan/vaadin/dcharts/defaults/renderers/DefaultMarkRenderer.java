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
package org.dussan.vaadin.dcharts.defaults.renderers;

import org.dussan.vaadin.dcharts.base.renderers.ShadowRenderer;
import org.dussan.vaadin.dcharts.base.renderers.ShapeRenderer;
import org.dussan.vaadin.dcharts.metadata.styles.MarkerStyles;

public class DefaultMarkRenderer {

	public static final Boolean SHOW = Boolean.TRUE;
	public static final String STYLE = MarkerStyles.FILLED_CIRLCE.getStyle();
	public static final Integer LINE_WIDTH = 2;
	public static final Float SIZE = 9.0f;
	public static final String COLOR = "#666666";
	public static final Boolean SHADOW = Boolean.TRUE;
	public static final Integer SHADOW_ANGLE = 45;
	public static final Integer SHADOW_OFFSET = 1;
	public static final Integer SHADOW_DEPTH = 3;
	public static final String SHADOW_ALPHA = "0.07";
	public static final String SHADOW_RENDERER = new ShadowRenderer()
			.setDefault(true).getValue();
	public static final String SHAPE_RENDERER = new ShapeRenderer().setDefault(
			true).getValue();

	public DefaultMarkRenderer() {
	}

}
