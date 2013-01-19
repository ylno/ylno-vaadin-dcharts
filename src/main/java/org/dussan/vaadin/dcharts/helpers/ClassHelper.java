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
package org.dussan.vaadin.dcharts.helpers;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ClassHelper {

	private static String convert2fieldName(String fieldName) {
		String[] values = fieldName.split("_");
		StringBuilder name = new StringBuilder(values[0].toLowerCase());
		for (int i = 1; i < values.length; i++) {
			name.append(values[i].substring(0, 1).toUpperCase()
					+ values[i].substring(1).toLowerCase());
		}
		return name.toString();
	}

	public static Map<String, Object> getStaticFieldValues(Object object) {
		Map<String, Object> values = new HashMap<String, Object>();
		Field[] fields = object.getClass().getDeclaredFields();
		for (Field field : fields) {
			String fieldName = convert2fieldName(field.getName());
			if (!fieldName.equals("serialVersionUID")
					&& !field.getType().equals(object.getClass())) {
				field.setAccessible(true);
				try {
					values.put(fieldName, field.get(null));
				} catch (Exception e) {
					values.put(fieldName, null);
				}
				field.setAccessible(false);
			}
		}

		if (object.getClass().getSuperclass() != null
				&& object.getClass().getSuperclass().getDeclaredFields() != null
				&& object.getClass().getSuperclass().getDeclaredFields().length > 0) {
			fields = object.getClass().getSuperclass().getDeclaredFields();
			for (Field field : fields) {
				String fieldName = convert2fieldName(field.getName());
				if (!fieldName.equals("serialVersionUID")) {
					field.setAccessible(true);
					try {
						values.put(fieldName, field.get(null));
					} catch (Exception e) {
						values.put(fieldName, null);
					}
					field.setAccessible(false);
				}
			}
		}

		return values;
	}

	public static Map<String, Object> getFieldValues(Object object) {
		Map<String, Object> values = new HashMap<String, Object>();
		Field[] fields = object.getClass().getDeclaredFields();
		for (Field field : fields) {
			String fieldName = field.getName();
			if (!"serialVersionUID".equals(fieldName)
					&& !"defaultValues".equals(fieldName)
					&& !field.getType().equals(object.getClass())) {
				field.setAccessible(true);
				try {
					values.put(fieldName, field.get(object));
				} catch (Exception e) {
					values.put(fieldName, null);
				}
				field.setAccessible(false);
			}
		}

		if (object.getClass().getSuperclass() != null
				&& object.getClass().getSuperclass().getDeclaredFields() != null
				&& object.getClass().getSuperclass().getDeclaredFields().length > 0) {
			fields = object.getClass().getSuperclass().getDeclaredFields();
			for (Field field : fields) {
				String fieldName = field.getName();
				if (!"serialVersionUID".equals(fieldName)
						&& !"defaultValues".equals(fieldName)) {
					field.setAccessible(true);
					try {
						values.put(
								fieldName,
								field.get(object.getClass().getSuperclass()
										.cast(object)));
					} catch (Exception e) {
						values.put(fieldName, null);
					}
					field.setAccessible(false);
				}
			}
		}

		return values;
	}

	public static void setFieldValue(Object object, String fieldName,
			Object fieldValue) {
		try {
			Field field = object.getClass().getDeclaredField(fieldName);
			field.setAccessible(true);
			field.set(object, fieldValue);
			field.setAccessible(false);
		} catch (Exception e) {
			try {
				Field field = object.getClass().getSuperclass()
						.getDeclaredField(fieldName);
				field.setAccessible(true);
				field.set(object.getClass().getSuperclass().cast(object),
						fieldValue);
				field.setAccessible(false);
			} catch (Exception ex) {
			}
		}
	}

}
