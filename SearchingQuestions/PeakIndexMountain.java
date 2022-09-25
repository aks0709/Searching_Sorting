package SearchingQuestions;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakIndexMountain
{
    public static void main(String[] args)
    {
        int arr[]={0,1,4,7,4,2,1};
        int ans=getPeakIndex(arr);
        System.out.println(ans);

    }
    static int getPeakIndex(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)   //we iterate loop for start<end because if we iterate it for start<=end
            //the loop runs again for the last time and value of start and end will change
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]) //it means you are in the decreasing part of an array
            {
                end=mid;//very important step we are not doing end=mid-1;
//because in this case there is a chance that element before mid may be less so in that case our ans =mid
//thats why we include mid,  i.e, end=mid
            }

            if(arr[mid]<arr[mid+1]) //you are in  ascending part of array
            {
                start=mid+1;
// we do mid+1  because arr[mid] already less than arr[mid+1] so we have to search in the right part of the array
            }
        }
        return start;
//if you dry run observe that in the end start and end is going to point same block
//thats why we return either end or start
    }
}
