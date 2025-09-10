package main.JAVA.factory;

public class LibroFisico implements Libro {
    private String tipolibro;
    private String autor;
    private String nombre;

    public LibroFisico(String tipolibro, String nombre, String autor) {
        this.tipolibro = tipolibro;
        this.nombre = nombre;
        this.autor = autor;
    }

    public String getTipolibro() { return tipolibro; }
    public String getAutor() { return autor; }
    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return "LibroFisico{" +
                "tipolibro='" + tipolibro + '\'' +
                ", autor='" + autor + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}