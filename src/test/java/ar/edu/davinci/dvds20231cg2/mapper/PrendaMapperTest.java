package ar.edu.davinci.dvds20231cg2.mapper;

import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ar.edu.davinci.dvds20231cg2.controller.request.PrendaInsertRequest;
import ar.edu.davinci.dvds20231cg2.controller.request.PrendaUpdateRequest;
import ar.edu.davinci.dvds20231cg2.controller.response.PrendaResponse;
import ar.edu.davinci.dvds20231cg2.domain.Prenda;
import ar.edu.davinci.dvds20231cg2.domain.TipoPrenda;

class PrendaMapperTest {

	private final Logger LOGGER = LoggerFactory.getLogger(PrendaMapperTest.class);
	private final PrendaMapper mapper = PrendaMapper.instance;
	
	@Test
	void testMapToPrendaResponse() {
		Prenda prenda = Prenda.builder()
				.id(10L)
				.descripcion("prueba dto")
				.tipo(TipoPrenda.BUFANDA)
				.precioBase(new BigDecimal(100.2))
				.build();
		LOGGER.info("Prenda: " + prenda.toString());
		PrendaResponse prendaResponse = mapper.mapToPrendaResponse(prenda);
		LOGGER.info("prendaResponse: " + prendaResponse.toString());
	}
	@Test
	void testPrendaInsertRequestMatToPrenda() {
		PrendaInsertRequest prendaInsertRequest = PrendaInsertRequest.builder()
				.descripcion("prueba dto")
				.tipo("BUFANDA")
				.precioBase(new BigDecimal(100.2))
				.build();
		LOGGER.info("prendaInsertRequest: " + prendaInsertRequest.toString());
		Prenda prenda = mapper.matToPrenda(prendaInsertRequest);
		LOGGER.info("Prenda: " + prenda.toString());
	}
	@Test
	void testPrendaUpdateRequestMatToPrenda() {
		PrendaUpdateRequest prendaUpdateRequest = PrendaUpdateRequest.builder()
				.descripcion("prueba dto")
				.tipo("BUFANDA")
				.precioBase(new BigDecimal(100.2))
				.build();
		LOGGER.info("prendaUpdateRequest: " + prendaUpdateRequest.toString());
		Prenda prenda = mapper.matToPrenda(prendaUpdateRequest);
		LOGGER.info("Prenda: " + prenda.toString());
	}

}
