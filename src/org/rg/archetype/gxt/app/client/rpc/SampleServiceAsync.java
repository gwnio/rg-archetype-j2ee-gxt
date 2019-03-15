package org.rg.archetype.gxt.app.client.rpc;

import org.rg.archetype.gxt.app.shared.WelcomeReplyRequestDTO;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface SampleServiceAsync {

	public void getWelcomeMessage(WelcomeReplyRequestDTO request, AsyncCallback<String> callback);
}
