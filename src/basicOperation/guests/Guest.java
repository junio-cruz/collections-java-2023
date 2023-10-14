package basicOperation.guests;

import java.util.Objects;

public class Guest {
    private String name;
    private int inviteCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guest guest)) return false;
        return getInviteCode() == guest.getInviteCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInviteCode());
    }

    public Guest(String name, int inviteCode) {
        this.name = name;
        this.inviteCode = inviteCode;
    }

    public String getName() {
        return this.name;
    }

    public int getInviteCode() {
        return this.inviteCode;
    }


    @Override
    public String toString() {
        return "name " + name + " inviteCode " + inviteCode;
    }
}
