package com.delivery.customer.dao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import com.delivery.customer.model.Customer;
import com.delivery.customer.repository.CustomerRepository;

/*
 * Indicates that an annotated class is a "Repository", originally defined by Domain-Driven Design as 
 * a mechanism for encapsulating storage, retrieval, and search behavior which emulates a collection of objects
 */

public class CustomerDao {
	
	/*
	 * When the annotation is applied to a field or method, the container will inject an instance of the requested resource into the application component 
	 * when the component is initialized. If the annotation is applied to the component class,
	 *  the annotation declares a resource that the application will look up at runtime
	 */
	@Autowired
	CustomerRepository customerRepo;
	
	@Value("${paging.defaultSortField}")
	private String defaultSortField;
	@Value("${paging.defaultSortOrder}")
	private String defaultSortOrder;
	
	
	@Nullable
	public List<Customer> fetchAllCustomers() {
		
		/*
		 * A container object which may or may not contain a non-null value. If a value is present, isPresent() returns true. If no value is present, the object is considered empty and isPresent() returns false.
		 *Returns an Optional describing the given value, if non-null, otherwise returns an empty Optional.
		 */
		List<Customer> cList = null;
		return Optional.ofNullable(customerRepo.findAll()).orElse(cList);
		
	}
	
	public void pushCustomerData(String name) {
		Customer customer= new Customer();
		customer.firstName(name);
		customerRepo.save(customer);
	}
	

	
	//Cannot make a static reference to the non-static method findAll() from the type JpaRepository<Customer,String>
	/*
	 * 	public static Optional<User> findUserByName(String name) {
	    User user = usersByName.get(name);
	    Optional<User> opt = Optional.ofNullable(user);
	    return opt;
	}
	
	public void pushAlarmData(List<Alarm> alarms) {
		alarmRepository.save(alarms);
	}

	public boolean checkAlarmData(String id) {
		return alarmRepository.exists(id);
	}

	public boolean checkByEventAttached(String eventUuid) {
		return alarmRepository.existsByEventAttached(eventUuid);
	}

	public List<Alarm> findByEventAttached(String eventUuid) {
		return alarmRepository.findByEventAttached(eventUuid);
	}

	public Alarm fetchAlarmById(String id) {
		return alarmRepository.findOne(id);
	}

	
	
	public List<Alarm>fetchAlarms(String customer){
		StringBuilder query= new StringBuilder();
		String message = "";
		query.append(Constants.QUERY_BRACES_START);
		query.append((customer == null || Constants.QUERY_UNDEFINED.equals(customer))? Constants.EMPTY_STRING:Constants.ALARM_QUERY_CUSTOMER);
		query.append(Constants.QUERY_COLON_SEPARATOR).append(Constants.QUERY_BRACES_START).append(Constants.QUERY_REGEX_OPERATOR).append(Constants.QUERY_COLON_SEPARATOR).append(Constants.QUERY_SINGLE_QUOTE).append(customer).append(Constants.QUERY_SINGLE_QUOTE).append(", $options").append(":'i' ").append(Constants.QUERY_BRACES_END).append(Constants.QUERY_BRACES_END);
		message=MESSAGE1 + query;
		LOGGER.info(message);
		BasicQuery dataquery =  new BasicQuery(query.toString());
		return mongoTemplate.find(dataquery, Alarm.class);
	}

	public List<Alarm> fetchAlarmList(String customer, String service, String resource, String nature,
			LocalDateTime startDate, LocalDateTime endDate) {
		Query dataquery = new Query();
		String message = "";
		Optional.ofNullable(customer).ifPresent(cust -> dataquery.addCriteria(Criteria.where(CUSTOMER).in(Arrays.asList(cust.split(",")))));
		Optional.ofNullable(service).ifPresent(cust -> dataquery.addCriteria(Criteria.where(PRODUCT).in(Arrays.asList(cust.split(",")))));
		Optional.ofNullable(resource).ifPresent(cust -> dataquery.addCriteria(Criteria.where(SOURCE).is(cust)));
		Optional.ofNullable(nature).ifPresent(cust -> dataquery.addCriteria(Criteria.where(MESSAGE).is(cust)));
		if(Optional.ofNullable(startDate).isPresent() && Optional.ofNullable(endDate).isPresent())
		dataquery.addCriteria(Criteria.where(CREATION_DATE).ne(null).andOperator(
                Criteria.where(CREATION_DATE).gte(startDate),
                Criteria.where(CREATION_DATE).lte(endDate)
            ));
		message = MESSAGE1 + dataquery.toString();
		LOGGER.info(message);
		List<Alarm> alarmList = mongoTemplate.find(dataquery, Alarm.class);
		message = MESSAGE2 + alarmList.size();
		LOGGER.info(message);
		return alarmList;

	}

	public void updateStatus(String alarmUUID, String status) {
		Alarm alarm = alarmRepository.findOne(alarmUUID);
		if (alarm != null) {
			alarm.setAlarmStatus(status);
			alarm.setAlarmLastModified(LocalDateTime.now());
			alarmRepository.save(alarm);
		}

	}

	public void updateSeverity(String alarmUUID, String severity) {
		Alarm alarm = alarmRepository.findOne(alarmUUID);
		if (alarm != null) {
			alarm.setAlarmSeverity(severity);
			alarm.setAlarmLastModified(LocalDateTime.now());
			alarmRepository.save(alarm);
		}
	}

	public void deleteAlarm(Alarm alarm) {
		alarmRepository.delete(alarm);
	}
	
	public void deleteAlarms(List<Alarm> alarms) {
		alarmRepository.delete(alarms);

	}
*/
}
