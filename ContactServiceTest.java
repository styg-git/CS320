package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import contacts.ContactService;
import contacts.Contact;
import org.junit.jupiter.api.DisplayName;

class ContactServiceTest {

	@Test
	@DisplayName("New contact added.")
	void testAddContact() {
		ContactService service = new ContactService();
		Contact contact = new Contact("12345", "Taylor", "Jones", "1234567890", "98765 Easy St.");
				service.addContact(contact);				
				assertEquals(contact, service.getContact("12345"));
	}
	
	@Test
	@DisplayName("Duplicate contacts cannot be added.")
	void testDuplicateContactID() {
		ContactService service = new ContactService();
		Contact contact1 = new Contact("12345", "Taylor", "Jones", "1234567890", "98765 Easy St.");
		Contact contact2 = new Contact("12345", "First", "Last", "0987654321", "12345 Easy St.");
		
		service.addContact(contact1);				
		assertThrows(IllegalArgumentException.class, () -> service.addContact(contact2));
	}
	
	
	@Test
	@DisplayName("Contacts can be deleted.")
	void testDeleteContact() {
		ContactService service = new ContactService();
		Contact contact = new Contact("12345", "Taylor", "Jones", "1234567890", "98765 Easy St.");
		
		service.addContact(contact);
		service.deleteContact("12345");
		assertThrows(IllegalArgumentException.class, () -> service.deleteContact("12345"));
	}
	
	@Test
	@DisplayName("Cannot delete contact that doesn't exist.")
	void testDeleteNonExistentContact() {
		ContactService service = new ContactService();
		assertThrows(IllegalArgumentException.class, () -> service.deleteContact("54321"));
	}
	
	@Test
	@DisplayName("Contacts can be updated.")
	void testUpdateContact() {
		ContactService service = new ContactService();
		Contact contact = new Contact("12345", "Taylor", "Jones", "1234567890", "98765 Easy St.");
		
		service.addContact(contact);
		service.updateContact("12345", "Taylor", "Jones", "1234567890", "98765 Easy St.");
		
		Contact updateContact = service.getContact("12345");
		assertEquals("Taylor", updateContact.getFirstName());
		assertEquals("Jones", updateContact.getLastName());
		assertEquals("1234567890", updateContact.getPhone());
		assertEquals("98765 Easy St.", updateContact.getAddress());
	}
	
	@Test
	@DisplayName("Cannot delete contact that doesn't exist.")
	void testUpdateNonExistentContact() {
		ContactService service = new ContactService();
		assertThrows(IllegalArgumentException.class, () -> service.updateContact("100000", "Taylor", "Jones", "1234567890", "98765 Easy St."));
	}
	
	
	
	
	
	
	
	
}


