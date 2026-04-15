package edu.teamrocket.bicipalma.domain.estacion;
import edu.teamrocket.bicipalma.domain.vehiculo.Movil;

class Anclaje {

    private Movil bici;
    private boolean ocupado = false;

    Anclaje() {}
    
    boolean isOcupado() {
        return this.ocupado;
    }

    Movil getBici() {
        return this.bici;
    }

    void anclarBici(Movil bici) {
        this.bici = bici;
        this.ocupado = true;
    }

    void liberarBici() {
        this.ocupado = false;
        this.bici = null;
    }

    public String toString() {
        return "Id: %s; Ocupado: %b".formatted(this.bici == null ? "null" : this.bici.getId(), this.ocupado);
    }
}   