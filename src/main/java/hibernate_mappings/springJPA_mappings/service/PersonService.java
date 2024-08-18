package hibernate_mappings.springJPA_mappings.service;

import hibernate_mappings.springJPA_mappings.entity.Person;
import hibernate_mappings.springJPA_mappings.model.PersonRequest;
import hibernate_mappings.springJPA_mappings.model.PersonResponse;

public interface PersonService {

     Person save(PersonRequest personRequest);

     PersonResponse getById(Integer personId);
}
