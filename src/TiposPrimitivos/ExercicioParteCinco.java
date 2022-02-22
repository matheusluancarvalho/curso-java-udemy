package TiposPrimitivos;

import java.util.Scanner;

public class ExercicioParteCinco {
    public static void main(String[] args) {

/*

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que
recebi o salário de <salario>, na data <data>

*/
        String nome = "Matheus Luan";
        String endereco = "Rua do Limoeiro";
        double salario = 850.0;
        String data = "05 de dezembro de 2021";

      System.out.println("Eu " + nome + " morando no endereço " + endereco + ", confirmo"
              + " que recebi o salário de R$ " + salario + " na data " + data);
    }
}
