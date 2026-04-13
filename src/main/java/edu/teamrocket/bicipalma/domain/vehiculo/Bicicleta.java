package edu.teamrocket.bicipalma.domain.vehiculo;

public class Bicicleta {

    final int id;

    public Bicicleta(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Id: %I".formatted(this.id);
    }
}