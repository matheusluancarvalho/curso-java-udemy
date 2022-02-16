package Colecoes.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo1Aula210 {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        //System.out.println(set.contains("Notebook"));
        // set.remove("Tablet");
       // set.removeIf(x -> x.length() >= 3); Remove todos os produtos que tenham mais de 3 caracteres
       //set.removeIf(x -> x.charAt(0) == 'T'); // Remove todos os produtos que começam com a letra T



        for (String p : set) {
            System.out.println(p);
        }
    }
}
