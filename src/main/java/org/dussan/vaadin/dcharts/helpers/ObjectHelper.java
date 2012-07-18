/**
 * Copyright (C) 2012  Dušan Vejnovič  <vaadin@dussan.org>
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
package org.dussan.vaadin.dcharts.helpers;

public class ObjectHelper {

	private static boolean areAllObjectsNull(Object... objects) {
		for (Object object : objects) {
			if (object == null) {
				return true;
			}
		}
		return false;
	}

	public static boolean isArray(Object object) {
		return (object != null && object.getClass().isArray());
	}

	public static boolean isString(Object object) {
		String string = object == null ? null : object.toString();
		return (object != null
				&& (object.getClass().isEnum() || object.getClass().equals(
						String.class)) //
				&& !string.startsWith("{") && !string.startsWith("[")
				&& !string.startsWith("$w") && !string.startsWith("new $"));
	}

	public static String toArrayString(Object... objects) {
		if (objects != null && objects.length > 0
				&& !areAllObjectsNull(objects)) {
			StringBuilder value = new StringBuilder();
			value.append(ObjectHelper.isString(objects[0]) ? "\"" : "");
			value.append(objects[0]);
			value.append(ObjectHelper.isString(objects[0]) ? "\"" : "");
			for (int i = 1; i < objects.length; i++) {
				value.append(", ");
				value.append(ObjectHelper.isString(objects[i]) ? "\"" : "");
				value.append(objects[i]);
				value.append(ObjectHelper.isString(objects[i]) ? "\"" : "");
			}
			return value.insert(0, "[").append("]").toString();
		}
		return null;
	}

	public static String toArrayString(Object[][] objects) {
		if (objects != null && objects.length > 0) {
			StringBuilder value = new StringBuilder();
			for (int i = 0; i < objects.length; i++) {
				if (value.length() > 0) {
					value.append(", ");
				}
				value.append(toArrayString(objects[i]));
			}
			return value.insert(0, "[").append("]").toString();
		}
		return null;
	}

}
