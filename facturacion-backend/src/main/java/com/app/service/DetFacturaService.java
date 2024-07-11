package com.app.service;

import com.app.dto.DetFacturaDTO;
import com.app.repository.CabFacturaRepository;
import com.app.repository.DetFacturaRepository;

import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetFacturaService {

    @SuppressWarnings("unused")
	private static  final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(DetFacturaService.class);
    private final DetFacturaRepository detFacturaRepository;

    @SuppressWarnings("unused")
	private final CabFacturaRepository cabFacturaRepository;

    public DetFacturaService(DetFacturaRepository detFacturaRepository, CabFacturaRepository cabFacturaRepository) {
        this.detFacturaRepository = detFacturaRepository;
        this.cabFacturaRepository = cabFacturaRepository;
    }

    @Transactional
    public void insertarFacturas(List<DetFacturaDTO> detFacturaDTOs) {
        for (DetFacturaDTO detFacturaDTO : detFacturaDTOs) {
            this.detFacturaRepository.insertarFactura(  detFacturaDTO.getCodigoProducto(),
                                                        detFacturaDTO.getCantidad(),
                                                        detFacturaDTO.getPkCabFactura()
                                                      );
        }
    }

}
