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
import org.dussan.vaadin.dcharts.base.renderers.AxisRenderer;
import org.dussan.vaadin.dcharts.base.renderers.LabelRenderer;
import org.dussan.vaadin.dcharts.base.renderers.TickRenderer;
import org.dussan.vaadin.dcharts.data.Ticks;
import org.dussan.vaadin.dcharts.defaults.DefaultXYaxis;
import org.dussan.vaadin.dcharts.defaults.DefaultAxisDefaults;
import org.dussan.vaadin.dcharts.helpers.JsonHelper;
import org.dussan.vaadin.dcharts.metadata.XYaxes;
import org.dussan.vaadin.dcharts.metadata.renderers.AxisRenderers;
import org.dussan.vaadin.dcharts.metadata.renderers.LabelRenderers;
import org.dussan.vaadin.dcharts.metadata.renderers.TickRenderers;
import org.dussan.vaadin.dcharts.metadata.ticks.TickFormatters;
import org.dussan.vaadin.dcharts.renderers.axis.CategoryAxisRenderer;
import org.dussan.vaadin.dcharts.renderers.axis.DateAxisRenderer;
import org.dussan.vaadin.dcharts.renderers.axis.LinearAxisRenderer;
import org.dussan.vaadin.dcharts.renderers.axis.LogAxisRenderer;
import org.dussan.vaadin.dcharts.renderers.axis.PyramidAxisRenderer;
import org.dussan.vaadin.dcharts.renderers.label.AxisLabelRenderer;
import org.dussan.vaadin.dcharts.renderers.label.CanvasAxisLabelRenderer;
import org.dussan.vaadin.dcharts.renderers.tick.AxisTickRenderer;
import org.dussan.vaadin.dcharts.renderers.tick.CanvasAxisTickRenderer;

public class AxesDefaults extends Option<AxesDefaults> {

	private static final long serialVersionUID = 5922536734600790267L;
	private Boolean show = null;
	private XYaxes name = null;
	private TickRenderers tickRenderer = null;
	private TickRenderer<?> tickOptions = null;
	private LabelRenderers labelRenderer = null;
	private LabelRenderer<?> labelOptions = null;
	private String label = null;
	private Boolean showLabel = null;
	private Object min = null;
	private Object max = null;
	private Boolean autoscale = null;
	private Float pad = null;
	private Float padMax = null;
	private Float padMin = null;
	private Ticks ticks = null;
	private Integer numberTicks = null;
	private Float tickInterval = null;
	private AxisRenderers renderer = null;
	private AxisRenderer<?> rendererOptions = null;
	private Boolean showTicks = null;
	private Boolean showTickMarks = null;
	private Boolean showMinorTicks = null;
	private Boolean drawMajorGridlines = null;
	private Boolean drawMinorGridlines = null;
	private Boolean drawMajorTickMarks = null;
	private Boolean drawMinorTickMarks = null;
	private Boolean useSeriesColor = null;
	private Float borderWidth = null;
	private String borderColor = null;
	private Boolean syncTicks = null;
	private Integer tickSpacing = null;

	public AxesDefaults() {
		super(new DefaultAxisDefaults());
		setRenderer(DefaultAxisDefaults.RENDERER);
	}

	public AxesDefaults(XYaxes xyAxes, boolean show,
			TickRenderers tickRenderers, TickRenderer<?> tickRenderer,
			LabelRenderers labelRenderers, LabelRenderer<?> labelRenderer,
			String label, boolean showLabel, Object min, Object max,
			boolean autoscale, float pad, float padMax, float padMin,
			Ticks ticks, int numberTicks, float tickInterval,
			AxisRenderers axisRenderers, AxisRenderer<?> axisRenderer,
			boolean showTicks, boolean showTickMarks, boolean showMinorTicks,
			boolean drawMajorGridlines, boolean drawMinorGridlines,
			boolean drawMajorTickMarks, boolean drawMinorTickMarks,
			boolean useSeriesColor, float borderWidth, String borderColor,
			boolean syncTicks, int tickSpacing) {
		super(new DefaultAxisDefaults());
		setShow(show);
		setAxis(xyAxes);
		setTickRenderer(tickRenderers);
		setTickOptions(tickRenderer);
		setLabelRenderer(labelRenderers);
		setLabelOptions(labelRenderer);
		setLabel(label);
		setShowLabel(showLabel);
		setMin(min);
		setMax(max);
		setAutoscale(autoscale);
		setPad(pad);
		setPadMax(padMax);
		setPadMin(padMin);
		setTicks(ticks);
		setNumberTicks(numberTicks);
		setTickInterval(tickInterval);
		setRenderer(axisRenderers);
		setRendererOptions(axisRenderer);
		setShowTicks(showTicks);
		setShowTickMarks(showTickMarks);
		setShowMinorTicks(showMinorTicks);
		setDrawMajorGridlines(drawMajorGridlines);
		setDrawMinorGridlines(drawMinorGridlines);
		setDrawMajorTickMarks(drawMajorTickMarks);
		setDrawMinorTickMarks(drawMinorTickMarks);
		setUseSeriesColor(useSeriesColor);
		setBorderWidth(borderWidth);
		setBorderColor(borderColor);
		setSyncTicks(syncTicks);
		setTickSpacing(tickSpacing);

		if (getRenderer() == null) {
			setRenderer(DefaultAxisDefaults.RENDERER);
		}
	}

