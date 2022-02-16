package Colecoes.HashcodeEEquals.Application;

import Colecoes.HashcodeEEquals.Entities.Clients;

public class MainHashcodeEEquals {
    public static void main(String[] args) {

        Clients c1 = new Clients("Maria", "maria@gmail.com");
        Clients c2 = new Clients("Bob", "bob@gmail.com");
        Clients c3 = new Clients("Bob", "bob@gmail.com");

        String s1 = "Test";
        String s2 = "Test";

        String s3 = new String("Test");
        String s4 = new String("Test");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));

        System.out.println(c2 == c3); // Ele compara as referẽncias de memória e não o conteúdo

        System.out.println(s1 == s2); // true -> Tratamento especial, pelo conteúdo
        System.out.println(s3 == s4); // false -> Referência de memória
    }
}
