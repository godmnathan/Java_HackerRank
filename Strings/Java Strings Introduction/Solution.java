import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        scanner.close();

        int sumOfLengths = str1.length() + str2.length();
        System.out.println(sumOfLengths);

        String comparisonResult = (str1.compareTo(str2) > 0) ? "Yes" : "No";
        System.out.println(comparisonResult);

        String capitalizedStr1 = capitalizeFirstLetter(str1);
        String capitalizedStr2 = capitalizeFirstLetter(str2);
        System.out.println(capitalizedStr1 + " " + capitalizedStr2);
    }

    private static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}
