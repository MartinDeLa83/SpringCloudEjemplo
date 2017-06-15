package com.atsistemas.cloud.servicios;

import java.util.List;

import com.atsistemas.cloud.entidades.Usuario;

public interface UsuarioService {
	List<Usuario> getUsuarios();
	
	Usuario getUsuario(String id);
}
