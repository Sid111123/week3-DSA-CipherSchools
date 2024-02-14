import java.util.*;

class Lecture39
{
    public static boolean isPalindrome(String s)
    {
        s = s.toLowerCase();
        int start = 0;
        int end = s.length()-1;

        while(start<=end)
        {
            char a = s.charAt(start);
            char b = s.charAt(end);
            if(a!=b) return false;
            start++;
            end--;
        }
        return true;

    }
    public static void main(String ar[])
    {
        // we are ignoring case in checking whether a string is palindrome or not
        String s = "Groog";
        if(isPalindrome(s)) System.out.println("Is A Palindrome");
        else System.out.println("Not Palindrome");
    }
}