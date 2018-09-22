package repositorio;

import java.util.List;

import entidad.Usuario;
import interfaces.UsuarioRepositorio;

public class UsuarioRepositorioImp implements UsuarioRepositorio{
ConexionDB conexionDb;
	
	@Override
	public boolean guardar(Usuario usuario) {
		
		return false;
	}

	@Override
	public Integer buscar(int id) {

		return null;
	}

	@Override
	public Usuario buscarUsuario(String nombre) {

		return null;
	}

	@Override
	public List<Usuario> buscar(String usuario) {

		return null;
	}

}
