package enset.glsid.billingservice.models;


import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class ProductItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Bill bill;
    private long productId;
    @Transient
    private Product product;
    private double quantity;
}
