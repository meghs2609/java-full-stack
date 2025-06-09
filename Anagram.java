//a quick brown fox jumps over a lazy dog
import java.util.*;
class Anagram{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine().toLowerCase();
        int c[]=new int[26];
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='a'&& ch<='z')
            {
                c[ch-'a']++;
            }
        }
        
        int m=0;
        for(int i=0;i<26;i++)
        {
            if(c[i]==0)
            {
                m++;
            }
        }
        if(m==0)
        {
            System.out.println("yes its an anagram");
        }
        else
        System.out.println("no , its not an anagram");
        
    }
}