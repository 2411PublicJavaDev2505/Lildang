package com.lildang.spring.chat.service.logic;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lildang.spring.chat.controller.dto.ChatSendRequest;
import com.lildang.spring.chat.domain.ChatVO;
import com.lildang.spring.chat.service.ChatService;
import com.lildang.spring.chat.store.ChatStore;

@Service
public class ChatServiceLogic implements ChatService{

	private ChatStore cStore;
	private SqlSession session;
	
	@Autowired
	public ChatServiceLogic(ChatStore cStore, SqlSession session) {
		this.cStore = cStore;
		this.session = session;
	}
	
	@Override
	public List<ChatVO> selectList(Map<String, String> map) {
		return cStore.selectList(session, map);
	}

	@Override
	public int sendChat(ChatSendRequest chat) {
		return cStore.sendChat(session, chat);
	} 

}
