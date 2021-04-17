package com.delivery.customer.model;

import java.time.Instant;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class EmailAddress {

	private String emailAddress;
	
	private boolean isPrimary;
	
	/* instant : used to record event time stamps for a specific instant on java time-line
	 *  */
	private Instant lastUpdateTimeStamp;
}
