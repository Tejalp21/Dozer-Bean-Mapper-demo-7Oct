package com.prowings;

import java.util.Arrays;

import org.dozer.DozerBeanMapper;

import com.prowings.Dto.CustomerAccount;
import com.prowings.model.Account;

public class TestDozerWithCustomConverter {
	
	public static void main(String[] args) {
		
		//4 For custom converter
		Account account = new Account();
		account.setAccNo("Ram123");
		account.setName("Ram");
		account.setTransferCode(12345);
		account.setAccountOpeningDate(1696685155);
		account.setCountryCode(91);
		
		DozerBeanMapper mapper = new DozerBeanMapper();
		
		mapper.setMappingFiles(Arrays.asList("DozerMapping2.xml"));
		
		CustomerAccount customerAccount = mapper.map(account, CustomerAccount.class);
		
		System.out.println("Account object" +account);
		System.out.println("CustomerAccount object" +customerAccount);
	}

}
