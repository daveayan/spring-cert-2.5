package learn.spring25.remoting.server.http;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

public class CustomHttpInvokerServiceExporter extends HttpInvokerServiceExporter {
	public void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Http Service Invoked ... ");
		super.handleRequest(request, response);
	}
}