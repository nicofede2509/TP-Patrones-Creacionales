package main.JAVA.singleton;

import main.JAVA.factory.Libro;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static volatile Database DB_instance;
    private List<Libro> libros = new ArrayList<>();

    private Database() {
        System.out.println("Conectando a la base de datos...");
    }

    public static synchronized Database getDB_instance() {
        if (DB_instance == null) {
            synchronized (Database.class) {
                if (DB_instance == null) {
                    DB_instance = new Database();
                }
            }
        }
        return DB_instance;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibros(Libro libro) {
        libros.add(libro);
    }

    public void listarLibros() {
        for (Libro libro : libros) {
            int contador = libros.indexOf(libro) + 1;
            System.out.println("Libro: " + contador);
            System.out.println(libro);
        }
    }
}