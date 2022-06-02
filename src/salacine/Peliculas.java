package salacine;

public class Peliculas {

    String nombre;
    int edad;

    public Peliculas(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Confirmacion de compra {Nombre= " + nombre + ", Edad= " + edad + ", ";
    }

}