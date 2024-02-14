import java.util.*;

class Lecture33
{
    // this function is used to print the numbers in descending order
    public static void descendingOrder(int n)
    {
        if(n==0) return;
        System.out.println(n);
        descendingOrder(n-1);   // calling the function itself by decrementing 
    }
    public static void main(String k[])
    {
        int n = 9;
        descendingOrder(9);
    }
}