package hibernate_mappings.springJPA_mappings.repository;

import hibernate_mappings.springJPA_mappings.entity.Passport;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportRepo extends JpaRepository<Passport,Integer> {

}
