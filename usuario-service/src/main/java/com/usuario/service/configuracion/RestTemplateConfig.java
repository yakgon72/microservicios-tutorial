package com.usuario.service.configuracion;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

	// Anotamos con el decorador @LoadBalanced porque este bean estara dando soporte de balanceo de carga
	// en las peticiones de los demas servicios
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
