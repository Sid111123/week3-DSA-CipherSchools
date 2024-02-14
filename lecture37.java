import java.util.*;

class Lecture37
{
    public static boolean twoPointer(int arr[], int tar)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int sum = arr[start] + arr[end];
            if(sum==tar) return true;
            else if(sum<tar)
            {
                start++;
            }
            else end--;
        }
        return false;
    }
    public static void main(String ar[])
    {
        int arr[] = {2,3,4,6,8,10,12};
        int target = 15;
        if(twoPointer(arr,target))
        {
            System.out.println("Sum Found");
        }
        else System.out.println("Sum Not Found");
    }
}