package hibernate_mappings.springJPA_mappings.repository;

import hibernate_mappings.springJPA_mappings.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Person,Integer> {
}
