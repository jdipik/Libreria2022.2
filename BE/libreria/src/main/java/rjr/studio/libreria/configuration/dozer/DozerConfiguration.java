package rjr.studio.libreria.configuration.dozer;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.dozermapper.core.loader.api.BeanMappingBuilder;
import com.github.dozermapper.spring.DozerBeanMapperFactoryBean;
import com.github.dozermapper.springboot.autoconfigure.DozerProperties;

import lombok.RequiredArgsConstructor;


@Configuration
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
@EnableConfigurationProperties(DozerProperties.class)
public class DozerConfiguration {
	
	private final DozerProperties properties;
	private final List<DozerMapping> builders;

	@Bean("mapper")
	public DozerBeanMapperFactoryBean dozerMapper() throws IOException {
		DozerBeanMapperFactoryBean factoryBean = new DozerBeanMapperFactoryBean();
		factoryBean.setMappingFiles(properties.getMappingFiles());
		// @formatter:off
		List<BeanMappingBuilder> mappings = builders.stream()
				.map(DozerMapping::get)
				.collect(Collectors.toList());
		// @formatter:on

		factoryBean.setMappingBuilders(mappings);
		return factoryBean;
	}

}
