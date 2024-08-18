package hibernate_mappings.springJPA_mappings.entity;

import com.fasterxml.jackson.databind.SerializationFeature;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "PERSON")

@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    Integer personId;
    @Column(name = "person_name")
    String personName;
    @Column(name = "phone_number")
    String phoneNumber;
    @Column(name = "person_state")
    String state;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "pass_id")
    private Passport passport;

}
