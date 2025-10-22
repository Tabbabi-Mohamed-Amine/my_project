import java.util.Scanner;
public class CelsiusToKelvin {
    public static void main(String[] args){
        Scanner x = new Scanner (System.in);
        double y = x.nextDouble() ;
        y = y + 273.15 ;
        System.out.println(y);
        x.close();
    }
}
