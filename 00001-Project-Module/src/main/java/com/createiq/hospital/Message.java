package com.createiq.hospital;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Message {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int senderid;
	@Column
	private int recieverid;
	@Column
	private String sender;
	@Column
	private String subject;
	@Column
	private String message;
	@Column
	private int messageid;
	@Column
	private String date;
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(int senderid, int recieverid, String sender, String subject, String message, int messageid,
			String date) {
		super();
		this.senderid = senderid;
		this.recieverid = recieverid;
		this.sender = sender;
		this.subject = subject;
		this.message = message;
		this.messageid = messageid;
		this.date = date;
	}
	public int getSenderid() {
		return senderid;
	}
	public void setSenderid(int senderid) {
		this.senderid = senderid;
	}
	public int getRecieverid() {
		return recieverid;
	}
	public void setRecieverid(int recieverid) {
		this.recieverid = recieverid;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getMessageid() {
		return messageid;
	}
	public void setMessageid(int messageid) {
		this.messageid = messageid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Message [senderid=" + senderid + ", recieverid=" + recieverid + ", sender=" + sender + ", subject="
				+ subject + ", message=" + message + ", messageid=" + messageid + ", date=" + date + "]";
	}

	
}
