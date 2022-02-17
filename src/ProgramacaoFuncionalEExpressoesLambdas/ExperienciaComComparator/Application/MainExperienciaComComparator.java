package ProgramacaoFuncionalEExpressoesLambdas.ExperienciaComComparator.Application;

import ProgramacaoFuncionalEExpressoesLambdas.ExperienciaComComparator.Entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainExperienciaComComparator {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        //-------------------------------------1 Forma----------------------------------------------

        // list.sort(new MyComparator());

        //-------------------------------------2 Forma----------------------------------------------

        /*
        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };

        list.sort(comp);

         */

        //--------------------------------------3 Forma----------------------------------------------

        /*
        Comparator<Product> comp = (p1, p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };
        list.sort(comp);

         */

        //---------------------------------------4 Forma---------------------------------------------

        /*

        Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        list.sort(comp);

         */

        //---------------------------------------5 Forma---------------------------------------------

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : list){
            System.out.println(p);
        }
    }

}
