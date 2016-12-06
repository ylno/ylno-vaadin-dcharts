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
package org.dussan.vaadin.dcharts.renderers.series;

import org.dussan.vaadin.dcharts.base.renderers.SeriesRenderer;
import org.dussan.vaadin.dcharts.defaults.renderers.series.DefaultBlockRenderer;

public class BlockRenderer extends SeriesRenderer<BlockRenderer> {

	private static final long serialVersionUID = 5231093434453162096L;
	private String css = null;
	private Boolean escapeHtml = null;
	private Boolean insertBreaks = null;
	private Boolean varyBlockColors = null;

	public BlockRenderer() {
		super(new DefaultBlockRenderer());
	}

	public BlockRenderer(String css, boolean escapeHtml, boolean insertBreaks,
			boolean varyBlockColors) {
		super(new DefaultBlockRenderer());
		setCss(css);
		setEscapeHtml(escapeHtml);
		setInsertBreaks(insertBreaks);
		setVaryBlockColors(varyBlockColors);
	}

	public String getCss() {
		return css;
	}

	public BlockRenderer setCss(String css) {
		this.css = "{" + css.replace("{", "").replace("}", "") + "}";
		return this;
	}

	public Boolean getEscapeHtml() {
		return escapeHtml;
	}

	public BlockRenderer setEscapeHtml(boolean escapeHtml) {
		this.escapeHtml = escapeHtml;
		return this;
	}

	public Boolean getInsertBreaks() {
		return insertBreaks;
	}

	public BlockRenderer setInsertBreaks(boolean insertBreaks) {
		this.insertBreaks = insertBreaks;
		return this;
	}

	public Boolean getVaryBlockColors() {
		return varyBlockColors;
	}

	public BlockRenderer setVaryBlockColors(boolean varyBlockColors) {
		this.varyBlockColors = varyBlockColors;
		return this;
	}

}
