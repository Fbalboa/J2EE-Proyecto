package session;

import javax.ejb.Local;

import session.AdminPersonal.PersonaSinContratoError;

import entity.Personal;

@Local
public interface AdminPersonalLocal
{
	public Personal crearPersonal(Personal personal);

	public Personal actualizarPersonal(Personal personal) throws PersonaSinContratoError ;
	
	public void quitarPersonal(Personal personal);
}
