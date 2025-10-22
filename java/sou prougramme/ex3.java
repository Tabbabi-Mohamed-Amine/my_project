import java.util.Scanner ;
import java.lang.Math ;
public class ex3 {
    public static double calculesomme(int x){
        double s = 0 ;
        for (int i = 0 ; i<=x ; i++){
            s = s + Math.pow(i,2) ;
        }
        return s ;
    }
    public static void main(String[] args) {
        int n = exercice2.lectureN();
        System.out.println("La somme des carrés des "+n+" premiers entiers est : "+calculesomme(n)) ;

    }
    
}
