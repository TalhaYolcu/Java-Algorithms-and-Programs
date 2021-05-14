public class ShellSort {
    //SortingAlgorithm interface ini implemet
    public static <T extends Comparable<T>> void sort(T[] table) {
        int gap=table.length/2;
        while(gap>0) {
            for(int nextPos=gap;nextPos<table.length;nextPos++) {
                insert(table,nextPos,gap);
            }
            if(gap==2) {gap=1;}
            else {gap=(int)(gap/2.2);}
        }
    }
    private static <T extends Comparable<T>> void insert(T[] table, int nextPos,int gap) {
        T nextVal=table[nextPos];
        while((nextPos>gap-1) && nextVal.compareTo(table[nextPos-gap])<0) {
            table[nextPos]=table[nextPos-gap];
            nextPos-=gap;
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