# hello
import java.io.*;
import java.util.*;
import java.lang.*;
public class Character{
  public static void main(String args[])throws IOException
  {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter the character:");
     char ch=br.readLine().charAt(0);
     if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' ||ch=='U')
     {
       System.out.println("vowel");
      }
      else
      {
         System.out.println("consonant");
    }  
     }
    }
