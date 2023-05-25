package com.example.demo.Paris;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class ParisService {

	private List<Paris> paris = new ArrayList<>();

	private ParisRepository parisRepository;

	// find all

	public ParisService(ParisRepository parisRepository) {
		this.parisRepository = parisRepository;
	}

	public List<Paris> findAll() {
		return parisRepository.findAll();
	}

	// find BY id
	public Optional<Paris> findById(int id) {
		return parisRepository.findById(id);
	}

	// save
	public void save(Paris paris) {
		parisRepository.save(paris);
	}

	// deleteByID

	public void deleteById(int id) {
		parisRepository.deleteById(id);
	}

	public void update(Paris paris) {
		deleteById(paris.getId());
		parisRepository.save(paris);
	}

}
