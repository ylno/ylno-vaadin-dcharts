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
package org.dussan.vaadin.dcharts.events;

public enum ChartEventType {

	NOT_DEFINED("notDefined"), //
	RAW_IMAGE_DATA("rawImageData"), //
	BAR_MOUSE_ENTER("barMouseEnter"), //
	BAR_MOUSE_LEAVE("barMouseLeave"), //
	BAR_CLICK("barClick"), //
	BAR_RIGHT_CLICK("barRightClick"), //
	BUBBLE_MOUSE_ENTER("bubbleMouseEnter"), //
	BUBBLE_MOUSE_LEAVE("bubbleMouseLeave"), //
	BUBBLE_CLICK("bubbleClick"), //
	BUBBLE_RIGHT_CLICK("bubbleRightClick"), //
	DONUT_MOUSE_ENTER("donutMouseEnter"), //
	DONUT_MOUSE_LEAVE("donutMouseLeave"), //
	DONUT_CLICK("donutClick"), //
	DONUT_RIGHT_CLICK("donutRightClick"), //
	LINE_CLICK("lineClick"), //
	LINE_RIGHT_CLICK("lineRightClick"), //
	OHLC_MOUSE_ENTER("ohlcMouseEnter"), //
	OHLC_MOUSE_LEAVE("ohlcMouseLeave"), //
	OHLC_CLICK("ohlcClick"), //
	PIE_MOUSE_ENTER("pieMouseEnter"), //
	PIE_MOUSE_LEAVE("pieMouseLeave"), //
	PIE_CLICK("pieClick"), //
	PIE_RIGHT_CLICK("pieRightClick"), //
	PYRAMID_MOUSE_ENTER("pyramidMouseEnter"), //
	PYRAMID_MOUSE_LEAVE("pyramidMouseLeave");

	private String eventType;

	private ChartEventType(String eventType) {
		this.eventType = eventType;
	}

	public static ChartEventType fromString(String eventType) {
		if (eventType != null) {
			for (ChartEventType type : ChartEventType.values()) {
				if (eventType.equals(type.getEventType())) {
					return type;
				}
			}
		}
		return ChartEventType.NOT_DEFINED;
	}

	public String getEventType() {
		return eventType;
	}

	@Override
	public String toString() {
		return getEventType();
	}

}
