package courses.first.consolidate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TicTacToe {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String RESET = "\033[0m";
    private static final Character playerOne = 'X';
    private static final Character playerTwo = 'O';

    private static Character turn;
    private static Boolean inGame;
    private static Boolean inGameTicTacToe;
    private int nxN;
    private List<List<Character>> board;

    public TicTacToe(int n) {
        this.board = fillBoard(n);
        this.nxN = n;
    }

    public static void initialGame(Scanner in) {

        int width, count = 1;
        System.out.print("Inserte el ancho del tablero: ");
        width = in.nextInt();
        TicTacToe ticTacToe = new TicTacToe(width);

        System.out.println("El tablero es de " + width + " x " + width);
        System.out.println("Este es su tablero de juego: ");
        ticTacToe.toWrite();

        turn = playerOne;
        inGameTicTacToe = true;

        while (inGameTicTacToe) {
            List<Integer> indices = ticTacToe.indices(in);
            if (indices.get(0) >= 0 && indices.get(0) < ticTacToe.nxN) {
                if (indices.get(1) >= 0 && indices.get(1) < ticTacToe.nxN) {
                    if (ticTacToe.board.get(indices.get(0)).get(indices.get(1)) != ' ') {
                        System.out.println("Error esa posición ya esta ocupada vuelva a intentarlo...");
                        continue;
                    }
                    if (turn == playerOne) {
                        ticTacToe.board.get(indices.get(0)).set(indices.get(1), turn);
                        turn = playerTwo;
                    } else {
                        ticTacToe.board.get(indices.get(0)).set(indices.get(1), turn);
                        turn = playerOne;
                    }
                    count++;
                } else {
                    System.out.print("No existe esa columna vuelva a intentarlo..."
                                     + (turn == playerOne ? " jugador 1" : "jugador 2"));
                    continue;
                }
            } else {
                System.out.print("No existe esa fila vuelva a intentarlo..."
                                 + (turn == playerOne ? " jugador 1" : "jugador 2"));
                continue;
            }
            ticTacToe.toWrite();
            if (count >= ticTacToe.nxN * 2) {
                Character winner = verifyWinner(ticTacToe.board);
                if (winner != ' ') {
                    if (winner == playerOne) {
                        System.out.println("\nA ganado el juego el jugador 1");
                    }
                    if (winner == playerTwo) {
                        System.out.println("\nA ganado el juego el jugador 2");
                    }
                    break;
                } else if (count == ticTacToe.nxN * ticTacToe.nxN + 1) {
                    System.out.println("\nHubo un empate");
                    break;
                }
            }
        }
    }

    public static Character verifyWinner(List<List<Character>> board) {

        int n = board.size(), d_one = 0, d_two = 0, d_three = 0, d_four = 0;
        for (int i = 0; i < n; ++i) {
            int one = 0, two = 0, three = 0, four = 0;
//            one = (int) board.get(i).stream().filter((item) -> (item == playerOne)).count();
//            two = (int) board.get(i).stream().filter((item) -> (item == playerTwo)).count();

            for (int j = 0; j < n; ++j) {
                one += ((board.get(i)).get(j) == playerOne) ? 1 : 0;
                two += ((board.get(i)).get(j) == playerOne) ? 1 : 0;
                three += ((board.get(j)).get(i) == playerOne) ? 1 : 0;
                four += ((board.get(j)).get(i) == playerTwo) ? 1 : 0;
//                if (three > 0 && four > 0) {
//                    break;
//                }
            }

            if (((board.get(i)).get(i) == playerOne)) {
                ++d_one;
            } else if (((board.get(i)).get(i) == playerTwo)) {
                ++d_two;
            }

            if (((board.get(i)).get(n - (i + 1)) == playerOne)) {
                ++d_three;
            } else if (((board.get(i)).get(n - (i + 1)) == playerTwo)) {
                ++d_four;
            }

//            System.out.printf("%s %s %s %s %s %s %s %s\n", one, two, three, four, d_one, d_two, d_three, d_four);

            if (one == n) {
                return playerOne;
            }

            if (two == n) {
                return playerTwo;
            }

            if (three == n) {
                return playerOne;
            }

            if (four == n) {
                return playerTwo;
            }

            if (d_one == n) {
                return playerOne;
            }

            if (d_two == n) {
                return playerTwo;
            }

            if (d_three == n) {
                return playerOne;
            }

            if (d_four == n) {
                return playerTwo;
            }
        }
        return ' ';
    }

    public static void startGame(Scanner in) {

        System.out.printf("%s\n", "BIENVENIDOS A TICTATOE");
        inGame = true;

        while (inGame) {
            System.out.printf("\n%s\n%s\n%s\n%s", "Opciones de juego:",
                    "1) Empezar nuevo juego",
                    "2) Salir",
                    "Su opción: ");
            int option = in.nextInt();
            if (option == 1) {
                initialGame(in);
            } else if (option == 2) {
                System.out.println("Hasta una proxima");
                System.exit(0);
            } else {
                System.out.println("Esa opción no esta contemplada");
            }
        }
    }

    private List<List<Character>> fillBoard(int n) {
        List<List<Character>> keys = IntStream.range(0, n)
                .mapToObj(i -> new ArrayList<>(Collections.nCopies(n, ' ')))
                .collect(Collectors.toList());
        return keys;
    }

    public void toWrite() {

        String format = "";
        for (int i = 0; i < this.nxN; ++i) {
            format += "_____";
        }

        System.out.printf("%s\n", format);
        String finalLine = format;
        board.forEach((list) -> {
            list.forEach((item) -> System.out.printf("%s| %s%s %s|", RESET, item == ' '
                            ? RESET
                            : item == playerTwo
                            ? ANSI_RED
                            : ANSI_BLUE
                    , item == ' ' ? '-' : item, RESET));
            System.out.print("\n");
        });
        System.out.printf("%s", finalLine);
    }

    public List<Integer> indices(Scanner in) {
        List<Integer> indices = new ArrayList<>();
        System.out.println("\nFormato de entrada: fila|espacio|columna");
        System.out.print("Ingresame la posición: ");
        indices.add(in.nextInt() - 1);
        indices.add(in.nextInt() - 1);
        return indices;
    }
}
