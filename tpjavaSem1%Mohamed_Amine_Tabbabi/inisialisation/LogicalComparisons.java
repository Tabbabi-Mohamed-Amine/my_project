public class LogicalComparisons {
    public static void main(String []args){
        int A=6 , B = 21 ;
        Boolean res ;
        res = A>B ;
        System.out.println("A>B ?" + res);//false
        res = A<B ;
        System.out.println("!A>B ?" + res);//true
        res = A==B ;
        System.out.println("A==B ?" + res);//false
        res = A!=B ;
        System.out.println("A!=B ?" + res);//true
        res = (A<B)&(A==B) ;
        System.out.println("(A<B)&(A==B) ?" + res);//true
        res = (A<B)|(A==B);
        System.out.println("(A<B)|(A==B) ?" + res);//true
        res = (A<B)^(A==B);
        System.out.println("(A<B)^(A==B) ?" + res);//ture
        res = A<B ?true:false;
        System.out.println("res = A<B ?true:false ?" + res);//true
    }
}
