package entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;

@Entity
@SecondaryTable(name = "TIPO_PERSONAL", pkJoinColumns = { @PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "Tipo_personal_id") })
public abstract class Personal extends Persona {
	private boolean contratado;
	private String descripcion;
	private Contrato contrato;

	@Override
	@Id
	public BigDecimal getId() {

		return super.getId();
	}

	@Override
	public void setId(BigDecimal id) {

		super.setId(id);
	}

	public boolean isContratado() {
		return contratado;
	}

	public void setContratado(boolean contratado) {
		this.contratado = contratado;
	}

	@Column(name = "DESCRIPCION", table = "TIPO_PERSONAL")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String getNombre() {

		return super.getNombre();
	}

	@Override
	public void setNombre(String nombre) {

		super.setNombre(nombre);
	}

	@Override
	public String getApellido() {

		return super.getApellido();
	}

	@Override
	public void setApellido(String apellido) {

		super.setApellido(apellido);
	}

	@Override
	@Column(name = "fecha_nacimiento")
	public Date getNacimiento() {

		return super.getNacimiento();
	}

	@Override
	public void setNacimiento(Date nacimiento) {

		super.setNacimiento(nacimiento);
	}

	@Override
	@ManyToOne
	@JoinColumn(name = "Nacionalidad_ID")
	public Nacionalidad getNacionalidad() {

		return super.getNacionalidad();
	}

	@Override
	public Personal getPersonal() {

		return super.getPersonal();
	}

	@Override
	public void setPersonal(Personal personal) {

		super.setPersonal(personal);
	}

	@Override
	public Socio getSocio() {

		return super.getSocio();
	}

	@Override
	public void setSocio(Socio socio) {

		super.setSocio(socio);
	}

	@OneToOne
	@JoinColumn(name = "Contrato_id")
	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

}
