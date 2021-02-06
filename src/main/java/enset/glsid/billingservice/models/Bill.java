package enset.glsid.billingservice.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;


@Data

@Entity
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "bill")
    private Collection<ProductItem> productItems;
    private LocalDate date;
    @Transient
    private Customer customer;
    private long customerId;
}
