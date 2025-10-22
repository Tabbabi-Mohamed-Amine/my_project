import java.util.Scanner;

public class CharOccurrenceCounter {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("donner une chaine");
        String ch = s.nextLine();
        System.out.println("donner un caractere");
        char c = s.next().charAt(0);
        int x = 0;
        while (ch.length() > 0) { 
            if (ch.charAt(0) == c) {
                x = x + 1;
            }
            ch = ch.substring(1); 
        }
        if (x == 0){
            System.out.println("n'existe pas");
        }else{
            System.out.println(x);
        }
        s.close();
    }
}
