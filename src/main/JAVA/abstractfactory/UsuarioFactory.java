package main.JAVA.abstractfactory;

public class UsuarioFactory implements AbstractFactory {

    public InterfazUI crearUI() {
        return new UsuarioUI();
    }

    public MetodoEnvio crearEnvio() {
        return new EnvioNormal();
    }
}