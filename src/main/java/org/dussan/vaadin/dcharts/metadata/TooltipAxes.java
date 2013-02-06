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
package org.dussan.vaadin.dcharts.metadata;

public enum TooltipAxes {

	X("x"), //
	Y("y"), //
	XY("xy"), //
	YX("yx"), //
	BOTH("both"), //
	X_BAR("xbar"), //
	Y_BAR("ybar"), //
	XY_BAR("xybar"), //
	YX_BAR("yxbar"), //
	X_BUBBLE("xbubble"), //
	Y_BUBBLE("ybubble"), //
	XY_BUBBLE("xybubble"), //
	YX_BUBBLE("yxbubble"), //
	X_PYRAMID("xpyramid"), //
	Y_PYRAMID("ypyramid"), //
	XY_PYRAMID("xypyramid"), //
	YX_PYRAMID("yxpyramid");

	private String axes;

	private TooltipAxes(String axes) {
		this.axes = axes;
	}

	public String getAxes() {
		return axes;
	}

	@Override
	public String toString() {
		return getAxes();
	}

}
