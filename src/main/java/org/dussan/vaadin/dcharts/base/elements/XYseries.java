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
package org.dussan.vaadin.dcharts.base.elements;

import java.util.Arrays;

import org.dussan.vaadin.dcharts.base.BaseElement;
import org.dussan.vaadin.dcharts.base.renderers.MarkerRenderer;
import org.dussan.vaadin.dcharts.base.renderers.SeriesRenderer;
import org.dussan.vaadin.dcharts.defaults.DefaultXYseries;
import org.dussan.vaadin.dcharts.helpers.JsonHelper;
import org.dussan.vaadin.dcharts.metadata.FillAxes;
import org.dussan.vaadin.dcharts.metadata.Xaxes;
import org.dussan.vaadin.dcharts.metadata.Yaxes;
import org.dussan.vaadin.dcharts.metadata.lines.LineCaps;
import org.dussan.vaadin.dcharts.metadata.lines.LineJoins;
import org.dussan.vaadin.dcharts.metadata.lines.LinePatterns;
import org.dussan.vaadin.dcharts.metadata.renderers.MarkerRenderers;
import org.dussan.vaadin.dcharts.metadata.renderers.SeriesRenderers;
import org.dussan.vaadin.dcharts.renderers.series.BarRenderer;
import org.dussan.vaadin.dcharts.renderers.series.BlockRenderer;
import org.dussan.vaadin.dcharts.renderers.series.BubbleRenderer;
import org.dussan.vaadin.dcharts.renderers.series.DonutRenderer;
import org.dussan.vaadin.dcharts.renderers.series.LineRenderer;
import org.dussan.vaadin.dcharts.renderers.series.OhlcRenderer;
import org.dussan.vaadin.dcharts.renderers.series.PieRenderer;
import org.dussan.vaadin.dcharts.renderers.series.PyramidRenderer;

public class XYseries extends BaseElement<XYseries> {

	private static final long serialVersionUID = 1536298263012996186L;
	private Boolean show = null;
	private Xaxes xaxis = null;
	private Yaxes yaxis = null;
	private Float gridBorderWidth = null;
	private SeriesRenderers renderer = null;
	private SeriesRenderer<?> rendererOptions = null;
	private String label = null;
	private Boolean showLabel = null;
	private String color = null;
	private String negativeColor = null;
	private Float lineWidth = null;
	private LineJoins lineJoin = null;
	private LineCaps lineCap = null;
	private Object linePattern = null;
	private Boolean shadow = null;
	private Integer shadowAngle = null;
	private Float shadowOffset = null;
	private Integer shadowDepth = null;
	private Float shadowAlpha = null;
	private Boolean breakOnNull = null;
	private MarkerRenderers markerRenderer = null;
	private MarkerRenderer markerOptions = null;
	private Boolean showLine = null;
	private Boolean showMarker = null;
	private Integer index = null;
	private Boolean fill = null;
	private String fillColor = null;
	private String fillAlpha = null;
	private Boolean fillAndStroke = null;
	private Boolean disableStack = null;
	private Integer neighborThreshold = null;
	private Boolean fillToZero = null;
	private Integer fillToValue = null;
	private FillAxes fillAxis = null;
	private Boolean useNegativeColors = null;
	private PointLabels pointLabels = null;
	private Trendline trendline = null;

	public XYseries() {
		super(new DefaultXYseries());
		setXaxis(Xaxes.X);
		setYaxis(Yaxes.Y);
		setShow(true);
	}

	public XYseries(Xaxes xaxes) {
		super(new DefaultXYseries());
		setXaxis(xaxes);
		setYaxis(Yaxes.Y);
		setShow(true);
	}

	public XYseries(Yaxes yaxes) {
		super(new DefaultXYseries());
		setXaxis(Xaxes.X);
		setYaxis(yaxes);
		setShow(true);
	}

