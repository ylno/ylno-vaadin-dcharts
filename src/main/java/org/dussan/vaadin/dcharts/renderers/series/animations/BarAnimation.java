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
package org.dussan.vaadin.dcharts.renderers.series.animations;

import org.dussan.vaadin.dcharts.base.elements.Animation;
import org.dussan.vaadin.dcharts.defaults.renderers.animations.DefaultBarAnimation;
import org.dussan.vaadin.dcharts.metadata.directions.AnimationDirections;

public class BarAnimation extends Animation<BarAnimation> {

	private static final long serialVersionUID = 8089742669250187604L;

	public BarAnimation() {
		super(new DefaultBarAnimation());
		setShow(true);
	}

	public BarAnimation(Boolean show, AnimationDirections animationDirections,
			Integer speed) {
		super(new DefaultBarAnimation());
		setShow(show);
		setDirection(animationDirections);
		setSpeed(speed);
	}

}
