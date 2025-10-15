import java.util.Scanner;
public class ReverseStringFor {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        String ch = s.nextLine();
        String ch2 = "";
        for(int i =0 ; i<ch.length() ; i++ ){
            ch2 = ch.charAt(i) + ch2;
        }
        System.out.println(ch);
        System.out.println(ch2);
        s.close();
    }
}
