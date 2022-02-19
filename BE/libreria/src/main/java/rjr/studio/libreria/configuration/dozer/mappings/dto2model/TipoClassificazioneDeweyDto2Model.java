package rjr.studio.libreria.configuration.dozer.mappings.dto2model;

import org.springframework.stereotype.Component;

import com.github.dozermapper.core.loader.api.BeanMappingBuilder;

import rjr.studio.libreria.api.model.tipologiche.TipoClassificazioneDewey;
import rjr.studio.libreria.business.dto.tipologiche.TipoClassificazioneDeweyDto;
import rjr.studio.libreria.configuration.dozer.DozerMapping;

@Component
public class TipoClassificazioneDeweyDto2Model implements DozerMapping {

	@Override
	public BeanMappingBuilder get() {
		return new BeanMappingBuilder() {
			@Override
			protected void configure() {
				mapping(TipoClassificazioneDeweyDto.class, TipoClassificazioneDewey.class);
			}
		};
	}
}
