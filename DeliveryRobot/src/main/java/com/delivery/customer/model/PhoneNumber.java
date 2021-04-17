package com.delivery.customer.model;

import java.time.Instant;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class PhoneNumber {
	
	private String phoneNumber;
	
	@NotNull(message = "phoneType is REQUIRED!" )
	private PhoneType phoneType;
	
	private boolean isPrimary;
	
	/* instant : used to record event time stamps for a specific instant on java time-line
	 *  */
	private Instant lastUpdateTimeStamp;

}
