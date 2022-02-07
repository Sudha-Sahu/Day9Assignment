package com.Bridgelabz.Day9Assignment;

public class AddressBook{
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String gmail;
	AddressBook() {

		System.out.println("Welcome to Address Book program in AddressBook Main class!!!!");
	}
	private AddressBook(String firstName, String lastName, String city, String state, String zip, String phoneNumber, String gmail) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.phoneNumber=phoneNumber;
		this.gmail=gmail;
	}
	public void displayAddress() {
		System.out.println("First Name :"+firstName);
		System.out.println("Last Name :"+lastName);
		System.out.println("City :"+city);
		System.out.println("State :"+state);
		System.out.println("Zipcode :"+zip);
		System.out.println("Phone Number :"+phoneNumber);
		System.out.println("Gmail Address :"+gmail);
	}
	public static void main(String[] args) {

		AddressBook address = new AddressBook();
		address = new AddressBook("Samuel", "Shah", "Mumbai", "Maharastra", "490025", "9856321235", "samuelshah123@gmail.com");
		address.displayAddress();
	}
}