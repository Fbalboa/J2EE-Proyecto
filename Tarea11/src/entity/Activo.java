package entity;

import java.math.BigDecimal;

import javax.persistence.*;

import enumerador.TipoActivo;

@Entity
@SecondaryTable(name = "TIPO_ACTIVO", pkJoinColumns ={@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "TIPO_ACTIVO_ID") })
public class Activo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private BigDecimal id;
	private double valor;
	@Enumerated(EnumType.STRING)
	@Column(name="TIPO", table="TIPO_ACTIVO")
	private TipoActivo tipo;
	@Column(name="DESCRIPCION", table="TIPO_ACTIVO")
	private String descripcion;

	public Activo() {	
	}

	public Activo(double valor, TipoActivo tipo, String descripcion) {
		this.valor = valor;
		this.tipo = tipo;
		this.descripcion = descripcion;
	}
	
	public BigDecimal getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public double getValor() {
		return valor;
	}
	public TipoActivo getTipo() {
		return tipo;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}


	public void setTipo(TipoActivo tipo) {
		this.tipo = tipo;
	}

}
