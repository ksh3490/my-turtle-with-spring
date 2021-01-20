package net.turtle.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import net.turtle.domain.User;
import net.turtle.domain.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@PostMapping("/createUser")
	public String create(User user) {
		System.out.println("user: " + user);
		userRepository.save(user);
		return "redirect:/userList";
	}

	@GetMapping("/userList")
	public String list(Model model) {
		model.addAttribute("users", userRepository.findAll());
		return "userList";
	}

}
