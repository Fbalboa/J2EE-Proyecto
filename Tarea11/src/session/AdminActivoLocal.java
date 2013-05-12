package session;

import java.math.BigDecimal;

import javax.ejb.Local;

import entity.Activo;

@Local
public interface AdminActivoLocal {
	public Activo crearActivo(Activo activo);

	public Activo actualizarActivo(Activo activo);

	public void eliminarActivo(Activo activo);

	public BigDecimal totalActivos();
}
