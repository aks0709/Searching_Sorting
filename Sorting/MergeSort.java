package Sorting;

import java.util.Arrays;

public class MergeSort
{
    public static void main(String[] args)
    {
    int arr[]={5,4,3,2,1};
    //updating the original array
    arr=mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }


    //return an array
    static int [] mergesort(int arr[])
    {
        //base condition
        if(arr.length==1)
            return arr;  //when we hit the base condition i,e. single block array return the array

        int mid =arr.length/2;
        //divide array in 2 parts in each recursive calls
        int left[]=mergesort(Arrays.copyOfRange(arr,0,mid));
        int right []=mergesort(Arrays.copyOfRange(arr,mid,arr.length));

       return merge(left,right);

    }

    //return the merged array
    static int [] merge(int left[],int right[])
    {
        int [] combined=new int[left.length+ right.length];
        //declaring 3 pointers
        int i=0;  //pointer that iterate in left array
        int j=0;   //pointer that iterate in right array
        int k=0;   //pointer that iterate in combined array

        //both condition should be true simultaneously
        while(i< left.length&& j< right.length)
        {
            if(left[i]<right[j]) {
                combined[k] = left[i];
                i++;
            }
            else {
                combined[k]=right[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the array is not finished
        //loop1
        //copying the remaining elements from left array if right array is finished
        while(i< left.length)
        {
            combined[k]=left[i];
            i++;
            k++;

        }
        //loop2
        //copying the remaining elements from right array if left array is finished
        while(j< right.length)
        {
            combined[k]=right[j];
            j++;
            k++;

        }
        //either loop1 run or loop2 run

        return combined;
    }
}
