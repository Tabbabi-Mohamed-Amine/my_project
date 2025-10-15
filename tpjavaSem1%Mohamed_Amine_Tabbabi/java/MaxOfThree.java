import java.util.Scanner ;
public class MaxOfThree {
    public static void main(String[] arg){
        Scanner cl = new Scanner (System.in);
        System.out.print("donner a ");
        int a = cl.nextInt();
        System.out.print("donner b");
        int b = cl.nextInt();
        System.out.print("donner c");
        int c = cl.nextInt();
        if (a>b && a>c){
            System.out.print(a);
        }else if(b>a && b>c){
            System.out.print(b);
        }else{
            System.out.print(c);
        }
        cl.close();
    }
}
