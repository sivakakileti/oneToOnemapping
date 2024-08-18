package hibernate_mappings.springJPA_mappings.repository;

import hibernate_mappings.springJPA_mappings.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepo extends JpaRepository<Person,Integer> {
   List<Person> findAllByState(String State);
   List<Person> findByPassportPassportNum(String passportNumber );
}
