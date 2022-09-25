package SearchingQuestions;

public class IsPerfectSquare
{
    public static void main(String[] args)
    {

        boolean ans=isPerfectSquare(17);
        System.out.println(ans);
    }

    static boolean isPerfectSquare(int num)
    {
        int start=0;
        int end=num;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid*mid==num)
                return true;
            else
            {
                if(mid*mid<num)
                    start=mid+1;
                else
                    end=mid-1;
            }
        }

        return false;
    }
}
