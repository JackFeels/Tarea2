
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

    public String getVuelto(){
        Moneda m;
        
        if(this.exp.HayMonedas()>0){
            m = this.exp.getVuelto();
            vuelto = vuelto + m.getValor();
            return String.valueOf(m.getValor());
        }else{
            return "null";
        }
    }
        
    public String getqueBebida() {
        return queBebida;
    }
}
