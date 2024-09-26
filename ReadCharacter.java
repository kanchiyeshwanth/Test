import java.util.Scanner;

public class ReadCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char character = scanner.next().charAt(0);
        System.out.println("" + character);
        scanner.close();
    }
}
