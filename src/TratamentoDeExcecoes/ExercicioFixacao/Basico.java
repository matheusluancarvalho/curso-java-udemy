package TratamentoDeExcecoes.ExercicioFixacao;

import Fundamentos.Carro;

public class Basico {
    public static void main(String[] args) {

        Aluno a1 = null;

        try{
            imprimirAluno(a1);
        }catch (Exception execao){
            System.out.println("Ocorreu um erro ao imprimir o nome do usuário");
        }

        try{
            System.out.println(7/0);
        }catch (ArithmeticException e){
            //e.printStackTrace();
            System.out.println("Ocorreu um erro na operação. Impossível dividir por zero!" +
                    " \nA não ser que vc tenha noção de limites, aí sim é outra coisa!" +
                    e.getMessage());
        }
        System.out.println("Fim :)");


    }
    public static void imprimirAluno(Aluno aluno){
        System.out.println(aluno.nome);
    }
}
