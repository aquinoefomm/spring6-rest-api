package springframework.spring_6_rest_mvc.services;

import springframework.spring_6_rest_mvc.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {

    Customer getCustomerById(UUID id);
    List<Customer> getAllCustomers();
    Customer saveNewCustomer(Customer customer);

    void updateCustomerId(UUID customerId, Customer customer);
}
