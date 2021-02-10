import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        return isr(list, 0);
    }
    public static ArrayList<Integer> isr(ArrayList<Integer> list, int i){ 
        
        if (i >= list.size() - 1){
            return list;
        }
        if (i < 0){
            return isr(list, 0);
        }      
        
        if (list.get(i) <= list.get(i + 1)){
            return isr(list, i + 1);
        }
        else{
            int temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
            return isr(list, i - 1);
        }
        
     }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        // YOUR CODE HERE
        return null;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
