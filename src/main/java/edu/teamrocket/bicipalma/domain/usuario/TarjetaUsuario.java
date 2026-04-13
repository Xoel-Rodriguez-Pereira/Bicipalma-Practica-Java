package edu.teamrocket.bicipalma.domain.usuario;

public class TarjetaUsuario {
    
    private final String id;
    private boolean activada = false;

    TarjetaUsuario(String id, boolean activada) {
        this.id = id;
        this.activada = activada;
    }
    
    public boolean isActivada() {
        return this.activada;
    }

    public void setActivada(boolean estado) {
        this.activada = estado;
    }

    @Override
    public String toString() {
        return "Tarjeta: %I -- %B".formatted(this.id, this.activada);
    }
}