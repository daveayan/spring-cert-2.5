package learn.spring25.web.mvc.xml.mappingrequeststohandlers.custommapping;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class UrlListDocumentsController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		System.out.println("************** In UrlListDocumentsController");
		return new ModelAndView("welcome", "today", new Date());
	}
}