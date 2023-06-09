import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ServerTest {

    Server server;
    Guest guest;

    @BeforeEach
    public void setUp() {
        server = new Server();
        guest = new Guest("Zaynah", 23, 50, 89, false, true);
    }

    // TODO: test that guest can only get served if over 18 -> if over 18 or boolean?

    @Test // tests are always void and empty brackets
    public void isGuestOldEnough() {
        assertThat(server.checkIfOldEnough(guest)).isEqualTo(true);
    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)
    @Test
    public void guestMoney(){
    assertThat(server.checkMoney(guest)).isEqualTo(true);
    }

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)
    @Test
    public void isGuestSober() {
    assertThat(server.soberEnough(guest)).isEqualTo(true);
    }

    // TODO: test that guest can only get served if guest is not banned from the pub
    @Test
    public void isGuestBanned(){
        assertThat(server.guestBanned(guest)).isFalse();
    }

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)

    @Test
    public void isGuestPaying£(){
        assertThat(server.guestPaying£(guest)).isTrue();

    }
}


    // EXTENSIONS
    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)


