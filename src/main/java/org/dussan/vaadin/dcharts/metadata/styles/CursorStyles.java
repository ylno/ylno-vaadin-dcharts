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
package org.dussan.vaadin.dcharts.metadata.styles;

public enum CursorStyles {

	AUTO("auto"), //
	CROSSHAIR("crosshair"), //
	DEFAULT("default"), //
	E_RESIZE("e-resize"), //
	HELP("help"), //
	MOVE("move"), //
	N_RESIZE("n-resize"), //
	NE_RESIZE("ne-resize"), //
	NW_RESIZE("nw-resize"), //
	POINTER("pointer"), //
	PROGRESS("progress"), //
	S_RESIZE("s-resize"), //
	SE_RESIZE("se-resize"), //
	SW_RESIZE("sw-resize"), //
	TEXT("text"), //
	W_RESIZE("w-resize"), //
	WAIT("wait");

	private String style;

	private CursorStyles(String style) {
		this.style = style;
	}

	public String getStyle() {
		return style;
	}

	@Override
	public String toString() {
		return getStyle();
	}

}
