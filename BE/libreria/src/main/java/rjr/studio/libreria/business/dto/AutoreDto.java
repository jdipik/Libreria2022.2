package rjr.studio.libreria.business.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AutoreDto {

	private Long id;

	private String cognome;

	private String nome;

	private String pseudonimo;

	private LocalDate dataNascita;

	private String luogoNascita;

	private LocalDate DataDecesso;

	private String luogoDecesso;
}
