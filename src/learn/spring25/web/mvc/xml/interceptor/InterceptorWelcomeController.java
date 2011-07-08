package learn.spring25.web.mvc.xml.interceptor;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class InterceptorWelcomeController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		System.out.println("************** In learn.spring25.web.mvc.xml.interceptor.WelcomeController");
		return new ModelAndView("welcome", "today", new Date());
	}
}