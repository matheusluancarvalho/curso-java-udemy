package ProgramacaoFuncionalEExpressoesLambdas.Consumer.Util;

import java.util.function.Consumer;
import ProgramacaoFuncionalEExpressoesLambdas.Consumer.Entities.Product;

public class PriceUpdate implements Consumer<Product>{

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
