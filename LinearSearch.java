import java.util.Scanner;

public class LinearSearch
{
    public static void main(String[] args)
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        x=sc.nextInt();
        int array[]=new int[x];
        System.out.println("enter the entries of array");
        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("enter key");
        int y= sc.nextInt();

        int z=Linear_search(array,y);
        System.out.println(z);
    }

    //return index if target element found
    //else return -1
    public static int Linear_search(int arr[],int key)
    {
        if (arr.length==0)
        {
            return -1;
        }

        for (int index=0;index< arr.length;index++)
        {
            //int element=arr[index];
            if (arr[index]==key)
            {
                return index;
            }
        }

        return -1;
    }
}

