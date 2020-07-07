package com.example.MetroV2_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MetroV2_1.DTO.Usuario;
import com.example.MetroV2_1.Repositorio.Iusuario;

@RestController
@RequestMapping("/RestUser")
public class UsuarioRestController {

	@Autowired
	Iusuario objIUsuario;
	
	@GetMapping("/Usuarios")
	public Iterable<Usuario> findAll(){
		//retornará todos las Lineas
		return objIUsuario.findAll();
	}
	
	@PostMapping("/saveUser")
	public Usuario addUser(@RequestBody Usuario usuario) {
		//Este metodo guardará al usuario enviado
		objIUsuario.save(usuario);
		
		return usuario;
	}
	
	@PutMapping("/updateUser")
	public Usuario updateUser(@RequestBody Usuario User) {
		objIUsuario.save(User);
		//este metodo actualizará al usuario enviado
		return User;
	}
	
	@GetMapping("/findUser/{nombreUsuario}")
	public Usuario getUser(@PathVariable String usuario){
		Usuario objUsuario=objIUsuario.findByUser(usuario);
		
		if(objUsuario == null) {
			throw new RuntimeException("User id not found -"+usuario);
		}
		//retornará al usuario con id pasado en la url
		return objUsuario;
	}
	
	@DeleteMapping("/eliminarLinea/{nombreUsuario}")
	public String deleteUser(@PathVariable String usuario) {
		Usuario objUser=objIUsuario.findByUser(usuario);
		
		if(objUser == null) { 
			throw new RuntimeException("User id not found -"+usuario);
		}
		
		objIUsuario.deletebyNombre(usuario);
		
		//Esto método, recibira el id de un usuario por URL y se borrará de la bd.
		return "Deleted user id - "+usuario;
	}
}
