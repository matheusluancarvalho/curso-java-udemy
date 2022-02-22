package TratamentoDeExcecoes.ExercicioFixacao;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {

        try {
            geraErro1();
        }catch (RuntimeException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            geraErro2();
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("Fim! :)");
    }

    static void geraErro1(){
        // Exceção não checada ou não verificada
        throw new RuntimeException("Ocorreu um Erro bem legal! #01"); // Lance um novo erro do tipo RuntimeException
                                                                     //com a seguinte mensagem
    }

    // Exceção checada ou verificada
    static void geraErro2() throws Exception {
       throw new Exception("Ocorreu um Erro bem legal! #02");
       // Posso lançar exceções do tipo Exception
    }

}
