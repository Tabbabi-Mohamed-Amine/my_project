import java.util.Scanner;

public class exercice4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String c, k, ch;
        c = "";
        k = "";

      
        do {
            System.out.println("Donner une chaîne qui ne dépasse pas 30 caractères :");
            ch = s.nextLine();
        } while (ch.length() > 30);

        System.out.println("Chaîne originale : " + ch);

        int x = 0;
        while (ch.length() != 0) {
            c = ch.substring(0, 1);
            x = (int) c.charAt(0) + 3;
            ch = ch.substring(1); 
            k = k + (char) x; 
        }

        System.out.println("Chaine transformée : " + k);
        s.close();
    }
}
