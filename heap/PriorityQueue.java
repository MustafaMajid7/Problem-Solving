package heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PriorityQueue implements Heap {

    private List<Integer> arr = new ArrayList<>();

    @Override
    public void push(int num) {
        arr.add(num);
        heapifyUp(arr.size()-1);
    }

    void heapifyUp(int i){
        if (i == 0)
            return;
        else {
            if (arr.get(i) < arr.get((i-1)/2)) {
                Collections.swap(arr, i, (i - 1) / 2);
                heapifyUp((i - 1) / 2);
            }
        }
    }

    @Override
    public int pop() {
        Collections.swap(arr,0,arr.size()-1);
        int ret =  arr.remove(arr.size()-1);
        heapifyDown(0);
        return ret;
    }

    private void heapifyDown(int i){
        if (i >= arr.size()/2)
            return;
        else {
            if (arr.get(i) > arr.get(i*2+1) && arr.get(i*2+1)<= arr.get(i*2+2)){
                Collections.swap(arr,i,i*2+1);
                heapifyDown(i*2+1);
            }
            else {
                Collections.swap(arr, i, i * 2 + 2);
                heapifyDown(i*2+2);
            }
        }
    }

    @Override
    public int size() {
        return arr.size();
    }

    @Override
    public void print() {
        arr.stream().forEach(x ->System.out.print(x + " "));
        System.out.println();
    }

    @Override
    public int top() {
        return arr.get(0);
    }
}
