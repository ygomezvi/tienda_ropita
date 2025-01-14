package ar.edu.davinci.dvds20231cg2.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteResponse {

	private Long id;

	private String nombre;

	private String apellido;

}
