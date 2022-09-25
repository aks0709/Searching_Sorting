package SearchingQuestions;

public class SmallestLetterGreaterThanTarget
{
    public static void main(String[] args)
    {
char arr[]={'c','f','j'};
char target='f';
char ans=nextGreatestLetter(arr,target);
        System.out.println(ans);
    }
    static char nextGreatestLetter(char[] letters, char target)
    {
        int start=0;
        int end=letters.length-1;
        char ans=letters[0];
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(letters[mid]>target)
            {
                end=mid-1;

                ans=letters[mid];
            }
            else
            {
                start=mid+1;
            }
        }
        return ans;
    }
}
