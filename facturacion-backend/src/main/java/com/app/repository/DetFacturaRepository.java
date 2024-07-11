package com.app.repository;

import com.app.entity.DetFactura;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DetFacturaRepository extends CrudRepository<DetFactura, Integer> {


    @Modifying
    @Transactional
    @Query(value = "INSERT INTO det_factura (codigo_producto, cantidad, pk_cab_factura) VALUES (?1, ?2, ?3)", nativeQuery = true)
    void insertarFactura(Integer codigoProducto, Integer cantidad, Integer pkCabFactura);
}
