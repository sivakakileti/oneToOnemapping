package hibernate_mappings.springJPA_mappings.model;

import lombok.Data;

@Data
public class PersonResponse {

    private Integer personId;
    private String personName;
    private String phoneNumber;
    private String state;
    private PassportResponse passportResponse;

}
