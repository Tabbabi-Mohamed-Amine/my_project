import java.util.Scanner;
public class DivisibilityCheck {
    public static void main(String[] args){
        Scanner cl = new Scanner (System.in);
        int x = cl.nextInt();
        int y =  x % 10 ;
        if (x % y == 0 ){
            System.out.println("le nombre est divisible");
        }else{
            System.out.println("le nombre est ne pas divisible");
        }
        cl.close();
    }
}
