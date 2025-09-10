package main.JAVA.builder;

public class Usuario {
    private String nombre;
    private String email;
    private String direccion;
    private String telefono;
    private String fechaNacimiento;

    public Usuario(String nombre, String email, String direccion, String telefono, String fechaNacimiento) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public String getDireccion() { return direccion; }
    public String getTelefono() { return telefono; }
    public String getFechaNacimiento() { return fechaNacimiento; }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}