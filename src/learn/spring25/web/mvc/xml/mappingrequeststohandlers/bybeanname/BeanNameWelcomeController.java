package learn.spring25.web.mvc.xml.mappingrequeststohandlers.bybeanname;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class BeanNameWelcomeController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		System.out.println("************** In BeanNameWelcomeController");
		return new ModelAndView("welcome", "today", new Date());
	}
}