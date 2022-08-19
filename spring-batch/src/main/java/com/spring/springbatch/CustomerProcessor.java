package com.spring.springbatch;

import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
		
//        if(customer.getGender().equals("Female")) {
//            return customer;
//        }else{
//            return null;
//        }
    	
    	return customer;
    }
}
