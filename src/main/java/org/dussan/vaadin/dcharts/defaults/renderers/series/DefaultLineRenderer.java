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

import org.dussan.vaadin.dcharts.base.elements.Bands;
import org.dussan.vaadin.dcharts.base.renderers.ShadowRenderer;
import org.dussan.vaadin.dcharts.base.renderers.ShapeRenderer;
import org.dussan.vaadin.dcharts.data.BandData;
import org.dussan.vaadin.dcharts.renderers.series.animations.LineAnimation;

public class DefaultLineRenderer {

	public static final LineAnimation ANIMATION = new LineAnimation()
			.setDefault(true);
	public static final Object SMOOTH = Boolean.FALSE;
	public static final Integer TENSION = null;
	public static final Boolean CONSTRAIN_SMOOTHING = Boolean.TRUE;
	public static final BandData BAND_DATA = null;
	public static final Bands BANDS = new Bands().setDefault(true);
	public static final Boolean HIGHLIGHT_MOUSEOVER = Boolean.TRUE;
	public static final Boolean HIGHLIGHT_MOUSEDOWN = Boolean.FALSE;
	public static final String[] HIGHLIGHT_COLORS = null;
	public static final ShapeRenderer SHAPE_RENDERER = new ShapeRenderer()
			.setIsarc(false);
	public static final ShadowRenderer SHADOW_RENDERER = new ShadowRenderer()
			.setIsarc(false);

	public DefaultLineRenderer() {
	}

}
