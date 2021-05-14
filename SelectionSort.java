public class SelectionSort {
    
    public static <T extends Comparable<T>> void sort(T[] arr) {
        int n=arr.length;
        int fill;

        for(fill=0;fill<n-1;fill++) {
            int posMin=fill;
            for(int next=fill+1;next<n;next++) {
                if(arr[next].compareTo(arr[posMin])<0) {
                    posMin=next;
                }
            }
            T temp=arr[fill];
            arr[fill]=arr[posMin];
            arr[posMin]=temp;
        }
        for(T t:arr) {
            System.out.println(t);
        }
    }
    
    public static void main(String[] args) {
        Integer[] arr = {30,35,20,65,60};
        sort(arr);
        String[] arr2= {"CSE232","CSE234","CSE222","MATH217"};
        sort(arr2);

    }
}