	public XYseries(Xaxes xaxes, Yaxes yaxes) {
		super(new DefaultXYseries());
		setXaxis(xaxes);
		setYaxis(yaxes);
		setShow(true);
	}

	public XYseries(boolean show, Xaxes xaxes, Yaxes yaxes,
			float gridBorderWidth, SeriesRenderers seriesRenderers,
			SeriesRenderer<?> seriesRenderer, String label, boolean showLabel,
			String color, String negativeColor, float lineWidth,
			LineJoins lineJoin, LineCaps lineCap, LinePatterns linePattern,
			boolean shadow, int shadowAngle, float shadowOffset,
			int shadowDepth, float shadowAlpha, boolean breakOnNull,
			MarkerRenderers markerRenderers, MarkerRenderer markerRenderer,
			boolean showLine, boolean showMarker, int index, boolean fill,
			String fillColor, String fillAlpha, boolean fillAndStroke,
			boolean disableStack, int neighborThreshold, boolean fillToZero,
			int fillToValue, FillAxes fillAxis, boolean useNegativeColors,
			PointLabels pointLabels, Trendline trendline) {
		super(new DefaultXYseries());
		setShow(show);
		setXaxis(xaxes);
		setYaxis(yaxes);
		setGridBorderWidth(gridBorderWidth);
		setRenderer(seriesRenderers);
		setRendererOptions(seriesRenderer);
		setLabel(label);
		setShowLabel(showLabel);
		setColor(color);
		setNegativeColor(negativeColor);
		setLineWidth(lineWidth);
		setLineJoin(lineJoin);
		setLineCap(lineCap);
		setLinePattern(linePattern);
		setShadow(shadow);
		setShadowAngle(shadowAngle);
		setShadowOffset(shadowOffset);
		setShadowDepth(shadowDepth);
		setShadowAlpha(shadowAlpha);
		setBreakOnNull(breakOnNull);
		setMarkerRenderer(markerRenderers);
		setMarkerOptions(markerRenderer);
		setShowLine(showLine);
		setShowMarker(showMarker);
		setIndex(index);
		setFill(fill);
		setFillColor(fillColor);
		setFillAlpha(fillAlpha);
		setFillAndStroke(fillAndStroke);
		setDisableStack(disableStack);
		setNeighborThreshold(neighborThreshold);
		setFillToZero(fillToZero);
		setFillToValue(fillToValue);
		setFillAxis(fillAxis);
		setUseNegativeColors(useNegativeColors);
		setPointLabels(pointLabels);
		setTrendline(trendline);
	}

	public XYseries(boolean show, Xaxes xAxes, Yaxes yAxes,
			float gridBorderWidth, SeriesRenderers seriesRenderers,
			SeriesRenderer<?> seriesRenderer, String label, boolean showLabel,
			String color, String negativeColor, float lineWidth,
			LineJoins lineJoin, LineCaps lineCap, String linePattern,
			boolean shadow, int shadowAngle, float shadowOffset,
			int shadowDepth, float shadowAlpha, boolean breakOnNull,
			MarkerRenderers markerRenderers, MarkerRenderer markerRenderer,
			boolean showLine, boolean showMarker, int index, boolean fill,
			String fillColor, String fillAlpha, boolean fillAndStroke,
			boolean disableStack, int neighborThreshold, boolean fillToZero,
			int fillToValue, FillAxes fillAxis, boolean useNegativeColors,
			PointLabels pointLabels, Trendline trendline) {
		super(new DefaultXYseries());
		setShow(show);
		setXaxis(xAxes);
		setYaxis(yAxes);
		setGridBorderWidth(gridBorderWidth);
		setRenderer(seriesRenderers);
		setRendererOptions(seriesRenderer);
		setLabel(label);
		setShowLabel(showLabel);
		setColor(color);
		setNegativeColor(negativeColor);
		setLineWidth(lineWidth);
		setLineJoin(lineJoin);
		setLineCap(lineCap);
		setLinePattern(linePattern);
		setShadow(shadow);
		setShadowAngle(shadowAngle);
		setShadowOffset(shadowOffset);
		setShadowDepth(shadowDepth);
		setShadowAlpha(shadowAlpha);
		setBreakOnNull(breakOnNull);
		setMarkerRenderer(markerRenderers);
		setMarkerOptions(markerRenderer);
		setShowLine(showLine);
		setShowMarker(showMarker);
		setIndex(index);
		setFill(fill);
		setFillColor(fillColor);
		setFillAlpha(fillAlpha);
		setFillAndStroke(fillAndStroke);
		setDisableStack(disableStack);
		setNeighborThreshold(neighborThreshold);
		setFillToZero(fillToZero);
		setFillToValue(fillToValue);
		setFillAxis(fillAxis);
		setUseNegativeColors(useNegativeColors);
		setPointLabels(pointLabels);
		setTrendline(trendline);
	}

