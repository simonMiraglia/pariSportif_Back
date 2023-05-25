package com.example.demo.Evenement;

public enum Statut {
	Ec("En_cours"), Av("A venir"), P("Passé");

	private String statut;

	private Statut(String statut) {
		this.statut = statut;
	}

	public String getStatut() {
		return statut;
	}

}