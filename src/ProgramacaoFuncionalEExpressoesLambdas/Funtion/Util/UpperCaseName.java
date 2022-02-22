package ProgramacaoFuncionalEExpressoesLambdas.Funtion.Util;

import ProgramacaoFuncionalEExpressoesLambdas.Funtion.Entities.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String>{

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
