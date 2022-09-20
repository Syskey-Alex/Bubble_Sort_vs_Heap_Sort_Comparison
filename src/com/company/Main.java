package com.company;

public class Main {
    //56,78,3,4,16,112,512,5,2
static int[] array = new int[]{56,78,3,4,16,112,512,5,2};
    public static void main(String[] args) {
        bubbleSort(array);
        int arr[] = {12, 11, 13, 5, 6, 7};
        int N = arr.length;

        // Function call
        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        ob.printArray(arr);
    }
    public static void bubbleSort(int[] array){
        int countSort=0;
        int temp;
        boolean swapped = true;
        int n = array.length;

        while(swapped){
            swapped = false;
            for(int i=0;i<n-1;i++){
                if(array[i]>array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapped = true;
                }

            }
            countSort++;
        }
        for(int i=0;i<n;i++){
            System.out.print("This is bubble sort: "+ array[i]+" ");
        }
    }

}
