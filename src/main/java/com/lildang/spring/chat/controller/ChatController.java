package com.lildang.spring.chat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lildang.spring.chat.service.ChatService;
import com.lildang.spring.employ.service.EmployService;

@Controller
public class ChatController {

	private ChatService cService;
	private EmployService eService;
	
	@Autowired
	public ChatController(ChatService cService, EmployService eService) {
		this.cService = cService;
		this.eService = eService;
	}

	@GetMapping("chat/toboss")
	public String showChat(Model model
			,@RequestParam("writerId") String writerId
			,@RequestParam("employNo") int employNo) {
		try {
			String receiverId = eService.selectIdByEmployNo(employNo);
			return "chat/chat";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}
	}
	
}
