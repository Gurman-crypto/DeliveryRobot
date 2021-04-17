package com.delivery.customer.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delivery.customer.dao.CustomerDao;
import com.delivery.customer.model.Customer;
import com.delivery.customer.repository.CustomerRepository;
import com.delivery.customer.service.Interfc.CustomerServiceInterfc;

/*Indicates that an annotated class is a "Service",
 *   "an operation offered as an interface that stands alone in the model, with no encapsulated state."
May also indicate that a class is a "Business Service Facade".
This annotation is a general-purpose stereotype 
This annotation serves as a specialization of @Component, allowing for implementation classes to be autodetected 
through classpath scanning.
*/
@Service
public class CustomerService implements CustomerServiceInterfc {

	@Autowired
	private CustomerRepository customerRepository;
	
	
	@Override
	public List<Customer> fetchCustomers(){
		
	    return customerRepository.findAll();
		
	}
	
	@Override
	public boolean pushCustomerData(String firstName){
		
		Customer customer =new Customer();
		customer.firstName(firstName);
		customerRepository.save(customer);
		
	     return true;
		
	}
	
	/*
	 * 
	 * @Override
	public List<Alarm> fetchAlarmService(String customer) {
		
		List<Alarm> alarm=null;
		if(customer!=null && !customer.isEmpty())
		 alarm =alarmDao.fetchAlarms(customer);
		else
	      alarm =alarmDao.fetchAllAlarms();
		return alarm;
	}

	 */
}
