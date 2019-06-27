package ar.edu.davinci.example.service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import ar.edu.davinci.example.domain.Persona;
import ar.edu.davinci.example.repository.PersonaRepository;


@Service
public class PersonaServiceImpl implements PersonaService{

	@Resource
	PersonaRepository personaRepository;
	
	@Override
	@Transactional
	public List<Persona> listarPersonas() {
		return (List<Persona>) personaRepository.findAll();
	}
	
	@Override
	@Transactional
	public Persona buscarPersonaId(Integer id) {
		return personaRepository.findById(id);
	}
	
	@Override
	@Transactional
	public Persona savePersona(Persona persona) {
		return personaRepository.save(persona);
	}

}
