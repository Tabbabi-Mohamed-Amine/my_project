import java.util.Scanner;
public class exercice5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ch ;
        do{
            System.out.println("Donner une chaine qui ne dépasse pas 50 caractères :");
            ch = s.nextLine();
        } while (ch.length() > 50);
        int x = 0;
        for (int i = 0; i < ch.length(); i++) {
            if (Character.isLowerCase(ch.charAt(i))) {
                x = x + 1 ;
            }
        }
        System.out.println("Le nombre des lettres minuscules est : " + x);
        s.close();


    }
    
}
