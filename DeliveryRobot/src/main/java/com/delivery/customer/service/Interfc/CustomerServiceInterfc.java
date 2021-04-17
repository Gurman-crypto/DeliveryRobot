package com.delivery.customer.service.Interfc;

import java.util.List;

import com.delivery.customer.model.Customer;

public interface CustomerServiceInterfc {
	
	List<Customer> fetchCustomers();
	/*
	List<Alarm> fetchAlarmService (String customer);

	Alarm fetchAlarmServiceById(String id);

	void updateStatus(String alarmUUID, String status, String userName);

	void updateSeverity(String alarmUUID, String severity, String userName);

	void updateAssignedTo(String alarmUUID, String alarmAssignedTo,String assignedName, String userName);
	
	List<Alarm> fetchAlarmListByPage(SearchAlarm searchAlarm);
	
	Long fetchAlarmListCount(SearchAlarm searchAlarm);

	List<String> fetchAlarmMessages(String product);

	List<SeverityCount> fetchAlarmCountBySeverity(String preferredProduct);

	List<ItemCount> fetchAlarmCountByProduct(String preferredProduct);

	Alarm insertUpdateComments(String id, Comments comments, Boolean commentFlag);

	Alarm deleteComment(String alarmUUID, String alarmCommentID);

	void updateSubscriberList(String alarmUUID, String subscriberMail, Boolean subscribeFlag);
*/

	boolean pushCustomerData(String firstName);
}
