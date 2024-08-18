package hibernate_mappings.springJPA_mappings.service.serviceImpl;

import hibernate_mappings.springJPA_mappings.entity.Passport;
import hibernate_mappings.springJPA_mappings.entity.Person;
import hibernate_mappings.springJPA_mappings.model.PassportResponse;
import hibernate_mappings.springJPA_mappings.model.PersonRequest;
import hibernate_mappings.springJPA_mappings.model.PersonResponse;
import hibernate_mappings.springJPA_mappings.repository.PersonRepo;
import hibernate_mappings.springJPA_mappings.service.PersonService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    @Transactional
    public PersonResponse getById(Integer personId) {
        //to find all persons whose state is Andhra Pradesh
        List<Person> personList = personRepo.findAllByState("Andhra Pradesh");
        //similarly you can find all persons based on non owning entity.
        //here owing entity is person because it has passport pk in its table columns
        //to find all persons based on passortNumber
        List<Person> personByPassportNum = personRepo.findByPassportPassportNum("Z5466312");
        //to know whether entity with that columnData or not. here we are doing for Id, similarly we can do for other columns also
        boolean exists = personRepo.existsById(1);
        Person person =  personRepo.findById(personId).get();
        PersonResponse personResponse = new PersonResponse();
        personResponse.setPersonId(person.getPersonId());
        personResponse.setPersonName(person.getPersonName());
        personResponse.setPhoneNumber(person.getPhoneNumber());
        personResponse.setState(person.getState());

        Passport passport = person.getPassport();
        PassportResponse passportResponse = new PassportResponse();
        passportResponse.setPassportId(passport.getPId());
        passportResponse.setPassportNumber(passport.getPassportNum());
        passportResponse.setIssuingAuthority(passport.getIssuedAuthority());
        passportResponse.setState(passport.getState());
        personResponse.setPassportResponse(passportResponse);
        return personResponse;

    }
}
