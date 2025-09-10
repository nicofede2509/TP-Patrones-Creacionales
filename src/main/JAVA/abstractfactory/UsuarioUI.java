package main.JAVA.abstractfactory;

public class UsuarioUI implements InterfazUI {
    private String rol = "Usuario";

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }

    public void mostrarUI() {
        System.out.println("Mostrando interfaz de usuario");
    }
}