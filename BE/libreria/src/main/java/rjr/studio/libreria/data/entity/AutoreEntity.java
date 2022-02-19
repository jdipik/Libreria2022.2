package rjr.studio.libreria.data.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "AUTORI")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AutoreEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "COGNOME", nullable = false, length = 255)
	private String cognome;
	
	@Column(name = "NOME", nullable = false, length = 255)
	private String nome;
	
	@Column(name = "PSEUDONIMO", length = 255)
	private String pseudonimo;
	
	@Column(name = "DATA_NASCITA")
	private LocalDate dataNascita;
	
	@Column(name = "LUOGO_NASCITA", length = 100)
	private String luogoNascita;
	
	@Column(name = "DATA_DECESSO")
	private LocalDate DataDecesso;
	
	@Column(name = "LUOGO_DECESSO", length = 100)
	private String luogoDecesso;
}
