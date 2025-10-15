import java.util.Scanner;
public class EvenOddCheck {
    public static void main(String[] arg){
        Scanner cl = new Scanner (System.in);
        System.out.print("donner un nombre ");
        int x = cl.nextInt();
        if (x%2 == 0 ){
            System.out.print("les nombre est pair");
        }else{
            System.out.print("le nombre est impair");
        }
        cl.close();
    }
}
