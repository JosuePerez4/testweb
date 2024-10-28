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

import co.edu.ufps.entities.TipoPersona;
import co.edu.ufps.services.TipoPersonaService;

@RestController
@RequestMapping("/tipo_persona")
public class TipoPersonaController {
	
	@Autowired
	public TipoPersonaService tipoPersonaService;

	@GetMapping("/tipo_persona")
	public List<TipoPersona> list() {
		return tipoPersonaService.list();
	}
	
	@GetMapping("/{id}")
	public TipoPersona get (@PathVariable int id) {
		return tipoPersonaService.get(id);
	}
	
	@PutMapping("/{id}")
	public TipoPersona put(@PathVariable int id,@RequestBody TipoPersona objeto) {
		return tipoPersonaService.update(id, objeto);
	}
	
	@PostMapping("/{id}")
	public TipoPersona post(@RequestBody TipoPersona objeto) {
		return tipoPersonaService.create(objeto);
	}
	
	@DeleteMapping("/{id}")
	public TipoPersona delete (@RequestBody int id) {
		return tipoPersonaService.delete(id);
	}
}
