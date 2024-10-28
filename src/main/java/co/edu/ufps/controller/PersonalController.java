package co.edu.ufps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.ufps.entities.Personal;
import co.edu.ufps.services.PersonalService;

@RestController
@RequestMapping("/personals")
public class PersonalController {
	
	@Autowired
	public PersonalService personalService;
	
	@GetMapping("/personals")
	public List<Personal> list () {
		List<Personal> personal = personalService.getAllUsers();
		return personal;
	}
	
	@GetMapping("/{id}")
	public Personal personalId (@PathVariable int id) {
		return personalService.getPersonalById(id);
	}
	
	@PutMapping("/{id}")
	public void insertar(@RequestBody Personal objeto) {
	    personalService.addUser(objeto);
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable int id) {
		personalService.deleteUser(id);
	}
}
