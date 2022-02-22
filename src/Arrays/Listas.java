package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Matheus");
        list.add("Alex");
        list.add("Ana");
        list.add("Jorge");
        list.add(2, "Marco");

        System.out.println("Tamanho da lista é de: " + list.size());


        for (String x : list) {
            System.out.println(x);
        }

        list.remove("Ana");
        System.out.println("Removeu Ana: " + list);
        System.out.println("Achando por nome: " + list.indexOf("Matheus")); // por nome
        System.out.println("Achando por index: " + list.get(0)); // Por index
        list.removeIf(x -> x.charAt(0) == 'A'); // Remove o nome que comece com a Letra A
        System.out.println("Alexe removido: " + list);
        System.out.println("Index of Jorge: " + list.indexOf("Jorge"));

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
        System.out.println("Deixou somente as pessoas que começam com a letra M: " + result);

        String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null); // Procura o
        // primeiro nome com a letra M se não tiver volta null

        System.out.println("Primeiro nome da lista que aparece com a letra M é: " + name);
    }
}
