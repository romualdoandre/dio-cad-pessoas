package one.digitalinnovation.personapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.personapi.repository.PersonRepository;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
	
	private PersonRepository personRepository;
	@Autowired
	public PersonController(PersonRepository personRepository) {
		super();
		this.personRepository = personRepository;
	}

	@GetMapping
	String getBook() {
		return "Hello";
	}

}
