package Tarea2PW;

public class Persona {
    public String nombre;
    int cuentaCorriente;

    public Persona (String nombre) {
        this.nombre = nombre;
        cuentaCorriente = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // suma la cuenta
    public void sumarCuenta (int cantidad) {
        this.cuenta += cantidad;
    }
        
}
