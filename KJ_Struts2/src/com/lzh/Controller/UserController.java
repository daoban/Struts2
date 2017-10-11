package com.lzh.Controller;

import com.opensymphony.xwork2.Action;

public class UserController implements Action {

	public String query() {
		System.out.println("-----query-------");
		return "success";
	}

	public String save() {
		System.out.println("------query-------");
		return "success";
	}

	public String add() {
		System.out.println("-------add-------");
		return "success";
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return this.SUCCESS;
	}
}
