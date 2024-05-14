package ro.ase.cts.strategyex2;

public class SortManager {
    private SortingStrategy sortingStrategy;
    public void setSortingStrategy(SortingStrategy sortingStrategy){
        this.sortingStrategy=sortingStrategy;
    }
    public void sortArray(int[] array){
        sortingStrategy.sort(array);
    }
}
