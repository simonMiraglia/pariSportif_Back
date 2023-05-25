package com.example.demo.utilisateurs;

public enum Role {
	U("Utilisateur"), C("Créateur"), A("Administrateur");

	private String role;

	private Role(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}

}