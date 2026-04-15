package edu.teamrocket.bicipalma.vehiculo;

import edu.teamrocket.bicipalma.domain.vehiculo.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BicicletaTest {

    private static Bicicleta bici = null;

    @BeforeEach
    public void setup_bicicleta() {
        // ARRANGE
        bici = new Bicicleta(101);
    }
    
    @Test
    public void test_constructor_bicicleta() {
        // ARRANGE
        int idExpected = 101;
        // ACT
        int id = bici.getId();
        // ASSERT
        assertEquals(idExpected, id);
    }

    @Test
    public void test_toString_bicicleta() {
        // ARRANGE
        String id = "101";
        // ACT
        String representacionIdBici = bici.toString();
        // ASSERT
        assertEquals(id, representacionIdBici);
    }
}