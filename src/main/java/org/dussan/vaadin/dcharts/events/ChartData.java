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
package org.dussan.vaadin.dcharts.events;

import java.io.Serializable;

public class ChartData implements Serializable {

	private static final long serialVersionUID = -8686529902812788792L;
	private String chartId = null;
	private ChartEventType chartEventType = null;
	private Long seriesIndex = null;
	private Long pointIndex = null;
	private Object[] data = null;
	private Object originData = null;

	public ChartData() {
	}

	public ChartData(String chartId, ChartEventType chartEventType,
			Long seriesIndex, Long pointIndex, Object[] data) {
		this.chartId = chartId;
		this.chartEventType = chartEventType;
		this.seriesIndex = seriesIndex;
		this.pointIndex = pointIndex;
		this.data = data;
	}

	public String getChartId() {
		return chartId;
	}

	public void setChartId(String chartId) {
		this.chartId = chartId;
	}

	public ChartEventType getChartEventType() {
		return chartEventType;
	}

	public void setChartEventType(ChartEventType chartEventType) {
		this.chartEventType = chartEventType;
	}

	public Long getSeriesIndex() {
		return seriesIndex;
	}

	public void setSeriesIndex(Long seriesIndex) {
		this.seriesIndex = seriesIndex;
	}

	public Long getPointIndex() {
		return pointIndex;
	}

	public void setPointIndex(Long pointIndex) {
		this.pointIndex = pointIndex;
	}

	public Object[] getData() {
		return data;
	}

	public void setData(Object[] data) {
		this.data = data;
	}

	public Object getOriginData() {
		return originData;
	}

	public void setOriginData(Object originData) {
		this.originData = originData;
	}

}
