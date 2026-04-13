package edu.teamrocket.bicipalma.domain.usuario;

public class TarjetaUsuario implements Autenticacion {
    
    private final String id;
    private boolean activada = false;

    public TarjetaUsuario(String id, boolean activada) {
        this.id = id;
        this.activada = activada;
    }
    
    @Override
    public boolean isActivada() {
        return this.activada;
    }

    public void setActivada(boolean estado) {
        this.activada = estado;
    }

    @Override
    public String toString() {
        return "Tarjeta: %s -- %B".formatted(this.id, this.activada);
    }
}