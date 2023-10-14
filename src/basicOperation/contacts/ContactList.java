package basicOperation.contacts;

import java.util.HashSet;
import java.util.Set;

public class ContactList {
    private Set<Contact> contactList;

    public ContactList() {
        this.contactList = new HashSet<>();
    }

    public void addContact(String name, int phone) {
        this.contactList.add(new Contact(name, phone));
    }

    public void displayContacts() {
        System.out.println(contactList);
    }

    public Set<Contact> searchContact(String name) {
        Set<Contact> contacts = new HashSet<Contact>();
        for (Contact contact: this.contactList) {
            if (contact.getName().startsWith(name)) {
                contacts.add(contact);
            }
        }
        return contacts;
    }

    public Contact updateContactPhone(String name, int newPhone) {
        Contact contactToUpdate = null;
        for (Contact contact: this.contactList) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contact.setPhone(newPhone);
                contactToUpdate = contact;
                break;
            }
        }
        return contactToUpdate;
    }
}
