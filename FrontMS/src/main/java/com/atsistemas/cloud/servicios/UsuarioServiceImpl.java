package com.atsistemas.cloud.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atsistemas.cloud.entidades.Usuario;
import com.atsistemas.cloud.repositorios.UsuarioRepository;
import com.atsistemas.cloud.repositorios.UsuarioRepositoryFeign;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	
	/*Para probar Feign*/
	
	//private UsuarioRepositoryFeign repositorio;
		
	/*Para probar RestTemplate*/
	
	private UsuarioRepository repositorio;

	@Override
	public List<Usuario> getUsuarios() {		
		return repositorio.getUsuarios();
	}

	@Override
	public Usuario getUsuario(String id) {
		return repositorio.getUsuario(id);
	}
}
