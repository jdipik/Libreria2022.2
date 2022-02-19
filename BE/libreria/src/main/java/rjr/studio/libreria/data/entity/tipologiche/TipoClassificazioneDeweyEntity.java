package rjr.studio.libreria.data.entity.tipologiche;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TIPO_CLASSIFICAZIONE_DEWEY")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TipoClassificazioneDeweyEntity {
	
	@EmbeddedId
	private TipoDeweyId id;
	
	@Column(name = "DESCRIZIONE", nullable = false, length = 255)
	private String descrizione;

}
