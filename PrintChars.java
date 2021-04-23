public class PrintChars {
    public static void print(String str) {
        if(str==null || str.equals("")) {
            System.out.println();
            return ;
        }
        else {
            System.out.print(str.charAt(0));
            print(str.substring(1));
        }
    }
    public static void printreverse(String str) {
        if(str==null || str.equals("")) {
            System.out.println();
            return ;
        }
        else {
            printreverse(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }
    public static void main(String[] args) {
        String str=new String("abcdefg");
        print(str);
        printreverse(str);
    }
}