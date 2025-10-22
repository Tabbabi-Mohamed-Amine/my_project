import java.util.Scanner;
public class SwapVariables {
    public static void main(String[] args){
        int x,y ;
        Scanner s = new Scanner (System.in);
        x = s.nextInt();
        y = s.nextInt();
        System.out.println("x = " + x + " y = " + y );// x=3 y=2
        x = x + y ;
        y = x - y ;
        x = x - y ;
        System.out.println("x = " + x + " y = " + y );// x=2 y=3
        s.close();
    }
}
