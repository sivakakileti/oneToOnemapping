package hibernate_mappings.springJPA_mappings.service.serviceImpl;

import hibernate_mappings.springJPA_mappings.entity.Passport;
import hibernate_mappings.springJPA_mappings.entity.Person;
import hibernate_mappings.springJPA_mappings.model.PersonRequest;
import hibernate_mappings.springJPA_mappings.repository.PersonRepo;
import hibernate_mappings.springJPA_mappings.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepo personRepo;

    @Override
    public Person save(PersonRequest personRequest) {
        Person person = new Person();
        person.setPersonName(personRequest.getPersonName());
        person.setPhoneNumber(personRequest.getPhoneNumber());
        person.setState(personRequest.getState());
        Passport passport = new Passport();
        passport.setPassportNum(personRequest.getPassportRequest().getPassportNum());
        passport.setState(personRequest.getPassportRequest().getState());
        passport.setIssuedAuthority(personRequest.getPassportRequest().getIssuedAuthority());
        person.setPassport(passport);
        return personRepo.save(person);
    }
}
