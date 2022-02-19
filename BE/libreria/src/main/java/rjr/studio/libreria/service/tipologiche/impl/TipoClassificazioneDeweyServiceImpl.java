package rjr.studio.libreria.service.tipologiche.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import rjr.studio.libreria.data.entity.tipologiche.TipoClassificazioneDeweyEntity;
import rjr.studio.libreria.data.repository.tipologiche.TipoClassificazioneDeweyRepository;
import rjr.studio.libreria.service.tipologiche.TipoClassificazioneDeweyService;

@Service
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class TipoClassificazioneDeweyServiceImpl implements TipoClassificazioneDeweyService {

	private final TipoClassificazioneDeweyRepository tipoClassificazioneDeweyRepository;
	
	@Override
	public List<TipoClassificazioneDeweyEntity> findAll() {
		return tipoClassificazioneDeweyRepository.findAll();
	}

}
