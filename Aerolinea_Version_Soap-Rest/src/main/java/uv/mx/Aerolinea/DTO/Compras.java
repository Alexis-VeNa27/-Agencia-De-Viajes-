package uv.mx.Aerolinea.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Compras {
	
	@Id
	private int idCompra;		
	private String nomCliente;
	private String metodoPago;
	private String asiento;					
	private int idVueloF;
	
	public int getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}
	public String getNomCliente() {
		return nomCliente;
	}
	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}
	public String getMetodoPago() {
		return metodoPago;
	}
	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}
	public String getAsiento() {
		return asiento;
	}
	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}
	public int getIdVueloF() {
		return idVueloF;
	}
	public void setIdVueloF(int idVueloF) {
		this.idVueloF = idVueloF;
	}
	
	
}
