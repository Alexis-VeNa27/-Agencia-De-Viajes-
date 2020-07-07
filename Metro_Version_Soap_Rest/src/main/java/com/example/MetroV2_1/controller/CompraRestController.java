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

import com.example.MetroV2_1.DTO.Compras;
import com.example.MetroV2_1.Repositorio.Icompras;


@RestController
@RequestMapping("/RestCompras")
public class CompraRestController {

	@Autowired
	Icompras objICompras;
	
	@GetMapping("/Compras")
	public Iterable<Compras> findAll(){
		//retornará todos las Lineas
		return objICompras.findAll();
	}
	
	@PostMapping("/saveCompra")
	public Compras addUser(@RequestBody Compras compra) {
		//Este metodo guardará al usuario enviado
		objICompras.save(compra);
		
		return compra;
	}
	
	@PutMapping("/updateCompra")
	public Compras updateUser(@RequestBody Compras compra) {
		objICompras.save(compra);
		//este metodo actualizará al usuario enviado
		return compra;
	}
	
	@GetMapping("/findCompra/{nombreCompra}")
	public Compras getUser(@PathVariable String compra){
		Compras objCompra=objICompras.findByCompra(compra);
		
		if(objCompra == null) {
			throw new RuntimeException("User id not found -"+compra);
		}
		//retornará al usuario con id pasado en la url
		return objCompra;
	}
	
	@DeleteMapping("/eliminarCompra/{nombreCompra}")
	public String deleteUser(@PathVariable String compra) {
		Compras objCompra=objICompras.findByCompra(compra);
		
		if(objCompra == null) { 
			throw new RuntimeException("User id not found -"+compra);
		}
		
		objICompras.deletebyNombre(compra);
		
		//Esto método, recibira el id de un usuario por URL y se borrará de la bd.
		return "Deleted Compra id - "+compra;
	}
}
