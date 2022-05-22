package Tarea2PW;

public class Estacionamiento {
    static int cantLugares;
    static int precioInicio;
    static int autoNoche;
    
    static Estacionamiento [] lugares;

    public static void inicializar (int cantLugares, int precioInicio, int autoNoche){
        lugares = new Estacionamiento [cantLugares];

        Estacionamiento lugar = new Estacionamiento (cantLugares, precioInicio, autoNoche);
    }
    public static void entra ()
    

}
