public class FindLengthofString {
    public static int findlen(String str) {
        if(str.isEmpty() || str==null || str.equals("")) {
            return 0;
        }
        else {
            return 1 + findlen(str.substring(1));
        }
    }
    public static void main(String[] args) {
        String str=new String("abcdefg");
        int l=findlen(str);
        System.out.println("Length of the string is: " + l);
    }
}