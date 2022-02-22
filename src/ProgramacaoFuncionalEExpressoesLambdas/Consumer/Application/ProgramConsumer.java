package ProgramacaoFuncionalEExpressoesLambdas.Consumer.Application;

import java.util.ArrayList;
import java.util.List;

import ProgramacaoFuncionalEExpressoesLambdas.Consumer.Entities.Product;

public class ProgramConsumer {
    public static void main(String[] args) {
        // Aumenta os produtos em 10%

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double factor = 1.1;

        list.forEach(p -> p.setPrice(p.getPrice() * factor));

        list.forEach(System.out::println);
    }
}
