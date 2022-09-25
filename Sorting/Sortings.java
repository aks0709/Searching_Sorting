package Sorting;

import java.util.Arrays;

public class Sortings
{
    public static void main(String[] args) {
        int arr[] = {12, 34, 2, 5, 3, 56, 11};
        BubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    //bubble sort
// basically motive of this algorithm is that in each round the corresponding largest element reach its corresponding place
    //we compare adjacent elements if arr[j]>arr[j+1] swap them
    //in n-1 rounds we get sorted array
    //Time Complexity order of N2
    //Best case :-array is already sorted in that case we made only N comparison O(N)
    static void BubbleSort(int arr[],int size)
    {
        for (int i=1;i<size;i++)
        {
            boolean status=true;
            for (int j=0;j<size-i;j++) //in each round loop runs for n-i index
            {
                if (arr[j]>arr[j+1]) {
                    swap(arr, j, j + 1);
                    status=false;
                }

            }
            if (status==true)
                break;
        }
    }

    //Selection Sort:-
    //in this sorting technique we take minIndex initially

    static void swap(int arr[],int a,int b)
    {
     int temp=arr[a];
     arr[a]=arr[b];
     arr[b]=temp;
    }

}
