public class Factorial {
    public static int factorial(int x) {
        if(x<0) {
            throw new IllegalArgumentException();
        }
        if(x==0) {
            return 1;
        }
        
        else {
            return x * factorial(x-1);
        }
    }
    public static void main(String[] args) {
        int x=6;
        System.out.println("Factorial of x: " + factorial(x));
    }
}