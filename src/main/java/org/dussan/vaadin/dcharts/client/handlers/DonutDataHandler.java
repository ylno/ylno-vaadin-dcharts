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

public class DonutDataHandler {

	public static native void activateMouseEnter(VDCharts c, String id)
	/*-{
		$wnd.jQuery($doc).ready(function($){
			$wnd.jQuery('#'.concat(id)).on('jqplotDonutDataMouseEnter', function(ev, data) {
				var event = 'donutMouseEnter';
				c.@org.dussan.vaadin.dcharts.client.ui.VDCharts::fireEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)(id, event, data);
			});
		});
	}-*/;

	public static native void activateMouseLeave(VDCharts c, String id)
	/*-{
		$wnd.jQuery($doc).ready(function($){
			$wnd.jQuery('#'.concat(id)).on('jqplotDonutDataMouseLeave', function(ev, data) {
				var event = 'donutMouseLeave';
				c.@org.dussan.vaadin.dcharts.client.ui.VDCharts::fireEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)(id, event, data);
			});
		});
	}-*/;

	public static native void activateClick(VDCharts c, String id)
	/*-{
		$wnd.jQuery($doc).ready(function($){
			$wnd.jQuery('#'.concat(id)).on('jqplotDonutDataClick', function(ev, data) {
				var event = 'donutClick';
				c.@org.dussan.vaadin.dcharts.client.ui.VDCharts::fireEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)(id, event, data);
			});
		});
	}-*/;

	public static native void activateRightClick(VDCharts c, String id)
	/*-{
		$wnd.jQuery($doc).ready(function($){
			$wnd.jQuery('#'.concat(id)).on('jqplotDonutDataRightClick', function(ev, data) {
				var event = 'donutRightClick';
				c.@org.dussan.vaadin.dcharts.client.ui.VDCharts::fireEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)(id, event, data);
			});
		});
	}-*/;

}
