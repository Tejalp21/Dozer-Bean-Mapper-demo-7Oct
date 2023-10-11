package com.prowings;

import org.dozer.DozerBeanMapper;

import com.prowings.Dto.Destination;
import com.prowings.model.Source;

public class TestDozer {

	public static void main(String[] args) {

		Source source = new Source();
		
		//2 internal data type conversion
		source.setId("10");
		source.setPoint(76.50d);

		Destination destination = new Destination();

		DozerBeanMapper mapper = new DozerBeanMapper();

		//1 mapping object
		destination = mapper.map(source, Destination.class);

		System.out.println("Source " + source);
		System.out.println("Destination" + destination);

	}

}
