package session;

import entity.Personal;
import javax.ejb.Remote;

import session.AdminPersonal.PersonaSinContratoError;


@Remote
public interface AdminPersonalRemote {
	public Personal crearPersonal(Personal personal);

	public Personal actualizarPersonal(Personal personal) throws PersonaSinContratoError ;

	public void quitarPersonal(Personal personal);
}
