package assignment3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainControl {
	
	
	@RequestMapping(value= "/" , method= RequestMethod.GET )
	public ModelAndView userInteface() {
		ModelAndView modelAndView = new ModelAndView("login");
		
		return modelAndView;
	}
	
	@RequestMapping(value="success" , method = RequestMethod.POST)
	public ModelAndView success(@ModelAttribute("userdetail") User userdetail) {
		
		if((userdetail.userName == new User().userName) && (userdetail.password == new User().password)) {
			ModelAndView modelAndView = new ModelAndView("Sucess");
			return modelAndView;
		}else {
			ModelAndView modelAndView = new ModelAndView("error");
			return modelAndView;
		}
		
		
	}
	

}
