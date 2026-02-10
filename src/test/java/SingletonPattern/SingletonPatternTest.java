package SingletonPattern;

import org.example.SingletonPattern.Undo;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonPatternTest {
    private Undo undo;

    @BeforeEach
    void setUp() {
        undo = Undo.getInstance();

        try {
            while (true) {
                undo.undoCommand();}
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    void testSingletonInstance() {
            Undo instance1 = Undo.getInstance();
            Undo instance2 = Undo.getInstance();

            assertSame(instance1, instance2, "Ambas instancias deben ser la misma");
            assertNotNull(instance1);
    }

    @Test
    void testAddAndUndoCommand() {
        undo.addCommand("Comando 1");
        undo.addCommand("Comando 2");

        assertEquals("Comando 2", undo.undoCommand());
        assertEquals("Comando 1", undo.undoCommand());
    }

    @Test
    void testUndoEmptyHistory() {
            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                undo.undoCommand();});

            assertEquals("The list is empty", exception.getMessage());
    }
}

