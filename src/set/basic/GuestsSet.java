package set.basic;

import java.util.HashSet;
import java.util.Set;

public class GuestsSet {

    @SuppressWarnings("FieldMayBeFinal")
    private Set<Guest> guestsSet;

    public GuestsSet() {
        guestsSet = new HashSet<>();
    }

    public void addGuest(String name, Integer inviteCode) {
        guestsSet.add(new Guest(name, inviteCode));
    }

    public void removeGuestByInviteCode(Integer inviteCode) {
        guestsSet.removeIf(guest -> guest.inviteCode().equals(inviteCode));
    }

    public void showGuests() {
        guestsSet.forEach(System.out::println);
    }

    public static void main(String[] args) {
        GuestsSet guestsSet = new GuestsSet();

        guestsSet.addGuest("Jonas", 17);
        guestsSet.addGuest("Hector Salamanca", 73);
        guestsSet.addGuest("Camille", 20);

        guestsSet.showGuests();

        guestsSet.removeGuestByInviteCode(73);

        guestsSet.showGuests();
    }
}
