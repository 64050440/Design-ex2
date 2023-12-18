
interface Sorting {
    void sort();
}

class SelectionSort implements Sorting {
    @Override
    public void sort() {
        System.out.println("Selection sort");

    }
}

class MergeSort implements Sorting {
    @Override
    public void sort() {
        System.out.println("Merge sort");

    }
}

class InsertionSort implements Sorting {
    @Override
    public void sort() {
        System.out.println("Insertion sort");

    }
}

public class Open_Closed {
    public static void performSorting(Sorting sort) {
        sort.sort();
    }

    public static void main(String[] args) {
        Open_Closed sortManager = new Open_Closed();

        Sorting selectionSort = new SelectionSort();
        sortManager.performSorting(selectionSort);

        Sorting mergeSort = new MergeSort();
        sortManager.performSorting(mergeSort);

        Sorting insertionSort = new InsertionSort();
        sortManager.performSorting(insertionSort);
    }
}
