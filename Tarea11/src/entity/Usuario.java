package entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private BigDecimal id;
	@Column(name="NOMBRE_USUARIO")
	protected String nombreUsuario;
	@Column(name="PASSWORD")
	protected String contrasena;
	
	public Usuario(){};
	
	public Usuario(String name, String pass) {
		this.nombreUsuario = name;
		this.contrasena = pass;
	}
	
	public BigDecimal getId() {
		return id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public String getContrasena() {
		return contrasena;
	}	

}
