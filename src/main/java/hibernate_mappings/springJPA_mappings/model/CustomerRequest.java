package hibernate_mappings.springJPA_mappings.model;

import lombok.Data;

@Data
public class CustomerRequest {
  private String customerName;
  private Long customerId;
}
