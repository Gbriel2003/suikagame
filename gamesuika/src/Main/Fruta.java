package Main;

public class Fruta {
    private String nombre;  // nombre de la fruta: Datil, cotoperi...
    private String imagen;  // imagen de la fruta
    private int posicion;   // posicion de la fruta en el contenedor
    private boolean estado; //Si esta combinado con otra fruta
    private int puntuacion; //cantidad de puntos que otorga la fruta
    private int VelocidadCaida; //Velocidad con la que cae la fruta 
    
   public Fruta(String nombre, String imagen, int posicion, boolean estado, int puntuacion, int VelocidadCaida){
   this.nombre = nombre;
   this.imagen = imagen;
   this.posicion = posicion;
   this.estado = false;
   this.puntuacion = puntuacion;
   this.VelocidadCaida = VelocidadCaida;
   
   }

    public String getNombre() {
        return nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public int getPosicion() {
        return posicion;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public int getVelocidadCaida() {
        return VelocidadCaida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void setVelocidadCaida(int VelocidadCaida) {
        this.VelocidadCaida = VelocidadCaida;
    }
}
