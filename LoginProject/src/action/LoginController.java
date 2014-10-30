package action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap model, @RequestParam(value = "error", required = false) String error, HttpServletRequest request){
		//model.addAttribute("error", error);
		//model.add
		System.out.println("--------");
		return "/jsp/Login";
	}

}
