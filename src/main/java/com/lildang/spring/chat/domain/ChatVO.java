package com.lildang.spring.chat.domain;

import java.sql.Timestamp;

public class ChatVO {
	private int chatNo;
	private String writerId;
	private String chatDetail;
	private Timestamp chatTime;
	private String receiverId;
	
	public ChatVO() {}
	
	public int getChatNo() {
		return chatNo;
	}
	
	public String getWriterId() {
		return writerId;
	}
	
	public String getChatDetail() {
		return chatDetail;
	}
	
	public Timestamp getChatTime() {
		return chatTime;
	}
	
	public String getReceiverId() {
		return receiverId;
	}
	
	@Override
	public String toString() {
		return "ChatVO [chatNo=" + chatNo + ", writerId=" + writerId + ", chatDetail=" + chatDetail + ", chatTime="
				+ chatTime + ", receiverId=" + receiverId + "]";
	}

}
