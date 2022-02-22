package Operadores;

public class Aritmeticos {
    public static void main(String[] args) {

        var x = 34.56;
        var y = 2.2;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        int a = 8;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / (double) b); // Sem o double o valor dá inteiro -> Resultado = 2

        // Módulo -> Resto da divisão

        System.out.println(a % b);
    }
}
