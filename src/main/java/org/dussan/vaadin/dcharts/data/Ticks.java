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
package org.dussan.vaadin.dcharts.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dussan.vaadin.dcharts.base.BaseData;

public class Ticks extends BaseData<Ticks> implements Serializable {

	private static final long serialVersionUID = -8105822444564630400L;

	public Ticks() {
		super(false);
	}

	@Override
	public Ticks add(Object... data) {
		List<Object> series = getSeries();
		if (series.isEmpty()) {
			super.add(data);
		} else {
			List<Object> serie = new ArrayList<Object>();
			serie.addAll(Arrays.asList((Object[]) series.get(0)));
			serie.addAll(Arrays.asList(data));
			super.clean().add(serie.toArray());
		}
		return this;
	}

}
