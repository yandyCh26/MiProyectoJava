package pe.edu.upeu;

public class Persona {
    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
    }

    void conducir(coche coche) {
        System.out.println(nombre + " conduce el coche");
        coche.acelerar();
        coche.frenar();
    }
}