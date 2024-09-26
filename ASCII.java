import java.util.*;

public class ASCII {
    public static void main(String[] args) {
        char ch;
        Scanner scanner = new Scanner(System.in);
        ch = scanner.nextLine().charAt(0);
        int av = (int) ch;
        System.out.println("ASCII value is " + av);
        scanner.close();
    }
}

