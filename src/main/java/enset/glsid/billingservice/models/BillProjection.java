package enset.glsid.billingservice.models;


import org.springframework.data.rest.core.config.Projection;

import java.util.Collection;

@Projection(name = "billpro", types = Bill.class)
public interface BillProjection {
    public Collection<ProductItem> getProductItems();
    public Customer getCustomer();
}
