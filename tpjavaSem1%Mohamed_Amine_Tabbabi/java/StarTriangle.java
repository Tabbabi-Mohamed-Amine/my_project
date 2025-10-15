import java.util.Scanner;
public class StarTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String ch ;
        int i ;
        ch = "";
        System.out.print("entre the number of lines :");
        i = sc.nextInt();
        while (i != 0){
            ch = ch + "*";
            System.out.println(ch);
            i = i - 1 ;
        }
        sc.close();
    }
}
