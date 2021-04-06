package com.smartsoft.prueba.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartsoft.prueba.entity.Cliente;
import com.smartsoft.prueba.service.ClienteServiceDecl;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/cliente/")
public class ClienteControler {
	
	@Autowired
	private ClienteServiceDecl clienteService;
	
	
	@GetMapping
	private List<Cliente> listar() {
		return clienteService.getAllCliente();
	}

	@GetMapping(path = { "/{id}" })
	private Cliente buscarClientePorId(@PathVariable("id") Long id) {
		return clienteService.findById(id);
	}



}
