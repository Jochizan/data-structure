package first; /**
 * @(#)num_repite.java
 * @author Joan Roca Hormaza
 * @version 1.00 2021/5/4
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RepeatedNumber extends java.lang.Exception {

    public static void main(String args[]) {
        int[] arr = {1, 10, 100, 20, 30, 10, 50, 1, 20, 30, 40, 50};
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();

        int temporal = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (i + 1 < arr.length && arr[i] == temporal) {
                count++;
                map.put(arr[i], count);
            } else {
                count = 1;
                map.put(arr[i], count);
                temporal = arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(map);
    }
}