package session;

import javax.ejb.Local;

import entity.Contrato;

@Local
public interface AdminContratoPersonalLocal {

	public Contrato crearContrato(Contrato contrato);

	public Contrato actualizarContrato(Contrato contrato);

	public void eliminarContratoPersonal(Contrato contrato);

}
