package learn.spring25.remoting.server.hessian;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.remoting.caucho.HessianServiceExporter;

public class CustomHessianServiceExporter extends HessianServiceExporter {
	public void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hessian Service Invoked ... ");
		super.handleRequest(request, response);
	}
}