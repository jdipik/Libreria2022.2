package rjr.studio.libreria.api.controller.tipologiche.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import rjr.studio.libreria.api.controller.tipologiche.TipoClassificazioneDeweyController;
import rjr.studio.libreria.api.model.tipologiche.TipoClassificazioneDewey;
import rjr.studio.libreria.business.tipologiche.TipoClassificazioneDeweyBusiness;

@RestController
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class TipoClassificazioneDeweyControllerImpl implements TipoClassificazioneDeweyController {
	
	private final TipoClassificazioneDeweyBusiness tipoClassificazioneDeweyBusiness;

	@Override
	public List<TipoClassificazioneDewey> findAll() {
		return tipoClassificazioneDeweyBusiness.findAll();
	}

}
