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
package org.dussan.vaadin.dcharts.base.elements;

import org.dussan.vaadin.dcharts.base.BaseElement;
import org.dussan.vaadin.dcharts.helpers.JsonHelper;
import org.dussan.vaadin.dcharts.metadata.directions.AnimationDirections;

@SuppressWarnings({ "serial", "unchecked" })
public class Animation<T> extends BaseElement<T> {

	private Boolean show = null;
	private AnimationDirections direction = null;
	private Integer speed = null;

	public Animation(Object defaultAnimation) {
		super(defaultAnimation);
		setShow(true);
	}

	public Animation(boolean show, AnimationDirections animationDirections,
			int speed) {
		setShow(show);
		setDirection(animationDirections);
		setSpeed(speed);
	}

	public boolean getShow() {
		return show;
	}

	public T setShow(boolean show) {
		this.show = show;
		return (T) this;
	}

	public AnimationDirections getDirection() {
		return direction;
	}

	public T setDirection(AnimationDirections animationDirections) {
		this.direction = animationDirections;
		return (T) this;
	}

	public int getSpeed() {
		return speed;
	}

	public T setSpeed(int speed) {
		this.speed = speed;
		return (T) this;
	}

	@Override
	public String getValue() {
		return JsonHelper.toJsonString(this);
	}

}
