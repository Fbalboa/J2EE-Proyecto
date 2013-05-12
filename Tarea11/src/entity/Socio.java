package entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Socio extends Persona {

	protected boolean derechoAsiento;
	protected Collection<DatoContacto> datos;
	protected Contrato contrato;

	public Socio() {
	}

	@Column(name = "DERECHO_ASIENTO")
	public boolean isDerechoAsiento() {
		return derechoAsiento;
	}

	public void setDerechoAsiento(boolean derechoAsiento) {
		this.derechoAsiento = derechoAsiento;
	}

	@OneToMany
	@JoinColumn(name = "Socio_id")
	public Collection<DatoContacto> getDatos() {
		return datos;
	}

	public void setDatos(Collection<DatoContacto> datos) {
		this.datos = datos;
	}

	@Override
	@Column(name = "Fecha_Nacimiento")
	public Date getNacimiento() {
		// TODO Auto-generated method stub
		return super.getNacimiento();
	}

	@Override
	public void setNacimiento(Date nacimiento) {
		// TODO Auto-generated method stub
		super.setNacimiento(nacimiento);
	}

	@Override
	@ManyToOne
	@JoinColumn(name = "Nacionalidad_id")
	public Nacionalidad getNacionalidad() {
		return super.getNacionalidad();
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

	@Override
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public BigDecimal getId() {
		return super.getId();
	}

	@Override
	public void setId(BigDecimal id) {
		super.setId(id);
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