	public XYseries(boolean show, Xaxes xAxes, Yaxes yAxes,
			float gridBorderWidth, SeriesRenderers seriesRenderers,
			SeriesRenderer<?> seriesRenderer, String label, boolean showLabel,
			String color, String negativeColor, float lineWidth,
			LineJoins lineJoin, LineCaps lineCap, int[] linePattern,
			boolean shadow, int shadowAngle, float shadowOffset,
			int shadowDepth, float shadowAlpha, boolean breakOnNull,
			MarkerRenderers markerRenderers, MarkerRenderer markerRenderer,
			boolean showLine, boolean showMarker, int index, boolean fill,
			String fillColor, String fillAlpha, boolean fillAndStroke,
			boolean disableStack, int neighborThreshold, boolean fillToZero,
			int fillToValue, FillAxes fillAxis, boolean useNegativeColors,
			PointLabels pointLabels, Trendline trendline) {
		super(new DefaultXYseries());
		setShow(show);
		setXaxis(xAxes);
		setYaxis(yAxes);
		setGridBorderWidth(gridBorderWidth);
		setRenderer(seriesRenderers);
		setRendererOptions(seriesRenderer);
		setLabel(label);
		setShowLabel(showLabel);
		setColor(color);
		setNegativeColor(negativeColor);
		setLineWidth(lineWidth);
		setLineJoin(lineJoin);
		setLineCap(lineCap);
		setLinePattern(linePattern);
		setShadow(shadow);
		setShadowAngle(shadowAngle);
		setShadowOffset(shadowOffset);
		setShadowDepth(shadowDepth);
		setShadowAlpha(shadowAlpha);
		setBreakOnNull(breakOnNull);
		setMarkerRenderer(markerRenderers);
		setMarkerOptions(markerRenderer);
		setShowLine(showLine);
		setShowMarker(showMarker);
		setIndex(index);
		setFill(fill);
		setFillColor(fillColor);
		setFillAlpha(fillAlpha);
		setFillAndStroke(fillAndStroke);
		setDisableStack(disableStack);
		setNeighborThreshold(neighborThreshold);
		setFillToZero(fillToZero);
		setFillToValue(fillToValue);
		setFillAxis(fillAxis);
		setUseNegativeColors(useNegativeColors);
		setPointLabels(pointLabels);
		setTrendline(trendline);
	}

	@Override
	public String getName() {
		return (xaxis.getAxis() + yaxis.getAxis());
	}

	public boolean getShow() {
		return show;
	}

	public XYseries setShow(boolean show) {
		this.show = show;
		return this;
	}

	public Xaxes getXaxis() {
		return xaxis;
	}

	public XYseries setXaxis(Xaxes xaxis) {
		this.xaxis = xaxis;
		return this;
	}

	public Yaxes getYaxis() {
		return yaxis;
	}

	public XYseries setYaxis(Yaxes yaxis) {
		this.yaxis = yaxis;
		return this;
	}

	public float getGridBorderWidth() {
		return gridBorderWidth;
	}

