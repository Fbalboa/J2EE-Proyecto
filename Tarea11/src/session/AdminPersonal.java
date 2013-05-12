package session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Personal;

@Stateless(name = "AdminPersonal", mappedName = "Tarea11-AdminPersonal")
public class AdminPersonal implements AdminPersonalLocal, AdminPersonalRemote {
	@PersistenceContext(unitName = "Tarea11")
	private EntityManager em;

	public AdminPersonal() {
	}

	public Personal crearPersonal(Personal personal) {
		if(personal.getContrato()==null)
			return null;
		em.persist(personal);
		return personal;
	}

	public Personal actualizarPersonal(Personal personal) throws PersonaSinContratoError {
		if(personal.getContrato()==null)
			throw new PersonaSinContratoError();
		return em.merge(personal);
	}

	public void quitarPersonal(Personal personal) {
		personal = em.find(Personal.class, personal.getId());
		em.remove(personal);
	}
	
	/* Exceptions */
	public class PersonaSinContratoError extends Exception{
		private static final long serialVersionUID = 1L;
	}
}