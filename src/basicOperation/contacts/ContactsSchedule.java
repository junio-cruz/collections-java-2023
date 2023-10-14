package basicOperation.contacts;

import java.util.HashMap;
import java.util.Map;

public class ContactsSchedule {

    private Map<String, Integer> contactsSchedule;
    public ContactsSchedule() {
        this.contactsSchedule = new HashMap<>();
    }

    public void addContact(String name, int phone) {
        this.contactsSchedule.put(name, phone);
    }

    public void removeContact(String name) {
        if (!this.contactsSchedule.isEmpty()) {
            this.contactsSchedule.remove(name);
        }
    }

    public void displayContacts() {
        System.out.println("CONTACTS FOUND" + this.contactsSchedule);
    }

    public Integer searchByName(String name) {
        Integer phoneByName = null;
        if (!this.contactsSchedule.isEmpty()) {
            phoneByName = this.contactsSchedule.get(name);
        }
        return phoneByName;
    }
}
