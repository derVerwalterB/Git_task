import java.util.Scanner;

public class Main {
    private static final String EXIT = "exit";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(": ");
            String data = scanner.nextLine();
            if (EXIT.equals(data)) {
                break;
            }


        }
    }
}
