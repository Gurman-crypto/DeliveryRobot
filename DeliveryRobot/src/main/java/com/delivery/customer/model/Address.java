package com.delivery.customer.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/* allows lombok to build standard getter,setter methods ,
  @NoArgsConstructor will throw exception if due to presence of final fields no args contructor is not able to construct
 */
@Getter @Setter @NoArgsConstructor
public class Address {

private String addressLine1;
	
	private String addressLine2;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private String zipCode;
	
	private boolean isPrimary;
	
	/* instant : used to record event time stamps for a specific instant on java time-line
	 * private Instant lastUpdateTimeStamp;
	 * date address info was last changed
	 *  */
	private LocalDate lastAddressChangeDate;

}
