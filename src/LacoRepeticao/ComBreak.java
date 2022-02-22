package LacoRepeticao;

public class ComBreak {
    public static void main(String[] args) {

        int valorMaximo = 5;

        for (int i = 0; i <= valorMaximo; i++) {
            if (i > 3){
                break;
            }
            System.out.println("i = " + i);
        }


    }
}
