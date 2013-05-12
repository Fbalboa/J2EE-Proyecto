package session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Contrato;

@Stateless(name = "AdminContratoPersonal", mappedName = "Tarea11-AdminContratoPersonal")
public class AdminContratoPersonal implements AdminContratoPersonalLocal,
		AdminContratoPersonalRemote {

	@PersistenceContext(unitName = "Tarea11")
	private EntityManager em;

	public AdminContratoPersonal() {
	}

	public Contrato crearContrato(Contrato contrato) {
		em.persist(contrato);
		return contrato;
	}

	public Contrato actualizarContrato(Contrato contrato) {
		return em.merge(contrato);
	}

	public void eliminarContratoPersonal(Contrato contrato) {
		contrato = em.find(Contrato.class, contrato.getId());
		em.remove(contrato.getPersonal());
		em.remove(contrato);
	}

	

}
