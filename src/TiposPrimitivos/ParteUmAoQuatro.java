package TiposPrimitivos;

public class ParteUmAoQuatro {
    public static void main(String[] args) {

        /*

        Tipo Primitivo + Nome da variável = valor;

        São tipos primitivos em Java:

        byte = 1 byte       -128 a 127
        short = 2 bytes     -32768 a 32767
        int = 4 bytes       -2^-31 a 2^30
        long = 8 bytes      -2^63 a 2^62
        float = 4 bytes     -2^31 a 2^30
        double = 8 bytes    -2^63 a 2^62
        boolean = 1 bit     true ou false
        char = 2 bytes      -2^16 a 2^15

        São classes que especificam os tipos de objetos:

        String
        Arrays Primitivos
        Objetos

        */

        byte bytes = 1;
        short shorts = 2;
        int ints = 3;
        long longs = 4;
        float floats = 5.0F;
        double doubles = 6.0;
        boolean booleans = true;
        char chars = 'M';
        String strings = "João Bernardo da Silva Campos Neves Lemes Carvalho Ribeiro Souza Belas" +
                " Macedo Rosa Dias Alvares Toledo Fontes Real";

        System.out.println(bytes);
        System.out.println(shorts);
        System.out.println(ints);
        System.out.println(longs);
        System.out.println(floats);
        System.out.println(doubles);
        System.out.println(booleans);
        System.out.println(chars);
        System.out.println("Oi, meu nome é: " + strings);


        // Fazendo Casting

        int tamanho = (int) 1000000000000L;
        System.out.println(tamanho);

        var hey = "Olá";
        System.out.println(hey);

    }
}
