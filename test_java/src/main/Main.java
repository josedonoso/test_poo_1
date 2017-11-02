package main;

/**
 *
 * @author jose
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hola mundo desde Java!");
        
        Cliente c = new Cliente(1, "Nombre");
        
        System.out.println(c.getNombre());
    }

}
