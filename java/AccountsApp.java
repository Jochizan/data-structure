import com.common.Account;

import java.util.Scanner;

public class AccountsApp {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Account account = new Account();
        System.out.print("Introduzca el saldo inicial: ");
        account.deposit(in.nextFloat());
        account.toWrite();

        System.out.print("Introduzca una opción: \n1) deposito\n2) retiro\nSu opción: ");
        int option;

        // Es verdadero si escribimos algo en consola
        while (in.hasNext()) {
            option = in.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Introduzca un deposito: ");
                    account.deposit(in.nextFloat());
                    break;
                case 2:
                    System.out.print("Introduzca un retiro: ");
                    account.retirement(in.nextFloat());
                    break;
                default:
                    break;
            }
            account.toWrite();
            System.out.print("Introduzca una opción: \n1) deposito\n2) retiro\nSu opción: ");
        }
    }
}
