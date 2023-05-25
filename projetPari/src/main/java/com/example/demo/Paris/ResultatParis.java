package com.example.demo.Paris;

public enum ResultatParis {
	G("gagné"), P("perdu");

	private String res;

	public String getRes() {
		return res;
	}

	private ResultatParis(String res) {
		this.res = res;
	}
}
