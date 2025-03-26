package com.lildang.spring.chat.service;

import java.util.List;
import java.util.Map;

import com.lildang.spring.chat.controller.dto.ChatSendRequest;
import com.lildang.spring.chat.domain.ChatVO;

public interface ChatService {

	List<ChatVO> selectList(Map<String, String> map);

	int sendChat(ChatSendRequest chat);

}
