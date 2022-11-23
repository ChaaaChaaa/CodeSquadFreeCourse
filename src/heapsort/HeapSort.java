package heapsort;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HeapSort {
    TreeSet<Integer> numbersForMinHeap;
    TreeSet<Integer> numbersForMaxHeap;

    public HeapSort() {
        numbersForMinHeap = new TreeSet<>(Integer::compareTo);
    }

    public void insertHeap(int number) {

        numbersForMinHeap.add(number);
    }

    public void printHeap() {
        numbersForMaxHeap = (TreeSet<Integer>) numbersForMinHeap.clone();
        System.out.println("min heap : "+numbersForMinHeap);
    }

    public int getHeapSize() {
        return numbersForMinHeap.size();
    }

    public int deleteHeap() {
        int poll = numbersForMinHeap.pollFirst();
        numbersForMinHeap.remove(poll);
        return poll;
    }

    public int deleteHeap2() {
        int poll = numbersForMaxHeap.pollLast();
        numbersForMinHeap.remove(poll);
        return poll;
    }

    public void printHeap2() {
        numbersForMaxHeap = (TreeSet<Integer>) numbersForMaxHeap.descendingSet();
        System.out.println("max heap : "+numbersForMaxHeap);
    }
}
