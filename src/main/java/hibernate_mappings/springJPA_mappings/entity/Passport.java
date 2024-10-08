package hibernate_mappings.springJPA_mappings.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PASSPORT")
@Getter
@Setter
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

    @OneToOne( mappedBy = "passport", fetch = FetchType.LAZY)
    @JsonBackReference
    private Person person;


}
