import java.util.StringTokenizer;
public class exercice3 {
    public static void main(String[] args) {
        String texte1 = "Bonjour les etudients, bienvenue en java";
        StringTokenizer st1 = new StringTokenizer(texte1);
        System.out.println("Decoudage du texte en mots : ");
        while (st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }
        System.out.println("le text principale est : " + texte1);
    }
    
}
