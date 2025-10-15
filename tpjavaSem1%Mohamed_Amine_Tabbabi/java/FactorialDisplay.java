import java.util.Scanner;
public class FactorialDisplay {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in) ;
        int x,y ;
        String ch ;
        y = 1 ;
        ch = "" ;
        do{
            System.out.println("hhhhh") ;
            x  = s.nextInt() ;
        }while (x < 0) ;
        if (x == 0){
            System.out.println("0! = 1") ;
        }else {
            while (x > 1){
                y = y * x ;
                ch = ch + x + "*" ;
                x = x - 1 ;    
            }
        }
        ch = ch + "1" ;
        System.out.print(ch + " = " +  y) ;
        s.close() ;
    }
}
