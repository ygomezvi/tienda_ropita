package ar.edu.davinci.dvds20231cg2.controller.response;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PrendaResponse {
	private Long id;

	private String descripcion;

	private String tipo;

	private BigDecimal precioBase;

}
