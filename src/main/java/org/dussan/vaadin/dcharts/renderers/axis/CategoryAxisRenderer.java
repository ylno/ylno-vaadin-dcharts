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
package org.dussan.vaadin.dcharts.renderers.axis;

import org.dussan.vaadin.dcharts.base.renderers.AxisRenderer;
import org.dussan.vaadin.dcharts.defaults.renderers.axis.DefaultCategoryAxisRenderer;

public class CategoryAxisRenderer extends AxisRenderer<CategoryAxisRenderer> {

	private static final long serialVersionUID = -4169594015833650244L;
	private Boolean sortMergedLabels = null;

	public CategoryAxisRenderer() {
		super(new DefaultCategoryAxisRenderer());
	}

	public CategoryAxisRenderer(boolean sortMergedLabels) {
		super(new DefaultCategoryAxisRenderer());
		setSortMergedLabels(sortMergedLabels);
	}

	public boolean getSortMergedLabels() {
		return sortMergedLabels;
	}

	public CategoryAxisRenderer setSortMergedLabels(boolean sortMergedLabels) {
		this.sortMergedLabels = sortMergedLabels;
		return this;
	}

}
