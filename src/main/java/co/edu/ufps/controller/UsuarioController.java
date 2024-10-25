package co.edu.ufps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ufps.entities.Usuario;
import co.edu.ufps.repositories.UsuarioRepository;

@RestController
@RequestMapping("/users")
public class UsuarioController {

	@Autowired
	UsuarioRepository usuarioRepository;

	@GetMapping("/users/{username}")
	public Usuario findUser(String username) {
		return usuarioRepository.findById(username)
				.orElseThrow(() -> new RuntimeException("Usuario no encontrado con el username: " + username));
	}

	@GetMapping("/users")
	public List<Usuario> findUsers() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		return usuarios;
	}

	@PutMapping
	public Usuario updateUser(String username, String user) {
		Usuario usuario = usuarioRepository.findById(username)
				.orElseThrow(() -> new RuntimeException("Usuario no encontrado con el username: " + username));
		usuario.setUsername(username);
		usuario.setUser(user);

		Usuario usuarioActualizado = usuarioRepository.save(usuario);

		return usuarioActualizado;
	}
	
	@DeleteMapping
	public Usuario deleteUser (String username) {
		Usuario usuario = usuarioRepository.findById(username)
				
		        .orElseThrow(() -> new RuntimeException("Usuario no encontrado con el username: " + username));
		    
		    usuarioRepository.deleteById(username);
		    
		    return usuario;
	}
	
	@PostMapping
	public Usuario saveUser (Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
}
