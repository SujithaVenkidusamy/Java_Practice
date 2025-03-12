Given a word pat and a text txt. Return the count of the occurrences of anagrams of the word in the text.

Example 1:
Input: txt = "forxxorfxdofr", pat = "for"
Output: 3
Explanation: for, orf and ofr appears in the txt, hence answer is 3.

Example 2:
Input: txt = "aabaabaa", pat = "aaba"
Output: 4
Explanation: aaba is present 4 times in txt.

## Count all Occurances of Anagaram
```java[]
import java.util.*;
public class Main {
    public static boolean araAnagram(String s1, String s2)
    {
        // converting strings to char arrays
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        // sorting both char arrays
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // Check for equality of strings
        if (Arrays.equals(ch1, ch2))
            return true;
        else
            return false;
    }

    public static int countAnagrams(String text, String word)
    {
        int N = text.length();
        int n = word.length();

        // Initialize result
        int res = 0;

        for (int i = 0; i <= N - n; i++) {

            String s = text.substring(i, i + n);
            if (araAnagram(word, s))
                res++;
        }

        return res;
    }
    public static void main(String args[])
    {
        String text = "forxxorfxdofr";
        String word = "for";
        System.out.print(countAnagrams(text, word));
    }
}
```


Given two strings string1 and string2, remove those characters from first string(string1) which are present in second string(string2). Both the strings are different and contain only lowercase characters.
NOTE: Size of  first string is always greater than the size of  second string( |string1| > |string2|).

Example 1:
Input:
string1 = "computer"
string2 = "cat"
Output: "ompuer"
Explanation: After removing characters(c, a, t)
from string1 we get "ompuer".

Example 2:
Input:
string1 = "occurrence"
string2 = "car"
Output: "ouene"
Explanation: After removing characters
(c, a, r) from string1 we get "ouene".


## Remove Characters and display 
```java []
import java.util.*;
public class Main {
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       System.out.print("Enter String: ");
       String str1=s.nextLine();
       System.out.print("String not to be in: ");
       String str2=s.nextLine();
       
       StringBuffer ans=new StringBuffer();
       for(int i=0;i<str1.length();i++){
           int flag=0;
           for(int j=0;j<str2.length();j++){
               if(str1.charAt(i)==str2.charAt(j))   flag =1;
               
        }
        if(flag!=1)  ans.append(str1.charAt(i));
        
    }
    System.out.print("Output :"+ ans.toString());
  }
}
```

```
