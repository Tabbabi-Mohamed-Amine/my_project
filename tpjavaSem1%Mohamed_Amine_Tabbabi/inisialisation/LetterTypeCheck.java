import java.util.Scanner;
public class LetterTypeCheck {
    public static void main (String[] args){
        Scanner cl = new Scanner (System.in);
        char x = cl.next().charAt(0);
        if (Character.isLetter(x)){
            if (Character.isUpperCase(x)){
                System.out.println("le caractere est majus");
            }else{
                System.out.println("le caractere est miniscule");
            }
        }else{
            System.out.println("non caratere");
        }
        cl.close();
    }
}
