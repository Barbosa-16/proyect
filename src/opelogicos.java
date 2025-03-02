public class opelogicos {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 5;
        int c = 20;

        System.out.println("a es mayor que b y b es menor que c  " + (a > b && b < c ));
        System.out.println("a es menor b || b mayor que c" +  (a < b || b > c));
        System.out.println("! (a > b)" +  !(a > b));
    }
}
