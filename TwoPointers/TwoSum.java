import java.util.Arrays;
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {10, 2, 4};
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length - 1;
        int target = 6;
        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum == target) {
                System.out.println("Two sum index : " + l + "," + r +"\nTwo sum Values : " + arr[l] + "," + arr[r]);
                return;
            }
            if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        System.out.println("There is no two sum");
    }
}