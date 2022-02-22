package Arrays;


import java.util.Arrays;

public class AulaUm {
    public static void main(String[] args) {

        int [] array = new int[3];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        System.out.println(array);
        System.out.println(array[1]);

        int x = 1;

        x = array[1] + 2;
        System.out.println(x);

        array[2] = 5;
        System.out.println(array[2]);


        x = array.length;
        System.out.println(x);
    }
}
