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
package org.dussan.vaadin.dcharts.client.events;

public class EventObject {

	private String id = null;
	private String event = null;
	private String data = null;

	public EventObject(String id, String event, String data) {
		this.id = id;
		this.event = event;
		this.data = data;
	}

	@Override
	public boolean equals(Object obj) {
		EventObject eventObject = (EventObject) obj;
		return (id.equals(eventObject.id) && event.equals(eventObject.event)
				&& !event.endsWith("Click") && data.equals(eventObject.data));
	}

}
