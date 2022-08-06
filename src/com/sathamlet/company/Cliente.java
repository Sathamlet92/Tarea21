package com.sathamlet.company;

public class Cliente extends Persona{
    private int clienteId;
    private static int idC;
    public Cliente(String nombre, String apellido) {
        super(nombre, apellido);
        clienteId = idC + 1;
    }

    public int getClienteId() {
        return clienteId;
    }

    @Override
    public String toString() {
        return "ID Cliente: " + this.getClienteId()
                + "\nNombre: " + super.toString();
    }
}
