package session;

import javax.ejb.Local;

import entity.Contrato;

@Local
public interface AdminContratoSocioLocal {
	public Contrato crearContrato(Contrato contrato);

	public Contrato actualizarContrato(Contrato contrato);

	public void eliminarContratoSocio(Contrato contrato);

}
