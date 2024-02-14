import java.util.*;

class Lecture35
{
    public static boolean binerySearch(int tar, int arr[])
    {
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==tar) return true;
            else if(arr[mid]>tar) end = mid-1;
            else start = mid+1;
        }
        return false;
    }
    public static void main(String ar[])
    {
        int target = 8;
        int arr[] = {2,4,6,7,8,9,11,14,15};

        if(binerySearch(target,arr)) System.out.println("Value Found");
        else System.out.println("Value Not Found");
    }
}