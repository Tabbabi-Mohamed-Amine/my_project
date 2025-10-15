import java.util.Scanner;
public class IncrementDecrementDemo {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int x ,y ;
        System.out.println("donner un entier x");
        x = sc.nextInt();
        System.out.println("donner un entier y");
        y = sc.nextInt();
        System.out.println("x = " + x + "y = " + y);// x = 15 y = 21
        x = y++;
        System.out.println("x = " + x + "y = " + y);// x=21 y=22 
        x = ++y ;
        System.out.println("x = " + x + "y = " + y);// x=23 y=23
        y = x-- ;
        System.out.println("x = " + x + "y = " + y);// x=22 y=23
        y = --x ;
        sc.close();
    }
}
