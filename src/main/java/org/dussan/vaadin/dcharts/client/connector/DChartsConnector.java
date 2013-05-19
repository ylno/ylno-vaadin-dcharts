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
package org.dussan.vaadin.dcharts.client.connector;

import java.util.Map;

import org.dussan.vaadin.dcharts.DCharts;
import org.dussan.vaadin.dcharts.client.rpc.DChartsClientRPC;
import org.dussan.vaadin.dcharts.client.rpc.DChartsServerRpc;
import org.dussan.vaadin.dcharts.client.ui.VDCharts;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.ComponentConnector;
import com.vaadin.client.ConnectorHierarchyChangeEvent;
import com.vaadin.client.LayoutManager;
import com.vaadin.client.communication.RpcProxy;
import com.vaadin.client.ui.AbstractComponentContainerConnector;
import com.vaadin.client.ui.layout.ElementResizeEvent;
import com.vaadin.client.ui.layout.ElementResizeListener;
import com.vaadin.shared.ui.Connect;

@Connect(DCharts.class)
public class DChartsConnector extends AbstractComponentContainerConnector
		implements ValueChangeHandler<Object[]> {

	private static final long serialVersionUID = -5835057962150067653L;
	private DChartsServerRpc serverRpc = RpcProxy.create(
			DChartsServerRpc.class, this);

	@Override
	protected Widget createWidget() {
		return GWT.create(VDCharts.class);
	}

	@Override
	public VDCharts getWidget() {
		return (VDCharts) super.getWidget();
	}

	@Override
	protected void init() {
		super.init();

		registerRpc(DChartsClientRPC.class, new DChartsClientRPC() {
			private static final long serialVersionUID = -3966553309119744743L;

			@Override
			public void setChartId(String id) {
				getWidget().setChartId(id);
			}

			@Override
			public void setChartData(Map<Integer, String> chartData) {
				getWidget().processChartData(chartData);
			}
		});

		LayoutManager.get(getConnection()).addElementResizeListener(
				getWidget().getElement(), new ElementResizeListener() {
					@Override
					public void onElementResize(ElementResizeEvent e) {
						if (!getWidget().isChartPrepared()) {
							getWidget().prepareChart();
						} else if (getWidget().isChartPrepared()) {
							getWidget().refreshChart();
						}
					}
				});
		getWidget().addValueChangeHandler(this);
	}

	@Override
	public void updateCaption(ComponentConnector connector) {
		// not used
	}

	@Override
	public void onConnectorHierarchyChange(
			ConnectorHierarchyChangeEvent connectorHierarchyChangeEvent) {
		getWidget().add(getChildComponents().get(0).getWidget());
	}

	@SuppressWarnings("unchecked")
	@Override
	public void onValueChange(ValueChangeEvent<Object[]> eventObject) {
		Map<String, String> eventData = (Map<String, String>) ((ValueChangeEvent<Object[]>) eventObject)
				.getValue()[0];
		serverRpc.onEventFired(eventData);
	}

}
