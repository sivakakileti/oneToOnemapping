package hibernate_mappings.springJPA_mappings.controller;


import hibernate_mappings.springJPA_mappings.entity.Person;
import hibernate_mappings.springJPA_mappings.model.PersonRequest;
import hibernate_mappings.springJPA_mappings.model.PersonResponse;
import hibernate_mappings.springJPA_mappings.service.serviceImpl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommonController {

    @Autowired
    PersonServiceImpl personServiceImpl;


    @PostMapping("/person")
    public ResponseEntity<Person> savePerson(@RequestBody PersonRequest personRequest){
    Person response = personServiceImpl.save(personRequest);
    return   ResponseEntity.ok(response);
    }

    @GetMapping("/person/{personId}")
    public PersonResponse getPerson(@PathVariable Integer personId){
    return personServiceImpl.getById(personId);
    }

}
