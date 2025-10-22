import java.util.Scanner;
public class exercice1 {
    public static boolean lectureN(int x){
        if(x>0){
            return true;
        }return false;
    }
    public static boolean estpair(int x){
        if(x%2==0){
            return true;
        }return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i=0 ; i<11 ; i++){
            System.out.println("Entrez un nombre entier positif : ");
            int x = s.nextInt();
            while(lectureN(x)==false){
                System.out.println("Erreur ! Entrez un nombre entier positif : ");
                x = s.nextInt();
            }
            if(estpair(x)==true){
                System.out.println("Le nombre "+x+" est pair.");
            }else{
                System.out.println("Le nombre "+x+" est impair.");
            }
        }
        s.close();
    }
    
}
