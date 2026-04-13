package edu.teamrocket.bicipalma.domain.estacion;

import edu.teamrocket.bicipalma.domain.vehiculo.Movil;

public class Anclajes {

    private final Anclaje[] anclajes;

    Anclajes(int numAnclajes) {
        anclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    }

    private void crearAnclajes() {
        
        for (int i = 0; i < numAnclajes(); i++) {
            this.anclajes[i] = new Anclaje();
        }
    }

    Anclaje[] anclajes() {
        return this.anclajes;
    }

    int numAnclajes() {
        return this.anclajes.length;
    }

    void ocuparAnclaje(int posicion, Movil bici) {
        this.anclajes[posicion].anclarBici(bici);
    }

    boolean isAnclajeOcupado(int posicion) {
        return this.anclajes[posicion].isOcupado();
    }

    void ocuparAnclaje(int posicion) {
        this.anclajes[posicion].liberarBici();
    }

    Movil getBiciAt(int posicion) {
        return this.anclajes[posicion].getBici();
    }

    int seleccionarAnclaje() {
        int posicion = 0;
        while (!anclajes[posicion].isOcupado()) {
            posicion++;
        }
        return posicion;
    }
}   