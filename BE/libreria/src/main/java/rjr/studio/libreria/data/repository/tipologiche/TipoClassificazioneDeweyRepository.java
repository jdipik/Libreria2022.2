package rjr.studio.libreria.data.repository.tipologiche;

import org.springframework.data.jpa.repository.JpaRepository;

import rjr.studio.libreria.data.entity.tipologiche.TipoClassificazioneDeweyEntity;
import rjr.studio.libreria.data.entity.tipologiche.TipoDeweyId;

public interface TipoClassificazioneDeweyRepository extends JpaRepository<TipoClassificazioneDeweyEntity, TipoDeweyId>{

}
