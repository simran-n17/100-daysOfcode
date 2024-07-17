package threesum;
import java.util.*;

public class threesum {
    static List<List<Integer>> threesome(int arr[]) {
        List<List<Integer>> r1 = new ArrayList<>();
        if (arr == null || arr.length < 3) return r1;

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue; // Skip duplicate elements

            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == 0) {
                    r1.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    while (j < k && arr[j] == arr[j + 1])
                    	{
                    		j++;
                    	}
                    while (j < k && arr[k] == arr[k - 1])
                    	{
                    		k--; 
                    	}
                    
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return r1;
    }

    public static void main(String args[]) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> triplets = threesome(arr);
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
}
