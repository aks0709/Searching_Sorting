package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int arr[]={5,7,2,4,8,1,9};
        Selectionsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Selectionsort(int[]arr)
    {
        for (int i=0;i<arr.length-1;i++)
        {
            int MinIndex=i;

            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[j]<arr[MinIndex])
                    MinIndex=j;
            }
            swap(arr,MinIndex,i);
        }

    }

    static void swap(int []arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
