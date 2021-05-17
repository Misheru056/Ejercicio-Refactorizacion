package coche;

/**
 *
 * @author
 */
public class Main {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Coche myCar;
        int stockActual;
        
        myCar = new Coche("Opel",12000,500);
        try 
        {
            System.out.println("Venta de Coches");
            myCar.vender(300);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender " + e);
        }
        
        try
        {
            System.out.println("Compra de Coches");
            myCar.comprar(500);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar " + e);
        }
        stockActual = myCar.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

}