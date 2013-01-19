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

import org.dussan.vaadin.dcharts.base.elements.Option;
import org.dussan.vaadin.dcharts.defaults.DefaultTitle;
import org.dussan.vaadin.dcharts.helpers.JsonHelper;
import org.dussan.vaadin.dcharts.metadata.TextAligns;
import org.dussan.vaadin.dcharts.metadata.renderers.TitleRenderers;

public class Title extends Option<Title> {

	private static final long serialVersionUID = -8998312544602992463L;
	private String text = null;
	private Boolean show = null;
	private String fontFamily = null;
	private String fontSize = null;
	private String textAlign = null;
	private String textColor = null;
	private TitleRenderers renderer = null;
	private String rendererOptions = null;
	private Boolean escapeHtml = null;

	public Title() {
		super(new DefaultTitle());
	}

	public Title(String title) {
		super(new DefaultTitle());
		setText(title);
	}

	public Title(String text, boolean show, String fontFamily, String fontSize,
			TextAligns textAlign, String textColor, TitleRenderers renderer,
			String rendererOptions, boolean escapeHtml) {
		super(new DefaultTitle());
		setText(text);
		setShow(show);
		setFontFamily(fontFamily);
		setFontSize(fontSize);
		setTextAlign(textAlign);
		setTextColor(textColor);
		setRenderer(renderer);
		setRendererOptions(rendererOptions);
		setEscapeHtml(escapeHtml);
	}

	public String getText() {
		return text;
	}

	public Title setText(String text) {
		this.text = text;
		return this;
	}

	public boolean getShow() {
		return show;
	}

	public Title setShow(boolean show) {
		this.show = show;
		return this;
	}

	public String getFontFamily() {
		return fontFamily;
	}

	public Title setFontFamily(String fontFamily) {
		this.fontFamily = fontFamily;
		return this;
	}

	public String getFontSize() {
		return fontSize;
	}

	public Title setFontSize(String fontSize) {
		this.fontSize = fontSize;
		return this;
	}

	public String getTextAlign() {
		return textAlign;
	}

	public Title setTextAlign(TextAligns textAlign) {
		this.textAlign = textAlign.getAlign();
		return this;
	}

	public String getTextColor() {
		return textColor;
	}

	public Title setTextColor(String textColor) {
		this.textColor = textColor;
		return this;
	}

	public TitleRenderers getRenderer() {
		return renderer;
	}

	public Title setRenderer(TitleRenderers renderer) {
		if (!renderer.equals(this.renderer)) {
			rendererOptions = DefaultTitle.RENDERER_OPTIONS;
		}
		this.renderer = renderer;
		return this;
	}

	public String getRendererOptions() {
		return rendererOptions;
	}

	public Title setRendererOptions(String rendererOptions) {
		this.rendererOptions = rendererOptions;
		return this;
	}

	public boolean getEscapeHtml() {
		return escapeHtml;
	}

	public Title setEscapeHtml(boolean escapeHtml) {
		this.escapeHtml = escapeHtml;
		return this;
	}

	@Override
	public String getValue() {
		return JsonHelper.toJsonString(this);
	}

}
