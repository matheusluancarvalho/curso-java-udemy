package Operadores;

public class Atribuicao {
    public static void main(String[] args) {

        int a = 3;
        int b = a;
        int c = a + b;

        c += b; // c = c + b
        c -= a; // c = c - a
        c *= b; // c = c * b
        c /= a; // c = c / a
        c %= 2; // c = c / 2 -> Serve pra saber se o número é par

        System.out.println(c);

    }
}
