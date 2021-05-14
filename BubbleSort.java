public class BubbleSort {
    
    public static <T extends Comparable<T>> void sort(T[] table) {
        int pass=1;
        boolean exchanges=false;

        do {
            exchanges=false;
            for(int i=0;i<table.length-pass;i++) {
                if(table[i].compareTo(table[i+1])>0) {
                    T temp=table[i];
                    table[i]=table[i+1];
                    table[i+1]=temp;
                    exchanges=true;
                }
            }
            pass++;
        }
        while(exchanges);
        for(T t:table) {
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