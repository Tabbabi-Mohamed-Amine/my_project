import java.util.Scanner;
public class AdmissionCheck {
    public static void main(String[] arg){
        Scanner cl = new Scanner (System.in);
        System.out.print("donner une valeur entre 0 et 10  ");
        int x = cl.nextInt();
        if (x >= 10 ){
            System.out.print("admis");
        }else{
            System.out.print("refuse");
        }
        cl.close();
    }
}
