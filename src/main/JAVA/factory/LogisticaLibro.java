package main.JAVA.factory;

public class LogisticaLibro {
    public static Libro CrearLibro(String tipoLibro, String nombre, String autor, String espacio_ocupado) {
        switch (tipoLibro.toLowerCase()) {
            case "fisico":
                return new LibroFisico(tipoLibro, nombre, autor);
            case "digital":
                return new LibroDigital(tipoLibro, nombre, autor, espacio_ocupado);
            default:
                throw new IllegalArgumentException("Nombre ingresado inválido: " + tipoLibro);
        }
    }
}