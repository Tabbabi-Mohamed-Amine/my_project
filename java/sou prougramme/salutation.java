import java.util.Scanner;
public class salutation {
    public static void salutt(String name) {
        System.out.println("bonjour Mr " + name );
    }
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = s.nextLine();
    salutt(name);
    s.close();
}
}