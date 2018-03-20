package se.lexicon.model;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImp1 implements CustomerService1 {

	List<Customer1> customerList = new ArrayList<Customer1>();
	
	@Override
	public void Add(Customer1 customer) {
		customerList.add(customer);
	}

}
