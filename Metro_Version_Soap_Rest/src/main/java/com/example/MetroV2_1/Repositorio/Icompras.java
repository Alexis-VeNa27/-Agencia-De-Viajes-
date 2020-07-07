package com.example.MetroV2_1.Repositorio;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.MetroV2_1.DTO.Compras;


@Transactional
public interface Icompras extends CrudRepository<Compras, Integer>{
	
	@Query(value="select * from Compras where compra = :compra", nativeQuery = true)
	public Compras findByCompra(String compra);
	
	@Modifying
	@Query(value="update Compras set fecha=:fecha, nombre_Linea=:nombreLinea, origen=:origen,precio=:precio,type_Pago=:typePago,type_Vagon=:typeVagon,usuario=:usuario where compra=:compra")
	public void updateCompra(String fecha,String nombreLinea,String origen, String precio,String typePago, String typeVagon, String usuario, String compra);

	@Modifying
	@Query(value="delete from Compras where compra = :compra", nativeQuery = true)
	public void deletebyNombre(String compra);
}
