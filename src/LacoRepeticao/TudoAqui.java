package LacoRepeticao;

public class TudoAqui {
    public static void main(String[] args) {

        // while, do while, for

        int count = 0;

        while (count < 11){
            System.out.println(count);
            count += 1;
        }// final while

        count = 0;
        do {
            System.out.println("Dentro do do-while: " + ++count);

            //Executa ao menos uma vez
        }while (count < 10);

        for (int i = 0; i < 10; i++){
            System.out.println("For: " + ++i);
        }

    }
}
