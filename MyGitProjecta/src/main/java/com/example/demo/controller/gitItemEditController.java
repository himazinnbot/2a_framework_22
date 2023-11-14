package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class gitItemEditController {

	@RequestMapping(path = "/gititemedit", method = RequestMethod.GET)
	public String gitItemEdit() {

		return "gititemedit";
	}

	@RequestMapping(path = "/henkousita", method = RequestMethod.POST)
	public String gitgit(Model model, String name, String price) {

		model.addAttribute("name", name);
		model.addAttribute("price", price);

		return "henkou";
	}

}
