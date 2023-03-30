public class Server {
//    public boolean canServeGuest(Guest guest){
//        return true;


    public boolean checkIfOldEnough(Guest guest) {
        if (guest.getAge() >= 18) {
            return true;
        }
        return false;
    }

    public boolean checkMoney (Guest guest) {
        if (guest.getMoney() >= 5) {
            return true;
        }
        return false;
    }

    public boolean soberEnough (Guest guest) {
        if (guest.getSober() >= 50){
            return true;
        }
        return false;
    }

    public boolean guestBanned (Guest guest) {
        if (guest.bannedFromPub == true) {
            return true;
        }
        return false;
    }

    public boolean guestPaying£ (Guest guest) {
        if (guest.guestPaying£ == true) {
            return true;
        }
        return false;
    }

}
