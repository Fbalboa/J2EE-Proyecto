package entity;

import javax.persistence.*;

import enumerador.TipoDato;


/**
 * The persistent class for the DATO_CONTACTO database table.
 * 
 */
@Entity
@Table(name="DATO_CONTACTO")
@SecondaryTable(name = "TIPO_Contacto", pkJoinColumns ={@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "TIPO_Contacto_id") })
public class DatoContacto{


	@Id
	private long id;

	@Column(name="TIPO", table="TIPO_Contacto")
	private TipoDato tipo;
	@Column(name="Descripcion", table="TIPO_Contacto")
	private String descripcion;

    public DatoContacto() {
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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