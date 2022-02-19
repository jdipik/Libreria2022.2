package rjr.studio.libreria.api.model.tipologiche;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TipoClassificazioneDewey {

	@JsonAlias("ClassificazioneDeweyLivelloI")
	private String classDeweyI;

	@JsonAlias("ClassificazioneDeweyLivelloII")
	private String classDeweyII;

	private String descrizione;

}
