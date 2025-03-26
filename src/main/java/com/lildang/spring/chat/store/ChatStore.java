package com.lildang.spring.chat.store;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.lildang.spring.chat.controller.dto.ChatSendRequest;
import com.lildang.spring.chat.domain.ChatVO;

public interface ChatStore {

	List<ChatVO> selectList(SqlSession session, Map<String, String> map);

	int sendChat(SqlSession session, ChatSendRequest chat);

}
