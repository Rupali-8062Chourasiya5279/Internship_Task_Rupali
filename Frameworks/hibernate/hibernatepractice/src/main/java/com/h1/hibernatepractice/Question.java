package com.h1.hibernatepractice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Question {
	
	@Id
	private int qid;
	private String que;
	@OneToOne
	private Answer ans;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int qid, String que, Answer ans) {
		super();
		this.qid = qid;
		this.que = que;
		this.ans = ans;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	public Answer getAns() {
		return ans;
	}
	public void setAns(Answer ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", que=" + que + ", ans=" + ans + "]";
	}
	
	
}
