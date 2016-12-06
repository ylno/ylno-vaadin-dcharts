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

import java.io.Serializable;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.jar.JarInputStream;
import java.util.jar.Manifest;

public class ManifestHelper implements Serializable {

	private static final long serialVersionUID = -1377412482123878104L;

	@SuppressWarnings("resource")
	public final static Manifest getManifest() {
		try {
			URL url = ManifestHelper.class.getResource(ManifestHelper.class
					.getSimpleName() + ".class");
			URLConnection urlConnection = url.openConnection();
			urlConnection.setUseCaches(false);

			if (urlConnection instanceof JarURLConnection) {
				return ((JarURLConnection) urlConnection).getManifest();
			} else {
				Manifest manifest = new JarInputStream(
						urlConnection.getInputStream()).getManifest();
				if (manifest == null) {
					String location = url.toExternalForm();
					location = location.substring(0,
							location.indexOf("org/dussan/vaadin") - 1)
							+ "/META-INF/MANIFEST.MF";
					manifest = new Manifest(new URL(location).openStream());
				}
				return manifest;
			}
		} catch (Exception e) {
			return null;
		}
	}

}
