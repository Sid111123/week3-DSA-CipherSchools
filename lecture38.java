import java.util.*;

class Lecture38
{
    public static String reverseString(String s) // Two pointer approach to reverse string
    {
        char arr[] = s.toCharArray();

        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        String newstr = "";
        for(char c: arr)
        {
            newstr += c;
        }
        return newstr;
    }
    public static void main(String ar[])
    {
        String s = "HELLO";
        System.out.println(reverseString(s));
    }
}

/*

// reversing a string using a for loop.................

public static String reverseString(String s)
    {
        StringBuilder newstr = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            char c = s.charAt(i);
            newstr.append(c);
        }
        return newstr.toString();
    }
    public static void main(String ar[])
    {
        String s = "HELLO";
        System.out.println(reverseString(s));
    }

*/