import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        
        while(scanner.hasNext()){
            counter += 1;
            
            String line = scanner.nextLine();
            System.out.println(counter + " " + line);
        }
    }
}