package uv.mx.Aerolinea.Repositorio;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import uv.mx.Aerolinea.DTO.Vuelos;

@Transactional
public interface Ivuelos extends CrudRepository<Vuelos, Integer> {
	
	@Query("select idVuelo, origen, destino, hora, fecha, precio "
			+ "from Vuelos v "
			+ "where v.idVuelo = :id_vuelo")
	String mostrarDatosVuelo(@Param("id_vuelo") int idVuelo);			
	
	@Modifying
	@Query(value="update Vuelos set origen=:origen, destino=:destino, hora=:hora, fecha=:fecha, precio=:precio where id_vuelo=:idVuelo")
	public void modificarVuelo(int idVuelo, String origen, String destino, String hora, String fecha, int precio);	
}