public class Test_Quebrado {
    public static void main(String[] args) {
        Quebrado quebrado = new Quebrado();
        Quebrado quebrado1 = new Quebrado();
        Quebrado quebrado2 = new Quebrado();
        Quebrado quebrado3 = new Quebrado();

        quebrado1.read();
        quebrado1.toWrite();
        quebrado2.read();
        quebrado2.toWrite();
        quebrado3.read();
        quebrado3.toWrite();

        System.out.print("La suma de los dos es: ");
        quebrado = quebrado.sum(quebrado1, quebrado2);
        quebrado = quebrado.simplify(quebrado);
        quebrado.toWrite();

        System.out.print("La suma de los tres es: ");
        quebrado = quebrado.sum(quebrado1, quebrado2);
        quebrado = quebrado.sum(quebrado, quebrado3);
        quebrado = quebrado.simplify(quebrado);
        quebrado.toWrite();

        //Quebrado quebrado3 = quebrado1.sum(quebrado1, quebrado2);
        //quebrado3.toWrite();
    }
}
