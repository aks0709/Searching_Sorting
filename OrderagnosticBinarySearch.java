public class OrderagnosticBinarySearch
{
    public static void main(String[] args) {

        int arr[]={20,14,6,3,1};
        int target=14;
        int ans=orderagnosticbs(arr,target);
        System.out.println(ans);
    }

    static int orderagnosticbs(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isasc=(arr[start]<arr[end]);
        while (start<=end)
        {
            int mid=start+(end-start)/2;

            if (arr[mid]==target)
                return mid;
            if (isasc){
                if(target<arr[mid])
                {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            else {

                if(target>arr[mid])
                {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
