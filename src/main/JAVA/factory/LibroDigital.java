package main.JAVA.factory;

public class LibroDigital implements Libro {
    private String tipolibro;
    private String nombre;
    private String autor;
    private String espacio_ocupado;

    public LibroDigital(String tipolibro, String nombre, String autor, String espacio_ocupado) {
        this.tipolibro = tipolibro;
        this.nombre = nombre;
        this.autor = autor;
        this.espacio_ocupado = espacio_ocupado;
    }

    public String getTipolibro() { return tipolibro; }
    public String getNombre() { return nombre; }
    public String getAutor() { return autor; }
    public String getEspacio_ocupado() { return espacio_ocupado; }

    @Override
    public String toString() {
        return "LibroDigital{" +
                "tipolibro='" + tipolibro + '\'' +
                ", nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", espacio_ocupado='" + espacio_ocupado + '\'' +
                '}';
    }
}