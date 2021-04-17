package com.delivery.customer.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.customer.model.Customer;
import com.delivery.customer.service.CustomerService;

@RestController
/*A convenience annotation that is itself annotated with @Controller and @ResponseBody.
Types that carry this annotation are treated as controllers where @RequestMapping methods assume @ResponseBody semantics by default.

Variant of JSR-303's javax.validation.Valid, supporting the specification of validation groups. Designed for convenient use with Spring's JSR-303 support but not JSR-303 specific.
Can also be used with method level validation, indicating that a specific class is supposed to be validated at the method level 
*/
@Validated
public class CustomerController {

	public static final String URL_CUSTOMERS = "/customer";
	public static final String URL_CUSTOMER_PER_ID = "/customer/{customerId}";
	public static final String URL_CUSTOMER_PER_TYPE = "/customer/{type}";
	public static final String URL_ADD_CUSTOMER = "/customer/add";
	public static final String URL_OPERATION_ON_CUSTOMER = "/customer/operation/{customerId}";
	
	@Autowired
	CustomerService customerApi;
	
	/*Annotation for mapping web requests onto methods in request-handling classes with flexible method signatures.
	This annotation can be used both at the class and at the method level. 
	*/
	@RequestMapping(value = URL_CUSTOMERS , method = RequestMethod.GET )
	public List<Customer> getCustomers() {
		 System.out.println("gurman!!");
		return customerApi.fetchCustomers() ;
		
	}
	
	/*
	 * Annotation which indicates that a method parameter should be bound to a URI template variable.
	 *  Supported for RequestMapping annotated handler methods.
	 */
	@RequestMapping(value = URL_CUSTOMER_PER_ID , method = RequestMethod.GET )
	public Customer getCustomerPerId(@PathVariable String Id) {
		
		
		return null ;
		
	}
	
	/*
	 * Annotation which indicates that a method parameter should be bound to a web request parameter.
Supported for annotated handler methods in Spring MVC and Spring WebFlux as follows:

In Spring MVC, "request parameters" map to query parameters, form data, and parts in multipart requests. This is because the Servlet API combines query parameters and form data into a single map called "parameters", and that includes automatic parsing of the request body.
In Spring WebFlux, "request parameters" map to query parameters only. To work with all 3, query, form data, and multipart data, you can use data binding to a command object annotated with ModelAttribute.
	 */
	@RequestMapping(value = URL_CUSTOMER_PER_TYPE , method = RequestMethod.GET )
	public List<Customer> getCustomersPerType(@PathVariable String Id, @RequestParam(required = true) String Type) {
		
		
		return null ;
		
	}
	
	/*
	 * Annotation indicating a method parameter should be bound to the body of the web request. The body of the request is passed through an HttpMessageConverter to resolve the method argument depending on the content type of the request.
	 *  Optionally, automatic validation can be applied by annotating the argument with @Valid.
	 */
	@RequestMapping(value = URL_ADD_CUSTOMER , method = RequestMethod.POST )
	public Boolean addCustomer(@RequestBody @Validated Customer customer) {
		
		
		return null ;
		
	}
	
	@RequestMapping(value = URL_OPERATION_ON_CUSTOMER , method = RequestMethod.PUT )
	public Boolean updateCustomerData(@RequestParam(required = true) String CustomerId , @RequestBody @Validated Customer customer) {
		
		
		return null ;
		
	}
	
	@RequestMapping(value = URL_OPERATION_ON_CUSTOMER , method = RequestMethod.DELETE )
	public Boolean deleteCustomer(@RequestParam(required = true) String CustomerId) {
		
		
		return null ;
		
	}
	
	@RequestMapping(value = "/abc" , method = RequestMethod.POST )
	public Boolean abc(@RequestParam(required = true) String Name ) {
		
		 System.out.println("gurman test!!");
		customerApi.pushCustomerData(Name) ;
		return true ;
		
	}
	
}
