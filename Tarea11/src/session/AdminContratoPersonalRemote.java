package session;

import javax.ejb.Remote;

import entity.Contrato;

@Remote
public interface AdminContratoPersonalRemote {

	public Contrato crearContrato(Contrato contrato);

	public Contrato actualizarContrato(Contrato contrato);

	public void eliminarContratoPersonal(Contrato contrato);

}
