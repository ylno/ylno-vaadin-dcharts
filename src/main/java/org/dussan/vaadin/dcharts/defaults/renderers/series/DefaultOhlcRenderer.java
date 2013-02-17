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
package org.dussan.vaadin.dcharts.defaults.renderers.series;

import org.dussan.vaadin.dcharts.metadata.ticks.BodyWidth;
import org.dussan.vaadin.dcharts.metadata.ticks.TickLength;

public class DefaultOhlcRenderer {

	public static final Boolean CANDLE_STICK = Boolean.FALSE;
	public static final Object TICK_LENGTH = TickLength.AUTO;
	public static final Object BODY_WIDTH = BodyWidth.AUTO;
	public static final String[] OPEN_COLOR = null;
	public static final String[] CLOSE_COLOR = null;
	public static final String[] WICK_COLOR = null;
	public static final Boolean FILL_UP_BODY = Boolean.FALSE;
	public static final Boolean FILL_DOWN_BODY = Boolean.TRUE;
	public static final String[] UP_BODY_COLOR = null;
	public static final String[] DOWN_BODY_COLOR = null;
	public static final Boolean HLC = Boolean.FALSE;
	public static final Float LINE_WIDTH = 1.5f;

	public DefaultOhlcRenderer() {
	}

}
