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
package org.dussan.vaadin.dcharts.defaults;

import org.dussan.vaadin.dcharts.metadata.locations.PointLabelLocations;
import org.dussan.vaadin.dcharts.metadata.ticks.TickFormatters;

public class DefaultPointLabels {

	public static final Boolean SHOW = Boolean.TRUE;
	public static final PointLabelLocations LOCATION = PointLabelLocations.NORTH;
	public static final Boolean LABELS_FROM_SERIES = Boolean.FALSE;
	public static final Integer SERIES_LABEL_INDEX = null;
	public static final String[] LABELS = null;
	public static final Boolean STACKED_VALUE = Boolean.FALSE;
	public static final Integer YPADDING = 6;
	public static final Integer XPADDING = 6;
	public static final Boolean ESCAPE_H_T_M_L = Boolean.TRUE;
	public static final Integer EDGE_TOLERANCE = -5;
	public static final TickFormatters FORMATTER = TickFormatters.DEFAULT;
	public static final String FORMAT_STRING = null;
	public static final Boolean HIDE_ZEROS = Boolean.FALSE;

	public DefaultPointLabels() {
	}
}
