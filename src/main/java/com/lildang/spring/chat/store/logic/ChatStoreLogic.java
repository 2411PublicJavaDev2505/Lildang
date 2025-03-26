package com.lildang.spring.chat.store.logic;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.lildang.spring.chat.controller.dto.ChatSendRequest;
import com.lildang.spring.chat.domain.ChatVO;
import com.lildang.spring.chat.store.ChatStore;

@Repository
public class ChatStoreLogic implements ChatStore{

	@Override
	public List<ChatVO> selectList(SqlSession session, Map<String, String> map) {
		return session.selectList("ChatMapper.selectList",map);
	}

	@Override
	public int sendChat(SqlSession session, ChatSendRequest chat) {
		return session.insert("ChatMapper.sendChat",chat);
	}

}
