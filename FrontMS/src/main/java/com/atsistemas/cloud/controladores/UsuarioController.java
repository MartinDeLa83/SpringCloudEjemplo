package com.atsistemas.cloud.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.atsistemas.cloud.entidades.Usuario;
import com.atsistemas.cloud.servicios.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	public UsuarioService servicio;
	
	@RequestMapping("/")
	public String home(){
		return "index";
	}
	
	@RequestMapping("/listaDeUsuarios")
	public String listarUsuarios(Model model) {
		List<Usuario> usuarios = servicio.getUsuarios();
		model.addAttribute("usuarios", usuarios);
		return "listaUsuarios";
	}
	
	@RequestMapping("/detalleUsuario")
	public String getUsuario(@RequestParam("id") String id, Model model) {
		Usuario usuario = servicio.getUsuario(id);
		model.addAttribute("usuario", usuario);
		return "detalleUsuario";
	}

}
