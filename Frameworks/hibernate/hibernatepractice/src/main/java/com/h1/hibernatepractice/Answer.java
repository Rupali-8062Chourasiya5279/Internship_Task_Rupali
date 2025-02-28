package com.h1.hibernatepractice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Answer {

	@Id
	private int aid;
	private String ans;
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int aid, String ans) {
		super();
		this.aid = aid;
		this.ans = ans;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Answer [aid=" + aid + ", ans=" + ans + "]";
	}
	
}
