package com.example.demo.Paris;

import com.example.demo.Evenement.Evenements;
import com.example.demo.utilisateurs.Utilisateurs;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Paris {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "cotes")
	private double cotes;

	@Column(name = "date_debut")
	private String date_debut;

	@Column(name = "date_fin")
	private String date_fin;

	@Column(name = "mise")
	private int mise;
	
	@ManyToOne
	Utilisateurs utilisateur;

	@ManyToOne
	Evenements evenements;
}
