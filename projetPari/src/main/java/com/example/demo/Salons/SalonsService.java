package com.example.demo.Salons;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class SalonsService {

	public SalonsService(SalonsRepository salonsRepository) {
		this.salonsRepository = salonsRepository;
	}

	private List<Salons> salons = new ArrayList<>();

	private SalonsRepository salonsRepository;

	// findAll
	public List<Salons> findAll() {
		return salonsRepository.findAll();
	}

	// findById
	public Optional<Salons> findById(int id) {
		return salonsRepository.findById(id);
	}

	// save
	public void save(Salons salons) {
		salonsRepository.save(salons);
	}

	// deleteByID
	public void deleteById(int id) {
		salonsRepository.deleteById(id);
	}

	// updateById
	public void update(Salons salons) {
		deleteById(salons.getId());
		salonsRepository.save(salons);
	}
}