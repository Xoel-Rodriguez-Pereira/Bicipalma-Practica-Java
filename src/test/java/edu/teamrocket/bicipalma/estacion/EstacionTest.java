package edu.teamrocket.bicipalma.estacion;

import edu.teamrocket.bicipalma.domain.estacion.Estacion;
import edu.teamrocket.bicipalma.domain.vehiculo.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EstacionTest {

    Estacion estacion = new Estacion(1, "Manacor", 6);
		
		/* caso TEST visualizar estado de la estacion 
		 * muestra id, direccion, anclaje
		 * */
	@Test
    public void testGetIdEstacion(){
        assertEquals(estacion.getId(), 1);
        assertEquals(estacion.getDireccion(), "Manacor");
        assertEquals(estacion.numAnclajes(), 6);
    }
	    
				
		/* caso TEST visualizar anclajes libres */
    @Test
    public void visualizarAnclajesLibres(){
        assertEquals(estacion.anclajesLibres(), 6);
    }
		/* caso TEST anclar bicicleta(s) */
		/* caso TEST visualizar anclajes ocupados */
    @Test
    public void visualizarAnclajesOcupados() {

        int[] bicicletas = {291, 292, 293, 294};

		for ( int id: bicicletas ){
			Bicicleta bicicleta = new Bicicleta(id);
            assertEquals(bicicleta.getId(), id);
			estacion.anclarBicicleta(bicicleta);
		}

        assertEquals(estacion.anclajesLibres(), 2);
    }
		
		/* caso TEST retirar bicicleta */

		
}