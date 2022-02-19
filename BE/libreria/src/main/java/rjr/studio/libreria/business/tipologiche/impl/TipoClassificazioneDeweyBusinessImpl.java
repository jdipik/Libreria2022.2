package rjr.studio.libreria.business.tipologiche.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.dozermapper.core.Mapper;

import lombok.RequiredArgsConstructor;
import rjr.studio.libreria.api.model.tipologiche.TipoClassificazioneDewey;
import rjr.studio.libreria.business.dto.tipologiche.TipoClassificazioneDeweyDto;
import rjr.studio.libreria.business.tipologiche.TipoClassificazioneDeweyBusiness;
import rjr.studio.libreria.configuration.dozer.DozerUtility;
import rjr.studio.libreria.service.tipologiche.TipoClassificazioneDeweyService;

@Component
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class TipoClassificazioneDeweyBusinessImpl implements TipoClassificazioneDeweyBusiness{
	
	private final Mapper mapper;
	
	private final TipoClassificazioneDeweyService tipoClassificazioneDeweyService;

	@Override
	public List<TipoClassificazioneDewey> findAll() {
				
		return DozerUtility
				.mapList(mapper, DozerUtility
						.mapList(mapper, tipoClassificazioneDeweyService.findAll(), TipoClassificazioneDeweyDto.class),
						TipoClassificazioneDewey.class);
	}

}
