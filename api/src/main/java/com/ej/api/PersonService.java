package com.ej.api;
import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepo;
    
    
    public void createPerson(Person person){
        personRepo.save(person);
    }

    public void deletePerson(Person person){
        personRepo.delete(person);
    }

    public List<Person> getAllPersons(){
        return personRepo.findAll();
    }
}
