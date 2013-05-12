package entity;

import javax.persistence.MappedSuperclass;

import enumerador.TipoJugador;

@MappedSuperclass
public class MedioCampista extends Jugador {
	protected double valorMercado=1.5;
	
	public MedioCampista(){
		tipo=TipoJugador.Mediocampista;
	}
	
	
	

	
	@Override
	public double ValorMercado(){
		return valorBase*valorMercado;		
	}

}
