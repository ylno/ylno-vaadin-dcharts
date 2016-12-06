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
package org.dussan.vaadin.dcharts.base.renderers;

import org.dussan.vaadin.dcharts.base.BaseElement;
import org.dussan.vaadin.dcharts.helpers.JsonHelper;

@SuppressWarnings("serial")
public class GridRenderer<T> extends BaseElement<T> {

	private String shadowRenderer = null;

	public GridRenderer(Object defaultGridRenderer) {
		super(defaultGridRenderer);
	}

	public GridRenderer(ShadowRenderer shadowRenderer) {
		setShadowRenderer(shadowRenderer);
	}

	public String getShadowRenderer() {
		return shadowRenderer;
	}

	public GridRenderer<T> setShadowRenderer(ShadowRenderer shadowRenderer) {
		this.shadowRenderer = shadowRenderer.getValue();
		return this;
	}

	@Override
	public String getValue() {
		return JsonHelper.toJsonString(this);
	}

}
