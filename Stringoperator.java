import java.util.Scanner;

public class Stringoperator {
    public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String reversed = reverse(input);
        System.out.println("Reversed string: " + reversed);
        scanner.close();
    }
    public static String reverse(String str) {
        StringBuilder reversedString = new StringBuilder(str);
        return reversedString.reverse().toString();
    }
}
}
