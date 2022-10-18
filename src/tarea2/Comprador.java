
package tarea2;

public class Comprador {
    private int vuelto;
    private String queBebida;
    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        Bebida b = exp.comprarBebida(m, cualBebida);
        if(b != null){
            this.queBebida = b.beber();
        }
        Moneda mon = null;
        while((mon = exp.getVuelto()) != null){
            this.vuelto = vuelto + mon.getValor();
        }        
    }
    public int getVuelto(){
        return vuelto;
    }
    public String getqueBebida(){
        return queBebida;
    } 
}
