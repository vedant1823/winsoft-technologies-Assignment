// Merge two arrays by satisfying given constraints
import java.util.Arrays;

public class Problem1 {
    public static int[] mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        int[] mergedArray = new int[m];

       
        int nonZeroIndex = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[nonZeroIndex--] = X[i];
            }
        }

        
        int i = n;  
        int j = 0;  
        int k = 0;  

        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                mergedArray[k] = X[i];
                k++;
                i++;
            } else {
                mergedArray[k] = Y[j];
                k++;
                j++;
            }
        }

       
        while (j < n) {
            mergedArray[k] = Y[j];
            k++;
            j++;
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};

        int[] mergedArray = mergeArrays(X, Y);

        System.out.println(Arrays.toString(mergedArray));  
    }
}