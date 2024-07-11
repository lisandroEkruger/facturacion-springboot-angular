package com.app.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.app.entity.CabFactura;

public interface CabFacturaRepository extends CrudRepository<CabFactura, Integer> {

    @Query(value = "SELECT COALESCE(MAX(num_factura), 0) + 1 as num_factura FROM facturacion.cab_factura", nativeQuery = true)
    public Integer generaFactura();
}