	public XYaxes getAxis() {
		return name;
	}

	public AxesDefaults setAxis(XYaxes xyAxes) {
		this.name = xyAxes;
		return this;
	}

	public boolean getShow() {
		return show;
	}

	public AxesDefaults setShow(boolean show) {
		this.show = show;
		return this;
	}

	public TickRenderers getTickRenderer() {
		return tickRenderer;
	}

	public AxesDefaults setTickRenderer(TickRenderers tickRenderers) {
		if (!tickRenderers.getRenderer().equals(this.tickRenderer)) {
			this.tickOptions = DefaultXYaxis.TICK_OPTIONS;
		}
		this.tickRenderer = tickRenderers;
		return this;
	}

	public TickRenderer<?> getTickOptions() {
		return tickOptions;
	}

	public AxesDefaults setTickOptions(TickRenderer<?> tickRenderer) {
		if (tickRenderer instanceof AxisTickRenderer) {
			setTickRenderer(TickRenderers.AXIS);
		} else if (tickRenderer instanceof CanvasAxisTickRenderer) {
			setTickRenderer(TickRenderers.CANVAS);
		}
		this.tickOptions = tickRenderer;
		return this;
	}

	public LabelRenderers getLabelRenderer() {
		return labelRenderer;
	}

	public AxesDefaults setLabelRenderer(LabelRenderers labelRenderers) {
		if (!labelRenderers.equals(this.labelRenderer)) {
			this.labelOptions = DefaultXYaxis.LABEL_OPTIONS;
		}
		this.labelRenderer = labelRenderers;
		return this;
	}

	public LabelRenderer<?> getLabelOptions() {
		return labelOptions;
	}

	public AxesDefaults setLabelOptions(LabelRenderer<?> labelRenderer) {
		if (labelRenderer instanceof AxisLabelRenderer) {
			setLabelRenderer(LabelRenderers.AXIS);
		} else if (labelRenderer instanceof CanvasAxisLabelRenderer) {
			setLabelRenderer(LabelRenderers.CANVAS);
		}
		this.labelOptions = labelRenderer;
		return this;
	}

	public String getLabel() {
		return label;
	}

	public AxesDefaults setLabel(String label) {
		this.label = label;
		return this;
	}

	public boolean getShowLabel() {
		return showLabel;
	}

	public AxesDefaults setShowLabel(boolean showLabel) {
		this.showLabel = showLabel;
		return this;
	}

	public Object getMin() {
		return min;
	}

	public AxesDefaults setMin(Object min) {
		this.min = min;
		return this;
	}

	public Object getMax() {
		return max;
	}

	public AxesDefaults setMax(Object max) {
		this.max = max;
		return this;
	}

	public boolean getAutoscale() {
		return autoscale;
	}

	public AxesDefaults setAutoscale(boolean autoscale) {
		this.autoscale = autoscale;
		return this;
	}

	public float getPad() {
		return pad;
	}

	public AxesDefaults setPad(float pad) {
		this.pad = pad;
		return this;
	}

	public float getPadMax() {
		return padMax;
	}

	public AxesDefaults setPadMax(float padMax) {
		this.padMax = padMax;
		return this;
	}

	public float getPadMin() {
		return padMin;
	}

	public AxesDefaults setPadMin(float padMin) {
		this.padMin = padMin;
		return this;
	}

	public Ticks getTicks() {
		return ticks;
	}

	public AxesDefaults setTicks(Ticks ticks) {
		this.ticks = ticks;
		return this;
	}

	public int getNumberTicks() {
		return numberTicks;
	}

	public AxesDefaults setNumberTicks(int numberTicks) {
		this.numberTicks = numberTicks;
		return this;
	}

