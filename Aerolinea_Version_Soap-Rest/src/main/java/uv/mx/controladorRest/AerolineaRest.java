package uv.mx.controladorRest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uv.mx.Aerolinea.DTO.Compras;
import uv.mx.Aerolinea.DTO.Vuelos;
import uv.mx.Aerolinea.Repositorio.Icompras;
import uv.mx.Aerolinea.Repositorio.Ivuelos;

@RestController
public class AerolineaRest {
	
	@Autowired	
	private Icompras icompras;
	
	@Autowired
	private Ivuelos ivuelos;
			
	//AgregarVuelo...			
	@PostMapping("/rest/vuelos")
	public Vuelos agregarVuelo(@RequestBody Vuelos vuelo) {		
		
		//Este metodo guardará el vuelo enviado
		ivuelos.save(vuelo);
		
		return vuelo;	
	}		
	
	//MostrarVuelo..
	@GetMapping("/rest/vuelos/{idVuelo}")
	public Optional<Vuelos> mostrarVuelo(@PathVariable int idVuelo){
				
		Optional<Vuelos> vuelo = ivuelos.findById(idVuelo);
		
		if(vuelo == null) {
			throw new RuntimeException("El vuelo: "+idVuelo+ " no existe!");			
		}
		//retornará al vuelo con id pasado en la url
		return vuelo;
	}	
	
	//ModificarVuelo..
	@PutMapping("/rest/vuelos")	
	public Vuelos modificarVuelo(@RequestBody Vuelos vuelo) {		
		
		//Este metodo modificara el vuelo enviado
		ivuelos.save(vuelo);
		
		return vuelo;	
	}		
	
	//EliminarVuelo..
	@DeleteMapping("/rest/vuelos/{idVuelo}")	
	public String eliminarVuelo(@PathVariable int idVuelo) {
		
		Optional<Vuelos> vuelo = ivuelos.findById(idVuelo);
		
		if(vuelo == null) {
			throw new RuntimeException("El vuelo: "+idVuelo+ " no existe!");
		}
		
		ivuelos.deleteById(idVuelo);
		
		//Este método, recibira el id de un vuelo por URL y se borrará de la bd.
		return "Se elimino el vuelo con el ID: "+idVuelo;
	}
	
	
	//BuscarVuelos..
	@GetMapping("/rest/vuelos")
	public List<Vuelos> vuelos() {
		Iterable<Vuelos> listaVuelos = ivuelos.findAll();
		
		List<Vuelos> respuesta = new ArrayList<Vuelos>();
		for (Vuelos ls : listaVuelos) {
			respuesta.add(ls);
		}
		return respuesta;
	}
	
	//RealizarCompra...
	@PostMapping("/rest/compras")
	public Compras realizarCompra(@RequestBody Compras compra) {		
		
		//Este metodo realizara una compra
		icompras.save(compra);
				
		return compra;	
	}	
	
	
	//MostrarCompra...
	@GetMapping("/rest/compras/{idCompra}")
	public Optional<Compras> mostrarCompra(@PathVariable int idCompra){
				
		Optional<Compras> compra = icompras.findById(idCompra);
		
		if(compra == null) {
			throw new RuntimeException("La compra: "+idCompra+ " no existe!");			
		}
		//retornará la compra con id pasado en la url
		return compra;
	}	
	
	//ModificarCompra...
	@PutMapping("/rest/compras")	
	public Compras modificarCompra(@RequestBody Compras compra) {		
		
		//Este metodo modificara la compra realizada
		icompras.save(compra);
		
		return compra;	
	}	
	
	
	//CancelarCompra...
	@DeleteMapping("/rest/compras/{idCompra}")	
	public String cancelarCompra(@PathVariable int idCompra) {
		
		Optional<Compras> compra = icompras.findById(idCompra);
		
		if(compra == null) {
			throw new RuntimeException("La compra: "+idCompra+ " no existe!");
		}
		
		icompras.deleteById(idCompra);
		
		//Este método, recibira el id de una compra por URL y se borrará de la bd.
		return "Se cancelo la compra con el ID: "+idCompra;
	}
}