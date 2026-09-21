public class Calculadora {
    int a, b;

    public Calculadora(int x, int y) {
        a = x;
        b = y;
    }

    public int soma() {
        return a + b;
    }

    public  int subtrai() {
        return  a - b;
    }

    public  int multiplicacao(){
        return  a * b;
    }

    public  int divide(){
        return a / b;
    }
}
