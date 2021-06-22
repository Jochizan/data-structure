package first;

import courses.first.consolidate.TicTacToe;

import java.util.Scanner;

public class TicTacToeApp {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        TicTacToe.startGame(in);
    }
}
