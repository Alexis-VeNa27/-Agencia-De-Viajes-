package com.example.MetroV2_1.Repositorio;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.MetroV2_1.DTO.LineaMetro;

@Transactional
public interface ILineaMetro extends CrudRepository<LineaMetro, Integer> {
	
	@Query(value="select * from linea_metro where nombre_linea = :nombreLinea", nativeQuery = true)
	public LineaMetro findByNombreLinea(String nombreLinea);

	@Modifying
	@Query(value="delete from linea_metro where Nombre_Linea = :NombreLinea", nativeQuery = true)
	public void deletebyNombre(String NombreLinea);
	
	@Modifying
	@Query(value="update LineaMetro set destino=:destino, horario=:horario, origen=:origen, precio=:precio where nombre_linea=:nombreLinea")
	public void updateLineaMetro(String destino, String horario, String origen, String precio, String nombreLinea);
}
