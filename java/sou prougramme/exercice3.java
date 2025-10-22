import java.util.Scanner;
public class exercice3 {
    public static int lectureN(){
        Scanner s = new Scanner(System.in);
        System.out.println("Entrez un nombre entier positif : ");
        int x = s.nextInt();
        while(x<=0){
            System.out.println("Erreur ! Entrez un nombre entier positif : ");
            x = s.nextInt();
        }
        s.close();
        return x;
    }
    public static int calculesomme(int x){
        int somme = 0;
        for (int i=1; i<=x; i++){
            somme = somme + (i*i);
        }
        return somme;
    }
    public static void main(String[] args) {
        int x = lectureN();
        int somme = calculesomme(x);
        System.out.println("La somme des carrés des "+x+" premiers entiers est : "+somme);}
}
