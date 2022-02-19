package rjr.studio.libreria.data.entity.tipologiche;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TipoDeweyId implements Serializable{
	
	private static final long serialVersionUID = 3296884933821238738L;

	@Column(name = "CLASS_DEWEY_I", nullable = false, length = 3)
	private String classDeweyI;
	
	@Column(name = "CLASS_DEWEY_II", nullable = false, length = 3)
	private String classDeweyII;

}
