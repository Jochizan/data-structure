
/**
 * @(#)keep_tidy.java
 * @author Joan Roca Hormaza
 * @version 1.00 2021/5/4
 */

import java.util.*;

public class KeepTidy {

    static Scanner in = new Scanner(System.in);

    public static void main(String args[]) {
        int temporal;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add(70);
        arr.add(80);
        arr.add(90);
        arr.add(100);
        arr.add(120);
        // Collections.sort(arr); -> solo si el arreglo esta desordenado

        System.out.println(arr.toString());
        System.out.print("Ingrese un valor: ");

        while (in.hasNext()) {
            temporal = in.nextInt();

            ArrayList<Integer> ans = new ArrayList<Integer>();
            ArrayList<Integer> response = runBinarySearchRecursively(arr, ans, temporal, 0, arr.size());

            System.out.println("índices: " + response.toString());
            if (response.get(0) == -1) {
                if (response.get(0) >= arr.size()) {
                    arr.add(temporal);
                } else {
                    arr.add(response.get(2), temporal);
                }
            } else {
                arr.add(response.get(0), temporal);
            }

            System.out.println(arr.toString());
            System.out.print("Ingrese un valor: ");
        }
    }

    static ArrayList<Integer> runBinarySearchRecursively(ArrayList<Integer> sortedArray, ArrayList<Integer> answer,
                                                         int key, int low, int high) {
        int middle = (low + high) / 2;

        if (high < low) {
            answer.add(-1);
            answer.add(high);
            answer.add(low);
            return answer;
        }

        if (middle < sortedArray.size()) {
            if (key == sortedArray.get(middle)) {
                answer.add(middle);
                return answer;
            } else if (key < sortedArray.get(middle)) {
                return runBinarySearchRecursively(sortedArray, answer, key, low, middle - 1);
            } else {
                return runBinarySearchRecursively(sortedArray, answer, key, middle + 1, high);
            }
        } else {
            answer.add(middle);
            return answer;
        }
    }
}