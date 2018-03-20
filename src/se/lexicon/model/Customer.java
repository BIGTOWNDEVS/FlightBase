package se.lexicon.model;

public class Customer {

	public String name;
	public int phoneNumber;

	public Customer(String name, int phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;

	}

	public String getName() {
		return name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public String toString() {
		return name + "\t" + phoneNumber;
	}
}