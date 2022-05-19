package com.usuario.service.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.usuario.service.modelos.Moto;

//Feign indica que es un cliente del servicio usuario que tiene como nombre "moto-service" y que se 
//encuentra expuesto en la url-puerto ""http://localhost:8003"

//Con una configuracion GateWay se quita esta y se pone la de abajo
//@FeignClient(name = "moto-service",url = "http://localhost:8003")
@FeignClient(name = "moto-service")
@RequestMapping("/moto")
public interface MotoFeignClient {

	@PostMapping()
	public Moto save(@RequestBody Moto moto);
	
	@GetMapping("/usuario/{usuarioId}")
	public List<Moto> getMotos(@PathVariable("usuarioId") int usuarioId);
}
