package entity;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

import enumerador.TipoJugador;

@MappedSuperclass
public abstract class Jugador extends Personal {
	protected TipoJugador tipo;
	protected double valorBase;

	
	@Column(name="Tipo", table="TIPO_Personal")
	@Enumerated(EnumType.STRING)
	public TipoJugador getTipo() {
		return tipo;
	}

	public double getValorBase() {
		return valorBase;
	}

	public abstract double ValorMercado();

}
