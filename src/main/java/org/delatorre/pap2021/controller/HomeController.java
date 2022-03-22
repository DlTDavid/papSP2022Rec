package org.delatorre.pap2021.controller;

import javax.servlet.http.HttpSession;
import org.delatorre.pap2021.exception.DangerException;
import org.delatorre.pap2021.helper.H;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index(){
		return "home/index";
	}
	
}
