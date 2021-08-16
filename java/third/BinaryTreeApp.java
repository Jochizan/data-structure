package third;

import courses.third.BinaryTreeMain;
import courses.third.Data;

import java.util.Scanner;

public class BinaryTreeApp {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        BinaryTreeMain binaryTreeMain = new BinaryTreeMain();
        String name;
        double note;
        int cod;

        System.out.println("Introducir datos.\nFinalizar con Ctrl + Z o exit");
        System.out.print("Nombre: ");

        while ((name = in.next()) != null) {
            if (name.equals("exit"))
                break;

            System.out.print("Nota: ");
            note = in.nextDouble();

            cod = binaryTreeMain.insert(new Data(name, note));

            if (cod == BinaryTreeMain.EXIST) {
                Data data = (Data) binaryTreeMain.search(new Data(name, note));

                if (note >= 0) {
                    data.setNote(note);
                } else {
                    if (binaryTreeMain.delete(new Data(name, note)) == null) {
                        System.out.println("No borrado porque ya existe");
                    } else {
                        System.out.println("Nodo borrado");
                    }
                }
            }
            System.out.println();
            System.out.print("Nombre: ");
        }
        System.out.println("\n");

        System.out.println("\nArbol Inorder: ");
        binaryTreeMain.visitInorder();

        System.out.println("\nArbol Postorder: ");
        binaryTreeMain.visitPostorder();

        System.out.println("\nArbol Preorden: ");
        binaryTreeMain.visitPreorder();
    }
}
