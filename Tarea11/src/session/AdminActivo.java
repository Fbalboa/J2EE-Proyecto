package session;

import java.math.BigDecimal;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entity.Activo;

@Stateless(name = "AdminActivo", mappedName = "Tarea11-AdminActivo")
public class AdminActivo implements AdminActivoLocal, AdminActivoRemote {

	@PersistenceContext(unitName = "Tarea11")
	private EntityManager em;

	public AdminActivo() {
	}

	public Activo crearActivo(Activo activo) {
		em.persist(activo);
		return activo;
	}

	public Activo actualizarActivo(Activo activo) {
		return em.merge(activo);
	}

	public void eliminarActivo(Activo activo) {
		activo = em.find(Activo.class, activo.getId());
		em.remove(activo);
	}

	public BigDecimal totalActivos() {
		try {
			Query query = em.createQuery("from Activo c where c.firstName='Bill' and c.lastName='Burke'");
			Customer cust = (Customer) query.getSingleResult();
			
			List results;
			int first = 0;
			int max = 10;
			
			do {
			results = getCustomers(max, first);
			Iterator it = results.iterator( );
			while (it.hasNext( )) {
			Customer c = (Customer) it.next( );
			System.out.println(c.getFirstName() + " " + c.getLastName( ));
			}
			entityManager.clear( );
			first = first + results.getSize( );
			} while (results.size( ) > 0);
			
			Query queryp = em.createQuery("from Personal p " + 
										  "where p.TipoPersonal=:arquero OR " + 
										   " AND p.TipoPersonal=:defensa OR " +
										   " AND p.TipoPersonal=:mediocampista OR " +
										   " AND p.TipoPersonal=:delantero");
			queryp.setParameter("arquero",TipoPersonal.);
			
			Customer cust = (Customer) query.getSingleResult();
		} catch (EntityNotFoundException notFound) {
		} catch (NonUniqueResultException nonUnique) {
		}
	}
}
