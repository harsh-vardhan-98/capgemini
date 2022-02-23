package assignment4;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.validation.Valid;

@Controller
public class RegistrationControl {
		
		@RequestMapping(value = "/" , method=RequestMethod.GET)
		public ModelAndView regstrationForm() {
			
			ModelAndView modelandView = new ModelAndView("registration");
			return modelandView;
			
		}
		
		@RequestMapping(value = "/registrationView" , method = RequestMethod.POST)
		public ModelAndView regstrationView(@Valid @ModelAttribute("Registration") Registration customer , BindingResult bindingResult) {
			
			if(bindingResult.hasErrors()) {
				ModelAndView modelandView = new ModelAndView("registration");
				return modelandView;
			}else {
				
			ModelAndView modelandView = new ModelAndView("registrationView");
			modelandView.addObject("msg", customer);
			return modelandView;
			}
			
		}
		
		
		
}
