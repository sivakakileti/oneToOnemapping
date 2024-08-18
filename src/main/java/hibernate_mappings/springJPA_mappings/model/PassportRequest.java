package hibernate_mappings.springJPA_mappings.model;

import lombok.Data;

@Data
public class PassportRequest {
    
    private String passportNum;
    private String issuedAuthority;
    private String state;
}
