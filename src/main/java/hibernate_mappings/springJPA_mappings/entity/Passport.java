package hibernate_mappings.springJPA_mappings.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "PASSPORT")
@Data
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pass_id")
    Integer pId;

    @Column(name = "passport_number")
    String passportNum;

    @Column(name = "ISSUED_AT")
    String issuedAuthority;

    @Column(name = "state")
    String state;

    @OneToOne( mappedBy = "passport")
    private Person person;


}
