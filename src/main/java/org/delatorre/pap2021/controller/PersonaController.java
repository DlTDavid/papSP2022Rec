package org.delatorre.pap2021.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


//creamos el controlador para que spring controle y vuelva siempre aqui cuando haya una peticion http
//son component con cosas extras
//spring es un framework de inyeccion de independencias, los new son entrecomillas malos , 
//lo que nos implementa spring es intentar desatarnos de los new
//los new son malos a la hora de modificar el codigo por eso, spring me facilita esta  "funcion"
//esta pensado a subsistemas grandes
@Controller
@RequestMapping("/persona")
public class PersonaController {

//Autowired	
//decoramos un atributo
//ese atributo que yo he ehcho new, lo cableo y lo pongo en relaccion con la tabla 
	
	@GetMapping("r")
	public String r(
			ModelMap m
			){
		
		//es una coleccion java en vez de coleccionar pares suelto, colecciona 
		//en el return va la ruta a ala vista que quiero desplegar
		//empieza desde la carpeta templates como carpeta raiz
		
		//en la carpeta _t--> en el frame.html ahi esta la variable view
		m.put("view","persona/r");
		return "_t/frame";
	}
	
	@GetMapping("c")
	public String c(ModelMap m){
		m.put("view","persona/c");
		return "_t/frame";
	}
	
	
	@PostMapping("c")
	public String cPost() {
		return ""; 
	}
	
}
