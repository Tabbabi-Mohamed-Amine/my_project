import java.util.Scanner;
public class ReverseStringWhile {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        String ch = s.nextLine();
        System.out.println(ch);
        String ch2 ="" ;
        while (ch.length() == ch2.length()){
            ch2 = ch.charAt(0) + ch2  ;
            ch.substring(1);
        }
        System.out.println(ch2);
        s.close();
    }
} 
