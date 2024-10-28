package co.edu.ufps.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import co.edu.ufps.entities.TipoPersona;
import co.edu.ufps.repositories.TipoPersonaRepository;

@Service
public class TipoPersonaService {
	@Autowired
	public TipoPersonaRepository tipoPersonaRepository;

	public List<TipoPersona> list() {
		return tipoPersonaRepository.findAll();
	}

	public TipoPersona get(int id) {
		Optional<TipoPersona> tipoPersonaOpt = tipoPersonaRepository.findById(id);
		if (tipoPersonaOpt.isPresent()) {
			return tipoPersonaOpt.get();
		}
		return null;
	}

	public TipoPersona create(TipoPersona objeto) {
		return tipoPersonaRepository.save(objeto);
	}

	public TipoPersona delete(int id) {
		Optional<TipoPersona> tipoPersonaOpt = tipoPersonaRepository.findById(id);
		if (tipoPersonaOpt.isPresent()) {
			tipoPersonaRepository.deleteById(id);
			return tipoPersonaOpt.get();
		}
		return null;
	}

	public TipoPersona update(int id, TipoPersona tipoPersonaDetails) {
		Optional<TipoPersona> tipoPersonaOpt = tipoPersonaRepository.findById(id);

		if (tipoPersonaOpt.isPresent()) {
			TipoPersona tipoPersona = tipoPersonaOpt.get();
			
			tipoPersona.setDescripcion(tipoPersonaDetails.getDescripcion());

			return tipoPersonaRepository.save(tipoPersona);
		}
		
		return null;
	}
}
