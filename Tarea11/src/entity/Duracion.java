package entity;

import java.sql.Date;

import javax.persistence.Embeddable;

@Embeddable
public class Duracion {
	
	private Date inicio;
	private Date termino;
	
	public Duracion() {	
	}
	
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	
	public Date getTermino() {
		return termino;
	}
	public void setTermino(Date termino) {
		this.termino = termino;
	}
	
}
