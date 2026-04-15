package edu.teamrocket.bicipalma.domain.estacion;

import edu.teamrocket.bicipalma.domain.vehiculo.Movil;

public class Anclajes {

    private final Anclaje[] anclajes;

    public Anclajes(int numAnclajes) {
        anclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    }

    private void crearAnclajes() {
        
        for (int i = 0; i < numAnclajes(); i++) {
            this.anclajes[i] = new Anclaje();
        }
    }

    public Anclaje[] anclajes() {
        return this.anclajes;
    }

    public int numAnclajes() {
        return this.anclajes.length;
    }

    public void ocuparAnclaje(int posicion, Movil bici) {
        this.anclajes[posicion].anclarBici(bici);
    }

    public boolean isAnclajeOcupado(int posicion) {
        return this.anclajes[posicion].isOcupado();
    }

    public void liberarAnclaje(int posicion) {
        this.anclajes[posicion].liberarBici();
    }

    public Movil getBiciAt(int posicion) {
        return this.anclajes[posicion].getBici();
    }

    public int seleccionarAnclaje() {
        int posicion = 0;
        while (anclajes[posicion].isOcupado()) {
            posicion++;
        }
        return posicion;
    }
}   
