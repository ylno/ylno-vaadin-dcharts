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
package org.dussan.vaadin.dcharts.client.handlers;

import org.dussan.vaadin.dcharts.client.ui.VDCharts;

public class ResizeHandler {

	public static native void activate(VDCharts c, boolean activate)
	/*-{
		$wnd.jQuery($doc).ready(function($){
			var resizeTimer = null;
			if (activate) {
				$wnd.jQuery($wnd).bind('resize', function() {
				    if (resizeTimer) {
				    	clearTimeout(resizeTimer);
				    }
				    resizeTimer = setTimeout(function() {
				    	c.@org.dussan.vaadin.dcharts.client.ui.VDCharts::refreshChart()();
				    }, 100);
				});
			} else {
				$wnd.jQuery($wnd).unbind('resize');
			}
		});
	}-*/;

}
