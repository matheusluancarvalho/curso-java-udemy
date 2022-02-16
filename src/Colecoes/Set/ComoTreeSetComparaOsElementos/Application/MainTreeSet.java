package Colecoes.Set.ComoTreeSetComparaOsElementos.Application;

import java.util.Set;
import java.util.TreeSet;

import Colecoes.Set.ComoSetTestaIgualdade.Entities.Product;

public class MainTreeSet {
    public static void main(String[] args) {
        Set<Product> set = new TreeSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        for (Product p : set) {
            System.out.println(p);
        }

    }
}
