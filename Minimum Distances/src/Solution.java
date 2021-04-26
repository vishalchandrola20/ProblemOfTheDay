import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        System.out.println("===============");




        int result = Result.minimumDistances(Arrays.asList(1, 2, 3, 4, 10));
System.out.println("==============="+result);
       // bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine() ;

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
