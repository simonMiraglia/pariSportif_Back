package com.example.demo.Evenement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class EvenementService {

	private List<Evenements> evenements = new ArrayList<>();

	private EvenementRepository evenementRepository;

	// find all

	public List<Evenements> findAll() {
		return evenementRepository.findAll();
	}

	// find BY id
	public Optional<Evenements> findById(int id) {
		return evenementRepository.findById(id);
	}

	// save
	public void save(Evenements evenements) {
		evenementRepository.save(evenements);
	}

	// deleteByID

	public void deleteById(int id) {
		evenementRepository.deleteById(id);
	}

	public void update(Evenements evenements) {
		deleteById(evenements.getId());
		evenementRepository.save(evenements);
	}

	public EvenementService(EvenementRepository evenementRepository) {
		
		this.evenementRepository = evenementRepository;
	}

}
