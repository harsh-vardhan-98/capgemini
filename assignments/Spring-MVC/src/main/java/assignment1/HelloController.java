package assignment1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	public ModelAndView welocme() {
		ModelAndView modelAndView = new ModelAndView("index");
		 modelAndView.addObject("welcome", "Hii EveryOne!");
		 return modelAndView;
	}
	
	@RequestMapping("/HelloPage")
	public ModelAndView helloworld() {
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("msg", "Hello World!");
		
		return modelAndView;
		
	}
	
	
}
