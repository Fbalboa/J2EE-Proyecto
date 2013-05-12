package session;

import javax.ejb.Local;

import session.FuncUsuario.UsuarioNoEcontradoError;
import entity.Usuario;

@Local
public interface FuncUsuarioLocal
{
	public void quitarUsuario(Usuario usuarioid) throws UsuarioNoEcontradoError;
	
	public void agregarUsuario(Usuario usuario);
}
