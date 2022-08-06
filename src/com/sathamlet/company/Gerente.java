package com.sathamlet.company;

public class Gerente extends Empleado{
    private double presupuesto;
    public Gerente(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPresupuesto: " + this.getPresupuesto();
    }
}
