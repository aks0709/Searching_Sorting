package SearchingQuestions;
//https://leetcode.com/problems/arranging-coins/submissions/
public class ArrangeCoins
{
    public static void main(String[] args)
    {
        int coins=16;
        int ans=getCompleteRows(coins);
        System.out.println(ans);
    }
    /*Logic is Rows are increasing in natural numbers,Thats why we initialise start with 1
    we apply Binary search to search for the row which is incomplete,initialise end with n;

    procedure we calculate mid and no of coins till mid by sum of n natural no formula
    if(sum<=n) ans=mid but we still check for remaining rows
    if sum>n end=mid-1;

     in the end return ans,
     */
    static int getCompleteRows(int n)
    {
        long start=1;
        long end=n;
        long mid=0;
        long ans=0;


        while(start<=end)
        {
            mid=start+(end-start)/2;

            long no_of_coins=mid*(mid+1)/2;

            if(no_of_coins<=n){
                ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return (int)ans;
    }
}
