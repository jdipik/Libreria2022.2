package rjr.studio.libreria.business.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EditoreDto {

	private Long id;

	private String nomeAzienda;

	private String denominazioneSociale;

}
