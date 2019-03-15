package org.rg.archetype.gxt.app.client.utils;

import com.google.gwt.http.client.UrlBuilder;
import com.google.gwt.user.client.Window;

public class URLUtils {

	private static final String CONTEXT_ROOT = "rg-archetype-j2ee-gxt";

	public static String getUrlString(String path) {
		UrlBuilder urlBuilder = new UrlBuilder();
		urlBuilder.setHost(Window.Location.getHost());
		urlBuilder.setPath(CONTEXT_ROOT + "/" + path);

		String port = Window.Location.getPort();
		if (!port.isEmpty()) {
			urlBuilder.setPort(Integer.parseInt(port));
		}

		return urlBuilder.buildString();
	}
}
