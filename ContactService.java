package contacts;

import java.util.ArrayList;

public class ContactService {

	//instantiate array data structure to store contacts
	private ArrayList<Contact> contactsList = new ArrayList<Contact>();
	
	
	//display contact information for all contacts in the list
	public void displayContacts() {
		for (int i = 0; i < contactsList.size(); i++) {
			System.out.println("Contact ID: " + contactsList.get(i).getID());
			System.out.println("First Name: " + contactsList.get(i).getFirstName());
			System.out.println("Last Name: " + contactsList.get(i).getLastName());
			System.out.println("Phone #: " + contactsList.get(i).getPhone());
			System.out.println("Address: " + contactsList.get(i).getAddress());
		}		
	}
	
	//search for a contact by ID
	public Contact getContact(String contactID) {
		for (Contact contact : contactsList) {
			if (contact.getID().equals(contactID)) {
				return contact;
			}
		}
		//throw exception if ID not found
		throw new IllegalArgumentException("Contact not found with ID:" + contactID);
	}
	
	//add a new contact or throw exception if ID isn't unique
	public void addContact(Contact contact) {
		//loop over each contact in the list
		for (Contact c : contactsList) {
			//if duplicate ID throw exception
			if (c.getID().equals(contact.getID())) {
				throw new IllegalArgumentException("ID already exists.");
			}
		}
		//add the contact
		contactsList.add(contact);
	}
	
	//delete a contact
	public void deleteContact(String contactID) {
		for (int i = 0; i < contactsList.size(); i++) {
			//if contact matches contact ID remove it
			if (contactsList.get(i).getID() == contactID) {
				contactsList.remove(i);
				return;
			}
		}
		//if ID not found throw exception
		throw new IllegalArgumentException("Contact not found with ID: " + contactID);
	}
	
	//update contact information
	public void updateContact(String contactID, String firstName, String lastName, String phone, String address) {
		//loop over contacts
		for (Contact contact : contactsList) {
			//if ID matches update each field
			if (contact.getID().equals(contactID)) {
				if (firstName ==  null || firstName.length() <= 10) {
					contact.setFirstName(firstName);
				}
				if (lastName ==  null || lastName.length() <= 10) {
					contact.setLastName(lastName);
				}
				if (phone ==  null || phone.length() != 10) {
					contact.setPhone(phone);
				}
				if (address ==  null || address.length() <= 30) {
					contact.setFirstName(address);
				}
				return;
			}
		}
		//if ID not found throw exception
		throw new IllegalArgumentException("Contact not found with ID: " + contactID);
	}
}