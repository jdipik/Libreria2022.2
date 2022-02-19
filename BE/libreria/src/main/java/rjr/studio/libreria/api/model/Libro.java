package rjr.studio.libreria.api.model;

import java.time.LocalDate;
import java.util.Set;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import rjr.studio.libreria.api.model.tipologiche.TipoClassificazioneDewey;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Libro {

	private Long id;
	
	@NotNull
	@Size(min = 1, max = 255, message = "La lunghezza del titolo deve essere compresa tra 1 e 255 caratteri")
	private String titolo;
	
	private Set<Autore> autori;
	
	private Editore editore;
	
	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate annoPubblicazione;
	
	@NotNull
	@Size(min = 13, max = 13, message = "La lunghezza del codice ISBN e' di 13 caratteri")
	private Integer codiceISBN;
	
	private TipoClassificazioneDewey tipoClassificazioneDewey;

}
