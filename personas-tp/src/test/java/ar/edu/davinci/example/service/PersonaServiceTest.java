package ar.edu.davinci.example.service;

import static org.junit.Assert.assertEquals;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import ar.edu.davinci.example.Application;
import ar.edu.davinci.example.domain.Persona;
import ar.edu.davinci.example.service.PersonaService;

@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest(classes = Application.class)
@AutoConfigureTestDatabase(replace=Replace.NONE)
@ComponentScan(basePackages = {"ar.edu.davinci.example.service"})
public class PersonaServiceTest {
	
	private static final Logger log = LoggerFactory.getLogger(PersonaServiceTest.class);
	
	@Autowired
	private PersonaService personaService;
	
	@Test
	public void listAll() throws Exception {
		List<Persona> all = personaService.listarPersonas();
		for(Persona persona : all) {
			System.out.println(persona.toString());
		}
		
		//assertEquals(2, all.size());
	}

}
