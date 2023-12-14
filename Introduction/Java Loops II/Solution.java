import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numQ = scanner.nextInt();
        
        for (int i = 0; i < numQ; i++) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            generateAndPrintSeries(a, b, n);
        }

        scanner.close();
    }

    private static void generateAndPrintSeries(int a, int b, int n) {
        int currentTerm = a;
        for (int j = 0; j < n; j++) {
            currentTerm += Math.pow(2, j) * b;
            System.out.print(currentTerm + " ");
        }
        System.out.println();
    }
}
