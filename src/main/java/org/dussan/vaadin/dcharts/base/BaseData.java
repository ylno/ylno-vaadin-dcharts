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
package org.dussan.vaadin.dcharts.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.dussan.vaadin.dcharts.helpers.ObjectHelper;

@SuppressWarnings("serial")
public class BaseData<T> implements Serializable {

	private boolean hasSubSeries = false;
	private boolean appendExtraBrackets = true;
	private List<Object> subSeries = null;
	private List<Object> series = null;

	public BaseData(boolean appendExtraBrackets) {
		this.appendExtraBrackets = appendExtraBrackets;
		subSeries = new ArrayList<Object>();
		series = new ArrayList<Object>();
	}

	protected List<Object> getSeries() {
		return series;
	}

	@SuppressWarnings("unchecked")
	protected T clean() {
		series = new ArrayList<Object>();
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T newSeries() {
		if (!hasSubSeries) {
			hasSubSeries = true;
			series = new ArrayList<Object>();
		}

		if (!subSeries.isEmpty()) {
			series.add(subSeries.toArray(new Object[][] {}));
			subSeries = new ArrayList<Object>();
		}

		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T add(Object... data) {
		if (hasSubSeries()) {
			subSeries.add((Object[]) data);
		} else {
			series.add((Object[]) data);
		}
		return (T) this;
	}

	public Object getSeriesValue(int seriesIndex, int pointIndex) {
		List<Object> series = this.series;
		if (hasSubSeries() && !subSeries.isEmpty()) {
			series.add(subSeries.toArray(new Object[][] {}));
		}

		try {
			Object[] serie = (Object[]) series.get(seriesIndex);
			return serie[pointIndex];
		} catch (Exception e) {
			return null;
		}
	}

	public String getValue() {
		if (hasSubSeries() && !subSeries.isEmpty()) {
			series.add(subSeries.toArray(new Object[][] {}));
			subSeries = new ArrayList<Object>();
		}

		StringBuilder dataSeries = new StringBuilder();
		for (Object data : series) {
			if (dataSeries.length() > 0) {
				dataSeries.append(", ");
			}
			if (data instanceof Object[][]) {
				dataSeries
						.append(ObjectHelper.toArrayString((Object[][]) data));
			} else {
				dataSeries.append(ObjectHelper.toArrayString((Object[]) data));
			}
		}

		if (appendExtraBrackets) {
			dataSeries.insert(0, "[").append("]");
		}

		return dataSeries.toString();
	}

	public boolean hasSubSeries() {
		return hasSubSeries;
	}

	public boolean isEmpty() {
		return !(series != null && !series.isEmpty())
				& !(hasSubSeries() && subSeries != null && !subSeries.isEmpty());
	}

	@Override
	public String toString() {
		return getValue();
	}

}
