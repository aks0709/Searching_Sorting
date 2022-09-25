package SearchingQuestions;

public class SearchInsertposition
{
    public static void main(String[] args)
    {
        int arr[]={1,3,4,5};
        int target=6;
        int ans=searchInsert(arr,target);
        System.out.println(ans);

    }

    static int searchInsert(int[] nums, int target)
    {
        int start=0;
        int end=nums.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]>target)
                end=mid-1;
            else
            {
                if(nums[mid]<target)
                    start=mid+1;
                else
                    return mid;
            }

        }
        //while loop mai condition fail hone se phele loop akhri baar chala hoga usmai start ki value badi hogi
        return start;


    }
}
