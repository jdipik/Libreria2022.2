package rjr.studio.libreria.business.dto;

import java.time.LocalDate;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import rjr.studio.libreria.data.entity.tipologiche.TipoClassificazioneDeweyEntity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LibroDto {

	private Long id;

	private String titolo;

	private Set<AutoreDto> autori;

	private EditoreDto editore;

	private LocalDate annoPubblicazione;

	private Integer codiceISBN;

	private TipoClassificazioneDeweyEntity tipoClassificazioneDewey;

}