	public XYseries setGridBorderWidth(float gridBorderWidth) {
		this.gridBorderWidth = gridBorderWidth;
		return this;
	}

	public SeriesRenderers getRenderer() {
		return renderer;
	}

	public XYseries setRenderer(SeriesRenderers seriesRenderers) {
		if (!seriesRenderers.equals(this.renderer)) {
			rendererOptions = DefaultXYseries.RENDERER_OPTIONS;
		}
		this.renderer = seriesRenderers;
		return this;
	}

	public SeriesRenderer<?> getRendererOptions() {
		return rendererOptions;
	}

	public XYseries setRendererOptions(SeriesRenderer<?> seriesRenderer) {
		if (seriesRenderer instanceof BarRenderer) {
			setRenderer(SeriesRenderers.BAR);
		} else if (seriesRenderer instanceof BlockRenderer) {
			setRenderer(SeriesRenderers.BLOCK);
		} else if (seriesRenderer instanceof BubbleRenderer) {
			setRenderer(SeriesRenderers.BUBBLE);
		} else if (seriesRenderer instanceof DonutRenderer) {
			setRenderer(SeriesRenderers.DONUT);
		} else if (seriesRenderer instanceof LineRenderer) {
			setRenderer(SeriesRenderers.LINE);
		} else if (seriesRenderer instanceof PieRenderer) {
			setRenderer(SeriesRenderers.PIE);
		} else if (seriesRenderer instanceof OhlcRenderer) {
			setRenderer(SeriesRenderers.OHLC);
		} else if (seriesRenderer instanceof PyramidRenderer) {
			setRenderer(SeriesRenderers.PYRAMID);
		}
		this.rendererOptions = seriesRenderer;
		return this;
	}

	public String getLabel() {
		return label;
	}

	public XYseries setLabel(String label) {
		this.label = label;
		return this;
	}

	public boolean getShowLabel() {
		return showLabel;
	}

	public XYseries setShowLabel(boolean showLabel) {
		this.showLabel = showLabel;
		return this;
	}

	public String getColor() {
		return color;
	}

	public XYseries setColor(String color) {
		this.color = color;
		return this;
	}

	public String getNegativeColor() {
		return negativeColor;
	}

	public XYseries setNegativeColor(String negativeColor) {
		this.negativeColor = negativeColor;
		return this;
	}

	public float getLineWidth() {
		return lineWidth;
	}

	public XYseries setLineWidth(float lineWidth) {
		this.lineWidth = lineWidth;
		return this;
	}

	public LineJoins getLineJoin() {
		return lineJoin;
	}

	public XYseries setLineJoin(LineJoins lineJoin) {
		this.lineJoin = lineJoin;
		return this;
	}

	public LineCaps getLineCap() {
		return lineCap;
	}

	public XYseries setLineCap(LineCaps lineCap) {
		this.lineCap = lineCap;
		return this;
	}

	public Object getLinePattern() {
		return linePattern;
	}

	public XYseries setLinePattern(LinePatterns linePattern) {
		this.linePattern = linePattern;
		return this;
	}

	public XYseries setLinePattern(String linePattern) {
		this.linePattern = linePattern;
		return this;
	}

	public XYseries setLinePattern(int... linePattern) {
		this.linePattern = Arrays.toString(linePattern);
		return this;
	}

	public boolean getShadow() {
		return shadow;
	}

	public XYseries setShadow(boolean shadow) {
		this.shadow = shadow;
		return this;
	}

	public int getShadowAngle() {
		return shadowAngle;
	}

	public XYseries setShadowAngle(int shadowAngle) {
		this.shadowAngle = shadowAngle;
		return this;
	}

	public float getShadowOffset() {
		return shadowOffset;
	}

	public XYseries setShadowOffset(float shadowOffset) {
		this.shadowOffset = shadowOffset;
		return this;
	}

	public int getShadowDepth() {
		return shadowDepth;
	}

