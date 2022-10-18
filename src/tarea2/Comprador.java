
package tarea2;

public class Comprador {

    private int vuelto;
    private String queBebida;
    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        this.vuelto = 0;
        Bebida b = exp.comprarBebida(m, cualBebida);
        if (b != null) {
            this.queBebida = b.beber();
        }
        
        while(exp.getVuelto() != null){
            this.vuelto = this.vuelto + exp.getVuelto().getValor();
        }        
    }

    public int getVuelto() {
        return vuelto;
    }

    public String getqueBebida() {
        return queBebida;
    }
}
