package session;

import javax.ejb.Remote;

import entity.Contrato;

@Remote
public interface AdminContratoSocioRemote {

	public Contrato crearContrato(Contrato contrato);

	public Contrato actualizarContrato(Contrato contrato);

	public void eliminarContratoSocio(Contrato contrato);

}
