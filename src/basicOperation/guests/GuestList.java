package basicOperation.guests;

import java.util.HashSet;
import java.util.Set;

public class GuestList {
    private Set<Guest> guestList;

    public GuestList() {
        this.guestList = new HashSet<>();
    }

    public void addGuest(String name, int inviteCode) {
        this.guestList.add(new Guest(name, inviteCode));
    }

    public void removeGuest(int inviteCode) {
        Guest guestToRemove = null;
        for (Guest guest: this.guestList) {
            if (guest.getInviteCode() == inviteCode) {
                guestToRemove = guest;
                break;
            }
        }
        this.guestList.remove(guestToRemove);
    }

    public int countGuests() {
        return this.guestList.size();
    }

    public void displayGuests() {
        System.out.println(this.guestList);
    }
}
