package com.usuario.service.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.usuario.service.modelos.Carro;

// Feign indica que es un cliente del servicio usuario que tiene como nombre "carro-service" y que se 
// encuentra expuesto en la url-puerto ""http://localhost:8002"

// Con una configuracion GateWay se quita esta y se pone la de abajo
//@FeignClient(name = "carro-service",url = "http://localhost:8002")
@FeignClient(name = "carro-service")

@RequestMapping("/carro")
public interface CarroFeignClient {

	@PostMapping()
	public Carro save(@RequestBody Carro carro);
	
	@GetMapping("/usuario/{usuarioId}")
	public List<Carro> getCarros(@PathVariable("usuarioId") int usuarioId);
}
