package com.atsistemas.cloud.repositorios;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.atsistemas.cloud.entidades.Usuario;

@FeignClient("BACKMS")
public interface UsuarioRepositoryFeign {
	
	@RequestMapping(value="/usuarios", method = RequestMethod.GET)
	List<Usuario> getUsuarios();
	
	@RequestMapping("/usuarios/{id}")
	Usuario getUsuario(@PathVariable("id") String id);

}
