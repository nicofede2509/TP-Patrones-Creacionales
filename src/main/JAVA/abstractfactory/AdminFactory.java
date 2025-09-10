package main.JAVA.abstractfactory;

public class AdminFactory implements AbstractFactory {
    public InterfazUI crearUI() {
        return new AdminUI();
    }
    public MetodoEnvio crearEnvio() {
        return new EnvioExpress();
    }
}