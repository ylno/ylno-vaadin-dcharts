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
package org.dussan.vaadin.dcharts.options;

import java.util.ArrayList;
import java.util.List;

import org.dussan.vaadin.dcharts.base.elements.CanvasOverlayObject;
import org.dussan.vaadin.dcharts.base.elements.Option;
import org.dussan.vaadin.dcharts.canvasoverlays.DashedHorizontalLine;
import org.dussan.vaadin.dcharts.canvasoverlays.DashedVerticalLine;
import org.dussan.vaadin.dcharts.canvasoverlays.HorizontalLine;
import org.dussan.vaadin.dcharts.canvasoverlays.Line;
import org.dussan.vaadin.dcharts.canvasoverlays.VerticalLine;
import org.dussan.vaadin.dcharts.defaults.DefaultCanvasOverlay;
import org.dussan.vaadin.dcharts.helpers.JsonHelper;
import org.dussan.vaadin.dcharts.metadata.CanvasOverlayObjects;

public class CanvasOverlay extends Option<CanvasOverlay> {

	private static final long serialVersionUID = -7255828816874559376L;
	private Boolean show = null;
	private Boolean deferDraw = null;
	private ArrayList<CanvasOverlayObject<?>> objects = null;

	public CanvasOverlay() {
		super(new DefaultCanvasOverlay());
		objects = new ArrayList<CanvasOverlayObject<?>>();
	}

	public CanvasOverlay(boolean show, boolean deferDraw) {
		super(new DefaultCanvasOverlay());
		setShow(show);
		setDeferDraw(deferDraw);
	}

	public Boolean getShow() {
		return show;
	}

	public CanvasOverlay setShow(boolean show) {
		this.show = show;
		return this;
	}

	public boolean getDeferDraw() {
		return deferDraw;
	}

	public CanvasOverlay setDeferDraw(boolean deferDraw) {
		this.deferDraw = deferDraw;
		return this;
	}

	public List<CanvasOverlayObject<?>> getObjects() {
		return objects;
	}

	public CanvasOverlay setObject(CanvasOverlayObject<?> object) {
		this.objects.add(object);
		return this;
	}

	@Override
	public String getValue() {
		StringBuilder value = new StringBuilder();
		value.append(show != null ? "show: " + show + ", " : "");
		value.append(deferDraw != null ? "deferDraw: " + deferDraw + ", " : "");
		value.append("objects: [");
		for (CanvasOverlayObject<?> object : this.objects) {
			if (object != null) {
				if (object instanceof DashedHorizontalLine) {
					value.append("{"
							+ CanvasOverlayObjects.DASHED_HORIZONTAL_LINE
									.getObject());
				} else if (object instanceof DashedVerticalLine) {
					value.append("{"
							+ CanvasOverlayObjects.DASHED_VERTICAL_LINE
									.getObject());
				} else if (object instanceof HorizontalLine) {
					value.append("{"
							+ CanvasOverlayObjects.HORIZONTAL_LINE.getObject());
				} else if (object instanceof Line) {
					value.append("{" + CanvasOverlayObjects.LINE.getObject());
				} else if (object instanceof VerticalLine) {
					value.append("{"
							+ CanvasOverlayObjects.VERTICAL_LINE.getObject());
				}
				value.append(": " + JsonHelper.toJsonString(object) + "},");
			}
		}
		return "{" + value.substring(0, value.length() - 1) + "]}";
	}

}
