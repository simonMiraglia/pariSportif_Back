package com.example.demo.Evenement;

import java.util.List;
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
@RequestMapping("/evenements")
public class EvenementController {

	private EvenementService evenementService;

	public EvenementController(EvenementService evenementService) {
		this.evenementService = evenementService;
	}
	//GET ALL
	@GetMapping
	public List<Evenements> findAll() {
		return evenementService. findAll();
	}
	// POST
	@PostMapping
	public void save(@RequestBody Evenements evenements) {
		evenementService.save(evenements);
	}

	// GET
	@GetMapping("/{id}")
	public Optional<Evenements> findById(@PathVariable int id) {
		return evenementService.findById(id);
	}

	// PUT
	@PutMapping
	public void update(@RequestBody Evenements evenements) {
		evenements.setId(1);
		evenementService.update(evenements);
	}

	// DELETE
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id) {
		evenementService.deleteById(id);
	}


}
