package rjr.studio.libreria.data.entity.tipologiche;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
public abstract class Tipologica {
	
	private String codice;
	private String descrizione;

}
