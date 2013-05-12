package entity;

import java.math.BigDecimal;

import javax.persistence.*;

import enumerador.EstadoPasivo;

@Entity
@SecondaryTable(name = "ESTADO_PASIVO", pkJoinColumns ={@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ESTADO_PASIVO_ID") })
public class Pasivo {
	@Id
	private BigDecimal id;
	private double valor;
	@Enumerated(EnumType.STRING)
	@Column(name="ESTADO", table="ESTADO_PASIVO")
	private EstadoPasivo estado;
	@Column(name="DESCRIPCION", table="ESTADO_PASIVO")
	private String descripcion;
	
	public Pasivo(){
	}
	
	public Pasivo(double valor, EstadoPasivo estado, String descripcion) {
		this.valor = valor;
		this.estado = estado;
		this.descripcion = descripcion;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public EstadoPasivo getEstado() {
		return estado;
	}
	public void setEstado(EstadoPasivo estado) {
		this.estado = estado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public boolean isPendiente(){
		return estado==EstadoPasivo.Pendiente;
	}

	public BigDecimal getId() {
		return id;
	}

}
