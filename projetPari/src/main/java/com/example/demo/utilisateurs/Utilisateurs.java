package com.example.demo.utilisateurs;

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
@Getter
@Setter
@NoArgsConstructor
public class Utilisateurs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "pseudo")
	private String pseudo;

	@Column(name = "email")
	private String email;

	@Column(name = "points")
	private int points;

	@Column(name = "mot_de_passe")
	private String mdp;

	@Column(name = "role")
	private Role role;

	

	@ManyToMany
	@JoinTable(name = "utilisateurs_salons", joinColumns = @JoinColumn(name = "utilisateurs_id"), inverseJoinColumns = @JoinColumn(name = "salons_id"))
	List<Salons> salons;

}