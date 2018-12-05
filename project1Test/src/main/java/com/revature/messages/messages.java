package com.revature.messages;

public class messages {
	private int fromID;
	private int toID;
	private String message;
	public messages(int fromID, int toID, String message) {
		super();
		this.fromID = fromID;
		this.toID = toID;
		this.message = message;
	}
	public int getFromID() {
		return fromID;
	}
	public void setFromID(int fromID) {
		this.fromID = fromID;
	}
	public int getToID() {
		return toID;
	}
	public void setToID(int toID) {
		this.toID = toID;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
