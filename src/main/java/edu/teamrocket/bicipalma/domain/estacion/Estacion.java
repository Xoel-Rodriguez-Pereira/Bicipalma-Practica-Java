package edu.teamrocket.bicipalma.domain.estacion;

import edu.teamrocket.bicipalma.domain.vehiculo.Movil;
import edu.teamrocket.bicipalma.domain.usuario.Autenticacion;

import java.util.Optional;

public class Estacion {
    private final int id;
    private final String direccion;
    private final Anclajes anclajes;
    
    public Estacion(int id, String direccion, int numAnclajes) {
        this.id = id;
        this.direccion = direccion; 
        this.anclajes = new Anclajes(numAnclajes);
    }

    private int getId() {
        return this.id;
    }

    private String getDireccion() {
        return this.direccion;
    }

    @Override
    public String toString() {
        return "ID estacion: %S; Direccion: %S; Anclajes %d".formatted(this.id, this.direccion, this.anclajes.numAnclajes());
    }

    private Anclaje[] anclajes() {
        return this.anclajes.anclajes();
    }

    private int numAnclajes() {
        return this.anclajes.numAnclajes();
    }
    
    public void consultarEstacion() {
        System.out.println(this.toString());
    }

    public int anclajesLibres() {
        int anclajesLibres = 0;
        for (Anclaje anclaje : this.anclajes.anclajes()) {
            anclajesLibres += anclaje.isOcupado() ? 0 : 1;
        }
        return anclajesLibres;
    }

    public void anclarBicicleta(Movil bicicleta) {
        int posicion = 0; 
        while (this.anclajes.anclajes()[posicion].isOcupado()) { //this.anclajes.anclajes() devuelve un array de Anclaje
            posicion++;
        }
        mostrarAnclaje(bicicleta, posicion);
    }

    private void mostrarBicicleta(Movil bicicleta, int posicion) {
        System.out.println("Se ha retirado la bicicleta %d en la posicion %d".formatted(bicicleta, posicion));
    }

    private void mostrarAnclaje(Movil bicicleta, int posicion) {
        System.out.println("ID bicicleta: %d; Anclaje: %d".formatted(bicicleta.getId(), ++posicion));
    }

    public boolean leerTarjetaUsuario(Autenticacion tarjeta) {
        return tarjeta.isActivada();
    }

    public void retirarBicicleta(Autenticacion tarjeta) {
        if (tarjeta.isActivada()) {
            int posicionBici = this.anclajes.seleccionarAnclaje();
            this.anclajes.anclajes()[posicionBici].liberarBici();
            mostrarBicicleta(this.anclajes.getBiciAt(posicionBici), posicionBici);
        } else {
            System.out.println("No hay bicicletas disponibles");
        }
    }

    public void consultarAnclajes() {
        int posicion = 0;
        for (Anclaje anclaje : this.anclajes.anclajes()) {
            ++posicion;
            System.out.println("Bicicleta: %d -- %b; Anclaje: %d".formatted(anclaje.getBici(), anclaje.isOcupado(), posicion));
        }
    }
}