package ProgramacaoFuncionalEExpressoesLambdas.Predicate.Util;

import java.util.function.Predicate;
import ProgramacaoFuncionalEExpressoesLambdas.Predicate.Entities.Product;


public class ProductPredicate implements Predicate<Product>{

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;
    }
}
