package session;

import entity.Pasivo;
import javax.ejb.Local;


/**
 * @generated DT_ID=none
 */
@Local
public interface AdminPasivoLocal
{

    /**
     * @generated DT_ID=none
     */
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    /**
     * @generated DT_ID=none
     */
    public Pasivo persistPasivo(Pasivo pasivo);

    /**
     * @generated DT_ID=none
     */
    public Pasivo mergePasivo(Pasivo pasivo);

    /**
     * @generated DT_ID=none
     */
    public void removePasivo(Pasivo pasivo);

}
