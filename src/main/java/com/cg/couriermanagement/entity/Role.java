package com.cg.couriermanagement.entity;

public enum Role {
	ADMIN("ADMIN"),
	CUSTOMER("CUSTOMER");

	private String role;
	Role(String role) {
		// TODO Auto-generated constructor stub
		this.role = role;
	}
	public String getRole() {
		return role;
	}

}
