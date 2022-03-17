import java.util.Scanner;

public class SimpleIO {
    public static void main(String[] args) {
        String firstname, lastname;
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your first name: ");
        firstname = scanner.next();
        System.out.print("What is your last name: ");
        lastname = scanner.next();
        System.out.println("Hello " + firstname + " " + lastname + "!");
    }
}
