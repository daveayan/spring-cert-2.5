package learn.spring25.remoting.server.burlap;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.remoting.caucho.BurlapServiceExporter;

public class CustomBurlapServiceExporter extends BurlapServiceExporter {
	public void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Burlap Service Invoked ... ");
		super.handleRequest(request, response);
	}
}
