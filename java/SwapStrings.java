import java.util.Scanner;
public class SwapStrings {
    public static void main(String[] arg){
        Scanner cl = new Scanner(System.in);
        System.out.print("donner premier chaine -->");
        String ch1 = cl.nextLine();
        System.out.print("donner dauxieme chaine -->");
        String ch2 = cl.nextLine();
        String c ;
        System.out.println("le phrase est " + ch1 +"   " + ch2 );
        c = ch2 ;
        ch2 = ch1 ;
        ch1 = c ;
        System.out.println("apres l'echange " + ch1 + "   " + ch2 );
        cl.close();
    }
}
