package com.example.MetroV2_1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.MetroV2_1.DTO.Compras;
import com.example.MetroV2_1.DTO.LineaMetro;
import com.example.MetroV2_1.DTO.Usuario;
import com.example.MetroV2_1.Repositorio.ILineaMetro;
import com.example.MetroV2_1.Repositorio.Icompras;
import com.example.MetroV2_1.Repositorio.Iusuario;

import me.uvmetro.metrov2_1.ActualizarCompraRequest;
import me.uvmetro.metrov2_1.ActualizarCompraResponse;
import me.uvmetro.metrov2_1.ActualizarLineaMetroRequest;
import me.uvmetro.metrov2_1.ActualizarLineaMetroResponse;
import me.uvmetro.metrov2_1.ActualizarUsuarioRequest;
import me.uvmetro.metrov2_1.ActualizarUsuarioResponse;
import me.uvmetro.metrov2_1.CancelarCompraRequest;
import me.uvmetro.metrov2_1.CancelarCompraResponse;
import me.uvmetro.metrov2_1.CompraRequest;
import me.uvmetro.metrov2_1.CompraResponse;
import me.uvmetro.metrov2_1.EliminarLineaMetroRequest;
import me.uvmetro.metrov2_1.EliminarLineaMetroResponse;
import me.uvmetro.metrov2_1.EliminarUsuarioRequest;
import me.uvmetro.metrov2_1.EliminarUsuarioResponse;
import me.uvmetro.metrov2_1.LineasMetroRequest;
import me.uvmetro.metrov2_1.LineasMetroResponse;
import me.uvmetro.metrov2_1.MostrarCompraRequest;
import me.uvmetro.metrov2_1.MostrarCompraResponse;
import me.uvmetro.metrov2_1.MostrarComprasRequest;
import me.uvmetro.metrov2_1.MostrarComprasResponse;
import me.uvmetro.metrov2_1.MostrarLineaMetroRequest;
import me.uvmetro.metrov2_1.MostrarLineaMetroResponse;
import me.uvmetro.metrov2_1.MostrarLineasRequest;
import me.uvmetro.metrov2_1.MostrarLineasResponse;
import me.uvmetro.metrov2_1.MostrarUsuarioRequest;
import me.uvmetro.metrov2_1.MostrarUsuarioResponse;
import me.uvmetro.metrov2_1.MostrarUsuariosRequest;
import me.uvmetro.metrov2_1.MostrarUsuariosResponse;
import me.uvmetro.metrov2_1.UsuarioRequest;
import me.uvmetro.metrov2_1.UsuarioResponse;

@Endpoint
public class EndPoint {
	
	@Autowired
	Icompras objICompra;
	@Autowired
	Iusuario objIusuario;
	@Autowired
	ILineaMetro objIMetro;
	
