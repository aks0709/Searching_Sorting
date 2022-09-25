package Sorting;

import java.util.Arrays;

public class QuickSort
{
    public static void main(String[] args)
    {
        int arr[]={12,43,123,45,11,9,43};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void quickSort(int []arr,int start,int end)
    {
        if(start>=end)  //means single block ,already sorted
            return;
        int partitionIndex=partition(arr,start,end);  //partition index gives true place of pivot element


        //left part sort by recursion
        quickSort(arr,start,partitionIndex-1);
        //right part sort by recursion
        quickSort(arr,partitionIndex+1,end);
    }


    //swap function
    static void swap(int [] arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static int partition(int arr[],int start,int end)  //this method returns partitonindex as well as adjust the
                                                       //elements of array accoring to partition
    {

        int pivot=arr[start]; //pivot element is the element placed on start index
        int count=0;

        for (int i=start+1;i<=end;i++) //start+1 isliye kiya hai kyuki start index pe pivot element hai
        {
            if (arr[i]<=pivot)
                count++;  //this stores no. of elements less then pivot element in remaining array
        }

        int partitionIndex=start+count;
        swap(arr,start,partitionIndex);  // placing pivot element to right index


        //declaring two pointers
        int i=0;
        int j= end;

        while(i<partitionIndex&&j>partitionIndex)
        {
            while (arr[i]<=pivot)  //means element already placed on correct part of partition simply move on
            {
                i++;
            }


            while (arr[j]>=pivot) //means element already placed on correct part of partition simply move on
            {
                j--;
            }
          if(i<partitionIndex&&j>partitionIndex) //means elements are placed on wrong side of partition
          {
              swap(arr,i,j);  //swap their place
              i++;
              j--;
          }

        }

        return partitionIndex;
    }

}
