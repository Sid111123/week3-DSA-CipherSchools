import java.util.*;

class Lecture34
{
    public static void fibonacci(int first, int second, int n)
    {
        if(n==0) return;
        int third = first+second;
        System.out.print(third+" ");
        fibonacci(second,third,n-1);
    }
    public static void main(String k[])
    {
        System.out.print(0+" "+1+" ");
        fibonacci(0,1,9);
    }
}


/*

public static void fibonacci(int n, int arr[], int idx)
    {
        if(idx==n) return;
        arr[idx] = arr[idx-1] + arr[idx-2];
        fibonacci(n,arr,idx+1);
    }
    public static void main(String k[])
    {
        int n = 9;
        int arr[] = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        fibonacci(n,arr,2);

        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }

*/