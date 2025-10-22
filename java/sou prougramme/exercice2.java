import java.util.Scanner;
public class exercice2 {
    public static int lectureN(){
        Scanner s = new Scanner(System.in);
        System.out.println("Entrez un nombre entier positif : ");
        int x = s.nextInt();
        while(x<=0){
            System.out.println("Erreur ! Entrez un nombre entier positif : ");
            x = s.nextInt();
        }
        return x;
    }
    public static int compter(int x){
        int c = 0;
        for(int i=0; i<=x; i++){
            if(x%10>=0){
                c++;
            }
            x = x / 10;
        }
        return c;

    }
    public static void main(String[] args) {
        int x = lectureN();
        int c = compter(x);
        System.out.println("Le nombre "+x+" comporte "+c+" chiffres.");
    }
}
