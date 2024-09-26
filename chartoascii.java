import java.util.Scanner;

public class chartoascii {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] asciiArray = new int[1];

        System.out.println("");
        char inputChar = scanner.next().charAt(0);

        int asciiValue = (int) inputChar;
        asciiArray[0] = asciiValue;

        System.out.println("The ASCII value of '" + inputChar + "' is: " + asciiValue);
        for (int i = 0; i < asciiArray.length; i++) {
            System.out.println("asciiArray[" + i + "]: " + asciiArray[i]);
        }

        scanner.close();
    }
}
