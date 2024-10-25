package co.edu.ufps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.ufps.entities.Usuario;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, String>{

}
