package com.example.demo.Evenement;

public enum Resultat {
	O("Equipe1Gagne"), I("Equipe2gagne"), II("nul");

	private String res;

	public String getRes() {
		return res;
	}

	private Resultat(String res) {
		this.res = res;
	}

}