package second;

import java.util.Arrays;
import java.util.Collections;

public class ArrayReverseApp {

    public static void main(String[] args) {
        Integer[] intArr = {4, 8, 15, 16, 23, 42};
        String[] strArr = {"Jorge", "Paco", "Pedro", "Juan", "Marta"};


        System.out.println(Arrays.asList(intArr));
        System.out.println(Arrays.asList(strArr));
        System.out.println("Invirtiendo...");

        Collections.reverse(Arrays.asList(intArr));
        Collections.reverse(Arrays.asList(strArr));

        System.out.println(Arrays.asList(intArr));
        System.out.println(Arrays.asList(strArr));
    }
}
