package enset.glsid.billingservice.dao;

import enset.glsid.billingservice.models.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {
    public Collection<ProductItem> findByBillId(Long id);
}
