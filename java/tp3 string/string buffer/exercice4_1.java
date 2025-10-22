import java.util.Scanner;
public class exercice4_1 {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        String ch , c , k ;
        c = "";
        k = "";
        do {
            System.out.println("donner une chaine");
            ch = s.nextLine();
        }while (ch.length()>30);

        int x = 0 ;
        while (ch.length() != 0) {
            c = ch.substring(0, 1);
            x = (int) c.charAt(0) + 3;
            if (x > 122) {
                x = (x - 122)+96 ;
                ch = ch.substring(1); 
                 k = k + (char) x;
            }else{
                if (x > 90) {
                    x = (x - 90) + 64 ;
                    ch = ch.substring(1); 
                    k = k + (char) x;
                }else{
                
                ch = ch.substring(1); 
                k = k + (char) x;
                }
            }
            
        }
        System.out.println(k);
        s.close();
    }
    
}
