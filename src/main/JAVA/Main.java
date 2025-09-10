
package main.JAVA;

import main.JAVA.abstractfactory.*;
import main.JAVA.builder.Usuario;
import main.JAVA.factory.Libro;
import main.JAVA.factory.LogisticaLibro;
import main.JAVA.prototype.Prestamo;
import main.JAVA.singleton.Database;

public class Main {
    public static void main(String[] args) {
        System.out.println("Parte patrón Singleton: \n");

        Database Base_De_Datos = Database.getDB_instance();

        Database DB1 = Database.getDB_instance();
        Database DB2 = Database.getDB_instance();

        if(DB1 == DB2){
            System.out.println("Hola, bienvenido a su biblioteca. \n");
        }else {
            System.out.println("Acceso denegado, intente más tarde\n");
            System.exit(0);
        }

        System.out.println("================================================================================================");
        System.out.println("Parte patrón Factory\n");

        Libro libro1 = LogisticaLibro.CrearLibro("fisico","100 años de soledad" , "Gabriel García Máqrquez", null);
        Libro libro2 = LogisticaLibro.CrearLibro("digital","100 años de soledad" , "Gabriel García Máqrquez", "150 MB");

        Base_De_Datos.agregarLibros(libro1);
        Base_De_Datos.agregarLibros(libro2);

        Database.getDB_instance().listarLibros();

        System.out.println("================================================================================================");
        System.out.println("Parte patrón Abstract Factory.\n");

        AbstractFactory adminFactory = new AdminFactory();
        InterfazUI adminUI = adminFactory.crearUI();
        MetodoEnvio envioAdmin = adminFactory.crearEnvio();

        AbstractFactory userFactory = new UsuarioFactory();
        InterfazUI userUI = userFactory.crearUI();
        MetodoEnvio envioUser = userFactory.crearEnvio();

        System.out.println("Admin:");
        adminUI.mostrarUI();
        envioAdmin.enviar();

        System.out.println("\nUsuario:");
        userUI.mostrarUI();
        envioUser.enviar();
        System.out.println();

        System.out.println("================================================================================================");
        System.out.println("Parte patrón Builder.\n");

        Usuario usuario1 = new Usuario("Nico", "nico@mail.com", "San Martin 541", "2612189000", "25/09/2004");
        Usuario usuario2 = new Usuario("Pepe", "Pepe@gmail.com", "Avellaneda", "12345678", "07/3/1994");

        System.out.println("Usuarios creados:");
        System.out.println("Usuario 1 - Nombre: " + usuario1.getNombre() +
                ", Email: " + usuario1.getEmail() +
                ", Dirección: " + usuario1.getDireccion() +
                ", Teléfono: " + usuario1.getTelefono() +
                ", Fecha Nacimiento: " + usuario1.getFechaNacimiento());

        System.out.println("Usuario 2 - Nombre: " + usuario2.getNombre() +
                ", Email: " + usuario2.getEmail() +
                ", Dirección: " + usuario2.getDireccion() +
                ", Teléfono: " + usuario2.getTelefono() +
                ", Fecha Nacimiento: " + usuario2.getFechaNacimiento());
        System.out.println();

        System.out.println("================================================================================================");
        System.out.println("Parte patrón Prototype.\n");

        Prestamo prestamo1 = new Prestamo();
        prestamo1.setLibro(LogisticaLibro.CrearLibro("Digital", "El Quijote", "Cervantes", "5000 MB"));
        prestamo1.setUsuario(usuario1);
        prestamo1.setFechaInicio("01-09-2025");

        Prestamo prestamo2 = prestamo1.clone();
        prestamo2.setFechaInicio("03/5/2025");
        prestamo2.setFechaFin("10/5/2025");
        prestamo2.setLibro(LogisticaLibro.CrearLibro("Fisico", "Harry Potter y las reliquias de la muerte, Parte 1",
                "J.K Rowling", null));
        prestamo2.setUsuario(usuario2);

        System.out.println("Préstamos asociados:");
        System.out.println("Original - Libro: " + prestamo1.getLibro().getNombre() +
                ", Autor: " + prestamo1.getLibro().getAutor() +
                ", Usuario: " + prestamo1.getUsuario().getNombre() +
                ", Fecha Inicio: " + prestamo1.getFechaInicio() +
                ", Fecha Fin: " + prestamo1.getFechaFin());

        System.out.println("Clonado - Libro: " + prestamo2.getLibro().getNombre() +
                ", Autor: " + prestamo2.getLibro().getAutor() +
                ", Usuario: " + prestamo2.getUsuario().getNombre() +
                ", Fecha Inicio: " + prestamo2.getFechaInicio() +
                ", Fecha Fin: " + prestamo2.getFechaFin());
    }
}