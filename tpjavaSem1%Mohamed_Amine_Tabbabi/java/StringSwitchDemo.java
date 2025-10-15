import java.util.Scanner;
public class StringSwitchDemo {
    public static void main(String[] arg){
        Scanner cl = new Scanner(System.in);
        System.out.print("donner un caractere ");
        String x = cl.next();
        System.out.println(x);
        switch (x) {
            case "hi":
                System.out.println("la valeur est no hi");
                break;
            case "ss":
                System.out.print("ss miletry born before 1940 in almant");
                break;
            default:
                break;
        }
        cl.close();
    }
}
