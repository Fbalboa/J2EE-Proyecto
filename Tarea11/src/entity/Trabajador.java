package entity;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

import enumerador.TipoTrabajador;

@MappedSuperclass
public class Trabajador extends Personal{
	

	private TipoTrabajador tipo;
	@Column(name="Tipo", table="TIPO_Personal")
	@Enumerated(EnumType.STRING)
	public TipoTrabajador getTipo() {
		return tipo;
	}

	public void setTipo(TipoTrabajador tipo) {
		this.tipo = tipo;
	}
	
}
