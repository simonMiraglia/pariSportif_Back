package com.example.demo.utilisateurs;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class UtilisateurService {

	private List<Utilisateurs> utilisateurs = new ArrayList<>();

	private UtilisateurRepository utilisateurRepository;

	// find all

	public UtilisateurService(UtilisateurRepository utilisateurRepository) {
		this.utilisateurRepository = utilisateurRepository;
	}

	public List<Utilisateurs> findAll() {
		return utilisateurRepository.findAll();
	}

	// find BY id
	public Optional<Utilisateurs> findById(int id) {
		return utilisateurRepository.findById(id);
	}

	// save
	public void save(Utilisateurs utilisateurs) {
		utilisateurRepository.save(utilisateurs);
	}

	// deleteByID

	public void deleteById(int id) {
		utilisateurRepository.deleteById(id);
	}

	public void update(Utilisateurs utilisateurs) {
		deleteById(utilisateurs.getId());
		utilisateurRepository.save(utilisateurs);
	}

}