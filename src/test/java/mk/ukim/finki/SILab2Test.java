package mk.ukim.finki;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    public User user1 = new User("KoniiiVidovic", "password789#$%&*", "Koniii.Vidovic@gmail.com");
    public User user2 = new User("KoniVidovic", "password123$", "Koni.Vidovic@gmail.com");
    ArrayList<User> list = new ArrayList<User>();

    @Test
    void exceptionTest() { //Multiple condition test
        list.add(user1);
        list.add(user2);
        assertThrows(RuntimeException.class, ()-> SILab2.function(null, list));
    }

    //Every branch tests
    @Test
    void test2() {
        list.add(user1);
        list.add(user2);
        User user = new User("KoniVidovich", "password123$&*", "Koni.Vidovich@gmail.com");
        assertEquals(true, SILab2.function(user, list));
    }

    @Test
    void test3() {
        list.add(user1);
        list.add(user2);
        User user = new User("", "pass", "Koni.Vidovic@gmailcom");
        assertEquals(false, SILab2.function(user, list));
    }

    @Test
    void test4() {
        list.add(user1);
        list.add(user2);
        User user = new User("KoniVidovic", "pass word", "Koni.Vidovic@gmail.com");
        assertEquals(false, SILab2.function(user, list));
    }

    @Test
    void test5() {
        list.add(user1);
        list.add(user2);
        User user = new User("KoniVidovic", "password123", "Koni.Vidovic@gmail.com");
        assertEquals(false, SILab2.function(user, list));
    }


}