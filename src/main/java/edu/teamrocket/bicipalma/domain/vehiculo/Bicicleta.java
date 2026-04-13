package edu.teamrocket.bicipalma.domain.vehiculo;

public class Bicicleta implements Movil {

    final int id;

    public Bicicleta(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String toString() {
        return "%d".formatted(this.id);
    }
}