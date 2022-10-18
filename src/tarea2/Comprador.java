
package tarea2;

public class Comprador {

    private int vuelto;
    private String queBebida;
    private Expendedor exp;
    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        this.exp=exp;
        Bebida b = exp.comprarBebida(m, cualBebida);
        if (b != null) {
            this.queBebida = b.beber();
        }     
    }

    public int getVuelto(){
        Moneda m;
        m = this.exp.getVuelto();
        vuelto = vuelto + m.getValor();
        if(this.exp.HayMonedas()!=0){
            return m.getValor();
        }else{
            return vuelto;
        }
    }
        
    public String getqueBebida() {
        return queBebida;
    }
}
