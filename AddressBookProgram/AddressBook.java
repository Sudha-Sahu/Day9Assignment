package com.Bridgelabz.Day9Assignment;
import java.util.Scanner;

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
	public void getDetails() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name of user Contact : ");
		this.firstName= sc.nextLine();
		System.out.println("Enter the Last name of user Contact : ");
		this.lastName= sc.nextLine();
		System.out.println("Enter the City of user Contact : ");
		this.city= sc.nextLine();
		System.out.println("Enter the State of user Contact : ");
		this.state= sc.nextLine();
		System.out.println("Enter the ZipCode of user Contact : ");
		this.zip= sc.nextLine();
		System.out.println("Enter the Phone Number of user Contact : ");
		this.phoneNumber= sc.nextLine();
		System.out.println("Enter the Gmail of user Contact : ");
		this.gmail= sc.nextLine();

	}
	public void displayAddress() {

		System.out.println("Details of User Contact ");
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
		address.getDetails();
		address.displayAddress();
	}
}