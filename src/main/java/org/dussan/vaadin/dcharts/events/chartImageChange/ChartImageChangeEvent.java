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
package org.dussan.vaadin.dcharts.events.chartImageChange;

import java.awt.image.BufferedImage;

import com.google.gwt.event.shared.GwtEvent;

public class ChartImageChangeEvent extends GwtEvent<ChartImageChangeHandler> {

	private BufferedImage chartImage = null;
	public static final Type<ChartImageChangeHandler> TYPE = new Type<ChartImageChangeHandler>();

	public ChartImageChangeEvent(BufferedImage chartImage) {
		this.chartImage = chartImage;
	}

	public BufferedImage getChartImage() {
		return chartImage;
	}

	@Override
	public Type<ChartImageChangeHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(ChartImageChangeHandler handler) {
		handler.onChartImageChange(this);
	}

	public static Type<ChartImageChangeHandler> getType() {
		return TYPE;
	}

}
