package rjr.studio.libreria.data.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import rjr.studio.libreria.data.entity.tipologiche.TipoClassificazioneDeweyEntity;

@Entity
@Table(name = "LIBRI")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LibroEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "TITOLO", nullable = false, length = 255)
	private String titolo;
	
	@OneToMany
	@Column(name = "AUTORI")
	private Set<AutoreEntity> autori;
	
	@ManyToOne
	@JoinColumn(name = "EDITORE")
	private EditoreEntity editore;
	
	@Column(name = "ANNO_PUBBLICAZIONE", nullable = false)
	private LocalDate annoPubblicazione;
	
	@Column(name = "CODICE_ISBN", length = 13)
	private Integer codiceISBN;
	
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "CLASS_DEWEY_I", referencedColumnName = "CLASS_DEWEY_I"),
		@JoinColumn(name = "CLASS_DEWEY_II", referencedColumnName = "CLASS_DEWEY_II")
	})
	
	private TipoClassificazioneDeweyEntity tipoClassificazioneDewey;

}
