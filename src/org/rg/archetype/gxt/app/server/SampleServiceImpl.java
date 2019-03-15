package org.rg.archetype.gxt.app.server;

import javax.servlet.annotation.WebServlet;

import org.rg.archetype.gxt.app.client.rpc.SampleService;
import org.rg.archetype.gxt.app.shared.WelcomeReplyRequestDTO;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@WebServlet("gwt-rpc/SampleService")
public class SampleServiceImpl extends RemoteServiceServlet implements SampleService {

	private static final long serialVersionUID = 5045584276095642429L;

	@Override
	public String getWelcomeMessage(WelcomeReplyRequestDTO request) {
		return "Hello " + request.getName() + "!";
	}
}
