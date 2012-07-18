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
package org.dussan.vaadin.dcharts.base;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.dussan.vaadin.dcharts.helpers.ClassHelper;

@SuppressWarnings("serial")
public abstract class BaseElement<T> implements Serializable, Cloneable {

	private Map<String, Object> defaultValues = new HashMap<String, Object>();

	public BaseElement() {
	}

	abstract public String getValue();

	protected BaseElement(Object defaultValues) {
		this.defaultValues = ClassHelper.getStaticFieldValues(defaultValues);
	}

	public String getName() {
		return (getClass().getSimpleName().substring(0, 1).toLowerCase() + getClass()
				.getSimpleName().substring(1));
	}

	@SuppressWarnings("unchecked")
	public T setDefault(boolean replaceExistingValues) {
		try {
			Map<String, Object> values = ClassHelper.getFieldValues(this);
			for (Entry<String, Object> entry : values.entrySet()) {
				String fieldName = entry.getKey();
				Object fieldValue = entry.getValue();
				if (defaultValues.containsKey(fieldName)) {
					if (replaceExistingValues
							|| (!replaceExistingValues && fieldValue == null)) {
						ClassHelper.setFieldValue(this, fieldName,
								defaultValues.get(fieldName));
					}
				}
			}
		} catch (Exception e) {
		}
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T includeDefault() {
		try {
			Object object = this.clone();
			Map<String, Object> values = ClassHelper.getFieldValues(object);
			for (Entry<String, Object> entry : values.entrySet()) {
				String fieldName = entry.getKey();
				Object fieldValue = entry.getValue();
				if (fieldValue == null && defaultValues.containsKey(fieldName)) {
					ClassHelper.setFieldValue(object, fieldName,
							defaultValues.get(fieldName));
				}
			}
			return (T) object;
		} catch (CloneNotSupportedException e) {
			return (T) this;
		}
	}

	public boolean isEmpty() {
		return !(getValue() != null && getValue().length() > 0);
	}

	@Override
	public String toString() {
		return getValue();
	}

}
