public class gcd {
    public static int gcd(int m,int n) {
        if(m%n==0) {
            return n;
        }
        else if(m<n) {
            return gcd(n,m);
        }
        else {
            return gcd(n,m%n);
        }

    }
    public static void main(String[] args) {
        int x=32;
        int y=28;
        //x>y
        System.out.println("Greatest common divisor of " + x + " and "
        + y + " = " + gcd(x,y));
    }
}