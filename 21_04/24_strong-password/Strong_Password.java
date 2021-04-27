import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */
    public static int minimumNumber(int n, String password) {
        int count=0;
        if(Pattern.matches("[^a-z]+", password)) count++;
        if(Pattern.matches("[^A-Z]+", password)) count++;
        if(Pattern.matches("[^0-9]+", password)) count++;
        if(Pattern.matches("[^!@#$%^&*()+-]+", password)) count++;
        if(n>=6)
            return count;
        else{
            int tmp=6-(n+count);
            if(tmp>0) return count+tmp;
            else return count; 
        }
        return count;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
