package com.example.MetroV2_1.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LineaMetro {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer Id;
	private String NombreLinea;
	private String Origen;
	private String Destino;
	private String Horario;
	private String Precio;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getNombreLinea() {
		return NombreLinea;
	}
	public void setNombreLinea(String nombreLinea) {
		NombreLinea = nombreLinea;
	}
	public String getOrigen() {
		return Origen;
	}
	public void setOrigen(String origen) {
		Origen = origen;
	}
	public String getDestino() {
		return Destino;
	}
	public void setDestino(String destino) {
		Destino = destino;
	}
	public String getHorario() {
		return Horario;
	}
	public void setHorario(String horario) {
		Horario = horario;
	}
	public String getPrecio() {
		return Precio;
	}
	public void setPrecio(String precio) {
		Precio = precio;
	}
	
	
}
