package LacoRepeticao;

public class ExercicioBreak {
    /*
    Dado o calor de um carro, descubra quantas vezes ele pode ser parcelado

    Condição:
    -> valor da parcela >= 1000
     */
    public static void main(String[] args) {

        int a = 50000;
        int cont = 0;

        for (int i = 1; i <= a; i++) {
            double divisao = (double) a/i;
            if (divisao < 1000){
                break;
            }
            cont += 1;
        }
        System.out.println("Parcelas: " + cont + "X sem juros");
    }
}
