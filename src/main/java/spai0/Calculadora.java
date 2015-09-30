package spai0;

public class Calculadora {
    
    int x, y;
    
    public Calculadora (int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Calculadora () {
        this (1, 1);
    }
    
    public int sumar (int x, int y) {
        return x + y;
    }
    
    public int sumar () {
        return this.x + this.y;
    }
    
    public int multiplicar () {
        return this.x * this.y;
    }
    
    public int dividir () {
        return this.x / this.y;
    }

}
