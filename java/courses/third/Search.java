package courses.third;

public class Search extends OneDimensionalArray {
    public int busqueda_secuencial(int dato) {
        int i = 0, position;
        while (dato != a[i] && i < n) i++;
        if (dato == a[i]) position = i;
        else position = -1;
        return position;
    }

    public int busqueda_binaria(int dato) {
        int inf = 0, sup = n - 1, sw = 0, cen = 0, position;

        while (sup >= inf && sw == 0) {
            cen = (sup + inf) / 2;
            if (dato > a[cen]) inf = cen + 1;
            else if (dato < a[cen]) sup = cen - 1;
            else sw = 1;
        }

        if (sw == 1) position = cen;
        else position = -1;
        return position;
    }
}
