package enset.glsid.billingservice.dao;

import enset.glsid.billingservice.models.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {
}
