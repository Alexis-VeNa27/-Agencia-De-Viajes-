package com.example.MetroV2_1.DTO;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Compras {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer ID;
	private String Compra;
	private String Usuario;
	private String TypeVagon;
	private String Origen;
	private String NombreLinea;
	private String TypePago;
	private String Fecha;
	private String Precio;
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getCompra() {
		return Compra;
	}
	public void setCompra(String compra) {
		Compra = compra;
	}
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	public String getTypeVagon() {
		return TypeVagon;
	}
	public void setTypeVagon(String typeVagon) {
		TypeVagon = typeVagon;
	}
	public String getOrigen() {
		return Origen;
	}
	public void setOrigen(String origen) {
		Origen = origen;
	}
	public String getNombreLinea() {
		return NombreLinea;
	}
	public void setNombreLinea(String nombreLinea) {
		NombreLinea = nombreLinea;
	}
	public String getTypePago() {
		return TypePago;
	}
	public void setTypePago(String typePago) {
		TypePago = typePago;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	public String getPrecio() {
		return Precio;
	}
	public void setPrecio(String precio) {
		Precio = precio;
	}

	
}

