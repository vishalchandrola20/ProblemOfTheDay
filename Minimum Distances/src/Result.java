import java.util.Arrays;
import java.util.List;

class Result {

    /*
     * Complete the 'minimumDistances' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int minimumDistances(List<Integer> a) {

        int minimumDistance = -1;
        for (int i=0;i<a.size()-1; i++){
            for (int j=i+1;j<a.size();j++){
                if (a.get(i).equals(a.get(j))){
                    minimumDistance = minimumDistance == -1 ? j-i : minimumDistance < j-i ? minimumDistance : j-i;
                }
            }
        }

        return minimumDistance;
    }

}