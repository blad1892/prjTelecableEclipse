package interfaces;

import java.util.List;

import entidad.Usuario;

public interface UsuarioRepositorio {
	
	public boolean guardar(Usuario usuario);
	public Integer buscar(int id);
	public Usuario buscarUsuario(String nombre);
	public List<Usuario> buscar(String usuario);
		
}
