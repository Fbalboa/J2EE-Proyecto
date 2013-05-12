package session;

import entity.Pasivo;
import javax.ejb.Remote;


/**
 * @generated DT_ID=none
 */
@Remote
public interface AdminPasivoRemote
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
