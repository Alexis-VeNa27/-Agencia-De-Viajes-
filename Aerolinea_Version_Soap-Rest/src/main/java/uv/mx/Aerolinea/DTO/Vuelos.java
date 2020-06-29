package uv.mx.Aerolinea.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vuelos {
	
	@Id
	private int idVuelo;	
	private String origen;
	private String destino;
	private String hora;
	private String fecha;
	private int precio;	
	
	public Vuelos() {
		
	}
	
	public Vuelos(int idVuelo, String origen, String destino, String hora, String fecha, int precio) {
		super();
		this.idVuelo = idVuelo;
		this.origen = origen;
		this.destino = destino;
		this.hora = hora;
		this.fecha = fecha;
		this.precio = precio;
	}
	
	public int getIdVuelo() {
		return idVuelo;
	}
	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
}
