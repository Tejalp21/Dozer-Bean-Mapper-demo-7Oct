package com.prowings.Dto;

import org.dozer.Mapping;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CustomerAccount {

// 3.2 using annotation
//	@Mapping("accNo")
	String customerAccountNumber;

	String name;

//	@Mapping("transferCode")
	int ifscCode;
	
	//4 for custom converter
	String accountOpeningDate;
	
	String countryCode;

}
