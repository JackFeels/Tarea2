
package tarea2;
import java.util.ArrayList;

public class Tarea2 {

    public static void main(String[] args) {
        Moneda m = new Moneda1000();
        Expendedor e = new Expendedor(3,500);
        Comprador c = new Comprador (m,1,e);
        
        System.out.println(c.getVuelto());
        System.out.println(c.getVuelto());
        System.out.println(c.getVuelto());
        System.out.println(c.getVuelto());
        System.out.println(c.getVuelto());
        System.out.println(c.getVuelto());
        System.out.println(c.getqueBebida());   
    }
}
