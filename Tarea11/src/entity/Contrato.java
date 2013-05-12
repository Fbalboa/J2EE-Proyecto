package entity;

import java.math.BigDecimal;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class Contrato {
	@Id
	private BigDecimal id;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="inicio",
			column=@Column(name="FECHA_INICIO")),
		@AttributeOverride(name="termino",
			column=@Column(name="FECHA_EXPIRACION")), })
	private Duracion duracion;
	private int mensualidad;
	@OneToOne(mappedBy="contrato")
	private Personal personal;
	@OneToOne(mappedBy="contrato")
	private Socio socio;
	public Contrato(){
	}
	
	public BigDecimal getId() {
		return id;
	}

	public int getMensualidad() {
		return mensualidad;
	}

	public void setMensualidad(int mensualidad) {
		this.mensualidad = mensualidad;
	}

	public Duracion getDuracion() {
		return duracion;
	}

	public void setDuracion(Duracion duracion) {
		this.duracion = duracion;
	}

	public Personal getPersonal() {
		return personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	

}
