import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What type of ethem miss do you want (miss, sir, beldagli): ");
        String ethem = scanner.nextLine().toLowerCase();

        if (ethem.equals("miss")) {
            System.out.println("\nIts ethem miss");
        } else if (ethem.equals("sir")) {
            System.out.println("\nIts ethem sir");
        } else if (ethem.equals("beldagli")) {
            System.out.println("Its ethem boldegus beldagus");
        } else {
            System.out.println("\nWe do not support that ethem miss");
        }
        scanner.close();
    }
}
