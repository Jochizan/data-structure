package first;

import courses.first.tda.Stack;

import java.util.Scanner;

public class StackApp {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());

        stack.stack(10);
        stack.stack(20);
        stack.stack(30);

        System.out.println(stack.isEmpty());

//        System.out.println(stack.head());
        stack.toWrite();
    }
}
