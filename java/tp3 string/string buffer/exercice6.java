import java.util.Scanner;
public class exercice6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ch ;
        do{
            System.out.println("Veuillez saisir une chaine de caractere qui se termine par 'er' : ");
            ch = s.nextLine();
        }while (!ch.endsWith("er"));
        StringBuffer ch2 = new StringBuffer(ch);
        for (int i = 1; i <= 6; i++){
            switch (i) {
                case 1:
                    ch2.replace(ch.length() - 2, ch.length(), "e");
                    System.out.println("Je " + ch2);
                    break;
                case 2:
                    ch2.replace(ch.length() - 2, ch.length(), "es");
                    System.out.println("Tu " + ch2);
                    break;
                case 3:
                    ch2.replace(ch.length() - 2, ch.length(), "e");
                    System.out.println("Il/Elle " + ch2);
                    break;
                case 4:
                    ch2.replace(ch.length() - 2, ch.length(), "ons");
                    System.out.println("Nous " + ch2);
                    break;
                case 5:
                    ch2.replace(ch.length() - 2, ch.length(), "ez");
                    System.out.println("Vous " + ch2);
                    break;
                case 6:
                    ch2.replace(ch.length() - 2, ch.length(), "ent");
                    System.out.println("Ils/Elles " + ch2);
                    break;
                default:
                    break;
            }
            ch2 = new StringBuffer(ch);
        }
        s.close();
    }
}