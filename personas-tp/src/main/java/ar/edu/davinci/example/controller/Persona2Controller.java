package ar.edu.davinci.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.edu.davinci.example.domain.Persona;
import ar.edu.davinci.example.service.PersonaService;

@Controller    // This means that this class is a Controller
public class Persona2Controller {
	
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/personas")
	public @ResponseBody Iterable<Persona> getListarPersonas() {
		return personaService.listarPersonas();
	}	

	@GetMapping("/personas/{id}")
	public @ResponseBody Persona getPersonaId(@PathVariable("id") Integer id) {
		return personaService.buscarPersonaId(id);
	}
	
	@PostMapping("/personas")
	public @ResponseBody String savePersona(@RequestBody Persona newPersona) {
	    personaService.savePersona(newPersona);
	    return "Saved";
	}
}
