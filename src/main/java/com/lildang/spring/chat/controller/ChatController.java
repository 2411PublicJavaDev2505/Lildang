package com.lildang.spring.chat.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lildang.spring.chat.controller.dto.ChatSendRequest;
import com.lildang.spring.chat.domain.ChatVO;
import com.lildang.spring.chat.service.ChatService;
import com.lildang.spring.employ.service.EmployService;
import com.lildang.spring.member.service.MemberService;

import oracle.jdbc.proxy.annotation.Post;

@Controller
public class ChatController {

	private ChatService cService;
	private EmployService eService;
	private MemberService mService;
	
	@Autowired
	public ChatController(ChatService cService, EmployService eService, MemberService mService) {
		this.cService = cService;
		this.eService = eService;
		this.mService = mService;
	}

	@GetMapping("chat/toboss")
	public String showEtoBChat(Model model
			,@RequestParam("writerId") String writerId
			,@RequestParam("employNo") int employNo) {
		try {
			String receiverId = eService.selectIdByEmployNo(employNo);
			return "redirect:/chat/chat?writerId="+writerId+"&receiverId="+receiverId;
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}
	}
	
	@PostMapping("chat/send")
	public String sendChat(Model model
			,@ModelAttribute ChatSendRequest chat
			,HttpSession session) {
		try {
			int result = cService.sendChat(chat);
			String role = (String)session.getAttribute("role");
			if(result > 0) {
				return "redirect:/chat/chat?writerId="+chat.getWriterId()+"&receiverId="+chat.getReceiverId();
			}else {
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("chat/chat")
	public String showChat(Model model
			,@RequestParam("writerId") String writerId
			,@RequestParam("receiverId") String receiverId) {
		try {
			Map<String, String> map = new HashMap<String, String>();
			map.put("receiverId", receiverId);
			map.put("writerId", writerId);
			List<ChatVO> cList = cService.selectList(map);
			String receiverName = mService.selectNameById(receiverId);
			model.addAttribute("cList",cList);
			model.addAttribute("receiverId",map.get("receiverId"));
			model.addAttribute("writerId",map.get("writerId"));
			model.addAttribute("receiverName", receiverName);
			return "chat/chat";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}
	}
	
}
