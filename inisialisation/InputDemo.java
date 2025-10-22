import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        int x;
        System.out.println("donner un entier");
        x = cl.nextInt();
        System.out.println("donner un caracter");
        char y;
        y = cl.next().charAt(0);
        System.out.println(x);
        System.out.println(y);
        cl.close();
    }
}
