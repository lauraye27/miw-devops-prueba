package es.upm.miw.iwvg_devops.rest.code;

import es.upm.miw.iwvg_devops.code.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    void before() {
        user = new User("001", "Laura", "Ye", new ArrayList<>());
    }

    @Test
    void testAddFraction() {
        Fraction fraction = new Fraction(1, 2);
        user.addFraction(fraction);
        List<Fraction> fractions = user.getFractions();

        assertEquals(1, fractions.size());
        assertEquals(fraction, fractions.get(0));
    }

    @Test
    void testFullName() {
        assertEquals("Laura Ye", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("L.", user.initials());
    }
}
