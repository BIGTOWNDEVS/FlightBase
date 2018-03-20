package se.lexicon.model;

import java.util.HashSet;

public class CustomerService {

	// HashSet as it does not matter the order here
	private HashSet<Customer> newCustomer = new HashSet<Customer>();

	public void add(Customer customer) {
		newCustomer.add(customer);
	}

	public void remove(Customer customer) {
		newCustomer.remove(customer);
	}

}