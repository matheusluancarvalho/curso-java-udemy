package Operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {

        int a = 97;
        int b = 'a';

        System.out.println(a == b);
        System.out.println(3 > 7);
        System.out.println(3 >= 3);
        System.out.println(3 < 7);
        System.out.println(3 <= 7);
        System.out.println(3 != 7);

        double nota = 6.3;
        boolean bomcomp = true;
        boolean passouPorMedia = nota >= 7;
        boolean TemMesada = passouPorMedia &&  bomcomp;

        System.out.println("Vai ter mesada? " + TemMesada);

    }
}
