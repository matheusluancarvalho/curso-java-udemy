package Operadores;

public class Logicos {
    public static void main(String[] args) {


        //----------------------------------Tabela Verdade------------------------------
        System.out.println("Tabela Verdade".toUpperCase());
        //                                      AND
        System.out.println("\n\nand".toUpperCase());
        System.out.println("true && true = " + true);
        System.out.println("true && false = " + false);
        System.out.println("false && true = " + false);
        System.out.println("false && false = " + false);

        //                                      OR
        System.out.println("\n\nor".toUpperCase());
        System.out.println("true || true = " + true);
        System.out.println("true || false = " + true);
        System.out.println("false || true = " + true);
        System.out.println("false || false = " + false);

        //                                      AND
        System.out.println("\n\nxor".toUpperCase());
        System.out.println("true ^ true = " + false);
        System.out.println("true ^ false = " + true);
        System.out.println("false ^ true = " + true);
        System.out.println("false ^ false = " + false);

        //                                      NOT
        System.out.println("\n\nnot".toUpperCase());
        System.out.println("!true = " + false);
        System.out.println("!!true = " + true);
        System.out.println("!false = " + true);
        System.out.println("!!false = " + false);

    }
}
