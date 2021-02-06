package enset.glsid.billingservice;

import enset.glsid.billingservice.dao.BillRepository;
import enset.glsid.billingservice.dao.ProductItemRepository;
import enset.glsid.billingservice.feign.CustomerRestClient;
import enset.glsid.billingservice.feign.ProductRestClient;
import enset.glsid.billingservice.models.Bill;
import enset.glsid.billingservice.models.Customer;
import enset.glsid.billingservice.models.Product;
import enset.glsid.billingservice.models.ProductItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BillingServiceApplication.class, args);
	}

    @Autowired
	CustomerRestClient customerRestClient;
    @Autowired
	ProductRestClient productRestClient;
    @Autowired
	BillRepository billRepository;
    @Autowired
	ProductItemRepository productItemRepository;

	@Override
	public void run(String... args) throws Exception {
		// create new bill for a customer
		Bill bill = new Bill();
		bill.setCustomerId(1);
		bill.setCustomer(customerRestClient.getCustomerById(1L));
		billRepository.save(bill);
		//new productItems
		ProductItem productItem1 = new ProductItem();
		productItem1.setBill(bill);
		productItem1.setProduct(productRestClient.getProduct(1L));
		productItem1.setProductId(1);
		productItem1.setQuantity(100);
		productItem1.setBill(bill);
		productItemRepository.save(productItem1);
	}
}
