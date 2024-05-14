package ro.ase.cts.strategyex2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        SortManager sortManager= new SortManager();

        int[] arr1={5,2,9,1,3};
        sortManager.setSortingStrategy(new BubbleSortStrategy());
        sortManager.sortArray(arr1);
        System.out.println("Sorting array: "+ Arrays.toString(arr1));

        int[] arr2={7,4,8,2,1};
        sortManager.setSortingStrategy(new QuickSortStrategy());
        sortManager.sortArray(arr2);
        System.out.println("Sorting array: "+ Arrays.toString(arr2));
    }
}
