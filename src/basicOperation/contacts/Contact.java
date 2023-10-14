package basicOperation.contacts;

import java.util.Objects;

public class Contact {
    private String name;
    private int phone;

    public Contact(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }

    public int getPhone() {
        return this.phone;
    }
    public void setPhone(int newPhone) {
        this.phone = newPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact contact)) return false;
        return Objects.equals(getName(), contact.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "name " + name + " phone " + phone;
    }
}