	@PayloadRoot(localPart="CompraRequest", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public CompraResponse getCompraExitosa(@RequestPayload CompraRequest peticion) {
		CompraResponse respuesta=new CompraResponse();
		Usuario objUsuario=new Usuario();
		LineaMetro objMetro=new LineaMetro();
		Compras objCompra= new Compras();
		
		objUsuario=objIusuario.findByUser(peticion.getUsuario());
		objMetro=objIMetro.findByNombreLinea(peticion.getNombreLinea());
		objCompra=objICompra.findByCompra(peticion.getCompra());
		
		
		if(objUsuario== null) {
			respuesta.setCompra("El Usuario ingresado no existe por favor registrate");
		}else if(objMetro==null) {
			respuesta.setCompra("La linea de metro ingresada no existe por favor elije otra");
		}else if(objCompra != null) {
			respuesta.setCompra("Escoge otro nombre para tu compra este ya existe");
		}else {
			respuesta.setCompra("Compra = "+peticion.getCompra());
			respuesta.setUsuario("Usuario = "+peticion.getUsuario());
			respuesta.setFecha("Fecha = "+peticion.getFecha());
			respuesta.setOrigen("Origen = "+peticion.getOrigen());
			respuesta.setNombreLinea("Linea = "+peticion.getNombreLinea());
			respuesta.setTypeVagon("Vagon = "+peticion.getTypeVagon());
			respuesta.setPrecio("Precio = "+peticion.getPrecio());
			respuesta.setTypePago("Tipo de pago = "+peticion.getTypePago());
			
			objCompra=new Compras();
			objCompra.setCompra(peticion.getCompra());
			objCompra.setUsuario(peticion.getUsuario());
			objCompra.setFecha(peticion.getFecha());
			objCompra.setOrigen(peticion.getOrigen());
			objCompra.setNombreLinea(peticion.getNombreLinea());
			objCompra.setTypeVagon(peticion.getTypeVagon());
			objCompra.setPrecio(peticion.getPrecio());
			objCompra.setTypePago(peticion.getTypePago());
			
			objICompra.save(objCompra);
		}
		return respuesta;
	}
	
	@PayloadRoot(localPart="ActualizarCompraRequest", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public ActualizarCompraResponse getActualizarCompraExitosa(@RequestPayload ActualizarCompraRequest peticion) {
		ActualizarCompraResponse respuestaActualizar=new ActualizarCompraResponse();
		Compras objCompra= new Compras();
		
		objCompra=objICompra.findByCompra(peticion.getCompra());
		if(objCompra == null) {
			respuestaActualizar.setRespuesta("La compra no existe "+peticion.getCompra());
		}else {
			
			objICompra.updateCompra(peticion.getFecha(), peticion.getNombreLinea(), peticion.getOrigen(), peticion.getPrecio(), peticion.getTypePago(), peticion.getTypeVagon(), peticion.getUsuario(),peticion.getCompra());
			
			respuestaActualizar.setRespuesta("Compra con Nombre: "+peticion.getCompra()+" fue Actualizada con exito");
		}	
		
		return respuestaActualizar;
	}
	
	@PayloadRoot(localPart="CancelarCompraRequest", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public CancelarCompraResponse getCancelarCompraExitosa(@RequestPayload CancelarCompraRequest peticion) {
		CancelarCompraResponse respuestaCancelar=new CancelarCompraResponse();
		Compras objCompra= new Compras();
		objCompra=objICompra.findByCompra(peticion.getCancelación());
		objICompra.delete(objCompra);
		respuestaCancelar.setRespuesta("Compra con id: "+peticion.getCancelación()+" Fue cancelada");
		return respuestaCancelar;
	}
	
	@PayloadRoot(localPart="MostrarCompraRequest", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public MostrarCompraResponse getCompraExitosa(@RequestPayload MostrarCompraRequest peticion) {
		MostrarCompraResponse respuesta=new MostrarCompraResponse();
		Compras objCompra= new Compras();
		objCompra=objICompra.findByCompra(peticion.getCompra());
		if(objCompra.equals(null)) {
			respuesta.setCompra("Compra no localizada o inexistente");
		}else {
			respuesta.setCompra("ID Compra: "+peticion.getCompra());
			respuesta.setUsuario("Usuario: "+objCompra.getUsuario());
			respuesta.setNombreLinea("Linea De Metro: "+objCompra.getNombreLinea());
			respuesta.setOrigen("Origen: "+objCompra.getOrigen());
			respuesta.setFecha("Fecha: "+objCompra.getFecha());
			respuesta.setPrecio("Precio: "+objCompra.getPrecio());
			respuesta.setTypePago("Pago: "+objCompra.getTypePago());
			respuesta.setTypeVagon("Tipo de vagon: "+objCompra.getTypeVagon());
		}
		
		return respuesta;
	}
	
	@PayloadRoot(localPart="UsuarioRequest", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public UsuarioResponse getUsuarioExitoso(@RequestPayload UsuarioRequest peticion) {
		UsuarioResponse respuesta=new UsuarioResponse();
		Usuario objUsuario=new Usuario();
		objUsuario=objIusuario.findByUser(peticion.getNombreUsuario());
		if(objUsuario != null) {
			respuesta.setRespuesta("El usuario ya existe intenta con otro");
		}else {
			objUsuario=new Usuario();
			objUsuario.setNombreUsuario(peticion.getNombreUsuario());
			objUsuario.setFechaDeNacimiento(peticion.getFechaDeNacimiento());
			objUsuario.setCorreo(peticion.getCorreo());
			objUsuario.setMetodoPago(peticion.getMetodoPago());
			objUsuario.setNumeroTarjeta(peticion.getNumeroTarjeta());
			objIusuario.save(objUsuario);
			respuesta.setRespuesta("Usuario: "+peticion.getNombreUsuario()+" Agregado con exito");
		}
		
		
		return respuesta;
	}
	
	@PayloadRoot(localPart="ActualizarUsuarioRequest", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public ActualizarUsuarioResponse getCompraExitosa(@RequestPayload ActualizarUsuarioRequest peticion) {
		ActualizarUsuarioResponse respuesta=new ActualizarUsuarioResponse();
		Usuario objUsuario=new Usuario();
		objUsuario=objIusuario.findByUser(peticion.getNombreUsuario());
		if(objUsuario.equals(null)) {
			respuesta.setRespuesta("Usuario incorrecto o inexistente por favor corrijelo");
		}else {
			objIusuario.updateUser(peticion.getCorreo(), peticion.getFechaDeNacimiento(), peticion.getMetodoPago(), peticion.getNumeroTarjeta(), peticion.getNombreUsuario());
			respuesta.setRespuesta("Usuario: "+peticion.getNombreUsuario()+" Actualizado Correctamente");
		}
		
		return respuesta;
	}
	
	@PayloadRoot(localPart="EliminarUsuarioRequest", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public EliminarUsuarioResponse getCompraExitosa(@RequestPayload EliminarUsuarioRequest peticion) {
		EliminarUsuarioResponse respuesta=new EliminarUsuarioResponse();
		Usuario objUsuario=new Usuario();
		
		objUsuario=objIusuario.findByUser(peticion.getIdUsuario());
		if(objUsuario.equals(null)) {
			respuesta.setRespuesta("Usuario incorrecto o inexistente por favor corrijelo");
		}else {
			objIusuario.deletebyNombre(peticion.getIdUsuario());
			respuesta.setRespuesta("Usuario: "+peticion.getIdUsuario()+" eliminado correctamente");
		}
		
		return respuesta;
	}
	
	@PayloadRoot(localPart="LineasMetroRequest", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public LineasMetroResponse getCompraExitosa(@RequestPayload LineasMetroRequest peticion) {
		LineasMetroResponse respuesta=new LineasMetroResponse();
		LineaMetro objMetro=new LineaMetro();
		
		
		objMetro=objIMetro.findByNombreLinea(peticion.getNombreLinea());
		if(objMetro!=null) {
			respuesta.setRespuesta("La linea de Metro ya existe");
		}else {
			objMetro=new LineaMetro();
			objMetro.setNombreLinea(peticion.getNombreLinea());
			objMetro.setHorario(peticion.getHorario());
			objMetro.setOrigen(peticion.getOrigen());
			objMetro.setDestino(peticion.getDestino());
			objMetro.setPrecio(peticion.getPrecio());
			
			objIMetro.save(objMetro);
			
			respuesta.setRespuesta("Linea de Metro: "+peticion.getNombreLinea()+" Se guardo correctamente");
		}
		
		
		return respuesta;
	}
	
	@PayloadRoot(localPart="ActualizarLineaMetroRequest", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public ActualizarLineaMetroResponse getCompraExitosa(@RequestPayload ActualizarLineaMetroRequest peticion) {
		ActualizarLineaMetroResponse respuesta=new ActualizarLineaMetroResponse();
		LineaMetro objMetro=new LineaMetro();
		
		objMetro=objIMetro.findByNombreLinea(peticion.getNombreLinea());
		
		if(objMetro.equals(null)) {
			respuesta.setRespuesta("Linea del metro no existe o lo ingresaste mal");
		}else {
			objIMetro.updateLineaMetro(peticion.getDestino(), peticion.getHorario(), peticion.getOrigen(), peticion.getPrecio(), peticion.getNombreLinea());
			respuesta.setRespuesta("Linea del metro: "+peticion.getNombreLinea()+" actualizada correctamente");
		}
		
		
		return respuesta;
	}
	
	@PayloadRoot(localPart="EliminarLineaMetroRequest", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public EliminarLineaMetroResponse getCompraExitosa(@RequestPayload EliminarLineaMetroRequest peticion) {
		EliminarLineaMetroResponse respuesta=new EliminarLineaMetroResponse();
		
		LineaMetro objMetro=new LineaMetro();
		objMetro=objIMetro.findByNombreLinea(peticion.getNombreLinea());
		
		if(objMetro.equals(null)) {
			respuesta.setRespuesta("Linea del metro no existe o lo ingresaste mal");
		}else {
			objIMetro.deletebyNombre(peticion.getNombreLinea());
			respuesta.setRespuesta("Linea del metro: "+peticion.getNombreLinea()+" eliminada correctamente");
		}
		
		return respuesta;
	}
	
	@PayloadRoot(localPart="MostrarLineaMetroRequest", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public MostrarLineaMetroResponse getCompraExitosa(@RequestPayload MostrarLineaMetroRequest peticion) {
		MostrarLineaMetroResponse respuesta=new MostrarLineaMetroResponse();
		LineaMetro objMetro=new LineaMetro();
		objMetro=objIMetro.findByNombreLinea(peticion.getNombreLinea());
		
		if(objMetro.equals(null)) {
			respuesta.setNombreLinea("Linea del metro no existe o lo ingresaste mal");
		}else {
			respuesta.setNombreLinea("Nombre Linea: "+peticion.getNombreLinea());
			respuesta.setHorario("Horario: "+objMetro.getHorario());
			respuesta.setOrigen("Origen: "+objMetro.getOrigen());
			respuesta.setDestino("Destino: "+objMetro.getDestino());
			respuesta.setPrecio("Precio: "+objMetro.getPrecio());
		}
		
		return respuesta;
	}
	
	@PayloadRoot(localPart="MostrarLineasRequest", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public  MostrarLineasResponse getCompraExitosa(@RequestPayload MostrarLineasRequest peticion) {
		MostrarLineasResponse respuesta=new MostrarLineasResponse();
		LineaMetro linea=new LineaMetro();
		
		Iterable<LineaMetro> listMetro=objIMetro.findAll();
		
		for(LineaMetro LM : listMetro) {
			MostrarLineasResponse.Lineas lineas= new MostrarLineasResponse.Lineas();
			
			lineas.setNombreLinea(LM.getNombreLinea());
			//lineas.setId(LM.getId());
			lineas.setHorario(LM.getHorario());
			lineas.setOrigen(LM.getOrigen());
			lineas.setDestino(LM.getDestino());
			lineas.setPrecio(LM.getPrecio());
			
			respuesta.getLineas().add(lineas);
		}
		
		return respuesta;
	}
	
	@PayloadRoot(localPart="MostrarComprasRequest", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public  MostrarComprasResponse getCompras(@RequestPayload MostrarComprasRequest peticion) {
		MostrarComprasResponse respuesta=new MostrarComprasResponse();
		Compras linea=new Compras();
		
		Iterable<Compras> listCompras=objICompra.findAll();
		
		for(Compras LM : listCompras) {
			MostrarComprasResponse.Compra compras= new MostrarComprasResponse.Compra();
			
			compras.setCompra("ID Compra: "+LM.getCompra());
			compras.setUsuario("Usuario: "+LM.getUsuario());
			compras.setNombreLinea("Linea De Metro: "+LM.getNombreLinea());
			compras.setOrigen("Origen: "+LM.getOrigen());
			compras.setFecha("Fecha: "+LM.getFecha());
			compras.setPrecio("Precio: "+LM.getPrecio());
			compras.setTypePago("Pago: "+LM.getTypePago());
			compras.setTypeVagon("Tipo de vagon: "+LM.getTypeVagon());
			
			respuesta.getCompra().add(compras);
		}
		
		return respuesta;
	}
	
	@PayloadRoot(localPart="MostrarUsuariosRequest", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public  MostrarUsuariosResponse getUsuarios(@RequestPayload MostrarUsuariosRequest peticion2) {
		MostrarUsuariosResponse respuesta=new MostrarUsuariosResponse();
		Usuario usuario=new Usuario();
		
		Iterable<Usuario> listUsuarios=objIusuario.findAll();
		
		for(Usuario LM : listUsuarios) {
			MostrarUsuariosResponse.Usuario usuarios= new MostrarUsuariosResponse.Usuario();
			
			usuarios.setNombreUsuario(LM.getNombreUsuario());
			usuarios.setFechaDeNacimiento(LM.getFechaDeNacimiento());
			usuarios.setCorreo(LM.getCorreo());
			usuarios.setMetodoPago(LM.getMetodoPago());
			usuarios.setNumeroTarjeta(LM.getNumeroTarjeta());
			
			respuesta.getUsuario().add(usuarios);
		}
		
		return respuesta;
	}

	@PayloadRoot(localPart="MostrarUsuarioRequest", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public MostrarUsuarioResponse getCompraExitosa(@RequestPayload MostrarUsuarioRequest peticion) {
		MostrarUsuarioResponse respuesta=new MostrarUsuarioResponse();
		Usuario objUsuario= new Usuario();
		objUsuario=objIusuario.findByUser(peticion.getUsuario());
		if(objUsuario.equals(null)) {
			respuesta.setNombreUsuario("Usuario No Encontrado o Inexistente");
		}else {
			respuesta.setNombreUsuario("Usuario: "+objUsuario.getNombreUsuario());
			respuesta.setCorreo("Correo: "+objUsuario.getCorreo());
			respuesta.setFechaDeNacimiento("Fecha de nacimiento: "+objUsuario.getFechaDeNacimiento());
			respuesta.setMetodoPago("Metodo de pago: "+objUsuario.getMetodoPago());
			respuesta.setNumeroTarjeta("Numero de tarjeta: "+objUsuario.getNumeroTarjeta());
		}
		
		return respuesta;
	}

}
