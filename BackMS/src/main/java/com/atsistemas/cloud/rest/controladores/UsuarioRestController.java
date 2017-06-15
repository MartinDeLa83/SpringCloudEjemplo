package com.atsistemas.cloud.rest.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atsistemas.cloud.entidades.Usuario;
import com.atsistemas.cloud.repositorios.UsuarioRepository;

@RestController
public class UsuarioRestController {

	@Autowired
	UsuarioRepository repositorio;
	
	@RequestMapping("/usuarios")
	public List<Usuario> listarUsuarios() {		
		return repositorio.getUsuarios();
	}
	
	@RequestMapping("/usuarios/{id}")
	public Usuario getUsuario(@PathVariable("id") String id) {
		return repositorio.getUsuario(id);
	}
}
