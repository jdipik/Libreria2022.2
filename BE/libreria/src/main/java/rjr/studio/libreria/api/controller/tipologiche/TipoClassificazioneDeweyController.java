package rjr.studio.libreria.api.controller.tipologiche;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import rjr.studio.libreria.api.model.tipologiche.TipoClassificazioneDewey;

@RequestMapping("/libreria20222/tipologiche")
public interface TipoClassificazioneDeweyController {
	
	@GetMapping(value = "/dewey")
	public List<TipoClassificazioneDewey> findAll();

}
