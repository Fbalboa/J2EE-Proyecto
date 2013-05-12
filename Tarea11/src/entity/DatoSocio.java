package entity;

import enumerador.TipoDato;

public class DatoSocio {
	protected TipoDato tipo;
	protected String descripcion;
	
	
	
	public DatoSocio(TipoDato tipo, String descripcion) {
		this.tipo = tipo;
		this.descripcion = descripcion;
	}
	public TipoDato getTipo() {
		return tipo;
	}
	public void setTipo(TipoDato tipo) {
		this.tipo = tipo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
