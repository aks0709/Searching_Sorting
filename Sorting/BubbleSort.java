package Sorting;

import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args)
    {

        int arr[]={10,1,7,6,14,9};
        Bubblesort(arr,arr.length);
        System.out.println(Arrays.toString(arr));


    }

    static void Bubblesort(int []arr,int n)
    {

        for (int i=1;i<n;i++)//rounds
        {
            boolean swapped=true;  //suppose array already sorted
            for (int j=0;j< n-i;j++)  //loop runs n-i,j iterate from first index that is 0

 /* round 1  n-1 loop runs n-1comparisons were made
    round 2 n-2 loop runs
    round 3  n-3 loop runs
    round 4  n-4 loop runs
    round i  n-i loop runs*/
            {
                if (arr[j]>arr[j+1]) {
                    swap(arr, j, j + 1);
                    swapped=false;   //any of the swapping takes place means array is not sorted
                }
            }
            if (swapped==true) //it means value is still true so no swapping takes place hence array already sorted
                break;//break out of function because no need to make unnecessary comparisons(optimisation)
        }

    }

    static void swap(int arr[],int a,int b)
    {

        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
