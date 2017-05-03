package tpajay.springboot.jpaexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerJpaRepository custRepo;

	@RequestMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable("id") long id) {
		System.out.println("CustomerController getCustomer, id = " + id);
		Customer customer = (Customer)custRepo.findOne(id);
		return customer;
	}
	
	@RequestMapping("/customer")
	public void save(@RequestBody Customer customer) {
		custRepo.save(customer);
		System.out.println("CustomerController saved id: " + customer.getId());		
	}

}
