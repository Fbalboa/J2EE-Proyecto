package session;

import javax.ejb.Remote;

import session.FuncUsuario.UsuarioNoEcontradoError;
import entity.Usuario;

@Remote
public interface FuncUsuarioRemote
{
	public void quitarUsuario(Usuario usuarioid) throws UsuarioNoEcontradoError;
	
	public void agregarUsuario(Usuario usuario);
}
