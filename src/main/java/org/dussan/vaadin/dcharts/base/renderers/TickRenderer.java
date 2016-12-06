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
package org.dussan.vaadin.dcharts.base.renderers;

import org.dussan.vaadin.dcharts.base.BaseElement;
import org.dussan.vaadin.dcharts.helpers.JsonHelper;
import org.dussan.vaadin.dcharts.metadata.ticks.TickFormatters;
import org.dussan.vaadin.dcharts.metadata.ticks.TickMarks;

@SuppressWarnings("serial")
public class TickRenderer<T> extends BaseElement<T> {

	private TickMarks mark = null;
	private Boolean showMark = null;
	private Boolean showGridline = null;
	private Boolean isMinorTick = null;
	private Integer markSize = null;
	private Boolean show = null;
	private Boolean showLabel = null;
	private TickFormatters formatter = null;
	private String prefix = null;
	private String formatString = null;
	private String fontFamily = null;
	private String fontSize = null;
	private String textColor = null;

	public TickRenderer(Object defaultTickRenderer) {
		super(defaultTickRenderer);
		setShow(true);
	}

	public TickRenderer(TickMarks tickMarks, boolean showMark,
			boolean showGridline, boolean isMinorTick, int markSize,
			boolean show, boolean showLabel, TickFormatters tickFormatters,
			String prefix, String formatString, String fontFamily,
			String fontSize, String textColor) {
		setMark(tickMarks);
		setShowMark(showMark);
		setShowGridline(showGridline);
		setIsMinorTick(isMinorTick);
		setMarkSize(markSize);
		setShow(show);
		setShowLabel(showLabel);
		setFormatter(tickFormatters);
		setPrefix(prefix);
		setFormatString(formatString);
		setFontFamily(fontFamily);
		setFontSize(fontSize);
		setTextColor(textColor);
	}

	public TickMarks getMark() {
		return mark;
	}

	public TickRenderer<T> setMark(TickMarks tickMarks) {
		this.mark = tickMarks;
		return this;
	}

	public boolean getShowMark() {
		return showMark;
	}

	public TickRenderer<T> setShowMark(boolean showMark) {
		this.showMark = showMark;
		return this;
	}

	public boolean getShowGridline() {
		return showGridline;
	}

	public TickRenderer<T> setShowGridline(boolean showGridline) {
		this.showGridline = showGridline;
		return this;
	}

	public boolean getIsMinorTick() {
		return isMinorTick;
	}

	public TickRenderer<T> setIsMinorTick(boolean isMinorTick) {
		this.isMinorTick = isMinorTick;
		return this;
	}

	public int getMarkSize() {
		return markSize;
	}

	public TickRenderer<T> setMarkSize(int markSize) {
		this.markSize = markSize;
		return this;
	}

	public boolean getShow() {
		return show;
	}

	public TickRenderer<T> setShow(boolean show) {
		this.show = show;
		return this;
	}

	public boolean getShowLabel() {
		return showLabel;
	}

	public TickRenderer<T> setShowLabel(boolean showLabel) {
		this.showLabel = showLabel;
		return this;
	}

	public TickFormatters getFormatter() {
		return formatter;
	}

	public TickRenderer<T> setFormatter(TickFormatters tickFormatters) {
		this.formatter = tickFormatters;
		return this;
	}

	public String getPrefix() {
		return prefix;
	}

	public TickRenderer<T> setPrefix(String prefix) {
		this.prefix = prefix;
		return this;
	}

	public String getFormatString() {
		return formatString;
	}

	public TickRenderer<T> setFormatString(String formatString) {
		this.formatString = formatString;
		return this;
	}

	public String getFontFamily() {
		return fontFamily;
	}

	public TickRenderer<T> setFontFamily(String fontFamily) {
		this.fontFamily = fontFamily;
		return this;
	}

	public String getFontSize() {
		return fontSize;
	}

	public TickRenderer<T> setFontSize(String fontSize) {
		this.fontSize = fontSize;
		return this;
	}

	public String getTextColor() {
		return textColor;
	}

	public TickRenderer<T> setTextColor(String textColor) {
		this.textColor = textColor;
		return this;
	}

	@Override
	public String getValue() {
		return JsonHelper.toJsonString(this);
	}

}
