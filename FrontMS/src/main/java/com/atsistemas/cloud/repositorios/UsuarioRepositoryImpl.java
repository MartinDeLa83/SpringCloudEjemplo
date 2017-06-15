package com.atsistemas.cloud.repositorios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.atsistemas.cloud.entidades.Usuario;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository{
	
	@Autowired
	protected RestTemplate restTemplate;
	
	public static final String BACKMS_URL = "http://BACKMS";

	@Override
	public List<Usuario> getUsuarios() {
		return restTemplate.getForObject(BACKMS_URL+"/usuarios",ArrayList.class);
	}

	@Override
	public Usuario getUsuario(String id) {
		return restTemplate.getForObject(BACKMS_URL+"/usuarios/"+id, Usuario.class);
	}

	
	

}
