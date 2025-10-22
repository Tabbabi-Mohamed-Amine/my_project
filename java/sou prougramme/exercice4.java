import java.util.Scanner;
import java.lang.Math ;
public class exercice4 {
    public static boolean estArmstrong(int x){
        int o = x ;
        int somme = 0 ;
        while (x > 0 ){
            int res = x % 10 ;
            somme +=Math.pow(res,3);
            x/=10 ;
        }
        return o == somme ;
    }
    public static void main(String[] args) {
        //int n = exercice3.lectureN();
        for (int i = 1 ; i<=1000 ; i++){
        if (estArmstrong(i) == true){
            System.out.println(i+" est un nombre Armstrong") ;
        }
        
    }
}
}
