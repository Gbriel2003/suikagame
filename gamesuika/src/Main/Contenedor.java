package Main;

import javax.swing.JPanel;

public class Contenedor extends JPanel{
    
    private int dimensiones; //ancho y alto del contenedor
    private int limite; // linea en lo alto del contenedor
    private boolean EstadoDeJuego; //Indica si el juego esta en curso o esta terminado si el contenedor se llena
    private int Movimientos; // cantidad de movimientos realizados por el juegador
    
 // Constructor
    public Contenedor(int dimensiones, int limite) {
        this.dimensiones = dimensiones;
        this.limite = limite;
        this.EstadoDeJuego = true; // El juego comienza en curso
        this.Movimientos = 0; // Inicialmente, no se han realizado movimientos
    }

    // Método para agregar un movimiento
    public void agregarMovimiento() {
        this.Movimientos++;
        // Comprobar si el juego ha terminado
        if(this.Movimientos >= this.limite) {
            this.EstadoDeJuego = false;
        }
    }

    // Método para obtener el estado del juego
    public boolean getEstadoDeJuego() {
        return this.EstadoDeJuego;
    }

    // Método para obtener la cantidad de movimientos
    public int getMovimientos() {
        return this.Movimientos;
    }
}