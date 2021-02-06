package enset.glsid.billingservice.feign;


import enset.glsid.billingservice.models.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.List;

@FeignClient(name = "INVENTORY-SERVICE")
public interface ProductRestClient {
    @GetMapping(path = "/products")
    List<Product> products();
    @GetMapping(path = "/products/{id}")
    Product getProduct(@PathVariable(name = "id") Long id);
}
