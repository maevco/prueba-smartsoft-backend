package com.smartsoft.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartsoft.prueba.entity.Detalle;

@Repository
public interface DetalleRepository extends JpaRepository<Detalle, Long>{

}
