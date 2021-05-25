import com.consolidate.first.Sets;

import java.util.Scanner;
import java.util.Set;

public class SetsApp {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Sets setsA = new Sets();
        Sets setsB = new Sets();
        setsA.read(in);
        setsB.read(in);

        Set<String> response = Sets.union(setsA.getSet(), setsB.getSet());
        System.out.println("La unión de los dos conjuntos es: " + response);

        response = Sets.intersection(setsA.getSet(), setsB.getSet());
        System.out.println("La intersección de los dos conjuntos es: " + response);

        response = Sets.symmetricDifference(setsA.getSet(), setsB.getSet());
        System.out.println("La diferencia simétrica de los dos conjuntos es: " + response);
    }
}
