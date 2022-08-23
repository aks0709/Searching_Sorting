import java.util.Arrays;

public class TwoD_Matrix_Binary_Search
{
    public static void main(String[] args)
    {
        int arr[][]={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        int sortedMatrix[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target=15;
        System.out.println(Arrays.toString(search(arr,target)));
        System.out.println(Arrays.toString(search(sortedMatrix,target)));
    }

    static int[] search(int matrix[][],int target)
    {
        int r=0;
        int c=matrix.length-1;

        while(c>=0&&r< matrix.length) {
            if (matrix[r][c] == target)
                return new int[]{r, c};


            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
