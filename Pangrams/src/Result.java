import java.util.HashSet;
import java.util.Set;

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
    return isPangram(s) ? "pangram" : "not pangram";
    }

    private static boolean isPangram(String s) {
        Set<Character> allChars = new HashSet<>();

        for (Character c : s.toLowerCase().replace(" ","" ).toCharArray()){
            allChars.add(c);
        }

        return allChars.size()==26 ? true : false;
    }

}