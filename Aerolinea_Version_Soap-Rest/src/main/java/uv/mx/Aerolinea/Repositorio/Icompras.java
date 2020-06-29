package uv.mx.Aerolinea.Repositorio;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import uv.mx.Aerolinea.DTO.Compras;

public interface Icompras extends CrudRepository<Compras, Integer>{
	
	@Query("select idCompra, idVueloF, nomCliente, metodoPago, asiento "
			+ "from Compras c "
			+ "where c.idCompra = :id_compra")
	String mostrarDatosCompra(@Param("id_compra") int idCompra);	
			
	@Modifying
	@Query(value="update Compras set id_vuelof=:idVueloF, nom_cliente=:nomCliente, metodo_pago=:metodoPago, asiento=:asiento where id_compra=:idCompra")
	public void modificarCompra(int idCompra, int idVueloF, String nomCliente, String metodoPago, String asiento);

}
