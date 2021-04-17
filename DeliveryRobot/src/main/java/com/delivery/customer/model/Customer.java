package com.delivery.customer.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/* allows lombok to build standard getter,setter methods ,
@NoArgsConstructor will throw exception if due to presence of final fields no args contructor is not able to construct
@Data : shortcut to bundle @Getter @Setter @RequiredArgsConstructor @ToString and @EqualsAndHashCode
*/
@Accessors(fluent = true) 
@NoArgsConstructor
@Data 
@Entity
public class Customer {
	
	/*Unique identifier of the customer in the system
	 * Private = More or less-All code in this file ;
	 *  Nothing(package private) = All of private + all source code in the same package;
		Protected = all of the above + subclasses, even in another package;
		Public = everything.
	 */
	@Id
	@GeneratedValue
	@Column(columnDefinition="nvarchar(30)")
	private long customerId;
	
	/*
	   first name of the customer.
	   javax.validation.constraints : Contains all the Bean Validation provided constraints also called built-in constraints.
	   These constraints do not cover all functional use cases 
		but do represent all the fundamental blocks to express low level constraints on basic JDK types.
	*/
	//@Size( min=1, max=40 )
	@Column(columnDefinition="nvarchar(30)")
	//@Setter(AccessLevel.PROTECTED )
	private String firstName;
	
	//last name of the customer
	//@Size( min=0, max=40 )
	@Column(columnDefinition="nvarchar(30)")
	private String lastName;
	
	/* identifies customer as retail(person) ,small business etc
    */
	//@NotNull
	@Column(columnDefinition="nvarchar(30)")
	private CustomerType customerType;
	
	/* Birthdate of the retail customer.
	 * LocalDate: immutable date time object that represents date without time in calender  */
	//private LocalDate birthDate;
	
	/* TITLE : mr, mrs , etc
	    */
	@Column(columnDefinition="nvarchar(20)")
	private String CustomerPrefix;
	
	/* list of mailing address of the customer. Arraylist has initial capacity of 10.
	 * Valid : applied for validation cascading recursively on all the properties of the object to be validated */
	//@Valid
	//@Getter(lazy = true)
	//@NotNull
	//private List<Address> address = new ArrayList<Address>();
	
	/* list of mailing address of the customer. Arraylist has initial capacity of 10.
	 */
	//@Valid
	//@NotNull
	//private List<EmailAddress> emailAddress = new ArrayList<EmailAddress>();
	
	/* list of email address of the customer. Arraylist has initial capacity of 10.
	 */
	//@Valid
	//@NotNull
	//private List<PhoneNumber> phoneNumber = new ArrayList<PhoneNumber>();
	
	

}
