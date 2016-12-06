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
package org.dussan.vaadin.dcharts.renderers.grid;

import org.dussan.vaadin.dcharts.base.renderers.GridRenderer;
import org.dussan.vaadin.dcharts.base.renderers.ShadowRenderer;
import org.dussan.vaadin.dcharts.defaults.renderers.grid.DefaultCanvasGridRenderer;

public class CanvasGridRenderer extends GridRenderer<CanvasGridRenderer> {

	private static final long serialVersionUID = 7423766409788871695L;

	public CanvasGridRenderer() {
		super(new DefaultCanvasGridRenderer());
	}

	public CanvasGridRenderer(ShadowRenderer shadowRenderer) {
		super(new DefaultCanvasGridRenderer());
		setShadowRenderer(shadowRenderer);
	}

}
