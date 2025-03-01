package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import contacts.Contact;
import org.junit.jupiter.api.DisplayName;

class ContactTest {
	
	@Test
	@DisplayName("Contact ID must be 10 characters or less.")
	void testContactIDLength() {
		Contact contact = new Contact("1234567890001", "Taylor", "Jones", "1234567890","98765 Easy St.");
		if (contact.getID().length() > 10) {
			fail("Contact ID is longer than 10 characters.");
		}
	}
	
	@Test
	@DisplayName("Contact ID should not be null.")
	void testIDNull() {
		Contact contact = new Contact(null, "Taylor", "Jones", "1234567890","98765 Easy St.");
		assertNotNull(contact.getID(), "Contact ID is null.");
	}
		
	@Test
	@DisplayName("Contact first name must be 10 characters or less.")
	void testContactFirstLength() {
		Contact contact = new Contact("123456", "Taylor", "Jones", "1234567890","98765 Easy St.");
		if (contact.getFirstName().length() > 10) {
			fail("First name is longer than 10 characters.");
		}
	}
	
	@Test
	@DisplayName("First name should not be null.")
	void testFirstNameNull() {
		Contact contact = new Contact("123456", null, "Jones", "1234567890","98765 Easy St.");
		assertNotNull(contact.getFirstName(), "First name is null.");
	}
	
	@Test
	@DisplayName("Contact last name must be 10 characters or less.")
	void testContactLastLength() {
		Contact contact = new Contact("123456", "Taylor", "Jones", "1234567890","98765 Easy St.");
		if (contact.getFirstName().length() > 10) {
			fail("Last name is longer than 10 characters.");
		}
	}
	
	@Test
	@DisplayName("Last name should not be null.")
	void testLastNameNull() {
		Contact contact = new Contact("123456", "Taylor", null, "1234567890","98765 Easy St.");
		assertNotNull(contact.getLastName(), "Last name is null.");
	}
	
	
	@Test
	@DisplayName("Contact phone must be 10 digits.")
	void testContactPhoneLength() {
		Contact contact = new Contact("123456", "Taylor", "Jones", "1234567890","98765 Easy St.");
		if (contact.getFirstName().length() > 10) {
			fail("Phone number is not 10 digits");
		}
	}	
	
	@Test
	@DisplayName("Phone number should not be null.")
	void testPhoneNull() {
		Contact contact = new Contact("123456", "Taylor", "Jones", null,"98765 Easy St.");
		assertNotNull(contact.getPhone(), "Phone number is null.");
	}
	
	@Test
	@DisplayName("Contact address must be 30 characters or less.")
	void testContactAddressLength() {
		Contact contact = new Contact("123456", "Taylor", "Jones", "1234567890","98765 Easy St.");
		if (contact.getFirstName().length() > 10) {
			fail("Address must be less than 30 characters.");
		}
	}
	
	@Test
	@DisplayName("Address should not be null.")
	void testAddressNull() {
		Contact contact = new Contact("123456", "Taylor", "Jones", "1234567890", null);
		assertNotNull(contact.getAddress(), "Address is null.");
		}
}