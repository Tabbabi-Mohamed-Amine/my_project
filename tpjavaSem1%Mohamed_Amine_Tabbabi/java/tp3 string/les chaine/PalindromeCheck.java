import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String ch = s.nextLine();
        String ch2 = "";
        for(int i =0 ; i<ch.length() ; i++ ){
            ch2 = ch.charAt(i) + ch2;
        }
        if (ch.equals(ch2)){
            System.out.println("oui palindrom");
        }else{
            System.out.println("non palindrom");
        }
        s.close();
    }
}
