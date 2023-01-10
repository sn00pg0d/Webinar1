package org.example;

import java.util.Scanner;

public class ConsoleExample {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        String next = "";
        
        while (scanner.hasNext()) {
            try {
                next = scanner.next();
                sum += Integer.parseInt(next);
            } catch (NumberFormatException e) {
                if (next.equals("exit"))
                    break;
                else
                    System.out.println("Not a number " + next);
            }
        }

        System.out.println("Sum: " + sum);
    }
}
