package session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Usuario;

@Stateless(name = "FuncUsuario", mappedName = "Tarea11-FuncUsuario")
public class FuncUsuario
        implements FuncUsuarioLocal, FuncUsuarioRemote
{

    @PersistenceContext(unitName="Tarea11")
    private EntityManager em;

    public FuncUsuario() {
    }

	public void agregarUsuario(Usuario usuario) {
		em.persist(usuario);
	}
	
	public void quitarUsuario(Usuario usuarioid) throws UsuarioNoEcontradoError {
		Usuario usuario = em.find(Usuario.class, usuarioid.getId());
		if (usuario == null)
			throw new UsuarioNoEcontradoError();
        em.remove(usuario);
	}
	
	/* Exceptions */
	public class UsuarioNoEcontradoError extends Exception{
		private static final long serialVersionUID = 1L;
	}
}


