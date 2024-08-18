package hibernate_mappings.springJPA_mappings.service;

import hibernate_mappings.springJPA_mappings.entity.Person;
import hibernate_mappings.springJPA_mappings.model.PersonRequest;

public interface PersonService {

     Person save(PersonRequest personRequest);
}
