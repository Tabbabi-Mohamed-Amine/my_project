public class BooleanTests {
    public static void main(String[] ARGS){
        boolean res ;
        int a = 5 , b = 16 ;
        res  = a<b ;
        System.out.println("a<b" + res);
        res = !(a<b);
        System.out.println(res);
        res = ((a<b)&(a>b));
        System.out.println(res);
        res = a == b ;
        System.out.println(res);
    }
}
