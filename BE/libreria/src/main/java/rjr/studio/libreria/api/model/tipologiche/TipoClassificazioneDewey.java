package rjr.studio.libreria.api.model.tipologiche;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoClassificazioneDewey {

	@JsonProperty("ClassificazioneDeweyLivelloI")
	private String classDeweyI;

	@JsonProperty("ClassificazioneDeweyLivelloII")
	private String classDeweyII;

	private String descrizione;
	
}
