package tpajay.springboot.jpaexample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerPageController {
	
	@Autowired
	CustomerJpaRepository custRepo;

	@RequestMapping(value="/customer/page/new", method=RequestMethod.GET)
	public ModelAndView newCustomer() {
		return new ModelAndView("customer", "customer", new Customer());
	}
	
	@RequestMapping(value="/customer/page/submit", method=RequestMethod.POST)
	public String createCustomer(@ModelAttribute("customer") Customer customer) {
		custRepo.save(customer);
		//return ("redirect:/customer/page/" + customer.getId());
		return ("redirect:/customer/page/list");
	}
	
	@RequestMapping(value="/customer/page/{id}", method=RequestMethod.GET)
	public ModelAndView getPageCustomer(@PathVariable("id") String id) {
		System.out.println("CustomerPageController getPageCustomer, id = " + id);
		Long id_long = Long.parseLong(id);
		
		Customer customer = (Customer)custRepo.findOne(id_long);
		System.out.println("CustomerController Customer, fname = " + customer.fname);
		System.out.println("CustomerController Customer, lname = " + customer.lname);
		
		//SimpleObject simpleobject = new SimpleObject("Bob", "Marley");
		
		return new ModelAndView("customerdetails", "customer", customer);
	}
	
	@RequestMapping("/customer/page/list")
	public ModelAndView getAllCustomers() {
		List<Customer> custList = (List)custRepo.findAll();
		return new ModelAndView("customerlist", "customerlist", custList);
	}

}

