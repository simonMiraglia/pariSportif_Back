package com.example.demo.utilisateurs;

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
@RequestMapping("/utilisateurs")
public class UtilisateurController {
	private UtilisateurService utilisateurService;

	public UtilisateurController(UtilisateurService utilisateurService) {
		this.utilisateurService = utilisateurService;
	}
	// GET ALL 
		@GetMapping
		public List<Utilisateurs> findAll() {
			return utilisateurService.findAll();
		}
	// POST
	@PostMapping
	public void save(@RequestBody Utilisateurs utilisateurs) {
		utilisateurService.save(utilisateurs);
	}

	// GET
	@GetMapping("/{id}")
	public Optional<Utilisateurs> findById(@PathVariable int id) {
		return utilisateurService.findById(id);
	}

	// PUT
	@PutMapping
	public void update(@RequestBody Utilisateurs utilisateurs) {
		utilisateurs.setId(1);
		utilisateurService.update(utilisateurs);
	}

	// DELETE
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id) {
		utilisateurService.deleteById(id);
	}
}