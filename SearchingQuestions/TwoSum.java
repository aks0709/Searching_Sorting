package SearchingQuestions;

import java.util.Arrays;

public class TwoSum
{
    public static void main(String[] args)
    {
        int arr[]={2,7,11,15};//array is sorted
        int target=9;
        int ans[]=twoSum(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    //brute force is 2 pointers O(N2)
    static int[] twoSum(int[] numbers, int target)
    {
        for(int i=0;i<numbers.length;i++)
        {
            int start=i;
            int end=numbers.length-1;
            int mid=start+(end-start)/2;
            while(start<=end)
            {
                if(numbers[mid]==target-numbers[i])
                    return new int[]{i+1,mid+1};

                else
                {
                    if(numbers[mid]>target-numbers[i])
                        end=mid-1;
                    else
                        start=mid+1;
                }
            }
        }

        return new int[]{-1,-1};
    }
}
