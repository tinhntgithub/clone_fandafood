package com.fanda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fanda.dao.AccountDAO;
import com.fanda.entity.Account;

@Controller
public class AccountController {
	@Autowired
	AccountDAO dao ;
	@RequestMapping("/account/login")
	public String login() {
		
		
		return "/account/login";
	}
	@RequestMapping("/account/login/success")
	public String success(Model model) {
		
		 
		return "home/home";
	}
	
	
	@RequestMapping("/account/login/error")
	public String error(Model model) {
		 model.addAttribute("message", "Đăng Nhập Không Thành Công");
		 
		return "/account/login";
	}
	
	@RequestMapping("/account/logout/success")
	public String logout () {
		return "forward:/account/login";
	}
}
