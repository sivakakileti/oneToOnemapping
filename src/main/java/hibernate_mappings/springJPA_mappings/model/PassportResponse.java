package hibernate_mappings.springJPA_mappings.model;

import lombok.Data;

@Data
public class PassportResponse {
    private Integer passportId;
    private  String passportNumber;
    private String issuingAuthority;
    private  String state;

}
