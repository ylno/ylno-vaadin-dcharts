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
package org.dussan.vaadin.dcharts.base.renderers;

import org.dussan.vaadin.dcharts.base.BaseElement;
import org.dussan.vaadin.dcharts.helpers.JsonHelper;

@SuppressWarnings("serial")
public class LabelRenderer<T> extends BaseElement<T> {

	private Boolean show = null;
	private String label = null;
	private String fontFamily = null;
	private String fontSize = null;
	private String textColor = null;

	public LabelRenderer(Object defaultLabelRenderer) {
		super(defaultLabelRenderer);
		setShow(true);
	}

	public LabelRenderer(boolean show, String label, String fontFamily,
			String fontSize, String textColor) {
		setShow(show);
		setLabel(label);
		setFontFamily(fontFamily);
		setFontSize(fontSize);
		setTextColor(textColor);
	}

	public boolean getShow() {
		return show;
	}

	public LabelRenderer<T> setShow(boolean show) {
		this.show = show;
		return this;
	}

	public String getLabel() {
		return label;
	}

	public LabelRenderer<T> setLabel(String label) {
		this.label = label;
		return this;
	}

	public String getFontFamily() {
		return fontFamily;
	}

	public LabelRenderer<T> setFontFamily(String fontFamily) {
		this.fontFamily = fontFamily;
		return this;
	}

	public String getFontSize() {
		return fontSize;
	}

	public LabelRenderer<T> setFontSize(String fontSize) {
		this.fontSize = fontSize;
		return this;
	}

	public String getTextColor() {
		return textColor;
	}

	public LabelRenderer<T> setTextColor(String textColor) {
		this.textColor = textColor;
		return this;
	}

	@Override
	public String getValue() {
		return JsonHelper.toJsonString(this);
	}

}
