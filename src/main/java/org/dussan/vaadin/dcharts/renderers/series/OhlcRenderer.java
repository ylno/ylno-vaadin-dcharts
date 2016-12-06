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
import org.dussan.vaadin.dcharts.defaults.renderers.series.DefaultOhlcRenderer;
import org.dussan.vaadin.dcharts.metadata.ticks.BodyWidth;
import org.dussan.vaadin.dcharts.metadata.ticks.TickLength;

public class OhlcRenderer extends SeriesRenderer<OhlcRenderer> {

	private static final long serialVersionUID = -4181033717501514483L;
	private Boolean candleStick = null;
	private Object tickLength = null;
	private Object bodyWidth = null;
	private String[] openColor = null;
	private String[] closeColor = null;
	private String[] wickColor = null;
	private Boolean fillUpBody = null;
	private Boolean fillDownBody = null;
	private String[] upBodyColor = null;
	private String[] downBodyColor = null;
	private Boolean hlc = null;
	private Float lineWidth = null;

	public OhlcRenderer() {
		super(new DefaultOhlcRenderer());
	}

	public OhlcRenderer(boolean candleStick, TickLength tickLength,
			BodyWidth bodyWidth, String[] openColor, String[] closeColor,
			String[] wickColor, boolean fillUpBody, boolean fillDownBody,
			String[] upBodyColor, String[] downBodyColor, boolean hlc,
			float lineWidth) {
		super(new DefaultOhlcRenderer());
		setCandleStick(candleStick);
		setTickLength(tickLength);
		setBodyWidth(bodyWidth);
		setOpenColor(openColor);
		setCloseColor(closeColor);
		setWickColor(wickColor);
		setFillUpBody(fillUpBody);
		setFillDownBody(fillDownBody);
		setUpBodyColor(upBodyColor);
		setDownBodyColor(downBodyColor);
		setHlc(hlc);
		setLineWidth(lineWidth);
	}

	public OhlcRenderer(boolean candleStick, int tickLength,
			BodyWidth bodyWidth, String[] openColor, String[] closeColor,
			String[] wickColor, boolean fillUpBody, boolean fillDownBody,
			String[] upBodyColor, String[] downBodyColor, boolean hlc,
			float lineWidth) {
		super(new DefaultOhlcRenderer());
		setCandleStick(candleStick);
		setTickLength(tickLength);
		setBodyWidth(bodyWidth);
		setOpenColor(openColor);
		setCloseColor(closeColor);
		setWickColor(wickColor);
		setFillUpBody(fillUpBody);
		setFillDownBody(fillDownBody);
		setUpBodyColor(upBodyColor);
		setDownBodyColor(downBodyColor);
		setHlc(hlc);
		setLineWidth(lineWidth);
	}

	public OhlcRenderer(boolean candleStick, TickLength tickLength,
			int bodyWidth, String[] openColor, String[] closeColor,
			String[] wickColor, boolean fillUpBody, boolean fillDownBody,
			String[] upBodyColor, String[] downBodyColor, boolean hlc,
			float lineWidth) {
		super(new DefaultOhlcRenderer());
		setCandleStick(candleStick);
		setTickLength(tickLength);
		setBodyWidth(bodyWidth);
		setOpenColor(openColor);
		setCloseColor(closeColor);
		setWickColor(wickColor);
		setFillUpBody(fillUpBody);
		setFillDownBody(fillDownBody);
		setUpBodyColor(upBodyColor);
		setDownBodyColor(downBodyColor);
		setHlc(hlc);
		setLineWidth(lineWidth);
	}

	public OhlcRenderer(boolean candleStick, int tickLength, int bodyWidth,
			String[] openColor, String[] closeColor, String[] wickColor,
			boolean fillUpBody, boolean fillDownBody, String[] upBodyColor,
			String[] downBodyColor, boolean hlc, float lineWidth) {
		super(new DefaultOhlcRenderer());
		setCandleStick(candleStick);
		setTickLength(tickLength);
		setBodyWidth(bodyWidth);
		setOpenColor(openColor);
		setCloseColor(closeColor);
		setWickColor(wickColor);
		setFillUpBody(fillUpBody);
		setFillDownBody(fillDownBody);
		setUpBodyColor(upBodyColor);
		setDownBodyColor(downBodyColor);
		setHlc(hlc);
		setLineWidth(lineWidth);
	}

	public boolean getCandleStick() {
		return candleStick;
	}

	public OhlcRenderer setCandleStick(boolean candleStick) {
		this.candleStick = candleStick;
		return this;
	}

	public Object getTickLength() {
		return tickLength;
	}

	public OhlcRenderer setTickLength(TickLength tickLength) {
		this.tickLength = tickLength.getLength();
		return this;
	}

	public OhlcRenderer setTickLength(int tickLength) {
		this.tickLength = Integer.valueOf(tickLength);
		return this;
	}

	public Object getBodyWidth() {
		return bodyWidth;
	}

	public OhlcRenderer setBodyWidth(BodyWidth bodyWidth) {
		this.bodyWidth = bodyWidth.getWidth();
		return this;
	}

	public OhlcRenderer setBodyWidth(int bodyWidth) {
		this.bodyWidth = Integer.valueOf(bodyWidth);
		return this;
	}

	public String[] getOpenColor() {
		return openColor;
	}

	public OhlcRenderer setOpenColor(String... openColor) {
		this.openColor = openColor;
		return this;
	}

	public String[] getCloseColor() {
		return closeColor;
	}

	public OhlcRenderer setCloseColor(String... closeColor) {
		this.closeColor = closeColor;
		return this;
	}

	public String[] getWickColor() {
		return wickColor;
	}

	public OhlcRenderer setWickColor(String... wickColor) {
		this.wickColor = wickColor;
		return this;
	}

	public boolean getFillUpBody() {
		return fillUpBody;
	}

	public OhlcRenderer setFillUpBody(boolean fillUpBody) {
		this.fillUpBody = fillUpBody;
		return this;
	}

	public boolean getFillDownBody() {
		return fillDownBody;
	}

	public OhlcRenderer setFillDownBody(boolean fillDownBody) {
		this.fillDownBody = fillDownBody;
		return this;
	}

	public String[] getUpBodyColor() {
		return upBodyColor;
	}

	public OhlcRenderer setUpBodyColor(String... upBodyColor) {
		this.upBodyColor = upBodyColor;
		return this;
	}

	public String[] getDownBodyColor() {
		return downBodyColor;
	}

	public OhlcRenderer setDownBodyColor(String... downBodyColor) {
		this.downBodyColor = downBodyColor;
		return this;
	}

	public boolean getHlc() {
		return hlc;
	}

	public OhlcRenderer setHlc(boolean hlc) {
		this.hlc = hlc;
		return this;
	}

	public float getLineWidth() {
		return lineWidth;
	}

	public OhlcRenderer setLineWidth(float lineWidth) {
		this.lineWidth = lineWidth;
		return this;
	}

}
