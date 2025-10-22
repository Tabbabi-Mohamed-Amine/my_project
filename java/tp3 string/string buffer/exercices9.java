import java.util.Scanner;

public class exercices9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ch, ch2 = "";
        int i = 1;

        do {
            System.out.println("donner : ");
            ch = s.nextLine();
        } while (ch.length() == 0 || ch.endsWith(",") || ch.charAt(0) == ',');

        for (int j = 0; j < ch.length(); j++) {
            if (ch.charAt(j) != ',') {
                ch2 = ch2 + ch.charAt(j);
            } else {
                switch (i) {
                    case 1:
                        System.out.println("votre nom est : " + ch2);
                        break;
                    case 2:
                        System.out.println("votre prenom est : " + ch2);
                        break;
                    case 3:
                        System.out.println("numero de CIN : " + ch2);
                        break;
                    case 4:
                        System.out.println("votre date naissance : " + ch2);
                        break;
                    case 5:
                        System.out.println("ville d'origine : " + ch2);
                        break;
                    case 6:
                        System.out.println("votre spécialité de bac est : " + ch2);
                        break;
                    case 7:
                        System.out.println("vous avez obtenu votre bac : " + ch2);
                        break;
                }
                ch2 = "";
                i++;
            }
        }

     
        if (!ch2.equals("")) {
            switch (i) {
                case 1:
                    System.out.println("votre nom est : " + ch2);
                    break;
                case 2:
                    System.out.println("votre prenom est : " + ch2);
                    break;
                case 3:
                    System.out.println("numero de CIN : " + ch2);
                    break;
                case 4:
                    System.out.println("votre date naissance : " + ch2);
                    break;
                case 5:
                    System.out.println("ville d'origine : " + ch2);
                    break;
                case 6:
                    System.out.println("votre spécialité de bac est : " + ch2);
                    break;
                case 7:
                    System.out.println("vous avez obtenu votre bac : " + ch2);
                    break;
            }
        }

        s.close();
    }
}
