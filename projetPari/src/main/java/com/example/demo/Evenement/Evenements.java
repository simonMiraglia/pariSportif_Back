package com.example.demo.Evenement;

import java.util.List;

import com.example.demo.Paris.Paris;
import com.example.demo.Salons.Salons;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Evenements {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nom")
	private String nom;

	@Column(name = "date_debut")
	private String date_debut;

	@Column(name = "date_fin")
	private String date_fin;

	@Column(name = "statut")
	private Statut statut;

	@Column(name = "resultat")
	private Resultat resultat;
 

	@ManyToMany
	@JoinTable(name = "evenements_salons", joinColumns = @JoinColumn(name = "evenements_id"), inverseJoinColumns = @JoinColumn(name = "salons_id"))
	List<Salons> salons;
}