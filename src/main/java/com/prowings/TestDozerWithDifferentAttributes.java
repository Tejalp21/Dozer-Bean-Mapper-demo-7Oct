package com.prowings;

import java.util.Arrays;

import org.dozer.DozerBeanMapper;

import com.prowings.Dto.CustomerAccount;
import com.prowings.model.Account;

public class TestDozerWithDifferentAttributes {
	
	public static void main(String[] args) {
		
		//3 Different field name 
		Account account = new Account();
		account.setAccNo("Ram123");
		account.setName("Ram");
		account.setTransferCode(12345);
		
		DozerBeanMapper mapper = new DozerBeanMapper();
		
		//3.1 set object using xml file
//		mapper.setMappingFiles(Arrays.asList("DozerMapping.xml"));
		
		//3.3 using java based by using builder class
		mapper.addMapping(new CustomBuilder());
		
		CustomerAccount customerAccount = mapper.map(account, CustomerAccount.class);
		
		System.out.println("Account object" +account);
		System.out.println("CustomerAccount object" +customerAccount);
	}

}
