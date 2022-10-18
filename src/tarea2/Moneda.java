
package tarea2;

abstract class Moneda {
    protected int valor;
    public Moneda(int v){
        this.valor = v;
    }
    public Moneda getSerie(){
        return this;
    }
    public abstract int getValor(); 
}
class Moneda100 extends Moneda{
    public Moneda100(){
        super(100);
    }
    @Override
    public int getValor(){
        return super.valor;
    } 
}
class Moneda500 extends Moneda{
    public Moneda500(){
        super(500);
    }
    @Override
    public int getValor(){
        return super.valor;
    } 
}
class Moneda1000 extends Moneda{
    public Moneda1000(){
        super(1000);
    }
    @Override
    public int getValor(){
        return super.valor;
    } 
}
class Moneda1500 extends Moneda{
    public Moneda1500(){
        super(1500);
    }
    @Override
    public int getValor(){
        return super.valor;
    } 
}