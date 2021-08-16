package courses.third;

public class Ordering extends OneDimensionalArray {
    public void burbuja_der_izq() {
        int i, j;
        for (i = 1; i <= n - 1; i++)
            for (j = n - 1; j >= i; j--)
                if (a[j - 1] > a[j])
                    cambio(a, j - 1, j);
    }

    public void burbuja_izq_der() {
        int i, j;
        for (i = n - 2; i <= 0; i--)
            for (j = 0; j <= i; j++)
                if (a[j] > a[j + 1])
                    cambio(a, j, j + 1);
    }

    public void baraja() {
        int i, j, aux;
        for (i = 1; i <= n - 1; i++) {
            aux = a[i];
            j = i - 1;
            while (a[j] > aux && j > 0) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            if (a[j] > aux) {
                a[j + 1] = a[j];
                a[j] = aux;
            } else a[j + 1] = aux;
        }
    }

    public void seleccion_directa() {
        int i, j, k, aux;
        for (i = 0; i <= n - 2; i++) {
            k = i;
            aux = a[i];
            for (j = i + 1; j <= n - 1; j++)
                if (a[j] < aux) {
                    k = j;
                    aux = a[j];
                }
            a[k] = a[i];
            a[i] = aux;
        }
    }

    public void shell() {
        int d, i, sw;
        d = n;
        do {
            d = d / 2;
            do {
                sw = 0;
                i = -1;
                do {
                    i++;
                    if (a[i] > a[i + d]) {
                        cambio(a, i, i + d);
                        sw = 1;
                    }
                } while (i + d != n);
            } while (sw != 0);
        } while (d != 1);
    }

    public void quicksort(int data[], int inf, int sup) {
        int left = inf, right = sup;
        double half = data[(left + right) / 2];

        while (left < right) {
            while (data[left] < half && left < sup) left++;
            while (half < data[right] && right > inf) right--;
            if (left < right) cambio(data, left, right);
            left++;
            right--;
        }

        if (inf < right) quicksort(data, inf, right);
        if (left < sup) quicksort(data, left, sup);
    }

    public void cambio(int[] a, int pos1, int pos2) {
        int t = a[pos1];
        a[pos1] = a[pos2];
        a[pos2] = t;
    }
}
