import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
    // Write your code here
        String ans="not pangram";
        if(s.length()>=26)
            ans=isPangrams(s);
        return ans;
    }
    
    private static String isPangrams(String s){
        String ans="not pangram";
        String tmp=s.toLowerCase();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<tmp.length();i++){
            if(tmp.charAt(i)!=' ' && !map.containsKey(tmp.charAt(i))){
                map.put(tmp.charAt(i),1);
            }
        }
        if(map.size()==26) ans="pangram";
        return ans;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}