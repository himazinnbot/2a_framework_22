package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {

	//一覧表示用.
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String viewPage() {

		return "login";
	}

	//ログイン検証用
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String loginPost(String username, String password, HttpSession session) {

		String predefinedUsername = "gitlogin";
		String predefinedPassword = "gitpw";

		if (username.equals(predefinedUsername) && password.equals(predefinedPassword)) {
			session.setAttribute("username", username);
			return "redirect:/syouhinn";
		} else {
			// ログイン失敗時の処理を追加
			return "redirect:/login";
		}
	}
}