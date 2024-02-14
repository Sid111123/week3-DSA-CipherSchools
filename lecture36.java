import java.util.*;

class Lecture36
{
    public static int slidingWindow(int arr[], int k) // k is size of the window
    {
        int max = 0;
        for(int i=0;i<k;i++)
        {
            max += arr[i];
        }
        int temp = max;

        for(int i=k;i<arr.length;i++)
        {
            temp = temp + arr[i] - arr[i-k];
            max = Math.max(temp,max);
        }
        return max;
    }
    public static void main(String ar[])
    {
        int arr[] = {2,3,1,4,5};
        
        //finding max sum in the given array with k window size
        System.out.println(slidingWindow(arr,3));
    }
}