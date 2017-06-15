package com.atsistemas.cloud.repositorios;

import java.util.List;

import com.atsistemas.cloud.entidades.Usuario;

public interface UsuarioRepository {
	
	List<Usuario> getUsuarios();
	
	Usuario getUsuario(String id);
}
