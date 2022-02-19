package rjr.studio.libreria.business.dto.tipologiche;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TipoClassificazioneDeweyDto {

	private String classDeweyI;

	private String classDeweyII;

	private String descrizione;

}
