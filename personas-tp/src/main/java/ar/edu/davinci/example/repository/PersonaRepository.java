package ar.edu.davinci.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ar.edu.davinci.example.domain.Persona;

// This will be AUTO IMPLEMENTED by Spring into a Bean called personaRepository
// CRUD refers Create, Read, Update, Delete

public interface PersonaRepository extends JpaRepository<Persona, Long> {

	Persona findById(@Param("id") Integer id);

}