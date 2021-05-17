package coche;

/**
 *
 * @author Profesor
 */
public class Coche {

    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;

    /* Constructor sin argumentos */

    /**
     *
     */

    public Coche ()
    {
    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    // Coche
    
    /**
     *
     * @param nom
     * @param precio
     * @param stock
     */
    public Coche (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
   // Método para asignar el nombre del Coche

    /**
     *
     * @param nom
     */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
    // Método que me devuelve el nombre del Coche

    /**
     *
     * @return
     */
    public String obtenerNombre()
    {
        return nombre;
    }

    // Método que me devuelve el stock de coches disponible en cada momento

    /**
     *
     * @return
     */
     public int obtenerStock ()
    {
        return stock;
    }

    /* Método para comprar coches. Modifica el stock.
     * Este método va a ser probado con Junit
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de coches");
        stock = stock + cantidad;
    }

    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de coches");
        if (obtenerStock()< cantidad)
            throw new Exception ("No  hay suficientes coches para vender");
        stock = stock - cantidad;
    }
    
}  
   
    

