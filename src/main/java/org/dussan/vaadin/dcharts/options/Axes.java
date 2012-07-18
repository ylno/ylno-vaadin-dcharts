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
package org.dussan.vaadin.dcharts.options;

import java.util.ArrayList;
import java.util.List;

import org.dussan.vaadin.dcharts.base.elements.Option;
import org.dussan.vaadin.dcharts.base.elements.XYaxis;
import org.dussan.vaadin.dcharts.metadata.XYaxes;

public class Axes extends Option<Axes> {

	private static final long serialVersionUID = 6276609388835099826L;
	private List<XYaxis> axes = null;

	public Axes() {
		axes = new ArrayList<XYaxis>();
	}

	public List<XYaxis> getAxes() {
		return axes;
	}

	public XYaxis getAxis(XYaxes axis) {
		for (XYaxis xyAxis : axes) {
			if (xyAxis.getAxis().equals(axis)) {
				return xyAxis;
			}
		}
		return null;
	}

	public Axes addAxis(XYaxis xyAxis) {
		axes.add(xyAxis);
		return this;
	}

	@Override
	public String getValue() {
		StringBuilder value = new StringBuilder();
		for (XYaxis xyAxis : axes) {
			value.append(value.length() > 0 ? ", " : "");
			value.append(xyAxis.getName() + ": ");
			value.append(xyAxis.getValue());
		}

		return (value.length() > 0 ? value.insert(0, "{").append("}")
				.toString() : null);
	}

}
