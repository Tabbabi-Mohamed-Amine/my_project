public class ArithmeticOperations {
    public static void main(String[] args){
        int A,B ;
        A = 8 ;
        B = 18 ;
        System.out.println("A = " + A + "B = " + B);//A = 8B = 18
        A += B; 
        System.out.println("A = " + A + "B = " + B);//A = 26B = 18
        A -= 8 ;
        System.out.println("A = " + A + "B = " + B);//A = 18B = 18 
        A *= B ;
        System.out.println("A = " + A + "B = " + B);//A = 324B = 18
        A /= 2 ;
        System.out.println("A = " + A + "B = " + B);//A = 0B = 18 
        A %=2;
    }
}
