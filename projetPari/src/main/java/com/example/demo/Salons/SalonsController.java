package com.example.demo.Salons;

import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/salons")
public class SalonsController {

	private SalonsService salonsService;

	public SalonsController(SalonsService salonsService) {
		this.salonsService = salonsService;
	}

	// POST
	@PostMapping
	public void save(@RequestBody Salons salons) {
		salonsService.save(salons);
	}

	// GET
	@GetMapping("/{id}")
	public Optional<Salons> findById(@PathVariable int id) {
		return salonsService.findById(id);
	}

	// PUT
	@PutMapping
	public void update(@RequestBody Salons salons) {
		salonsService.update(salons);
	}

	// DELETE
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id) {
		salonsService.deleteById(id);
	}

}