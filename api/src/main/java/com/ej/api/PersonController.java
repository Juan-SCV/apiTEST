package com.ej.api;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {
    
    private final PersonService personService;

    @PostMapping
    public void createPerson(@RequestBody Person person){
        personService.createPerson(person);   
    }

    @DeleteMapping
    public void deletePerson(@RequestBody Person person) {
        personService.deletePerson(person);
    }
    
    @GetMapping
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }
}
