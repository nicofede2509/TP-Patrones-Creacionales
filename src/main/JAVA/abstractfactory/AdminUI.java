package main.JAVA.abstractfactory;

public class AdminUI implements InterfazUI {
    private String rol = "Administrador";

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }

    public void mostrarUI() {
        System.out.println("Mostrando interfaz de administrador");
    }
}