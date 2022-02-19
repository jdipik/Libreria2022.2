package rjr.studio.libreria.data.entity;

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
@Table(name = "EDITORI")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EditoreEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "NOME_AZIENDA", nullable = false, length = 255)
	private String nomeAzienda;
	
	@Column(name = "DENOMINAZIONE_SOCIALE", length = 255)
	private String denominazioneSociale;

}
