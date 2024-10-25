package co.edu.ufps.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Usuario {
	
	@Column(name = "username")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String username;
	private String user;
	private String email;
	private Date fecha;
	private String edad;

	public Usuario(String user, String username, String email, Date fecha, String edad) {
		super();
		this.user = user;
		this.username = username;
		this.email = email;
		this.fecha = fecha;
		this.edad = edad;
	}

}
