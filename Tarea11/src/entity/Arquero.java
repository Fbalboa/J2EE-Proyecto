package entity;
import javax.persistence.*;

import enumerador.TipoJugador;
@MappedSuperclass
public class Arquero extends Jugador {
	protected double valorMercado = 1;
	
	public Arquero(){
		tipo=TipoJugador.Arquero;
	}
	
	@Override
	public double ValorMercado() {
		return valorBase * valorMercado;
	}

}
