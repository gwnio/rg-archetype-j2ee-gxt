package org.rg.archetype.gxt.app.client.rpc;

import org.rg.archetype.gxt.app.client.utils.URLUtils;
import org.rg.archetype.gxt.app.shared.WelcomeReplyRequestDTO;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

/**
 * I'm not using @RemoteServiceRelativePath("SampleService") because according to the documentation
 * 
 * <quote>This annotation will cause the client-side proxy to automatically invoke the ServiceDefTarget.setServiceEntryPoint(String)
 * method with GWT.getModuleBaseURL() + value() as its argument. Subsequent calls to ServiceDefTarget.setServiceEntryPoint(String)
 * will override this default path.</quote>
 * 
 * Instead of {@link GWT#getModuleBaseURL()} I'm using {@link GWT#getHostPageBaseURL()} because I've adjusted where the deployable
 * output files go. 
 */
public interface SampleService extends RemoteService {

	public static class Util {
		
		public static SampleServiceAsync getAsync() {
			SampleServiceAsync service = GWT.create(SampleService.class);
			ServiceDefTarget serviceDefTarget = (ServiceDefTarget) service;
			serviceDefTarget.setServiceEntryPoint(URLUtils.getUrlString("gwt-rpc/SampleService"));
			return service;
		}
	}
	
	public String getWelcomeMessage(WelcomeReplyRequestDTO request);
}
