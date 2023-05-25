package com.example.demo.Paris;

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
@RequestMapping("/paris")
public class ParisController {

	private ParisService parisService;

	// Constructeur

	public ParisController(ParisService parisService) {
		this.parisService = parisService;
	}

	// POST
	@PostMapping
	public void save(@RequestBody Paris paris) {
		parisService.save(paris);
	}

	// GET
	@GetMapping("/{id}")
	public Optional<Paris> findById(@PathVariable int id) {
		return parisService.findById(id);
	}

	// PUT
	@PutMapping
	public void update(@RequestBody Paris paris) {
		paris.getId();
		parisService.update(paris);
	}

	// DELETE
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id) {
		parisService.deleteById(id);
	}
	//@GetMapping

}
