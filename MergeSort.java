import java.lang.reflect.Array;

public class MergeSort {
    //SortingAlgorithm interface implement
    @SuppressWarnings("unchecked")
    public static <T extends Comparable<T>> void sort(T[] table) { 
        if(table.length>1) {
            int halfsize=table.length/2;
            /*T[] leftSequence=(T[])Array.newInstance(table.getClass().getComponentType(), halfsize);
            T[] rightSequence=(T[])Array.newInstance(table.getClass().getComponentType(), table.length-halfsize);
            */
            T[] leftSequence=(T[]) new Comparable[halfsize];
            T[] rightSequence=(T[]) new Comparable[table.length-halfsize];
            
            System.arraycopy(table, 0, leftSequence, 0, halfsize);
            System.arraycopy(table, halfsize, rightSequence, 0, table.length-halfsize);
           
            /*for(int i=0;i<halfsize;i++) {
                leftSequence[i]=table[i];
            }
            for(int i=halfsize;i<table.length;i++) {
                rightSequence[i-halfsize]=table[i];
            }*/

            sort(leftSequence);
            sort(rightSequence);
            merge(table,leftSequence,rightSequence);
        }
    }

    private static < T extends Comparable < T >> void merge(T[] outputSequence, T[] leftSequence, T[] rightSequence) {
        int i = 0; // Index into the left input sequence.
        int j = 0; // Index into the right input sequence.
        int k = 0; // Index into the output sequence.

        // While there is data in both input sequences
        while (i < leftSequence.length && j < rightSequence.length) {
            // Find the smaller and
            // insert it into the output sequence.
            if (leftSequence[i].compareTo(rightSequence[j]) < 0) {
            outputSequence[k++] = leftSequence[i++];
            }
            else {
            outputSequence[k++] = rightSequence[j++];
            }
        }
        // assert: one of the sequences has more items to copy.
        // Copy remaining input from left sequence into the output.
        while (i < leftSequence.length) {
            outputSequence[k++] = leftSequence[i++];
        }
        // Copy remaining input from right sequence into output.
        while (j < rightSequence.length) {
            outputSequence[k++] = rightSequence[j++];
        }
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