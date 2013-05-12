package entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Nacionalidad {
	@Id
	private BigDecimal id;

	@Enumerated(EnumType.STRING)
	private enumerador.Nacionalidad pais;
	
	public Nacionalidad() {
	}

	public BigDecimal getId() {
		return id;
	}

	public enumerador.Nacionalidad getPais() {
		return pais;
	}

	public void setPais(enumerador.Nacionalidad pais) {
		this.pais = pais;
	}

	
   
}
