public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(10,40);

        System.out.println("A soma é de x= 10 e y= 40: " + calculadora.soma());
        System.out.println("A subtração é de x= 10 e y= 40: " + calculadora.subtrai());
        System.out.println("A multiplicação é de x= 10 e y= 40: " + calculadora.multiplicacao());
        System.out.println("A divição é de x= 10 e y= 40: " + calculadora.divide());


    }
}