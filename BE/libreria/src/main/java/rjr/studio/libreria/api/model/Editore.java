package rjr.studio.libreria.api.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Editore {

	private Long id;

	@NotNull
	@Size(min = 1, max = 255, message = "La lunghezza del nome dell'azienda deve essere compresa tra 1 e 255 caratteri")
	private String nomeAzienda;

	@NotNull
	@Size(min = 1, max = 255, message = "La lunghezza della denominazione sociale deve essere compresa tra 1 e 255 caratteri")
	private String denominazioneSociale;

}
