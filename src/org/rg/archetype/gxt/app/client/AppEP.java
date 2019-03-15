package org.rg.archetype.gxt.app.client;

import org.rg.archetype.gxt.app.client.rpc.SampleService;
import org.rg.archetype.gxt.app.shared.WelcomeReplyRequestDTO;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.box.MessageBox;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;

public class AppEP implements EntryPoint {

	@Override
	public void onModuleLoad() {
		TextButton textButton = new TextButton("Verify GXT Works");
		RootPanel.get().add(textButton);
		textButton.addSelectHandler(new SelectHandler() {
			
			@Override
			public void onSelect(SelectEvent event) {
				WelcomeReplyRequestDTO request = new WelcomeReplyRequestDTO();
				request.setName("John Doe");
				
				SampleService.Util.getAsync().getWelcomeMessage(request, new AsyncCallback<String>() {
					
					@Override
					public void onSuccess(String arg0) {
						MessageBox messageBox = new MessageBox(arg0);
						messageBox.show();
					}
					
					@Override
					public void onFailure(Throwable arg0) {
						// TODO Auto-generated method stub
					}
				});
			}
		});
	}
}
