package entity;

import javax.persistence.MappedSuperclass;

import enumerador.TipoJugador;

@MappedSuperclass
public class Defensa extends Jugador {
	protected double valorMercado = 1.2;
	public Defensa(){
		tipo=TipoJugador.Defensa;
	}
	
	@Override
	public double ValorMercado() {
		return valorBase * valorMercado;
	}

}
