package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetFacturaDTO {

    private Integer codigoProducto;
    private Integer cantidad;
    private Integer pkCabFactura;

}
