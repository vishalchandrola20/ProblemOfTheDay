import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = "We promptly judged antique ivory buckles for the next prize";

        String result = Result.pangrams(s);

      //  bufferedWriter.write(result);
      //  bufferedWriter.newLine();

        bufferedReader.close();
      //  bufferedWriter.close();
    }
}
