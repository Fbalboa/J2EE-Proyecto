package session;

import java.math.BigDecimal;

import javax.ejb.Remote;

import entity.Activo;

@Remote
public interface AdminActivoRemote {
	public Activo crearActivo(Activo activo);

	public Activo actualizarActivo(Activo activo);

	public void eliminarActivo(Activo activo);
	
	public BigDecimal totalActivos();
}
