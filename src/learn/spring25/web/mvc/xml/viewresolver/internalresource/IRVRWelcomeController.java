package learn.spring25.web.mvc.xml.viewresolver.internalresource;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IRVRWelcomeController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		System.out.println("************** In IRVRWelcomeController");
		return new ModelAndView("welcome", "today", new Date());
	}
}