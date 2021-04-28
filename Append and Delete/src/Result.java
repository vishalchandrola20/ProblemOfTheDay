class Result {

    /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {

        if (s.length()==0 && t.length()<=k || t.length()==0 && s.length()<=k){
            return "Yes";
        }
        if (k >= s.length()+t.length()){
            return "Yes";
        }

        int n = s.length() > t.length() ? t.length() : s.length();

        int j = 0;
        for (int i = 0;i<n;i++){
            if (s.charAt(i)!=t.charAt(i)){
                break;
            }
            j++;
        }
        int commonlength = (s.length() - j) + (t.length() - j);
        if (commonlength > k) {
            return "No";
        }else if (commonlength %2==k%2) {
            return "Yes";
        }else return "No";
    }

}