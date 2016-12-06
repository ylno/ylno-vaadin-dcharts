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
package org.dussan.vaadin.dcharts.helpers;

import java.util.Map;
import java.util.Map.Entry;

public class JsonHelper {

	public JsonHelper() {
	}

	public static String toJsonString(Object object) {
		try {
			Map<String, Object> values = ClassHelper.getFieldValues(object);
			StringBuilder builder = new StringBuilder();
			for (Entry<String, Object> entry : values.entrySet()) {
				String fieldName = entry.getKey();
				Object fieldValue = entry.getValue();

				if (ObjectHelper.isArray(fieldValue)) {
					if (fieldValue instanceof Object[][]) {
						fieldValue = ObjectHelper
								.toArrayString((Object[][]) fieldValue);
					} else {
						fieldValue = ObjectHelper
								.toArrayString((Object[]) fieldValue);
					}
				}

				if (fieldValue != null) {
					fieldValue = !ObjectHelper.isString(fieldValue) ? fieldValue
							: fieldValue.toString().replaceAll("\"", "'");
					builder.append(builder.length() > 0 ? ", " : "");
					builder.append(fieldName + ": ");
					builder.append(ObjectHelper.isString(fieldValue) ? "\""
							: "");
					builder.append(fieldValue);
					builder.append(ObjectHelper.isString(fieldValue) ? "\""
							: "");
				}
			}
			return builder.insert(0, "{").append("}").toString();
		} catch (Exception e) {
			return null;
		}
	}

}
