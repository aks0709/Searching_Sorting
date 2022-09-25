package Sorting;

import java.util.Arrays;

public class InsertionSort
{
    public static void main(String[] args)
    {
     int arr[]={12,322,43,13,1,69,639};
     Sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int arr[],int n)
    {
        for (int i=1;i<n;i++)//for rounds
        {
            int temp=arr[i]; //STORE current elemenet of current round
            int j=i-1;  //we declare j out of while() body.
            while(j>=0)
            {
                if (arr[j]>temp)//shift
                {
                    arr[j+1]=arr[j]; //shifting logic
                }
                else //element is already greater so no need to do comparisons simply break out
                {
                    break;
                }

                j--;
            }
            arr[j+1]=temp;   //to put element in between, j value  changes
        }
    }
}
