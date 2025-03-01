package contacts;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class Contact {

	private final String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	//default constructor for contact objects
	public Contact(String contactID, String firstName, String lastName, String phone, String address) {
		//if statements are used for input validation		
		//checks that a contact ID was entered and not longer than 10 characters
		if (contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Contact ID longer than 10 characters.");
		}
		
		//checks that a first name was entered and not longer than 10 characters
		if (firstName == null || firstName.length() >= 10) {
			throw new IllegalArgumentException("First name must not be longer than 10 characters.");
		}		
		
		//checks that a last name was entered and not longer than 10 characters
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Last name must not be longer than 10 characters..");
		}
		
		//checks that a phone number was entered that is exactly 10 digits
		if (phone == null || phone.length() > 10) {
			throw new IllegalArgumentException("Invalid phone number. Please enter a ten-digit phone number.");
		}
		
		//checks that an address was entered and is not longer than 30 characters
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address. Must be 30 characters or less.");
		}
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	//retrieves contact ID
	public String getID() {
		return contactID;
	}
	
	//retrieves first name
	public String getFirstName() {
		return firstName;
	}
	
	//retrieves last name
	public String getLastName() {
		return lastName;
	}
	
	//retrieves phone
	public String getPhone() {
		return phone;
	}
	
	//retrieves address
	public String getAddress() {
		return address;
	}
	

		
	//sets first name
	public void setFirstName(String firstName) {
		//if first name is empty throw error
		if (firstName == null || firstName.isEmpty()) {			
			throw new IllegalArgumentException("Invalid first name");
		} 
		//set name
		this.firstName = firstName;	
	}

	//sets last name
	public void setLastName(String lastName) {
		//if last name is empty throw error
		if (lastName == null || lastName.isEmpty()) {
			throw new IllegalArgumentException("Invalid last name");
		} 
		this.lastName = lastName;
	}

	//sets phone number
	public void setPhone(String phone) {
		//if phone is empty throw error
		if (phone == null || phone.isEmpty() || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		this.phone = phone;	
	}
	
	//sets address
	public void setAddress(String address) {
		//if address is empty throw error
		if (address == null || address.isEmpty()) {
			throw new IllegalArgumentException("Invalid last name");
		}
		this.address = address;
	}
}			



