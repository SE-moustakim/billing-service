package enset.glsid.billingservice.models;


import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Data @ToString

public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;


}
