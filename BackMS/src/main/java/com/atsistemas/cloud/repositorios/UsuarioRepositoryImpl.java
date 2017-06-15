package com.atsistemas.cloud.repositorios;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.atsistemas.cloud.entidades.Usuario;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository {
	
	private Map<Long, Usuario> mapaUsuarios = new HashMap<Long, Usuario>();
	
	public UsuarioRepositoryImpl() {
		
		// Creamos los usuarios en memoria
		
		Usuario usuario1 = new Usuario(1L, "50988836P" , "Iñaki");
		mapaUsuarios.put(1L, usuario1);
		Usuario usuario2 = new Usuario(2L, "40997836K" , "Arnau");
		mapaUsuarios.put(2L, usuario2);
		Usuario usuario3 = new Usuario(3L, "30697836S" , "Aleixo");
		mapaUsuarios.put(3L, usuario3);
		Usuario usuario4 = new Usuario(4L, "20000786L" , "Manuel");
		mapaUsuarios.put(4L, usuario4);

	}

	@Override
	public List<Usuario> getUsuarios() {		
		return new ArrayList<Usuario>(mapaUsuarios.values());
	}

	@Override
	public Usuario getUsuario(String id) {
		return mapaUsuarios.get(Long.parseLong(id));
	}


}