	public float getTickInterval() {
		return tickInterval;
	}

	public AxesDefaults setTickInterval(float tickInterval) {
		this.tickInterval = tickInterval;
		return this;
	}

	public AxisRenderers getRenderer() {
		return renderer;
	}

	public AxesDefaults setRenderer(AxisRenderers axisRenderers) {
		if (!axisRenderers.equals(this.renderer)) {
			rendererOptions = DefaultXYaxis.RENDERER_OPTIONS;
		}

		if (axisRenderers.equals(AxisRenderers.DATE)) {
			if (tickRenderer == null || tickRenderer.equals(TickRenderers.AXIS)) {
				tickOptions = new AxisTickRenderer()
						.setFormatter(TickFormatters.DATE);
			} else if (tickRenderer.equals(TickRenderers.CANVAS)) {
				tickOptions = new CanvasAxisTickRenderer()
						.setFormatter(TickFormatters.DATE);
			}
		}

		this.renderer = axisRenderers;
		return this;
	}

	public AxisRenderer<?> getRendererOptions() {
		return rendererOptions;
	}

	public AxesDefaults setRendererOptions(AxisRenderer<?> axisRenderer) {
		if (axisRenderer instanceof CategoryAxisRenderer) {
			setRenderer(AxisRenderers.CATEGORY);
		} else if (axisRenderer instanceof DateAxisRenderer) {
			setRenderer(AxisRenderers.DATE);
		} else if (axisRenderer instanceof LinearAxisRenderer) {
			setRenderer(AxisRenderers.LINEAR);
		} else if (axisRenderer instanceof LogAxisRenderer) {
			setRenderer(AxisRenderers.LOG);
		} else if (axisRenderer instanceof PyramidAxisRenderer) {
			setRenderer(AxisRenderers.PYRAMID);
		}
		this.rendererOptions = axisRenderer;
		return this;
	}

	public boolean getShowTicks() {
		return showTicks;
	}

	public AxesDefaults setShowTicks(boolean showTicks) {
		this.showTicks = showTicks;
		return this;
	}

	public boolean getShowTickMarks() {
		return showTickMarks;
	}

	public AxesDefaults setShowTickMarks(boolean showTickMarks) {
		this.showTickMarks = showTickMarks;
		return this;
	}

	public boolean getShowMinorTicks() {
		return showMinorTicks;
	}

	public AxesDefaults setShowMinorTicks(boolean showMinorTicks) {
		this.showMinorTicks = showMinorTicks;
		return this;
	}

	public boolean getDrawMajorGridlines() {
		return drawMajorGridlines;
	}

	public AxesDefaults setDrawMajorGridlines(boolean drawMajorGridlines) {
		this.drawMajorGridlines = drawMajorGridlines;
		return this;
	}

	public boolean getDrawMinorGridlines() {
		return drawMinorGridlines;
	}

	public AxesDefaults setDrawMinorGridlines(boolean drawMinorGridlines) {
		this.drawMinorGridlines = drawMinorGridlines;
		return this;
	}

	public boolean getDrawMajorTickMarks() {
		return drawMajorTickMarks;
	}

	public AxesDefaults setDrawMajorTickMarks(boolean drawMajorTickMarks) {
		this.drawMajorTickMarks = drawMajorTickMarks;
		return this;
	}

	public boolean getDrawMinorTickMarks() {
		return drawMinorTickMarks;
	}

	public AxesDefaults setDrawMinorTickMarks(boolean drawMinorTickMarks) {
		this.drawMinorTickMarks = drawMinorTickMarks;
		return this;
	}

	public boolean getUseSeriesColor() {
		return useSeriesColor;
	}

	public AxesDefaults setUseSeriesColor(boolean useSeriesColor) {
		this.useSeriesColor = useSeriesColor;
		return this;
	}

	public float getBorderWidth() {
		return borderWidth;
	}

	public AxesDefaults setBorderWidth(float borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public AxesDefaults setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	public boolean getSyncTicks() {
		return syncTicks;
	}

	public AxesDefaults setSyncTicks(boolean syncTicks) {
		this.syncTicks = syncTicks;
		return this;
	}

	public int getTickSpacing() {
		return tickSpacing;
	}

	public AxesDefaults setTickSpacing(int tickSpacing) {
		this.tickSpacing = tickSpacing;
		return this;
	}

	@Override
	public String getValue() {
		String jsonString = JsonHelper.toJsonString(this);
		return (jsonString.contains(",") ? jsonString : null);
	}

}
