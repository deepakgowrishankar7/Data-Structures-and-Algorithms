import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {10, 2, 4, 10, 15, 2, 5, 43};
        Arrays.sort(arr);
        int target = 19;
        boolean found = false;
        for (int l = 0; l < arr.length - 2; l++) {
            int r = l + 1;
            int s = arr.length - 1;
            while (r < s) {
                int sum = arr[l] + arr[r] + arr[s];
                if (sum == target) {
                    System.out.println("Triplet found: " + arr[l] + ", " + arr[r] + ", " + arr[s]);
                    found = true;
                    return;
                } else if (sum < target) {
                    r++;
                } else {
                    s--;
                }
            }
        }
        if (!found) {
            System.out.println("No triplet found with sum " + target);
        }
    }
}