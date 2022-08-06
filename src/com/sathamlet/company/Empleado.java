package com.sathamlet.company;

public class Empleado extends Persona {

    private double remuneracion;
    private int empleadoId;
    private static int idA;
    public Empleado(String nombre, String apellido) {
        super(nombre, apellido);
        empleadoId = ++idA;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }
    @Override
    public String toString() {
        return "Id: " + this.getEmpleadoId()
                + "\nNombre: " + super.toString()
                + "\nRemuneracion: " + this.getRemuneracion();
    }
}
