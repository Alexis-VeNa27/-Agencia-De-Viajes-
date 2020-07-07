package com.example.MetroV2_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MetroV2_1.DTO.LineaMetro;
import com.example.MetroV2_1.Repositorio.ILineaMetro;

@RestController
@RequestMapping("/RestLinea")
public class LineaRestController {
	
	@Autowired
	ILineaMetro objIMetro ;
	
	@GetMapping("LineasMetro")
	public Iterable<LineaMetro> findAll(){
		//retornará todos las Lineas
		return objIMetro.findAll();
	}
	
	@PostMapping("/saveLinea")
	public LineaMetro addLinea(@RequestBody LineaMetro lineaMetro) {
		//Este metodo guardará al usuario enviado
		objIMetro.save(lineaMetro);
		
		return lineaMetro;
		
	}
	
	@PutMapping("/UpdateLinea")
	public LineaMetro updateLinea(@RequestBody LineaMetro linea) {
		objIMetro.save(linea);
		//este metodo actualizará al usuario enviado
		return linea;
	}
	
	@GetMapping("/findLinea/{nombreLinea}")
	public LineaMetro getLinea(@PathVariable String nombreLinea){
		LineaMetro objLinea=objIMetro.findByNombreLinea(nombreLinea);
		
		if(objLinea == null) {
			throw new RuntimeException("User id not found -"+nombreLinea);
		}
		//retornará al usuario con id pasado en la url
		return objLinea;
	}
	
	@DeleteMapping("/eliminarLinea/{nombreLinea}")
	public String deleteLinea(@PathVariable String nombreLinea) {
		LineaMetro objLinea=objIMetro.findByNombreLinea(nombreLinea);
		
		if(objLinea == null) { 
			throw new RuntimeException("User id not found -"+nombreLinea);
		}
		
		objIMetro.deletebyNombre(nombreLinea);
		
		//Esto método, recibira el id de un usuario por URL y se borrará de la bd.
		return "Deleted user id - "+nombreLinea;
	}

}
