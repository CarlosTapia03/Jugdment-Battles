package aplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "batallas")
public class Batalla {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nombre")
	private String nombre;

	public Batalla() {

	}

	public Batalla(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Batalla [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
}
