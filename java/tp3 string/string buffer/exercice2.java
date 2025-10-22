import java.util.Scanner;
public class exercice2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("saisir une phrase : ");
        //String ch2 = s.nextLine();
        StringBuffer ch = new StringBuffer(s.nextLine());
        System.out.println("le contenue de StringBuffer est : " + ch);
        s.close();
    }
    
}
