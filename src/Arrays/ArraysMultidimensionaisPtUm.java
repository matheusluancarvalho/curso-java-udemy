package Arrays;

public class ArraysMultidimensionaisPtUm {
    public static void main(String[] args) {

        int[][] vet = new int[3][3];

        vet[0][0] = 1;
        vet[0][1] = 2;
        vet[0][2] = 3;

        vet[1][0] = 4;
        vet[1][1] = 5;
        vet[1][2] = 6;

        vet[2][0] = 7;
        vet[2][1] = 8;
        vet[2][2] = 9;

        //System.out.println(vet[0][1]);

        for (int[] ints : vet) {
            for (int j = 0; j < ints.length; j++) {
                System.out.println(ints[j]);
            }
        }

        System.out.println("--------------------------------------------------");

        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet[i].length; j++) {
                System.out.println(vet[i][j]);
            }
        }

        System.out.println("---------------------");

        for (int[] arrBase: vet){
            for (int num:arrBase){
                System.out.println(num);
            }
        }


    }
}
