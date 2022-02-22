package Operadores;

public class DesafioAritmeticos {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 5;
        int e = 6;
        int f = 7;
        int g = 10;

        int somabc = b + c;
        int subtracaoad = 1 - 5;
        int subtracaobf = 2 - 7;
        int multipcb = 3 * 2;

        var parta1 = 6 * somabc;
        var parta2 = Math.pow(parta1, 2);
        var parta3 = parta2 / multipcb;

        var partb1 = subtracaoad * subtracaobf;
        var partb2 = partb1 / b;
        var partb3 = Math.pow(partb2, 2);

        var partc1 = parta3 - partb3;
        var partc2 = Math.pow(partc1, 3);

        var partd1 = Math.pow(g, 3);

        var parte1 = partc2 / partd1;

        System.out.println("O resultado é: " + (int) parte1);



    }
}
