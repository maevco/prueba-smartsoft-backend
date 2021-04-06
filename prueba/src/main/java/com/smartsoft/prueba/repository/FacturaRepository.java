package com.smartsoft.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartsoft.prueba.entity.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long> {

}
