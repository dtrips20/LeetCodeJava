package com.deetree;

public class Palindrome {

    public static void main(String[] args)
    {

       String[] str = {"m","a","l","a","y","a","l","a","m"};

       int end = str.length-1;
       int start = 0 ;

       Palindrome p = new Palindrome();
       System.out.println(p.IsPalindrome(str,start,end));


    }


    private boolean IsPalindrome( String[] s,int start , int end)
    {

        if ( start == end)
            return true;

        if (!s[start].equals(s[end]))
            return false;

        if ( start < end)
        return IsPalindrome(s,start+1,end-1);

        return true;

    }

}
