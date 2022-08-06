package com.sathamlet;

import com.sathamlet.company.Empleado;
import com.sathamlet.company.Gerente;

public class Main {
    public static void main(String[] args) {
        Gerente gen1 = new Gerente("Luis", "Perez");
        gen1.setRemuneracion(23000);
        gen1.setPresupuesto(7000);
        System.out.println("gen1 = " + gen1);
        System.out.println();
        Empleado empleado1 = new Empleado("Jose", "Hernandez");
        empleado1.setRemuneracion(10300);
        System.out.println("empleado1 = " + empleado1);
        
    }
}
