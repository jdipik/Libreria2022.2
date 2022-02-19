package rjr.studio.libreria.api.model;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Autore {

	private Long id;

	@NotNull
	@Size(min = 1, max = 255, message = "La lunghezza del cognome deve essere compresa tra 1 e 255 caratteri")
	private String cognome;

	@NotNull
	@Size(min = 1, max = 255, message = "La lunghezza del nome deve essere compresa tra 1 e 255 caratteri")
	private String nome;

	@Size(min = 1, max = 255, message = "La lunghezza dello pseudonimo deve essere compresa tra 1 e 255 caratteri")
	private String pseudonimo;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dataNascita;

	@Size(min = 1, max = 100, message = "La lunghezza del luogo di nascita deve essere compresa tra 1 e 100 caratteri")
	private String luogoNascita;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate DataDecesso;

	@Size(min = 1, max = 100, message = "La lunghezza del luogo del decesso deve essere compresa tra 1 e 100 caratteri")
	private String luogoDecesso;
}
