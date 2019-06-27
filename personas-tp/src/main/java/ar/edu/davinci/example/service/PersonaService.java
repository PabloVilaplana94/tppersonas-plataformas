package ar.edu.davinci.example.service;

import java.util.List;

import ar.edu.davinci.example.domain.Persona;

public interface PersonaService {
	
	public List<Persona> listarPersonas();

	//public List<Persona> listarPersonasPorApellido(String apellido);

	public Persona buscarPersonaId(Integer id);

	//public Persona econtrarPersonaPorEmail(Persona persona) throws NotFoundException;

	public Persona savePersona(Persona persona);

	/*public Persona modificarPersona(Persona persona) throws NotFoundException;

	public Persona eliminarPersona(Persona persona) throws NotFoundException;*/

}