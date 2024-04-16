package asteric.in.Day2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import asteric.in.Day2.model.User;


	@Controller
	public class HomeController {

		
		@RequestMapping("/test1")
		
		String myfun(Model m)
		{
			String uname="Nikita";
			//m.addAttribute("uobj", "NIkita");
			m.addAttribute("o1", uname);
			return "index.html";
		}
		

		@RequestMapping("/test2")
		String myfun1(Model m)
		{
			
			User u = new User(101, "Nikita", "Nagpur");
			m.addAttribute("o2", u);
			
			return "index1.html";
		}
		
		@RequestMapping("/test3")
		String myfun2(Model m)
		{
			
			User u = new User(102, "Mansi", "Pune");
			m.addAttribute("o3", u);
			
			return "index2.html";
		}
		
		@RequestMapping("/test4")
		ModelAndView myfun3()
		{
			
			User u = new User(103, "Pradnya", "Delhi");
			ModelAndView m= new ModelAndView("index3.html");
			m.addObject("o4", u);
			
			return m;
		}
		
}
