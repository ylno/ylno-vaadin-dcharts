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
			
			assert element != null : "HTML Head element required";
			
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

}
