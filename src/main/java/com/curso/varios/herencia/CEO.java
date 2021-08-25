package com.curso.varios.herencia;

public class CEO extends Empleado {

    @Override
    public double calcularSalario() {
        System.out.println("CEO");
        return salario * 10;
    }
 
}
