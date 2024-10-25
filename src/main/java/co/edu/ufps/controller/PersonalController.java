package co.edu.ufps.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.ufps.entities.Personal;
import co.edu.ufps.repositories.PersonalRepository;

@RestController
@RequestMapping("/personals")
public class PersonalController {
	
	@Autowired
	PersonalRepository personalRepository;  
	
	@GetMapping("/personals")
	public List<Personal> list () {
		List<Personal> personals = personalRepository.findAll();
		return personals;
	}
}
