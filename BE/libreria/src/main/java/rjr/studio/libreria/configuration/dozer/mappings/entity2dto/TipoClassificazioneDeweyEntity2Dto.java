package rjr.studio.libreria.configuration.dozer.mappings.entity2dto;

import org.springframework.stereotype.Component;

import com.github.dozermapper.core.loader.api.BeanMappingBuilder;

import rjr.studio.libreria.business.dto.tipologiche.TipoClassificazioneDeweyDto;
import rjr.studio.libreria.configuration.dozer.DozerMapping;
import rjr.studio.libreria.data.entity.tipologiche.TipoClassificazioneDeweyEntity;

@Component
public class TipoClassificazioneDeweyEntity2Dto implements DozerMapping {

	@Override
	public BeanMappingBuilder get() {
		return new BeanMappingBuilder() {
			@Override
			protected void configure() {
				mapping(TipoClassificazioneDeweyEntity.class, TipoClassificazioneDeweyDto.class)
				.fields("id.classDeweyI", "classDeweyI")
				.fields("id.classDeweyII", "classDeweyII")
				;
			}
		};
	}
}
