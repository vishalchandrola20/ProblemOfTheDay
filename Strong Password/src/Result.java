import java.util.HashSet;
import java.util.Set;

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

        boolean small = false;
        boolean large = false;
        boolean number = false;
        boolean special = false;

        Set<Character> specials = new HashSet<>();

        for (Character c : "!@#$%^&*()-+".toCharArray()){
            specials.add(c);
        }
        for(int i = 0;i<n;i++){
            if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z'){
                small = true;
            }
            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'){
                large = true;
            }
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9'){
                number = true;
            }
            if (specials.contains(password.charAt(i))){
                special = true;
            }
        }
        int result = 0;
        result += small ? 0 : 1;
        result += large ? 0 : 1;
        result += number ? 0 : 1;
        result += special ? 0 : 1;

        return n + result < 6 ? 6 - n : result ;
    }

}
