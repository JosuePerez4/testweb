package co.edu.ufps.entities;

import jakarta.persistence.Column; 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="personal")
public class Personal {
	
	@Column(name="id")
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name="documento", length=20)
	private String documento;
	
	@Column(name="nombre", length=50)
	private String nombre;
	
	@Column(name="email", length=100)
	private String email;
	
	@Column(name="telefono", length=20)
	private String telefono;
	
	@ManyToOne
	@JoinColumn(name="tipo_personal_id")
	private TipoPersona tipoPersona;
}
