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
package org.dussan.vaadin.dcharts.metadata;

public enum FontWeights {

	BOLD("bold"), //
	BOLDER("bolder"), //
	LIGHTER("lighter"), //
	NORMAL("normal"), //
	WEIGHT_100(100), //
	WEIGHT_150(150), //
	WEIGHT_200(200), //
	WEIGHT_250(250), //
	WEIGHT_300(300), //
	WEIGHT_350(350), //
	WEIGHT_400(400), //
	WEIGHT_450(450), //
	WEIGHT_500(500), //
	WEIGHT_550(550), //
	WEIGHT_600(600), //
	WEIGHT_650(650), //
	WEIGHT_700(700), //
	WEIGHT_750(750), //
	WEIGHT_800(800), //
	WEIGHT_850(850), //
	WEIGHT_900(900);

	private Object weight;

	private FontWeights(Object weight) {
		this.weight = weight;
	}

	public Object getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return getWeight().toString();
	}

}
