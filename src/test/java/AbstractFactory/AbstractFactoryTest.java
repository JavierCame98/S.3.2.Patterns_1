package AbstractFactory;

import org.example.AbstractFactory.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AbstractFactoryTest {

    @Test
    void testSpainContact() {
        ContactFactory spainFactory = new SpainContactFactory(
                "Calle Mayor 1",
                "Madrid",
                "28001",
                "912344556"
        );
        Contact contact = new Contact(spainFactory);
        String result = contact.toString();

        assertTrue(result.contains("+34 912344556"), "El teléfono debería tener formato español");
        assertTrue(result.contains("Calle Mayor 1, Madrid, 28001"), "La dirección no coincide con el formato de SpainAdress");
    }

    @Test
    void testUSAContact() {
        ContactFactory usaFactory = new USAContactFactory(
                "5th Ave",
                "New York City",
                "10001",
                "2125551234"
        );
        Contact contact = new Contact(usaFactory);
        String result = contact.toString();

        assertTrue(result.contains("+1 2125551234"), "El teléfono debería tener formato USA");
        assertTrue(result.contains("5th Ave, New York City, NY 10001"), "La dirección no coincide con el formato de USAAdress");
    }

    @Test
    void testFactoryInstanceTypes() {
        ContactFactory spainFactory = new SpainContactFactory("S", "C", "Z", "P");

        assertInstanceOf(SpainAdress.class, spainFactory.createAdress(), "Debe crear una instancia de SpainAdress");
        assertInstanceOf(SpainPhone.class, spainFactory.createPhone(), "Debe crear una instancia de SpainPhone");

        ContactFactory usaFactory = new USAContactFactory("S", "C", "Z", "P");

        assertInstanceOf(USAAdress.class, usaFactory.createAdress(), "Debe crear una instancia de USAAdress");
        assertInstanceOf(USAPhone.class, usaFactory.createPhone(), "Debe crear una instancia de USAPhone");
    }
}
