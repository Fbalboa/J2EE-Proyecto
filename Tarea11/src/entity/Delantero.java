package entity;



import javax.persistence.MappedSuperclass;

import enumerador.TipoJugador;





@MappedSuperclass
public class Delantero extends Jugador {
	protected double valorMercado=2;
	
	
	public Delantero(){
		tipo=TipoJugador.Delantero;
	}


	@Override
	public double ValorMercado(){
		return valorBase*valorMercado;		
	}

}
