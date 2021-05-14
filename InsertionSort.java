public class InsertionSort {
    
    public static <T extends Comparable<T>> void sort(T[] table) {
        for(int nextPos=1;nextPos<table.length;nextPos++) {
            insert(table,nextPos);
        }
    }
    private static <T extends Comparable<T>> void insert(T[] table,int nextPos) {
        T nextVal=table[nextPos];
        while(nextPos>0 && table[nextPos-1].compareTo(nextVal)>0){
            table[nextPos]=table[nextPos-1];
            nextPos--;
        }
        table[nextPos]=nextVal;
    }
    public static <T extends Comparable<T>> void print(T[] table) {
        for(T t:table) {
            System.out.println(t);
        }
    }
    
    public static void main(String[] args) {
        Integer[] arr = {30,35,20,65,60};
        sort(arr);
        print(arr);
        String[] arr2= {"CSE232","CSE234","CSE222","MATH217"};
        sort(arr2);
        print(arr2);

    }
}