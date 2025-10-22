import java.util.Scanner;
public class MultiplyTwoNumbers {
    public static void main(String[] arg){
        Scanner cl = new Scanner(System.in);
        System.out.print("donner valeur un --> ");
        int x = cl.nextInt();
        System.out.print("donner la deuxiemr valeur --> ");
        int y = cl.nextInt();
        System.out.print("la somme de deux valeur est ");
        System.out.println(x*y);
        cl.close();
    }
}
