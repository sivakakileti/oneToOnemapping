package hibernate_mappings.springJPA_mappings.model;


import lombok.Data;

@Data
public class PersonRequest {


   private String personName;
   private   String phoneNumber;
   private PassportRequest passportRequest;
   private String state;
}
