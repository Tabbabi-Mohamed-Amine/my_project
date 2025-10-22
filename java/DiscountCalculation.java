import java.util.Scanner;
public class DiscountCalculation {
    public static void main(String[] arg){
        Scanner cl = new Scanner(System.in);
        double x = cl.nextDouble();
        if (x > 200 ){
            double y = (x * 15) / 100 ;
            double z = x - y ;
            System.out.println(z);
            double a = z * ( 1 + 0.2 );
            System.out.print(a);
        }
        cl.close();
    }
}
