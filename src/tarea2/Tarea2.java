
package tarea2;

public class Tarea2 {

    public static void main(String[] args) {
        Moneda m = new Moneda1000();
        Expendedor e = new Expendedor(1,500);
        Comprador c = new Comprador (m,2,e);
        System.out.println(c.getqueBebida());
        System.out.println(c.getVuelto());
        System.out.println(c.getVuelto());
        System.out.println(c.getVuelto());
        System.out.println(c.getVuelto());
        System.out.println(c.getVuelto());
        System.out.println(c.getVuelto());
    }
}
