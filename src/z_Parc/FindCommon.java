package z_Parc;

public class FindCommon {
    
    public static int value(int a, int b, int result) {
        if ((a < 0 && b < 0) || (a > 0 && b > 0)) {
            return Math.abs(result);
        } else if ((a < 0 || b < 0) && result > 0) {
            return -result;
        } else {
            return result;
        }
    }
    
    public static int mult(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        int result = 0;
        int absB = Math.abs(b); 
        
        for (int i = 0; i < absB; i++) {
            result += a;
        }
        
        return value(a, b, result);
    }
    
    public static void main(String[] args) {
        System.out.println(mult(0, 0));
        System.out.println(mult(0, 5));
        System.out.println(mult(5, 0));
        System.out.println(mult(5, 5));
        System.out.println(mult(-5, 6));
        System.out.println(mult(7, -5));
        System.out.println(mult(-5, -5));
    }
}