	public XYseries setShadowDepth(int shadowDepth) {
		this.shadowDepth = shadowDepth;
		return this;
	}

	public float getShadowAlpha() {
		return shadowAlpha;
	}

	public XYseries setShadowAlpha(float shadowAlpha) {
		this.shadowAlpha = shadowAlpha;
		return this;
	}

	public boolean getBreakOnNull() {
		return breakOnNull;
	}

	public XYseries setBreakOnNull(boolean breakOnNull) {
		this.breakOnNull = breakOnNull;
		return this;
	}

	public MarkerRenderers getMarkerRenderer() {
		return markerRenderer;
	}

	public XYseries setMarkerRenderer(MarkerRenderers markerRenderers) {
		if (!markerRenderers.equals(this.markerRenderer)) {
			markerOptions = DefaultXYseries.MARKER_OPTIONS;
		}
		this.markerRenderer = markerRenderers;
		return this;
	}

	public MarkerRenderer getMarkerOptions() {
		return markerOptions;
	}

	public XYseries setMarkerOptions(MarkerRenderer markerRenderer) {
		this.markerOptions = markerRenderer;
		return this;
	}

	public boolean getShowLine() {
		return showLine;
	}

	public XYseries setShowLine(boolean showLine) {
		this.showLine = showLine;
		return this;
	}

	public boolean getShowMarker() {
		return showMarker;
	}

	public XYseries setShowMarker(boolean showMarker) {
		this.showMarker = showMarker;
		return this;
	}

	public int getIndex() {
		return index;
	}

	public XYseries setIndex(int index) {
		this.index = index;
		return this;
	}

	public boolean getFill() {
		return fill;
	}

	public XYseries setFill(boolean fill) {
		this.fill = fill;
		return this;
	}

	public String getFillColor() {
		return fillColor;
	}

	public XYseries setFillColor(String fillColor) {
		this.fillColor = fillColor;
		return this;
	}

	public String getFillAlpha() {
		return fillAlpha;
	}

	public XYseries setFillAlpha(String fillAlpha) {
		this.fillAlpha = fillAlpha;
		return this;
	}

	public boolean getFillAndStroke() {
		return fillAndStroke;
	}

	public XYseries setFillAndStroke(boolean fillAndStroke) {
		this.fillAndStroke = fillAndStroke;
		return this;
	}

	public boolean getDisableStack() {
		return disableStack;
	}

	public XYseries setDisableStack(boolean disableStack) {
		this.disableStack = disableStack;
		return this;
	}

	public int getNeighborThreshold() {
		return neighborThreshold;
	}

	public XYseries setNeighborThreshold(int neighborThreshold) {
		this.neighborThreshold = neighborThreshold;
		return this;
	}

	public boolean getFillToZero() {
		return fillToZero;
	}

	public XYseries setFillToZero(boolean fillToZero) {
		this.fillToZero = fillToZero;
		return this;
	}

	public int getFillToValue() {
		return fillToValue;
	}

	public XYseries setFillToValue(int fillToValue) {
		this.fillToValue = fillToValue;
		return this;
	}

	public FillAxes getFillAxis() {
		return fillAxis;
	}

	public XYseries setFillAxis(FillAxes fillAxis) {
		this.fillAxis = fillAxis;
		return this;
	}

	public boolean getUseNegativeColors() {
		return useNegativeColors;
	}

	public XYseries setUseNegativeColors(boolean useNegativeColors) {
		this.useNegativeColors = useNegativeColors;
		return this;
	}

	public PointLabels getPointLabels() {
		return pointLabels;
	}

	public XYseries setPointLabels(PointLabels pointLabels) {
		this.pointLabels = pointLabels;
		return this;
	}

	public Trendline getTrendline() {
		return trendline;
	}

	public XYseries setTrendline(Trendline trendline) {
		this.trendline = trendline;
		return this;
	}

	@Override
	public String getValue() {
		return JsonHelper.toJsonString(this);
	}

}
