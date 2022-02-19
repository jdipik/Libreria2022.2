package rjr.studio.libreria.data.repository.tipologiche;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rjr.studio.libreria.data.entity.tipologiche.TipoClassificazioneDeweyEntity;
import rjr.studio.libreria.data.entity.tipologiche.TipoDeweyId;

@Repository
public interface TipoClassificazioneDeweyRepository extends JpaRepository<TipoClassificazioneDeweyEntity, TipoDeweyId>{

}
