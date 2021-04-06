package com.smartsoft.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartsoft.prueba.entity.Cliente;
import com.smartsoft.prueba.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteServiceDecl {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<Cliente> getAllCliente() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente findById(long id) {		
		return clienteRepository.findById(id);
	}

	

}
