package assignment2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	
	@RequestMapping(value = "/intrest"  , method = RequestMethod.GET)
	public ModelAndView intrest() {
		
		ModelAndView modelAndview = new ModelAndView("simpleIntrest");
		
		
		return modelAndview;
	}
	
	
	@RequestMapping(value="/calculatesi" , method = RequestMethod.POST)
	public ModelAndView calculate(@RequestParam("amount") Integer principal , @RequestParam("time") Integer time , @RequestParam("rate") Integer rate) {
		
		int intrest = (principal*time*rate)/100;
		ModelAndView modelAndView = new ModelAndView("calculatesi");
		modelAndView.addObject("SI", "The total amount with intrest will be::"+ principal+intrest);
		return modelAndView;
		
	}
	
}
