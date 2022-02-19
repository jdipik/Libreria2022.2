package rjr.studio.libreria.data.entity.tipologiche;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
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
public class TipoClassificazioneDeweyEntity implements Serializable {
	
	private static final long serialVersionUID = 527698724402990003L;

	@EmbeddedId TipoDeweyId id;
	
	@Column(name = "DESCRIZIONE", nullable = false, length = 255)
	private String descrizione;
	
	@Embeddable
	class TipoDeweyId implements Serializable{
		
		private static final long serialVersionUID = 3296884933821238738L;

		@Column(name = "CLASS_DEWEY_I", nullable = false, length = 3)
		private String classDeweyI;
		
		@Column(name = "CLASS_DEWEY_II", nullable = false, length = 3)
		private String classDeweyII;
	}

}
