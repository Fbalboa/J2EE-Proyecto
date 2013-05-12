package session;

import entity.Pasivo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless(name = "AdminPasivo", mappedName = "Tarea11-AdminPasivo")
public class AdminPasivo
        implements AdminPasivoLocal, AdminPasivoRemote
{

    @PersistenceContext(unitName="Tarea11")
    private EntityManager em;

    public AdminPasivo() {
    }

    public Object queryByRange(String jpqlStmt, int firstResult,
                               int maxResults) {
        Query query = em.createQuery(jpqlStmt);
        if (firstResult > 0) {
            query = query.setFirstResult(firstResult);
        }
        if (maxResults > 0) {
            query = query.setMaxResults(maxResults);
        }

        return query.getResultList();
    }

    public Pasivo persistPasivo(Pasivo pasivo) {
        em.persist(pasivo);
        return pasivo;
    }

    public Pasivo mergePasivo(Pasivo pasivo) {
        return em.merge(pasivo);
    }

    public void removePasivo(Pasivo pasivo) {
        pasivo = em.find(Pasivo.class, pasivo.getId());
        em.remove(pasivo);
    }

}
