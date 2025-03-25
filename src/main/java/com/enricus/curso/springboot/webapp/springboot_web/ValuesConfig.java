package com.enricus.curso.springboot.webapp.springboot_web;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration

@PropertySources({
	@PropertySource(value="classpath:values.properties", encoding="UTF-8"),
	// @PropertySource("classpath:values2.properties")
})
// @PropertySource("classpath:values.properties")
public class ValuesConfig {

//en la raiz del proyecto para añadir PropertySources
}
