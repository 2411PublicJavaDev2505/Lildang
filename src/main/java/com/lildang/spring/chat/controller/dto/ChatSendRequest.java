package com.lildang.spring.chat.controller.dto;

public class ChatSendRequest {

	private String writerId;
	private String receiverId;
	private String chatDetail;
	
	public ChatSendRequest(String writerId, String receiverId, String chatDetail) {
		super();
		this.writerId = writerId;
		this.receiverId = receiverId;
		this.chatDetail = chatDetail;
	}
	public String getWriterId() {
		return writerId;
	}
	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}
	public String getReceiverId() {
		return receiverId;
	}
	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}
	public String getChatDetail() {
		return chatDetail;
	}
	public void setChatDetail(String chatDetail) {
		this.chatDetail = chatDetail;
	}
	@Override
	public String toString() {
		return "ChatSendRequest [writerId=" + writerId + ", receiverId=" + receiverId + ", chatDetail=" + chatDetail
				+ "]";
	}
	
	
}
