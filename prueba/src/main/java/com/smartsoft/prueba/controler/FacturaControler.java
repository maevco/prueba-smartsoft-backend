package com.smartsoft.prueba.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.smartsoft.prueba.entity.Factura;
import com.smartsoft.prueba.service.FacturaServiceDecl;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/factura/")
public class FacturaControler {

	@Autowired
	private FacturaServiceDecl facturaService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Factura create(@RequestBody Factura factura) {
		return facturaService.add(factura);
	}

}
