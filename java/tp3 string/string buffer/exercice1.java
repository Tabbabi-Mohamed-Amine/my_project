public class exercice1 {
    public static void main(String[] args){
        StringBuffer ch1 = new StringBuffer("j");
        StringBuffer ch2 = new StringBuffer();
        ch2 = ch1.append("l");
        System.out.println("ch2 = " + ch2); // "l"
        StringBuffer ch_sb = ch1;
        ch1 = ch1.append("ava");
        ch_sb = ch_sb.append("est sensible a la casse !");
        System.out.println("contenue de ch_sb = " + ch_sb); // "javaest sensible a la casse !"
        System.out.println("contenue de ch1 = " + ch1); // "javaest sensible a la casse !"
        boolean test = (ch1 == ch_sb);
        if (test){
            System.out.println("ch1 et ch_sb pointent vers le meme objet");
        } else {
            System.out.println("ch1 et ch_sb pointent vers des objets differents");
        }
        ch2 = ch2.append("angage");
        System.out.println("ch2 = " + ch2); // "langage"
    }
    
}
