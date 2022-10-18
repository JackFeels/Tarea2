package tarea2;
import java.util.ArrayList;

public class Expendedor {

    public static final int COCA = 1;
    public static final int FANTA = 2;
    public static final int SPRITE = 3;

    private Deposito coca;
    private Deposito fanta;
    private Deposito sprite;
    private DepositoMon vuelto;

    private int precio;

    public Expendedor(int numBebidas, int precioBebidas) {
        this.coca = new Deposito();
        this.sprite = new Deposito();
        this.fanta = new Deposito();
        this.vuelto = new DepositoMon();
        this.precio = precioBebidas;

        for (int i = 0; i < numBebidas; i = i + 1) {
            coca.addBebida(new CocaCola(100 + i));
            sprite.addBebida(new Fanta(200 + i));
            fanta.addBebida(new Sprite(300 + i));
        }
    }

    public Bebida comprarBebida(Moneda m, int cual) {
        if (m == null) {
            this.vuelto.addMoneda(m);
            System.out.println("PagoIncorrectoException");
            return null;
        }else if(m.getValor() < precio){
            this.vuelto.addMoneda(m);
            System.out.println("NoHayBebidaException");
            return null;        
        } else {
            Bebida b = null;
            switch (cual) {
                case 1 -> {
                    b = SacaBebida(coca);
                    if (b == null) {
                        return null;
                    } else {
                        Vuelto100(CalcularVuelto(m));
                    }
                }

                case 2 -> {
                    b = SacaBebida(fanta);
                    if (b == null) {
                        return null;
                    } else {
                        Vuelto100(CalcularVuelto(m));
                    }
                }

                case 3 -> {
                    b = SacaBebida(sprite);
                    if (b == null) {
                        return null;
                    } else {
                        Vuelto100(CalcularVuelto(m));
                    }
                }
            }
            return b;
        }
    }

    public Moneda getVuelto() {
        return vuelto.getMoneda();
    }

    public int CalcularVuelto(Moneda m) {
        if (m.getValor() - precio > 0) {
            int v = m.getValor() - precio;
            return v;
        } else {
            return 0;
        }
    }

    public Bebida SacaBebida(Deposito d) {
        return d.getBebida();
    }

    public void Vuelto100(int vuelto) {
        int v = vuelto;
        while (v > 0) {
            Moneda n = new Moneda100();
            this.vuelto.addMoneda(n);
            v = v - 100;
        }
    }
    
    public int HayMonedas(){
        return vuelto.Size();
    }
}

