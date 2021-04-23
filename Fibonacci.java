public class Fibonacci {
    
    public static int fibonacci(int n) {
        if(n<=2) {
            return 1;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
    public static void main(String[] args) {
        //1,1,2,3,5,8,13,21,34,55,89
        //1 2 3 4 5 6 7  8  9  10 11
        System.out.println(fibonacci(11));
    }
}