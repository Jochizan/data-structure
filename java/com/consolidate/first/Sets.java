package com.consolidate.first;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sets {
    private Set<String> set = new HashSet<>();
    //    a -> [2, 3, 4, 100, 101] a.contains("1") -> false
    //    b -> [1, 2, 3, 4, 100, 102, 103]

    //    c -> [1, 2, 3, 4, 100, 101, 102, 103]
    //    d -> [2, 3, 4, 100, 101]

    public Sets() {}

    public static Set<String> union(Set<String> a, Set<String> b) {
        return mergeSet(a, b);
    }

    private static <T> Set<T> mergeSet(Set<T> a, Set<T> b) {
        return new HashSet<T>() {{
            addAll(a);
            addAll(b);
        }};
    }

    public static Set<String> intersection(Set<String> a, Set<String> b) {
        return intersectionSet(a, b);
    }

    private static <T> Set<T> intersectionSet(Set<T> a, Set<T> b) {
        return new HashSet<T>() {{
            a.forEach((item) -> {
                if (b.contains(item)) {
                    add(item);
                }
            });
        }};
    }

    public static Set<String> symmetricDifference(Set<String> a, Set<String> b) {
        return symmetricDifferenceSet(a, b);
    }

    private static <T> Set<T> symmetricDifferenceSet(Set<T> a, Set<T> b) {
        return new HashSet<T>() {{
            b.forEach((item) -> {
                if (!a.contains(item)) {
                    add(item);
                }
            });
            a.forEach((item) -> {
                if (!b.contains(item)) {
                    add(item);
                }
            });
        }};
    }

    public void read(Scanner in) {
        int n, i = 0;
        String data;
        System.out.print("Ingrese la cantidad de datos del conjunto: ");
        n = in.nextInt();

        while (n-- > 0) {
            System.out.print("Ingrese el número o palabra " + (i + 1) + " del conjunto: ");
            data = in.next();
            set.add(data);
            i++;
        }

        System.out.println(getSet());
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }
}
