
package tarea2;

public class Expendedor {
    public static final int COCA = 1;
    public static final int FANTA = 2;
    public static final int SPRITE = 3;
    
    private Deposito coca;
    private Deposito fanta;
    private Deposito sprite;
    private DepositoMon vuelto;
    
    private int precio;
    
    public Expendedor(int numBebidas,int precioBebidas){
        this.coca = new Deposito();
        this.sprite = new Deposito();
        this.fanta = new Deposito();
        this.vuelto = new DepositoMon();
        this.precio = precioBebidas;
        
        for(int i = 0; i < numBebidas; i = i + 1){
            coca.addBebida(new CocaCola(100 +i));
            sprite.addBebida(new Fanta(200 +i));
            fanta.addBebida(new Sprite(300 +i));
        }
    }
    public Bebida comprarBebida(Moneda m, int cual){
        if(m == null || m.getValor() < precio){
            this.vuelto.addMoneda(m);
            return null;    
        } else {
                
                }
    }
    
    
    public Moneda getVuelto(){
        return vuelto.getMoneda();
    }
}
