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
        int[] fin = new int[arr1.length * 2];
        return mergeRec(arr1, arr2, 0, 0, fin);
    }
    public static int[] mergeRec(int[] arr1, int[] arr2, int i, int j, int[] fin){
        if (j == arr2.length && i == arr1.length){
            return fin;
        }
        if (i == arr1.length){
            fin[i + j] = arr2[j];
            return mergeRec(arr1, arr2, i, j + 1, fin);
        }
        if (j == arr2.length){
            fin[i + j] = arr1[i];
            return mergeRec(arr1, arr2, i + 1, j, fin);
        }
        if (arr1[i] >= arr2[j]){
            fin[i + j] = arr2[j];
            return mergeRec(arr1, arr2, i, j + 1, fin);
        }
        fin[i + j] = arr1[i];
        return mergeRec(arr1, arr2, i + 1, j, fin);
        

        
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
