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
package org.dussan.vaadin.dcharts.client.js.injector;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.HeadElement;
import com.google.gwt.dom.client.ScriptElement;

public class JavaScriptInjector {

	private static HeadElement head;

	public static void inject(String javascript) {
		HeadElement head = getHead();
		ScriptElement element = createScriptElement();
		element.setText(javascript);
		head.appendChild(element);
	}

	private static HeadElement getHead() {
		if (head == null) {
			Element element = Document.get().getElementsByTagName("head")
					.getItem(0);

			assert (element != null) : "HTML Head element required";

			HeadElement head = HeadElement.as(element);
			JavaScriptInjector.head = head;
		}
		return JavaScriptInjector.head;
	}

	private static ScriptElement createScriptElement() {
		ScriptElement script = Document.get().createScriptElement();
		script.setAttribute("language", "javascript");
		return script;
	}

	public static native boolean isJQueryLibraryLoaded()
	/*-{
		if($wnd.jQuery){return true;}
		return false;
	}-*/;

	public static native boolean isJqPlotLibraryLoaded()
	/*-{
		if($wnd.jQuery.jqplot){return true;}
		return false;
	}-*/;

	public static native boolean isBarRendererLoaded()
	/*-{
		if($wnd.jQuery.jqplot.BarRenderer){return true;}
		return false;
	}-*/;

	public static native boolean isBlockRendererLoaded()
	/*-{
		if($wnd.jQuery.jqplot.BlockRenderer){return true;}
		return false;
	}-*/;

	public static native boolean isBubbleRendererLoaded()
	/*-{
		if($wnd.jQuery.jqplot.BubbleRenderer){return true;}
		return false;
	}-*/;

	public static native boolean isCategoryAxisRendererLoaded()
	/*-{
		if($wnd.jQuery.jqplot.CategoryAxisRenderer){return true;}
		return false;
	}-*/;

	public static native boolean isCanvasAxisLabelRendererLoaded()
	/*-{
		if($wnd.jQuery.jqplot.CanvasAxisLabelRenderer){return true;}
		return false;
	}-*/;

	public static native boolean isCanvasAxisTickRendererLoaded()
	/*-{
		if($wnd.jQuery.jqplot.CanvasAxisTickRenderer){return true;}
		return false;
	}-*/;

	public static native boolean isCanvasOverlayLibraryLoaded()
	/*-{
		if($wnd.jQuery.jqplot.CanvasOverlay){return true;}
		return false;
	}-*/;

	public static native boolean isCursorLibraryLoaded()
	/*-{
		if($wnd.jQuery.jqplot.Cursor){return true;}
		return false;
	}-*/;

	public static native boolean isDateAxisRendererLoaded()
	/*-{
		if($wnd.jQuery.jqplot.DateAxisRenderer){return true;}
		return false;
	}-*/;

	public static native boolean isDonutRendererLoaded()
	/*-{
		if($wnd.jQuery.jqplot.DonutRenderer){return true;}
		return false;
	}-*/;

	public static native boolean isEnhancedLegendRendererLoaded()
	/*-{
		if($wnd.jQuery.jqplot.EnhancedLegendRenderer){return true;}
		return false;
	}-*/;

	public static native boolean isHighlighterLibraryLoaded()
	/*-{
		if($wnd.jQuery.jqplot.Highlighter){return true;}
		return false;
	}-*/;

	public static native boolean isLogAxisRendererLoaded()
	/*-{
		if($wnd.jQuery.jqplot.LogAxisRenderer){return true;}
		return false;
	}-*/;

	public static native boolean isMeterGaugeRendererLoaded()
	/*-{
		if($wnd.jQuery.jqplot.MeterGaugeRenderer){return true;}
		return false;
	}-*/;

	public static native boolean isPieRendererLoaded()
	/*-{
		if($wnd.jQuery.jqplot.PieRenderer){return true;}
		return false;
	}-*/;

	public static native boolean isPointLabelsLibraryLoaded()
	/*-{
		if($wnd.jQuery.jqplot.PointLabels){return true;}
		return false;
	}-*/;

	public static native boolean isPyramidAxisRendererLoaded()
	/*-{
		if($wnd.jQuery.jqplot.PyramidAxisRenderer){return true;}
		return false;
	}-*/;

	public static native boolean isPyramidGridRendererLoaded()
	/*-{
		if($wnd.jQuery.jqplot.PyramidGridRenderer){return true;}
		return false;
	}-*/;

	public static native boolean isPyramidRendererLoaded()
	/*-{
		if($wnd.jQuery.jqplot.PyramidRenderer){return true;}
		return false;
	}-*/;

	public static native boolean isOHLCRendererLoaded()
	/*-{
		if($wnd.jQuery.jqplot.OHLCRenderer){return true;}
		return false;
	}-*/;

	public static native boolean isTrendlineLibraryLoaded()
	/*-{
		if($wnd.jQuery.jqplot.Trendline){return true;}
		return false;
	}-*/;

}
